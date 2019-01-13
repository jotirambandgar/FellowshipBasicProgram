package com.bridgelabz.objectoriented.addressbook;

public class PhoneNumber 
{
	long mobileNumber;
	Long landlineNumber;
	@Override
	public String toString() {
		return "PhoneNumber [mobileNumber=" + mobileNumber + ", landlineNumber=" + landlineNumber + "]";
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Long getLandlineNumber() {
		return landlineNumber;
	}
	public void setLandlineNumber(Long landlineNumber) {
		this.landlineNumber = landlineNumber;
	}

}
