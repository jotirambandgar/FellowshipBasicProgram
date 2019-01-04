package com.bridgelabz.objectoriented;

import java.io.Serializable;

public class PojoStock 
	{
		private String name;
		private int number;
		private int price;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String toString()
		{
			return "[name :"+name+",number of stock:"+number+",price:"+price+"]";
		}
	}

