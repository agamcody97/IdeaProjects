package com.agam_programs;

import java.util.Scanner;

public class ReverseLetter {
    public static void main(String[] args) {
        String s1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        s1=sc.nextLine();
        StringBuilder sb=new StringBuilder(s1);
        String s2=String.valueOf(sb.reverse());
        System.out.println(s2);
    }
}
