package com.vehicle.beans;

public class Vehicle {
     private String vehicleNo;
     private String vehicleType;
     private String adharNo;
     private int period;
     private int mobile;
	public Vehicle(String vehicleNo,String vehicleType, int period, String adharNo, int mobile) {
		// TODO Auto-generated constructor stub
		this.vehicleNo = vehicleNo;
		this.vehicleType = vehicleType;
		this.period = period;
		this.adharNo = adharNo;
		this.mobile = mobile;
	}
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
     
     
     
}
