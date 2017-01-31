package com;

	public class ChefOperations {
/***********************************************************************************/		
	public static Chef findChef(int a,Chef[] arr){
		try{
			int i;
			for(i=0;i<arr.length;i++){
				if(a==arr[i].getChefId()){
					return arr[i];	
				}
			}
		}
		catch(NullPointerException e){
			return null;
		}
		return null;
	}
	
/***********************************************************************************/	
	
	public static boolean searchChef(String name,Chef[] arr){
		try{
			for(int i=0;i<arr.length;i++){
				
				if(name==arr[i].getName()){
					return true;
				}
			}
			return false;
			
		}
		catch(Exception e){
		}
		return true;
	}
/**
 * @return **********************************************************************************/
	
	public static  Chef getHighestPaidChef(Chef[] arr){
			try{
				int i,j=0;
				double max=arr[0].getSalary();
				for(i=0;i<=arr.length;i++){
					if(arr[i].getSalary()>max){
						max=arr[i].getSalary();
						j=i;
					}
				}
				System.out.println(arr[j].getChefId());
				System.out.println(arr[j].getName());
				System.out.println(arr[j].getSalary());
			}
			catch(NullPointerException e){
				return null;
			}
			return null;
		}
/************************************************************************************/
	
	public static int countSpecialization(String arr1[][],String n){
		
		return 0;
	}
	
	
}
