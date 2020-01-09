package com.caoyuan.xiao1.week3.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.caoyuan.xiao1.week3.domain.Company;
import com.caoyuan.xiao1.week3.domain.CompanyExample;
import com.caoyuan.xiao1.week3.domain.CompanyExample.Criteria;
import com.caoyuan.xiao1.week3.mapper.CompanyMapper;
import com.caoyuan.xiao1.week3.service.CompanyService;
import com.caoyuan.xiao1.week3.vo.CompanyVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/*********************************************************
@ClassName:   CompanyServiceImpl
@Description: 公司类
@author:	     曹原
@date: 		  2019年11月18日 上午9:04:55 
*********************************************************/
@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Resource
	private CompanyMapper companyMapper;

	@Override
	public boolean insertCompanys(List<Company> companies) {
		try {
			return companyMapper.insertCompanys(companies)>0;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("插入公司数据错误");
		}
	}

	@Override
	public PageInfo<Company> selects(CompanyVO vo, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		CompanyExample example= new CompanyExample();
		Criteria criteria = example.createCriteria();
		//按规模
		if (null!=vo.getP1() && null!=vo.getP2()) {
			criteria.andCapitalBetween(vo.getP1(), vo.getP2());
		}
		//按类型
		if (null!=vo.getType()) {
			criteria.andTypeEqualTo(vo.getType());
		}
		//其它
		if (null!=vo.getTypes() && vo.getTypes().size()>0) {
			criteria.andTypeNotIn(vo.getTypes());
		}
		List<Company> list = companyMapper.selectByExample(example);
		return new PageInfo<Company>(list);
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