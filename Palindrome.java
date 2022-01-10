/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author agamk
 */
public class Palindrome {


    public static void main(String[] args) {
        // TODO code application logic here
//        int n=122321;
//        String number=String.valueOf(n);  // coverts the value of integer into char array
//        char[] digits=number.toCharArray(); 
//        System.out.println(""+digits.length);
//
//        for(int i=0;i<digits.length/2;i++){
//            if(digits[i]==digits[digits.length-(i+1)]){  
//               System.out.println("THIS IS A Palindrome");
//            }            
//            else 
//                System.out.println("THIS IS NOT A PALINDROME");
//        }

           String number; //string enter becoz string me hum number and char value kuch bhi store kr skte hain
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter any Number or String to check its a Palindrome or not!");
           number=sc.nextLine(); //store  the string in number variable
           StringBuilder sb=new StringBuilder(number); //stringbuilder in-built class will create the char array
           sb.reverse();     //reverse() is in-built function of StringBuilder class which can reverse the char string stored in array
           String rev=sb.toString(); //toString is also another function defined in StringBuilder which gives the same string as the input string
           if(rev.equals(number)){
              System.out.println("This is a Palindrome");
            }         
           else
               System.out.println("This is NOT a Palindrome");
    }   
}
