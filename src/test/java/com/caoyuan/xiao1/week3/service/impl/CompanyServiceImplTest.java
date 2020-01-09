package com.caoyuan.xiao1.week3.service.impl;

import static org.junit.Assert.fail;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.caoyuan.xiao1.week3.domain.Company;
import com.caoyuan.xiao1.week3.domain.Type;
import com.caoyuan.xiao1.week3.service.CompanyService;
import com.caoyuan.xiao1.week3.service.TypeService;
import com.caoyuan.xiao1.week3.vo.CompanyVO;
import com.cy.util.DateUtil;
import com.cy.util.RandomUtil;
import com.cy.util.StringUtil;
import com.github.pagehelper.PageInfo;

/*********************************************************
@ClassName:   CompanyServiceImplTest
@Description: 测试插入10000条数据
@author:	     曹原
@date: 		  2019年11月18日 上午9:23:07 
*********************************************************/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class CompanyServiceImplTest {

	// 注入Service
	@Resource
	private CompanyService companyService;
	@Resource
	private TypeService typeService;

	/**
	 * {@link com.caoyuan.xiao1.week3.service.impl.CompanyServiceImpl#insertCompanys(java.util.List)} 的测试方法。
	 * 插入10000条
	 */
	@Test
	public void testInsertCompanys() {
		LinkedList<Company> companies = new LinkedList<Company>();
		List<Type> types = typeService.selects();

		for (int i = 0; i < 10000; i++) {
			Company company = new Company();
//		(1)公司名称：以“北京”开头，以“有限公司”或“股份有限公司”或“集团有限公司”结尾，中间使用StringUtil.randomChineseString()方法创建2-4个随机汉字（4分）
			String[] arr = { "有限公司", "股份有限公司", "集团有限公司" };
			company.setName("北京" + StringUtil.randomChineseString(RandomUtil.random(2, 4))
					+ arr[RandomUtil.random(0, 2)]);
//		(2)法人代表姓名：调用StringUtil.generateChineseName()创建（4分）
			company.setCorporation(StringUtil.generateChineseName());
//		(3)注册地址：以“北京市”开头，后面调用StringUtil.randomChineseString()创建20-40个汉字（4分）
			company.setAddress(StringUtil.randomChineseString(RandomUtil.random(20, 40)));
//		(4)注册资本：调用RandomUtil随机数工具方法生成，值在10万元-10亿元之间（4分）
			company.setCapital(RandomUtil.random(100000, 1000000000));
//		(5)营业执照号：调用RandomUtil随机数工具方法生成，以1101开头，加上11位随机数，总共15位。（4分）
			company.setRegistNo("1101" + RandomUtil.randomNumber(11));
//		(6)公司经济类型：调用RandomUtil随机数工具方法，在公司类型表中的所有id中随机抽（4分）。
			company.setType2(types.get(RandomUtil.random(0, types.size() - 1)));
//		(7)成立时间：模拟从1980年1月1日至今任意随机日期（4分）。
			Calendar cal = Calendar.getInstance();
			cal.set(1980, 0, 1);
			Date d1 = cal.getTime();
			Date d2 = DateUtil.randomDate(d1, new Date());
			company.setCreated(d2);
//		(8)营业期限：在成立时间上延后50年（2分）。
			cal.setTime(d2);
			cal.add(Calendar.YEAR, 50);
			Date d3 = cal.getTime();
			company.setPeriod(d3);
			companies.add(company);
		}
		boolean insertCompanys = companyService.insertCompanys(companies);
		System.out.println(insertCompanys);
	}

	/**
	 * {@link com.caoyuan.xiao1.week3.service.impl.CompanyServiceImpl#selects(com.caoyuan.xiao1.week3.vo.CompanyVO, java.lang.Integer, java.lang.Integer)} 的测试方法。
	 */
	@Test
	public void testSelects() {
		CompanyVO vo = new CompanyVO();
		vo.setP1(1);
		vo.setP2(2000000);
		vo.setType(1);
		PageInfo<Company> info = companyService.selects(vo, 1, 3);
		List<Company> list = info.getList();
		for (Company company : list) {
			System.out.println(company);
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
