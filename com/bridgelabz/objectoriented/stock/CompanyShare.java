package com.bridgelabz.objectoriented.stock;

public class CompanyShare
{
private String symbol;
private String name;
private int price;
private int share;
public String getSymbol()
{
	return symbol;
}
public void setSymbol(String symbol)
{
	this.symbol = symbol;
}
public String getName() 
{
	return name;
}
public void setName(String name)
{
	this.name = name;
}
public int getPrice() 
{
	return price;
}
public void setPrice(int price) 
{
	this.price = price;
}
public int getShare()
{
	return share;
}
public void setShare(int share)
{
	this.share = share;
}
@Override
public String toString() {
	return "CompanyShare [symbol=" + symbol + ", name=" + name + ", price=" + price + ", share=" + share + "]";
}
}
