package com;

public class PointDemo {


	public static void main(String[] args) {
		try{
		Point obj=new Point(2,3);
		Point obj1=new Point(10,9);
	
		findDistance(obj,obj1);
		}
		catch(Exception e){
		}
}
	public static double findDistance(Point point1,Point point2 ){
		try{
		double dist=Math.sqrt((Math.pow((point1.getxCoordinate()-point2.getxCoordinate()), 2))+(Math.pow((point1.getyCoordinate()-point2.getyCoordinate()), 2)));
		System.out.println(dist);
		return dist;
		}
		catch(Exception e){
			
			return -1;
		}
		
	}
}

 class Point {
	private double xCoordinate;
	private double yCoordinate;
	
	Point(double x,double y){
		 xCoordinate=x;
		 yCoordinate=y;
		
	}

	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
}

