/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author agamk
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int no;
         boolean isPrime=true; //boolean data type stores only 2 values true and false
        System.out.println("Enter the number to check its prime number or not");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        if(no==1) //first chk for 1
            System.out.println("THIS IS A PRIME NO.");
        else if(no!=1){ //if number is other than 1 then enter the for loop
          for(int i=2;i<no;i++){  //start the for loop from 2 becoz 1 is already printed and run the for loop till (no-1)
              if(no%i==0){ //if remainder is 0 then its only divisible by itself and come out of the loop
                       isPrime=false; //now this value will go to the if statement which is defined below
                      break; //helps u to come out of the loop
         }
    }
    }
        if(isPrime)
            System.out.println("THIS IS A PRIME NO.");
        else
            System.out.println("THIS IS not A PRIME NO.");
    }  
}
