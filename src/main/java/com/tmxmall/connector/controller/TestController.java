package com.tmxmall.connector.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.type.TypeReference;
import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import com.sun.org.apache.xpath.internal.axes.OneStepIteratorForward;
import com.tmxmall.connector.dal.entity.FileInfo;
import com.tmxmall.connector.model.ConnectorInfo;
import com.tmxmall.connector.service.ConnectorProcess;
import com.tmxmall.connector.util.JacksonUtil;
import org.apache.commons.lang3.StringUtils;
import org.kohsuke.github.*;
import org.quartz.CronExpression;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@RestController
@RequestMapping()
public class TestController {


    @Value("${github.clientId}")
    private String clientId;

    @Value("${github.clientSecrets}")
    private String clientSecrets;

    @Value("${github.scope}")
    private String scope;

    @Value("${github.token}")
    private String token;
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ConnectorProcess connectorProcess;

    @RequestMapping("/connector/github/authorize")
    public void test(HttpServletResponse response) throws IOException {
        response.sendRedirect("https://github.com/login/oauth/authorize?client_id="
                + clientId + "&scope=" + scope + "&redirect_uri=" + "http://127.0.0.1:8866/files/github/callBack");
    }

    @RequestMapping("/connector/github/callBack")
    public void getCode(@RequestParam String code, HttpServletRequest request) {
        System.out.println("===code===" + code);
        String token = "";
        if (StringUtils.isNotEmpty(code)) {
            JSONObject obj = new JSONObject();
            obj.put("client_id", clientId);
            obj.put("code", code);
            obj.put("client_secret", clientSecrets);
            try {
                String res = restTemplate.postForObject("https://github.com/login/oauth/access_token", obj, String.class);
                System.out.println("===res===  " + res);
                if (StringUtils.isNoneBlank(res)) {
                    token = res.split("&")[0].split("=")[1];
                    request.getSession().setAttribute("token", token);
                    System.out.println("生成token  ：" + token);
                }
            } catch (RestClientException e) {
                e.printStackTrace();
            }
        }
    }

    @RequestMapping("/connector/repository")
    public Map<String, Object> repository() throws IOException {
        Map<String, Object> result = new HashMap<>();
        GitHub gitHub = new GitHubBuilder().withOAuthToken(token).build();
        GHMyself myself = gitHub.getMyself();
        List<String> repoNameList = new ArrayList();
        PagedIterable<GHRepository> ghRepositories = myself.listRepositories();
        for (GHRepository repository : ghRepositories) {
            repoNameList.add(repository.getName());
        }
        result.put("repoNameList", repoNameList);
        result.put("msg", "success");
        return result;
    }


    @RequestMapping("/connector/branch")
    public Map<String, Object> branch(@RequestParam String repoName, @RequestParam String sha) throws IOException {
        Map<String, Object> result = new HashMap<>();
        GitHub gitHub = new GitHubBuilder().withOAuthToken(token).build();
        GHMyself myself = gitHub.getMyself();
        GHRepository repository = myself.getRepository(repoName);
        GHTree tree = repository.getTree(sha);


        return result;
    }

    @RequestMapping("/connector/file")
    public Map<String, Object> file(@RequestParam(value = "repoName") String repoName, @RequestParam(value = "sha") String sha) throws Exception {
        Map<String, Object> result = new HashMap<>();

        GitHub gitHub = new GitHubBuilder().withOAuthToken(token).build();
        GHMyself myself = gitHub.getMyself();
        final GHRepository repository = myself.getRepository(repoName);
        List<FileInfo> fileInfoList = new ArrayList<>();
        GHTree tree = repository.getTree(sha);
        System.out.println("oauthName :" + myself.getLogin());
        getFile(tree, fileInfoList, "");

        result.put("msg", "success");
        result.put("fileInfoList", fileInfoList);
        return result;
    }

    private void getFile(GHTree tree, List<FileInfo> fileInfoList, String parentPath) throws Exception {
        for (GHTreeEntry entry : tree.getTree()) {
            String fileName = entry.getPath();
            String fileSHA = entry.getSha();
            String fileType = entry.getType();
            long size = entry.getSize();
            System.out.println(fileName +" : "+size);
            FileInfo fileInfo = new FileInfo(fileName, fileSHA, parentPath, fileType);
            fileInfoList.add(fileInfo);
            if ("tree".equals(entry.getType())) {
                String url = parentPath + fileName + "/";
                getFile(entry.asTree(), fileInfo.getFileInfoList(), url);
            }
        }
    }


    /**
     * 创建集成器项目
     *
     * @param connectorInfo
     * @param request
     * @return
     */
    @PostMapping("/connector/connectorInfo")
    public Map<String, Object> createConnectorInfo(@RequestBody ConnectorInfo connectorInfo, HttpServletRequest request) {
        Map<String, Object> result = new HashMap<>();
        connectorProcess.createConnectorInfo(connectorInfo, request);
        return result;
    }

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\jvm\\JVM指令手册.pdf.pdf"));
        int size = inputStream.available();
        System.out.println(size / 1024 + " kb ");
    }

    @PostMapping("/test")
    public String createConnectorInfo(@RequestParam(value = "connector_id_list") String  parmstr,
                                      @RequestParam(value = "yicat_group_id") String yicatGroupId) throws IOException {
        System.out.println(parmstr);
        System.out.println(yicatGroupId);
        return "111";
    }
}
