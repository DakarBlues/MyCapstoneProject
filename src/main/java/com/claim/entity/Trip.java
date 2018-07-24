package com.claim.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trip {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tripId;
	@Column
	private String userId;
	@Column
	private String originCountry;
	@Column
	private String  originDate;
	@Column
	private String destCountry;
	@Column
	private String  departDate;
	@Column
	private String departTime;
	
	
/*	public Trip(int tripId, String userId, String originCountry, Date originDate, String destCountry, Date departDate,
			String departTime) {
		super();
		this.tripId = tripId;
		this.userId = userId;
		this.originCountry = originCountry;
		this.originDate = originDate;
		this.destCountry = destCountry;
		this.departDate = departDate;
		this.departTime = departTime;
	}  */
	
	public Trip() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the tripId
	 */
	public int getTripId() {
		return tripId;
	}
	/**
	 * @param tripId the tripId to set
	 */
	public void setTripId(int tripId) {
		this.tripId = tripId;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the originCountry
	 */
	public String getOriginCountry() {
		return originCountry;
	}
	/**
	 * @param originCountry the originCountry to set
	 */
	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}
	/**
	 * @return the originDate
	 */
	public String getOriginDate() {
		return originDate;
	}
	/**
	 * @param originDate the originDate to set
	 */
	public void setOriginDate(String originDate) {
		this.originDate = originDate;
	}
	/**
	 * @return the destCountry
	 */
	public String getDestCountry() {
		return destCountry;
	}
	/**
	 * @param destCountry the destCountry to set
	 */
	public void setDestCountry(String destCountry) {
		this.destCountry = destCountry;
	}
	/**
	 * @return the departDate
	 */
	public String getDepartDate() {
		return departDate;
	}
	/**
	 * @param departDate the departDate to set
	 */
	public void setDepartDate(String departDate) {
		this.departDate = departDate;
	}
	/**
	 * @return the departTime
	 */
	public String getDepartTime() {
		return departTime;
	}
	/**
	 * @param departTime the departTime to set
	 */
	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}
	
	
	

	
}
