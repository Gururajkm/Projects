package com.Qac.Fruits.dto;

public class Details {
	
	private String customername;
	private String mobileno;
	private String fruitsQuantity;
	
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getFruitsQuantity() {
		return fruitsQuantity;
	}
	public void setFruitsQuantity(String fruitsQuantity) {
		this.fruitsQuantity = fruitsQuantity;
	}
	@Override
	public String toString() {
		return "Details [customername=" + customername + ", mobileno=" + mobileno + ", fruitsQuantity=" + fruitsQuantity
				+ "]";
	}
	
	
	
	
	

}
