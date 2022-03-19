
/*
 * class name:-finding_prime_numbers
 * objective :prime number or not
 * author :-Shraddha Choudhary
 * date :- 17-03-2022
 * */
package com.sebone.java.numbers;
 
import java.util.Scanner;
public class PrimeNumber{//camel case PrimeNumbers
	
	/**
	 * name:-isPrime
	 * @param n
	 * @return true
	 */

	public boolean isPrime(int n){
		boolean prime = true;
		if(n<=1){
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)
				prime = false;
		}
		return prime;
      }	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);						        	  //Take input form user
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		PrimeNumber primeNumber=new PrimeNumber(); 			//Create object
		boolean finding_prime_numbers= primeNumber.isPrime(n);					//Call a recursive function isPrime
		if(finding_prime_numbers){
			System.out.println(n+ " Prime number");
		}else{
			System.out.println(n+ " Not Prime");				
	    }
	}
}

