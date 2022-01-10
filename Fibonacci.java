/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author agamk
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int previousNumber=0,nextNumber=1,sum,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value till you want to print fibonnaci series: ");
        num=sc.nextInt();
        System.out.print(previousNumber+","+nextNumber);  // print 0,1 just like that
        for(int i=2;i<num;i++){     //start the loop from 2 and run it till num-1 
             sum=previousNumber+nextNumber;    // sum is adding the values of previousNumber and nextNumber     formula is sum=a+b;
                                                                                                                          //a=b
                                                                                                                          //b=sum
             System.out.print(","+sum);
             previousNumber=nextNumber;            //now the value of nextNumber is inside previousNumber
             //System.out.println(""+previousNumber);
             nextNumber=sum;       //now the value of sum is inside nextNumber
             //after this the value of nextNumber will go to the first sum=previousNumber+nextNumber
            // System.out.println(""+nextNumber);
        }
    }
    }

