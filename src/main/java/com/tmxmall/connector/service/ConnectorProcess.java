package com.tmxmall.connector.service;


import com.tmxmall.connector.dal.dao.*;
import com.tmxmall.connector.dal.entity.*;
import com.tmxmall.connector.model.*;
import com.tmxmall.connector.model.BranchInfo;
import com.tmxmall.connector.model.FileInfo;
import com.tmxmall.connector.model.mapper.*;
import com.tmxmall.connector.util.BaseConnector;
import com.tmxmall.connector.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

@Service
public class ConnectorProcess {

    private Logger logger = LoggerFactory.getLogger(ConnectorProcess.class);

    @Resource
    private ConnectorProjectDAO connectorProjectDAO;
    @Resource
    private ConnectorRepositoryDAO connectorRepositoryDAO;
    @Resource
    private ConnectorBranchDAO connectorBranchDAO;
    @Resource
    private ConnectorFileDAO connectorFileDAO;

    @Resource
    private ConnectorProjectSyncScheduledTaskDAO connectorProjectSyncScheduledTaskDAO;

    public void createConnectorProject() {

    }

    public void deleteConnectorProject() {

    }

    public void createConnectorRepository() {

    }

    public void deleteConnectorRepository() {

    }

    public void createConnectorBranch() {

    }

    public void deleteConnectorBranch() {

    }

    public void createConnectorFile() {

    }

    public void deleteConnectorFile() {

    }

    public void createConnectorDocument(ConnectorFileDO connectorFileDO) {

    }

    public void deleteConnectorDocument() {

    }



    public void createConnectorInfo(ConnectorInfo connectorInfo, HttpServletRequest request) {
        //int connectorType = (int) request.getSession().getAttribute("connectorType");
        //String token = (String) request.getSession().getAttribute("connectionToken");

        int connectorType = 1;
        String token = "931cbe8e316de88775fcf333790bcbcc9d1bf29c";

        ConnectorRepository connectorRepository = connectorInfo.getConnectorRepository();
        ConnectorProject connectorProject = connectorInfo.getConnectorProject();
        ScheduledTask scheduledTask = connectorInfo.getScheduledTask();
        String projectId = StringUtil.getRandomId();

        //项目数据
        connectorProject.setOauthToken(token);
        connectorProject.setProjectId(projectId);
        connectorProject.setConnectorType(connectorType);
        connectorProject.setCreateTime(new Date());
        connectorProject.setModifyTime(new Date());
        ConnectorProjectDO connectorProjectDO = ConnectorProjectHelper.INSTANCE.transForm(connectorProjectDAO.getDefault(), connectorProject);
        connectorProjectDAO.insertConnectorProject(connectorProjectDO);

        //仓库数据
        String repositoryId = StringUtil.getRandomId();
        ConnectorRepositoryDO connectorRepositoryDO = ConnectorRepositoryHelper.INSTANCE.transForm(connectorRepositoryDAO.getDefault(), connectorRepository);
        connectorRepositoryDO.setfProjectId(projectId);
        connectorRepositoryDO.setfRepositoryId(repositoryId);
        connectorRepositoryDAO.insertConnectorRepository(connectorRepositoryDO);

        //分支数据
        List<ConnectorBranch> connectorBranchList = connectorRepository.getConnectorBranchList();
        connectorBranchList.forEach(connectorBranch -> {
            connectorBranch.setBranchId(StringUtil.getRandomId());
            connectorBranch.setCreateTime(new Date());
            connectorBranch.setModifyTime(new Date(
            ));
        });
        List<ConnectorBranchDO> connectorBranchDOList = ConnectorBranchHelper.INSTANCE.transForm(connectorBranchList);
        connectorBranchDOList.forEach(connectorBranchDO -> connectorBranchDO.setfEnabled((byte) 1));
        connectorBranchDAO.insertConnectorBranch(connectorBranchDOList);

        //文件数据
        for (ConnectorBranch connectorBranch : connectorBranchList) {
            List<ConnectorFile> connectorFileList = connectorBranch.getConnectorFileList();
            String branchId = connectorBranch.getBranchId();
            for (ConnectorFile connectorFile : connectorFileList) {
                connectorFile.setBranchId(branchId);
                ConnectorFileDO connectorFileDO = ConnectorFileHelper.INSTANCE.transForm(connectorFileDAO.getDefault(), connectorFile);
                connectorFileDAO.insertConnectorFile(connectorFileDO);
            }
        }
        //定时任务数据
        scheduledTask.setProjectId(projectId);
        scheduledTask.setCreateTime(new Date());
        scheduledTask.setModifyTime(new Date());
        ConnectorProjectSyncScheduledTaskDO scheduledTaskDO = ScheduledTaskHelper.INSTANCE.transForm(connectorProjectSyncScheduledTaskDAO.getDefault(), scheduledTask);
        connectorProjectSyncScheduledTaskDAO.insertConnectorScheduleTask(scheduledTaskDO);

    }
}
