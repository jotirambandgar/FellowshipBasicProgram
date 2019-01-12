package com.bridgelabz.objectoriented.stock;

import java.util.LinkedList;
import java.util.List;

public class User
{
private String userName;
private int UserAmount;
private String date;

public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getUserAmount() {
	return UserAmount;
}
public void setUserAmount(int userAmount) {
	UserAmount = userAmount;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString() {
	return "User [userName=" + userName + ", UserAmount=" + UserAmount + ", date=" + date + "]";
}
}