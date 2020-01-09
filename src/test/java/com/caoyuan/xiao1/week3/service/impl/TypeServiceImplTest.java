package com.caoyuan.xiao1.week3.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.caoyuan.xiao1.week3.domain.Type;
import com.caoyuan.xiao1.week3.service.TypeService;

/*********************************************************
@ClassName:   TypeServiceImplTest
@Description: 测试
@author:	     曹原
@date: 		  2019年11月18日 上午11:12:29 
*********************************************************/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class TypeServiceImplTest {

	@Resource
	private TypeService typeService;
	/**
	 * {@link com.caoyuan.xiao1.week3.service.impl.TypeServiceImpl#selects()} 的测试方法。
	 */
	@Test
	public void testSelects() {
		List<Type> list = typeService.selects();
		for (Type type : list) {
			System.out.println(type);
		}
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