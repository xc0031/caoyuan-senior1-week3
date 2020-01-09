package com.caoyuan.xiao1.week3.service;

import java.util.List;

import com.caoyuan.xiao1.week3.domain.Company;
import com.caoyuan.xiao1.week3.vo.CompanyVO;
import com.github.pagehelper.PageInfo;

/*********************************************************
 @ClassName: CompanyService
 @Description: 公司类
 @author: 曹原
 @date: 2019年11月18日 上午9:04:36
 *********************************************************/
public interface CompanyService {

    /**
     * @param companies
     * @return
     * @Title: insertCompanys
     * @Description: 插入10000条数据
     * @return: boolean
     */
    boolean insertCompanys(List<Company> companies);

    /**
     * @param vo
     * @param pageSize
     * @param pageNum
     * @return
     * @Title: selects
     * @Description: 条件查询, 回显
     * @return: PageInfo<Company>
     */
    PageInfo<Company> selects(CompanyVO vo, Integer pageNum, Integer pageSize);

}

/**
 *
 */