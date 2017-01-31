package com;
public class EvenDemo {

	public static void main(String[] args) {
		int arr[]=new int[]{1, 11, 8, 2, 1, 101};
		findEvenValues(arr);
}
public static int[] findEvenValues(int[] arr){
	try{
	 int countLength = 0;
	 for (int i = 0; i < arr.length; i++) {
	        if (arr[i] % 2 == 0) {
	            countLength++; 
	        }
	    }
	 int[] filArray = new int[countLength];
	 int j = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] % 2 == 0) {
	            filArray[j] = arr[i]; 
	            j++;
	        }
	    }
	    
	    return filArray;
	}
	catch(ArrayIndexOutOfBoundsException e){
		 System.out.println("Array is out of Bounds"+e);
		 return null;
	}
	
	
}
}
