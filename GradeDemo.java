package com;

public class GradeDemo {
	public static void main(String[] args) {
		//System.out.println(GradeDemo.findGrade(-1));

	}
	public static char findGrade(double p){
		try{
		if(p>0&&p<=100){
			if(p>=80)
				return 'A';
			else if(p>=60&&p<80)
				return 'B';
			else if(p>=40&&p<60)
				return 'C';
			else if(p>=30&&p<40)
				return 'D';
			else 
				return 'E';
		}
		else
			return 'O';
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}

}
