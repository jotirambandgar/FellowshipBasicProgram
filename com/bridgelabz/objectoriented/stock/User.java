package com.bridgelabz.objectoriented.stock;

import java.util.LinkedList;
import java.util.List;

public class User
{
private String userName;
private String date;
List<CompanyShare> share = new LinkedList<CompanyShare>();
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getDate() {
	return date;
}
public List<CompanyShare> getShare() {
	return share;
}
public void setShare(LinkedList<CompanyShare> share) {
	this.share = share;
}
@Override
public String toString() {
	return "User [userName=" + userName + ", date=" + date + ", share=" + share + "]";
}
public void setDate(String date) {
	this.date = date;
}
}
