package com.stock.market.custom.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "trading_code")
	private String tradingCode;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "price")
	private float price;

	@Column(name = "change")
	private float change;

	public Company() {

	}

	public Company(int id, String tradingCode, String companyName, float price, float change) {
		this.id = id;
		this.tradingCode = tradingCode;
		this.companyName = companyName;
		this.price = price;
		this.change = change;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTradingCode() {
		return tradingCode;
	}

	public void setTradingCode(String tradingCode) {
		this.tradingCode = tradingCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getChange() {
		return change;
	}

	public void setChange(float change) {
		this.change = change;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", tradingCode=" + tradingCode + ", companyName=" + companyName + ", price="
				+ price + ", change=" + change + "]";
	}

}
