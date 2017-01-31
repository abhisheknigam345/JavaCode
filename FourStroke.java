package com;

public class FourStroke extends Engine {

	FourStroke(int id, double volume, double fuelCapacity, char fuelType) {
		super(id, volume, fuelCapacity, fuelType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public  double getMileage() {
		if(this.getFuelType()=='g'){
			return this.getVolume()*4*3/1000+this.getFuelCapacity()/2;
		}
		else if(this.getFuelType()=='d'){
			return this.getVolume()*4*2/1000 +this.getFuelCapacity()/4;
		}
		return 0;
	}

}
