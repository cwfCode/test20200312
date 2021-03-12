package com.tmxmall.connector.dal.mapper;


import com.tmxmall.connector.dal.entity.ConnectorProjectSyncScheduledTaskDO;
import com.tmxmall.connector.dal.entity.ConnectorProjectSyncScheduledTaskDOExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ConnectorProjectSyncScheduledTaskDOMapper {
    long countByExample(ConnectorProjectSyncScheduledTaskDOExample example);

    int deleteByExample(ConnectorProjectSyncScheduledTaskDOExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(ConnectorProjectSyncScheduledTaskDO record);

    int insertSelective(ConnectorProjectSyncScheduledTaskDO record);

    List<ConnectorProjectSyncScheduledTaskDO> selectByExampleWithRowbounds(ConnectorProjectSyncScheduledTaskDOExample example, RowBounds rowBounds);

    List<ConnectorProjectSyncScheduledTaskDO> selectByExample(ConnectorProjectSyncScheduledTaskDOExample example);

    ConnectorProjectSyncScheduledTaskDO selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") ConnectorProjectSyncScheduledTaskDO record, @Param("example") ConnectorProjectSyncScheduledTaskDOExample example);

    int updateByExample(@Param("record") ConnectorProjectSyncScheduledTaskDO record, @Param("example") ConnectorProjectSyncScheduledTaskDOExample example);

    int updateByPrimaryKeySelective(ConnectorProjectSyncScheduledTaskDO record);

    int updateByPrimaryKey(ConnectorProjectSyncScheduledTaskDO record);
}