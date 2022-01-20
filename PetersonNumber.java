package com.agam_programs;

import java.util.LinkedList;
import java.util.Scanner;

public class PetersonNumber {

    public static int fact(int a){ //function to calculate factorial
        int b=1;
        for (int i = 1; i <= a; i++) {
            b = b * i;
        }
        return b;
    }

    public static void main(String[] args) {
        int num, b = 1, sum = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        num=sc.nextInt();
        int temp=num; //temporary variable to store the number (num ki value neeche ke while loop se baad me 0 ho jaegi....usse bachne ke lie hume num ko ek temporary variable me save krna hoga)
        for(;num!=0;){ //while loop
            int x=num%10;
            sum+=fact(x); //sum=sum+fact(x) with factorial function call
            num=num/10;
        }
        System.out.println("Sum of all Integers factorial is "+sum);
        if(sum==temp) {
            System.out.println(temp + " is a Peterson number");
        }
        else {
            System.out.println(temp + " is not a Peterson number");
        }
    }
}
