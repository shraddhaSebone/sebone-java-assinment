/*
 * class name:-reverse a string
 * objective : reverse_string
 * author :-Shraddha Choudhary
 * date :- 17-03-2022
 * */
package com.sebone.java.numbers;
import java.util.*;
public class ReverseString {
		//recursive function to reverse a string
		public String revString(String str) {
			/**
			 * name:-reverseString
			 * @param String
			 * @return str
			 */
			//	checks if the string is empty   
			String rev = "";
			if(str.isEmpty()){  
//				System.out.println("String is empty.") ;  
					//if the above condition is true returns the same string 
				return str;  
			}
			else{  
				for (int i = str.length()-1; i >=0; i--) {
					rev=rev+str.charAt(i);
				}
				//abSystem.out.println(rev);
			}
			return rev;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);              	  //Take input form user
			System.out.println("Enter a string");
			String str = sc.next();
			
		    ReverseString reverseString=new ReverseString(); 
		    //Create object
			System.out.print("String is reverse "); 
			System.out.println(reverseString.revString(str));
			
			sc.close();//Call a recursive function reverseString
        }
}
