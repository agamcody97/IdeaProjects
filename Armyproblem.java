package com.agam_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Armyproblem {
    public static void main(String[] args) {
        int soldiers;
        int temp=0, temp1=0;
        ArrayList<Integer> list=new ArrayList<Integer>(10);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of soldiers");
        soldiers=sc.nextInt();
        System.out.println("Enter the number of weapons each soldier should have");
        for(int i=0;i< soldiers;i++){
            list.add(sc.nextInt());
        }

        System.out.println("Number of weapons each soldier has is: "+list.toString());
        for(int i=0;i< soldiers;i++){
            if(list.get(i)%2==0){
                temp++;
            }
            else if(list.get(i)%2!=0){
                temp1++;
            }
        }
        System.out.println("Total no of soldiers having even number of weapons "+temp);
        System.out.println("Total no of soldiers having odd number of weapons "+temp1);
    }
}
