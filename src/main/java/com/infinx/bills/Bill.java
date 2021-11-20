package com.infinx.bills;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Bill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billNumber;
	@Column(name = "billedTo")
	private String billedTo;
	@Column(name = "billedDate")
	private String billedDate;
	@Column(name = "billedAmount")
	private int billedAmount;
	@Column(name = "billTax")
	private int billTax;
	@Column(name = "totalAmount")
	private int totalAmount;
	
	public int getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}
	public String getBilledTo() {
		return billedTo;
	}
	public void setBilledTo(String billedTo) {
		this.billedTo = billedTo;
	}
	public String getBilledDate() {
		return billedDate;
	}
	public void setBilledDate(String billedDate) {
		this.billedDate = billedDate;
	}
	public int getBilledAmount() {
		return billedAmount;
	}
	public void setBilledAmount(int billedAmount) {
		this.billedAmount = billedAmount;
	}
	public int getBillTax() {
		return billTax;
	}
	public void setBillTax(int billTax) {
		this.billTax = billTax;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	

}
