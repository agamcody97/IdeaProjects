package com.agam_programs;

import java.util.LinkedList;
import java.util.Scanner;

public class TrailingZero {
    public static void main(String[] args) {
        long c=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){ //normal for loop which will run till n
            c=c*i; //calculating the factorial of n
        }
        System.out.println("Factorial of "+n+" is: "+c);
        LinkedList<Long> stack=new LinkedList<>(); //LinkedList of name stack will get the elements of c stored in array
        while(c!=0){
            stack.push(c%10);//push the elements in stack
            c=c/10;
        }
        int temp=0;
        System.out.println("Number of elements in the Stack: "+stack.size());
          for(int i=stack.size();i>0;i--){ //this for loop will start from end and run till i>0 and decrement at every step
              if(stack.get(i-1)==0){
                  temp++;
              }
              else //this statement is important becoz when the value is not equal to 0, it comes on else statement and breaks the for loop.
                  break;
          }
        System.out.println("Number of Zeros in the end "+temp);
    }
}
//        int n1 = n;
//        long ctr = 0;
//        while (n != 0)
//        {
//            ctr=ctr+n/5;  //formula for calculating trailing zeros in a factorial
//            n=n/5;
//        }
//        System.out.printf("Number of trailing zeros of the factorial "+n1+" is: "+ctr);
//        System.out.printf("\n");
//
//        float a=in.nextFloat();
//        float b=in.nextFloat();
//        System.out.println(Math.max(a,b)); //calculating the Maximum of 2 float numbers using Math in-built class
