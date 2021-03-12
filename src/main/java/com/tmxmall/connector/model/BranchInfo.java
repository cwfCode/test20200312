package com.tmxmall.connector.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BranchInfo {

    private String branchName;

    private String branchSHA;
}
