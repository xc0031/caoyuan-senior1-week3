package com.caoyuan.xiao1.week3.mapper;

import com.caoyuan.xiao1.week3.domain.Type;
import com.caoyuan.xiao1.week3.domain.TypeExample;
import java.util.List;

public interface TypeMapper {
    int deleteByExample(TypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Type record);

    int insertSelective(Type record);

    List<Type> selectByExample(TypeExample example);

    Type selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

}