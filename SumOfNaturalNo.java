/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author agamk
 */

public class SumOfNaturalNo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,sum=0,no = 0;
        Scanner sc=new Scanner(System.in);   
        System.out.println("Enter the number to calculate the sum of N natural numbers:\n");
        no=sc.nextInt();
        for(n=1;n<=no;n++){
            sum=sum+n; //sum integer me baar baar plus hokr value badh rahi hai sum ki aur phir for loop ke bahr jakr print krdi vo value
        }
        System.out.println("The Sum of "+no+" Natural number is: "+sum);
    //}
    }
}
