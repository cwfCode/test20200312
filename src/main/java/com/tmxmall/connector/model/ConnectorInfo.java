package com.tmxmall.connector.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class ConnectorInfo implements Serializable {

    private ConnectorProject connectorProject;

    private ConnectorRepository connectorRepository;

    private ScheduledTask scheduledTask;
}
