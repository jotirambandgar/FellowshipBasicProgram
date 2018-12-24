package com.bridgelab.objectoriented;

	public class PojoStock
	{
		private String stockname;
		private int stocknumber;
		private int stockprice;
		
		public String getName() {
			return stockname;
		}

		public void setName(String name) {
			this.stockname = name;
		}

		public int getWeight() {
			return stocknumber;
		}

		public void setWeight(int weight) {
			this.stocknumber = weight;
		}

		public int getPrice() {
			return stockprice;
		}

		public void setPrice(int price) {
			this.stockprice = price;
		}

		public String toString()
		{
			return "[name :"+stockname+",Weight:"+stocknumber+",price:"+stockprice+"]";
		}
	}

