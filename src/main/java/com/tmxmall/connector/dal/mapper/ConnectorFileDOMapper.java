package com.tmxmall.connector.dal.mapper;


import com.tmxmall.connector.dal.entity.ConnectorFileDO;
import com.tmxmall.connector.dal.entity.ConnectorFileDOExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ConnectorFileDOMapper {
    long countByExample(ConnectorFileDOExample example);

    int deleteByExample(ConnectorFileDOExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(ConnectorFileDO record);

    int insertSelective(ConnectorFileDO record);

    List<ConnectorFileDO> selectByExampleWithRowbounds(ConnectorFileDOExample example, RowBounds rowBounds);

    List<ConnectorFileDO> selectByExample(ConnectorFileDOExample example);

    ConnectorFileDO selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") ConnectorFileDO record, @Param("example") ConnectorFileDOExample example);

    int updateByExample(@Param("record") ConnectorFileDO record, @Param("example") ConnectorFileDOExample example);

    int updateByPrimaryKeySelective(ConnectorFileDO record);

    int updateByPrimaryKey(ConnectorFileDO record);
}