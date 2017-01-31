package com;


public class PrimeDemo {

	public static void main(String[] args) {
		int arr[]=new int[]{3, 7, 1, 2, 10, 5};
		addPrimeNumbers(arr);
		//System.out.println(ans);
		
	}
	
public static double addPrimeNumbers(int [] arr){
	int n=arr.length;
	double sum=0.0;
	for(int i=0;i<n;i++){
		if(isPrime(arr[i])){
			sum+=arr[i];
			//System.out.println(arr[i]);
			}
		
		}
	
	return sum;
}
public static boolean isPrime(int n){
	if(n==0||n==1)
		return false;
	else if(n==2)
		return true;
	else
		for(int i=2;i<n;i++){
			if(n%i==0)
				return false;
		}
	return true;
}
}
