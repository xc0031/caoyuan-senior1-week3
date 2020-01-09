package com.caoyuan.xiao1.week3.mapper;

import com.caoyuan.xiao1.week3.domain.Company;
import com.caoyuan.xiao1.week3.domain.CompanyExample;
import java.util.List;

public interface CompanyMapper {
    int deleteByExample(CompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Company record);

    int insertSelective(Company record);

    List<Company> selectByExample(CompanyExample example);

    Company selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);

	/** 
	 * @Title: insertCompanys 
	 * @Description: 插入10000条公司数据
	 * @param companies
	 * @return
	 * @return: int
	 */
	int insertCompanys(List<Company> companies);
}