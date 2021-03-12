package com.tmxmall.connector.util;

import com.tmxmall.connector.dal.entity.BranchInfo;
import com.tmxmall.connector.dal.entity.FileInfo;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.List;

public class GithubConnector extends BaseConnector {

    private GitHub gitHub;

    public GithubConnector(String token) {
        super(token);
    }

    @Override
    public List<String> listRepositories() throws IOException {
        return null;
    }

    @Override
    public List<BranchInfo> listBranches(String repoName) throws IOException {
        return null;
    }

    @Override
    public List<FileInfo> listFileTree(String repoName, String branchSHA) throws IOException {
        return null;
    }
}
