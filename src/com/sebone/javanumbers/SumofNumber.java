/*
 * class name:-sum of given numbers
 * objective : sum_numbers
 * author :-Shraddha Choudhary
 * date :- 17-03-2022
 * */

package com.sebone.javanumbers;
import java.util.*;
public class SumofNumber {
	 static int sum=0;
	public static int sumofnumber(int num){
		/**
		 * name:-sumofnumber
		 * param number,sum
		 * @return sum
		 */
		if(num < 0)
			return 0;
		return 	(num*(num+1)/2);
       	}	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);						        	  //Take input form user
		System.out.println("Enter a number");
		int num=sc.nextInt();
		SumofNumber sumofNumber = new SumofNumber(); 							//Create object
		//int sum=0;
		System.out.println("Sum of number is "+ sumofNumber.sumofnumber(num));			//Call a recursive function sumofnumber
	}
}
