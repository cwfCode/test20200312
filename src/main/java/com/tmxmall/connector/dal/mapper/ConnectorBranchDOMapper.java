package com.tmxmall.connector.dal.mapper;


import com.tmxmall.connector.dal.entity.ConnectorBranchDO;
import com.tmxmall.connector.dal.entity.ConnectorBranchDOExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ConnectorBranchDOMapper {
    long countByExample(ConnectorBranchDOExample example);

    int deleteByExample(ConnectorBranchDOExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(ConnectorBranchDO record);

    int insertSelective(ConnectorBranchDO record);

    List<ConnectorBranchDO> selectByExampleWithRowbounds(ConnectorBranchDOExample example, RowBounds rowBounds);

    List<ConnectorBranchDO> selectByExample(ConnectorBranchDOExample example);

    ConnectorBranchDO selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") ConnectorBranchDO record, @Param("example") ConnectorBranchDOExample example);

    int updateByExample(@Param("record") ConnectorBranchDO record, @Param("example") ConnectorBranchDOExample example);

    int updateByPrimaryKeySelective(ConnectorBranchDO record);

    int updateByPrimaryKey(ConnectorBranchDO record);
}