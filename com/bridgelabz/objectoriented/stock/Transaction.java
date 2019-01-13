package com.bridgelabz.objectoriented.stock;

import java.util.LinkedList;

public class Transaction 
{
	private String userName;
   private CompanyShare share;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public CompanyShare getShare() {
	return share;
}
public void setShare(CompanyShare share) {
	this.share = share;
}
@Override
public String toString() {
	return "Transaction [userName=" + userName + ", share=" + share + "]";
}
}