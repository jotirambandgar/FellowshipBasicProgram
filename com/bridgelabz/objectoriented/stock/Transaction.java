package com.bridgelabz.objectoriented.stock;

import java.util.LinkedList;

public class Transaction 
{
	private String userName;
    private String companyName;
    private String price;
    private int number;
    private String date;
    public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPrice()
	{
		return price;
	}
	@Override
	public String toString() {
		return "Transaction [userName=" + userName + ", companyName=" + companyName + ", price=" + price + ", number="
				+ number + ", date=" + date + "]";
	}
	public void setPrice(String price)
	{
		this.price = price;
	}
	
	public String getDate() 
	{
		return date;
	}
	public void setDate(String date) 
	{
		this.date = date;
	}

}