package com.agam_programs;

import java.util.LinkedList;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int num=0, sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        num=sc.nextInt();
        LinkedList<Integer> stack=new LinkedList<Integer>();
        for(;num!=0;){
            stack.push(num%10);
            num=num/10;
        }
        for(int i=0;i<stack.size();i++){
            sum=sum+stack.get(i);
        }
        System.out.println("The sum of digits is:"+sum);
    }
}
