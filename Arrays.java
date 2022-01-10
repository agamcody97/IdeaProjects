package com.agam_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int n;
        ArrayList<Integer> list=new ArrayList<Integer>(10);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store in the array list");
        n=sc.nextInt();
        System.out.println("Enter "+n+" elements");
        for (int i = 1; i <= n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
