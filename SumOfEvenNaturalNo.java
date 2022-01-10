/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofevennaturalno;

import static java.lang.Double.sum;
import static java.lang.Float.sum;
import java.util.Scanner;

/**
 *
 * @author agamk
 */
public class SumOfEvenNaturalNo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to calculate the sum of even natural numbers:\n");
        int i=sc.nextInt();
        for(int n=1;n<=i;n++){
            if(n%2==0) //first check wheather its even or not
                sum=sum+n; //sum integer me baar baar plus hokr value badh rahi hai sum ki aur phir for loop ke bahr jakr print krdi vo value
        }
        System.out.println("The sum of "+i+" natural even numbers is: "+sum);
    }
    
}
