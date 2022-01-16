package com.agam_programs;

import java.util.Scanner;

public class LuckyFourProblem {

    public static void main(String[] args) {
                int num=0,n=0,x=0, no=0;
                 Scanner sc=new Scanner(System.in);
                  num=sc.nextInt();
                 for(int i=0;i<num;i++){
                     x=sc.nextInt();
                    for(;x!=0;){
                        no=x%10;
                        x=x/10;
                        if(no==4)
                          n++;
                    }
                    System.out.println(""+n);
                     n=0; //to reset the value of n after the first integer is checked
                 }
    }
}
