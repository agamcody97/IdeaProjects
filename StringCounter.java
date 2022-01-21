package com.agam_programs;

import java.util.Scanner;

public class StringCounter {
    public static void main(String[] args) {
        String[] s=new String[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        for(int j=0;j<50;j++){                // for(int i = 1; scan.hasNext()== true; i++){
                                             // System.out.println(i + " " + scan.nextLine());
            s[j]= sc.nextLine();
            if(s[j].isEmpty()){
                break;
            }
        }
        for(int i=0;i<50;i++){
            if(!s[i].isEmpty()){
                System.out.println((i+1)+" "+s[i]);
            }
            else
                break;
        }
    }
}
