/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author agamk
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fact=1,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to find the factorial: ");
        num=sc.nextInt();
        if(num==0 || num==1)
            System.out.println("Factorial is 1");
        else if(num!=0 || num!=1){
            for(int i=1; i<=num;i++){
                fact=fact*i;
        }
            System.out.println("The Factorial of "+num+" is "+fact);
        }
            
    }
    
}
