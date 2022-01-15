/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agam_programs;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author agamk
 */
public class LinkedListStack {

    public static void main(String[] args) {

       int n;
       System.out.println("Enter the number to print in proper and reverse order:");
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       properOrder(n);
       reverseOrder(n);
    }
    public static void properOrder(int n){   // this is a function to print in proper order
        LinkedList<Integer> stack=new LinkedList<Integer>(); //definition to create new linked list with the name Stack!
        for(;n!=0;){ //naya style hai while loop likhne ka without increment....jiska matlb hota hai this for loop will run till n is not equals to 0.
                stack.push(n%10); //stack ke 2 main functions hote hain ek push aur dusra pop.....abhi yahan pr push function jo bhi value hogi usko sbse neeche rakhega 
                 n=n/10;            // jaise maine int n=1234 kia toh push(n%10) sbse pehle stack memory me 4 rakhega then 3,2, and last me 1.
          } 
          for(;!stack.isEmpty();)
          System.out.print(stack.pop()+" "); // pop krte hue sbse pehle 1 bahr aaega, phr 2,3,4. kyuki sbse pehle andr 4 gaya tha toh last me bhi 4 hi aaega.
          System.out.println();
          
    }    
    public static void reverseOrder(int n){// this is a function to print in reverse order
        for(;n!=0;){//naya style hai while loop likhne ka without increment....isko hum for(;n!=0;)bhi likh skte hain jaise upar likha hai aur while(n>0) bhi thik hai
            int c=n%10;
            n=n/10;
            System.out.print(c+" ");
        }
    }
    
}
