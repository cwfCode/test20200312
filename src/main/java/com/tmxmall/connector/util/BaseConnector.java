package com.tmxmall.connector.util;


import com.tmxmall.connector.dal.entity.BranchInfo;
import com.tmxmall.connector.dal.entity.FileInfo;

import java.io.IOException;
import java.util.List;

public abstract class BaseConnector {

    protected String token;

    public BaseConnector(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public abstract List<String> listRepositories()  throws IOException;

    public abstract List<BranchInfo> listBranches(String repoName) throws IOException;

    public abstract List<FileInfo> listFileTree(String repoName, String branchSHA) throws IOException;

}
