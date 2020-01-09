package com.caoyuan.xiao1.week3.domain;



import java.io.Serializable;
import java.util.Date;

/**
 * @author 曹原
 */
public class Company implements Serializable {
	private Integer id;

	private String name;

	private String corporation;

	private String address;

	private Integer capital;

	private String registNo;

	private Integer type;

	private Type type2;

	private Date period;

	private Date created;

	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getCorporation() {
		return corporation;
	}

	public void setCorporation(String corporation) {
		this.corporation = corporation == null ? null : corporation.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public Integer getCapital() {
		return capital;
	}

	public void setCapital(Integer capital) {
		this.capital = capital;
	}

	public String getRegistNo() {
		return registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo == null ? null : registNo.trim();
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * @return the type2
	 */
	public Type getType2() {
		return type2;
	}

	/**
	 * @param type2 the type2 to set
	 */
	public void setType2(Type type2) {
		this.type2 = type2;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Company company = (Company) o;

		if (id != null ? !id.equals(company.id) : company.id != null) return false;
		if (name != null ? !name.equals(company.name) : company.name != null) return false;
		if (corporation != null ? !corporation.equals(company.corporation) : company.corporation != null) return false;
		if (address != null ? !address.equals(company.address) : company.address != null) return false;
		if (capital != null ? !capital.equals(company.capital) : company.capital != null) return false;
		if (registNo != null ? !registNo.equals(company.registNo) : company.registNo != null) return false;
		if (type != null ? !type.equals(company.type) : company.type != null) return false;
		if (type2 != null ? !type2.equals(company.type2) : company.type2 != null) return false;
		if (period != null ? !period.equals(company.period) : company.period != null) return false;
		return created != null ? created.equals(company.created) : company.created == null;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (corporation != null ? corporation.hashCode() : 0);
		result = 31 * result + (address != null ? address.hashCode() : 0);
		result = 31 * result + (capital != null ? capital.hashCode() : 0);
		result = 31 * result + (registNo != null ? registNo.hashCode() : 0);
		result = 31 * result + (type != null ? type.hashCode() : 0);
		result = 31 * result + (type2 != null ? type2.hashCode() : 0);
		result = 31 * result + (period != null ? period.hashCode() : 0);
		result = 31 * result + (created != null ? created.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", corporation=" + corporation
				+ ", address=" + address + ", capital=" + capital + ", registNo="
				+ registNo + ", type=" + type + ", type2=" + type2 + ", period=" + period
				+ ", created=" + created + "]";
	}

}
