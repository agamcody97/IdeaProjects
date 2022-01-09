package com.agam_programs;

import java.util.Scanner;

public class LCM {
        public static int lcm(int a, int b){
            int i=0,j=0,c=1,d=1;
            for (i = 1; i <=a; i++) {  //this loop is for bigger number
                c = a * i;
                for (j = 1; j <= a; j++) { //this loop is for small second number which will run till the first number
                    d = b * j;
                    if (c == d) {
                        return c;
                    }
                }
            }
            return 0;
        }
        public static void main(String[] args){
            int a, b;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the First Number");
            a=sc.nextInt();
            System.out.println("Enter the Second Number");
            b=sc.nextInt();
            System.out.println("Lowest Common Multiple: "+lcm(a,b));
        }
    }

