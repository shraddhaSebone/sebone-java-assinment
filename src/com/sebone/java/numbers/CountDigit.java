
/*
 * class name:-count the digit of numbers
 * objective : count_digit
 * author :-Shraddha Choudhary
 * date :- 17-03-2022
 * */
package com.sebone.java.numbers;
import java.util.*;
public class CountDigit{
    	public static int count(int num) {
    		/**
    		 * name:-count
    		 * @param number
    		 * @return number
    		 */
    		int count=0;
    		if(num==0)
    			return 1;
    	
    		while(num!=0) {
    			num=num/10;
    			count++;
    		}
    		return count;    	
    	}
    public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);						        	  //Take input form user
			System.out.println("Enter a number:");
			int n=sc.nextInt();
			CountDigit countDigit=new CountDigit(); 							 		 //Create object
			System.out.println("Number of digit is :"+countDigit.count(n));	 			  //Call a recursive function count
	}
}
