package com.claim.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tId;
	@Column
	private String buyer;
	@Column
	private String seller;
	@Column
	private String denomination;
	@Column
	private int finalAmount;
	@Column
	private String boughtCurrency;
	@Column
	private double boughtAmount;
	@Column
	private double exchRate;
	@Column
	private Date transactDate;
	@Column
	private String message;
	@Column
	private String w3wLocation;
	@Column
	private int rating;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	
	}

	/**
	 * @return the tId
	 */
	public int gettId() {
		return tId;
	}

	/**
	 * @param tId the tId to set
	 */
	public void settId(int tId) {
		this.tId = tId;
	}

	/**
	 * @return the buyer
	 */
	public String getBuyer() {
		return buyer;
	}

	/**
	 * @param buyer the buyer to set
	 */
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	/**
	 * @return the seller
	 */
	public String getSeller() {
		return seller;
	}

	/**
	 * @param seller the seller to set
	 */
	public void setSeller(String seller) {
		this.seller = seller;
	}

	/**
	 * @return the denomination
	 */
	public String getDenomination() {
		return denomination;
	}

	/**
	 * @param denomination the denomination to set
	 */
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	/**
	 * @return the finalAmount
	 */
	public int getFinalAmount() {
		return finalAmount;
	}

	/**
	 * @param finalAmount the finalAmount to set
	 */
	public void setFinalAmount(int finalAmount) {
		this.finalAmount = finalAmount;
	}

	/**
	 * @return the boughtCurrency
	 */
	public String getBoughtCurrency() {
		return boughtCurrency;
	}

	/**
	 * @param boughtCurrency the boughtCurrency to set
	 */
	public void setBoughtCurrency(String boughtCurrency) {
		this.boughtCurrency = boughtCurrency;
	}

	/**
	 * @return the boughtAmount
	 */
	public double getBoughtAmount() {
		return boughtAmount;
	}

	/**
	 * @param boughtAmount the boughtAmount to set
	 */
	public void setBoughtAmount(double boughtAmount) {
		this.boughtAmount = boughtAmount;
	}

	/**
	 * @return the exchRate
	 */
	public double getExchRate() {
		return exchRate;
	}

	/**
	 * @param exchRate the exchRate to set
	 */
	public void setExchRate(double exchRate) {
		this.exchRate = exchRate;
	}

	/**
	 * @return the transactDate
	 */
	public Date getTransactDate() {
		return transactDate;
	}

	/**
	 * @param transactDate the transactDate to set
	 */
	public void setTransactDate(Date transactDate) {
		this.transactDate = transactDate;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the w3wLocation
	 */
	public String getW3wLocation() {
		return w3wLocation;
	}

	/**
	 * @param w3wLocation the w3wLocation to set
	 */
	public void setW3wLocation(String w3wLocation) {
		this.w3wLocation = w3wLocation;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transaction:\n Name: Kane\n Amount: "+this.finalAmount+"";
	}
	
	
	

	}
