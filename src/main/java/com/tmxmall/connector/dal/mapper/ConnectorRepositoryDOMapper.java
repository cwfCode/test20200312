package com.tmxmall.connector.dal.mapper;


import com.tmxmall.connector.dal.entity.ConnectorRepositoryDO;
import com.tmxmall.connector.dal.entity.ConnectorRepositoryDOExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ConnectorRepositoryDOMapper {
    long countByExample(ConnectorRepositoryDOExample example);

    int deleteByExample(ConnectorRepositoryDOExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(ConnectorRepositoryDO record);

    int insertSelective(ConnectorRepositoryDO record);

    List<ConnectorRepositoryDO> selectByExampleWithRowbounds(ConnectorRepositoryDOExample example, RowBounds rowBounds);

    List<ConnectorRepositoryDO> selectByExample(ConnectorRepositoryDOExample example);

    ConnectorRepositoryDO selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") ConnectorRepositoryDO record, @Param("example") ConnectorRepositoryDOExample example);

    int updateByExample(@Param("record") ConnectorRepositoryDO record, @Param("example") ConnectorRepositoryDOExample example);

    int updateByPrimaryKeySelective(ConnectorRepositoryDO record);

    int updateByPrimaryKey(ConnectorRepositoryDO record);
}