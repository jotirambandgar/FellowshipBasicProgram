package com.bridgelabz.designpattern.creational.factorypattern.model;

public abstract class ComputerFactory {
	
		
		public abstract String getRAM();
		public abstract String getHDD();
		public abstract String getCPU();
		
		@Override
		public String toString(){
			return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
		}

}
