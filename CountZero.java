/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countzero;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author agamk
 */
public class CountZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String number;
//        int c=0;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter any number to Count Zeros");
//        number=sc.nextLine();
//        StringBuilder sb=new StringBuilder(number);
//        for(int i=0;i<sb.length();i++)
//        if((sb.charAt(i)=='0')){
//            System.out.print("1");
//            System.out.print(" ");
//        }
          int n,c=0,i;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number to Count Zeros");
          n=sc.nextInt();
          LinkedList<Integer> stack=new LinkedList<Integer>();
          for(;n!=0;){
              stack.push(n%10); //to insert the elements in the stack
              n=n/10;
          }
          System.out.println("");
          System.out.println("Total number of Digits in Stack: "+stack.size()); //new function to calculate the size of stack
          for(i=0;i<stack.size();i++){
          if(stack.get(i)==0) //new function in LinkedList class which gives back the value of [i] at 
             c++; // if there is any value which is equal to 0 then increment in c  **************// VERY VERY VERY IMPORTANT CONCEPT**************************
          }
           System.out.println("Total count of Zeros is: "+c);
    }   
}
