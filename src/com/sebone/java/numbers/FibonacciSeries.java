/*
 * class name:-fibonacci_series
 * objective :fibonacci_series
 * author :-Shraddha Choudhary
 * date :- 17-03-2022
 * */
package com.sebone.java.numbers;
import java.util.Scanner;
public class FibonacciSeries {
	
	public int[] isfibonacci(int n){ 
		/**
		 * name:-isfibonacci
		 * @param n
		 * @return number
		 */
		
		if(n == 0)
		{
			int a[] = {};
			return a;
		}
		int arr[] = new int[n];
		arr[0] = 0;
		
		if(n==1){
			System.out.println(0);
			return arr;
		}
		
		arr[1] = 1;
		
//		System.out.print(n1+" "+n2);
		for (int i = 2; i < n; i++){
//			n3 = n1 + n2;
//			n1 = n2;
//			n2 = n3;
			arr[i] = arr[i - 2] + arr[i - 1];
//			System.out.print(" "+n3 + " ");
		}
		return arr;
	}       
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);							        	  //Take input form user
		System.out.println("Enter a number");
		int n=sc.nextInt();
		FibonacciSeries fibonacciSeries=new FibonacciSeries(); 							//Create object
		
		int [] arr = fibonacciSeries.isfibonacci(n);	
		
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + "  ");//Call a recursive function isfibonacci
	}
}