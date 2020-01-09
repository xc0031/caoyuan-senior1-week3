package com.caoyuan.xiao1.week3.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.caoyuan.xiao1.week3.domain.Type;
import com.caoyuan.xiao1.week3.mapper.TypeMapper;
import com.caoyuan.xiao1.week3.service.TypeService;

/*********************************************************
@ClassName:   TypeServiceImpl
@Description: 公司类型
@author:	     曹原
@date: 		  2019年11月18日 上午9:06:45 
*********************************************************/
@Service
public class TypeServiceImpl implements TypeService {

	@Resource
	private TypeMapper typeMapper;

	@Override
	public List<Type> selects() {
		return typeMapper.selectByExample(null);
	}
}

/**
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
