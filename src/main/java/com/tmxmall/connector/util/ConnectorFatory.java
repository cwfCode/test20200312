package com.tmxmall.connector.util;

import org.apache.ibatis.annotations.Case;

public class ConnectorFatory {


    public static final int GITHUB_CONNECTOR_TYPE = 1;

    public static BaseConnector create(int connectorType, String token) {
        switch (connectorType) {
            case GITHUB_CONNECTOR_TYPE:
                return new GithubConnector(token);
            default:
                throw new RuntimeException("创建连接器出错");
        }
    }
}
