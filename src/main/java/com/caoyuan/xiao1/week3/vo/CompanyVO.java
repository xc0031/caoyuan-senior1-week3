package com.caoyuan.xiao1.week3.vo;

import java.util.List;

/*********************************************************
@ClassName:   CompanyVO
@Description: 页面数据
@author:	     曹原
@date: 		  2019年11月18日 上午10:11:45 
*********************************************************/
public class CompanyVO {
	private Integer p1;// 规模1
	private Integer p2;// 规模2
	private Integer type;// 类型
	private List<Integer> types;// 其他

	/**
	 * @return the p1
	 */
	public Integer getP1() {
		return p1;
	}

	/**
	 * @param p1 the p1 to set
	 */
	public void setP1(Integer p1) {
		this.p1 = p1;
	}

	/**
	 * @return the p2
	 */
	public Integer getP2() {
		return p2;
	}

	/**
	 * @param p2 the p2 to set
	 */
	public void setP2(Integer p2) {
		this.p2 = p2;
	}

	/**
	 * @return the type
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * @return the types
	 */
	public List<Integer> getTypes() {
		return types;
	}

	/**
	 * @param types the types to set
	 */
	public void setTypes(List<Integer> types) {
		this.types = types;
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
