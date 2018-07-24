package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Currency {
	@Column
	private String currency;
	@Id
	private String ticker;
	@Column
	private String country;
	@Column
	private double rateToUsd;
	public String getCurrency() {
		return currency;
	}
	
	
	
	public Currency(String currency, String ticker, String country, double rateToUsd) {
		super();
		this.currency = currency;
		this.ticker = ticker;
		this.country = country;
		this.rateToUsd = rateToUsd;
	}



	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getRateToUsd() {
		return rateToUsd;
	}
	public void setRateToUsd(double rateToUsd) {
		this.rateToUsd = rateToUsd;
	}


	/*
	public void setActive(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	*/
	
}
