package com.agam_programs;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        a=sc.nextInt();
        double b = Math.sqrt(a+1);
        System.out.println("Value of b is "+b);
        System.out.println("Value of Math.floor(b) is "+Math.floor(b));
        if(b-Math.floor(b)==0){
            System.out.println(a+" is a Sunny Number!");
        }
        else
            System.out.println(a+" is not a Sunny number....Sorry");
    }
}
