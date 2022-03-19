/*
 * class name:-factoiral number
 * objective :Java program to find factorial of given number
 * author :-Shraddha Choudhary
 * date :- 17-03-2022
 * */
package com.sebone.java.numbers;
import java.util.*;
public class FactorialNumber {
          	public static int isfactorial(int num){
          		/**
          		 * name:-isfactorial
          		 * @param number
          		 * @return number
          		 */
          		int fact=1;
          		if(num>=0){
          			for(int i=num;i>=1;i--)
          				fact=fact*i;
//          			System.out.println("fact are "+fact);
        	   	}
          		else{
          			System.out.println("Number are not define"); 	
          		}
          		return fact;
          	 }
          public static void main(String[] args) {
        	  Scanner sc=new Scanner(System.in);        	  //Take input form user
        	  System.out.println("Given number is :");
        	  int num=sc.nextInt();
        	  FactorialNumber factorialNumber=new FactorialNumber();     //Create object
        	  System.out.println(factorialNumber.isfactorial(num));                            //Call a recursive function isfactorial
          }
}