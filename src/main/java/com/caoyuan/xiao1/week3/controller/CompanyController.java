package com.caoyuan.xiao1.week3.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.caoyuan.xiao1.week3.domain.Company;
import com.caoyuan.xiao1.week3.service.CompanyService;
import com.caoyuan.xiao1.week3.vo.CompanyVO;
import com.github.pagehelper.PageInfo;

/*********************************************************
@ClassName:   CompanyController
@Description: 公司类控制层
@author:	     曹原
@date: 		  2019年11月18日 上午9:03:51 
*********************************************************/
@Controller
public class CompanyController {

	@Resource
	private CompanyService companyService;

	/**
	 * @Title: selects 
	 * @Description: 条件查询,回显
	 * @param model
	 * @param vo
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @return: String
	 */
	@RequestMapping(value = {"","/","companys"})
	public String selects(Model model, CompanyVO vo,
			@RequestParam(defaultValue = "1") Integer pageNum,
			@RequestParam(defaultValue = "3") Integer pageSize) {
		PageInfo<Company> page = companyService.selects(vo, pageNum, pageSize);
		model.addAttribute("page", page);
		model.addAttribute("vo", vo);
		return "companys";
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
