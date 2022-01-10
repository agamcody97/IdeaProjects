package com.agam_programs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int n;
        System.out.println("Enter the number between 1 to 999 to check its Armstrong number or not:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>=1 && n<=9)
            System.out.println("This is an Armstrong number");
        else{
            int a=n%10; //a=3 //if n=153 then a=3,b=15,c=5 and e=1
            int b=n/10; //b=15
            int c=b%10; //c=5
            int e=b/10; //e=1

            int f=(a*a*a)+(c*c*c)+(e*e*e);
            if(f==n)
                System.out.println("This is an Armstrong number");
            else
                System.out.println("This is not an Armstrong number");
        }
    }
}
