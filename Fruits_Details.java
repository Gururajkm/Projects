package com.Qac.Fruits.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fruits_details")
public class Fruits_Details {
	
	@Id
	@Column(name="serialNo")
	private  int serialNo;
	@Column(name="customerName")
	private String customerName;
	@Column(name=" mobileNo")
	private String  mobileNo;
	@Column(name="fruitsQuantity")
	private String fruitsQuantity;
	
	
	
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String string) {
		this.mobileNo = string;
	}
	public String getFruitsQuantity() {
		return fruitsQuantity;
	}
	public void setFruitsQuantity(String fruitsQuantity) {
		this.fruitsQuantity = fruitsQuantity;
	}
	@Override
	public String toString() {
		return "Fruits_Details [serialNo=" + serialNo + ", customerName=" + customerName + ", mobileNo=" + mobileNo
				+ ", fruitsQuantity=" + fruitsQuantity + "]";
	}
	
	
	

}
