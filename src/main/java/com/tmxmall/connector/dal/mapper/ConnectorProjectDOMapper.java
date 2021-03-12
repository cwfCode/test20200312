package com.tmxmall.connector.dal.mapper;


import com.tmxmall.connector.dal.entity.ConnectorProjectDO;
import com.tmxmall.connector.dal.entity.ConnectorProjectDOExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ConnectorProjectDOMapper {
    long countByExample(ConnectorProjectDOExample example);

    int deleteByExample(ConnectorProjectDOExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(ConnectorProjectDO record);

    int insertSelective(ConnectorProjectDO record);

    List<ConnectorProjectDO> selectByExampleWithRowbounds(ConnectorProjectDOExample example, RowBounds rowBounds);

    List<ConnectorProjectDO> selectByExample(ConnectorProjectDOExample example);

    ConnectorProjectDO selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") ConnectorProjectDO record, @Param("example") ConnectorProjectDOExample example);

    int updateByExample(@Param("record") ConnectorProjectDO record, @Param("example") ConnectorProjectDOExample example);

    int updateByPrimaryKeySelective(ConnectorProjectDO record);

    int updateByPrimaryKey(ConnectorProjectDO record);
}