/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author agamk
 */
public class DataStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Constructors and arrays in java
        int i=0;
       String s=null;
       //store 5 integer value
       int[] number=new int[5];
       
       //store 5 string values
       String[] name=new String[5];
       
       //here i am creating 2 instances of student class which is defined below
       student s1 = new student();
       student s2=new student(i,s);
       
       System.out.println(""+s1.number);
       System.out.println(""+s1.name);
       
       System.out.println(""+s2.number);
       System.out.println(""+s2.name);
    }
    
}
class student{ //create student class to store 5 values of students which includes 5 numbers and 5 names
           int number;
           String name;
           
           student(){
               this.number=1;
               this.name="agam";
           }
           student(int i, String s){
               this.number=2;
               this.name="sharma";
             
         }
         
       }
