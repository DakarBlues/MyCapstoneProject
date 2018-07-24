package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airport {
	@Id
	private String airport;
	@Column
	private String country;
	@Column
	private String abbreviat;
	
	public Airport() {
		// TODO Auto-generated constructor stub
	}
	 
	public Airport(String airport, String country, String abbreviat) {
		super();
		this.airport = airport;
		this.country = country;
		this.abbreviat = abbreviat;
	}

	/**
	 * @return the airport
	 */
	public String getAirport() {
		return airport;
	}

	/**
	 * @param airport the airport to set
	 */
	public void setAirport(String airport) {
		this.airport = airport;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the abbreviat
	 */
	public String getAbbreviat() {
		return abbreviat;
	}

	/**
	 * @param abbreviat the abbreviat to set
	 */
	public void setAbbreviat(String abbreviat) {
		this.abbreviat = abbreviat;
	}
}
