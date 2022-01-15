package com.agam_programs;


import java.util.Scanner;

public class StringIntegerCounter {
        public static void main(String args[] ) throws Exception {
            String s;
            int count=0, n=0, num=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a Sentence");
            s=sc.nextLine();
            String[] spil=s.split(" "); //split is a function of String class
               for(int i=0;i<spil.length;i++){
                   if(spil[i].contains("0") || spil[i].contains("1") ||spil[i].contains("2") ||spil[i].contains("3") ||spil[i].contains("4")
                           ||spil[i].contains("5") ||spil[i].contains("6") ||spil[i].contains("7") ||spil[i].contains("8") ||spil[i].contains("9")){
                       count++;
                   }
                   else
                       n++;
                   }
            System.out.println("No of Integers:"+count);
            System.out.println("No of Words:"+n);
        }
}



