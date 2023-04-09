package com.coh.dao;

import com.coh.pojo.Assign;
import com.coh.pojo.AssignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssignDao {
    long countByExample(AssignExample example);

    int deleteByExample(AssignExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Assign record);

    int insertSelective(Assign record);

    List<Assign> selectByExample(AssignExample example);

    Assign selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Assign record, @Param("example") AssignExample example);

    int updateByExample(@Param("record") Assign record, @Param("example") AssignExample example);

    int updateByPrimaryKeySelective(Assign record);

    int updateByPrimaryKey(Assign record);
}