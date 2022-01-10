/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicepaper;

import java.util.Scanner;

/**
 *
 * @author agamk
 */
public class FindEvenOddInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0,b=0;
        int[] number= new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 integers");
        for(int i=0;i<5;i++){
            number[i]=sc.nextInt();
        if((number[i]%2)==0){
            a++;
            }
        else if((number[i]%2)!=0){
            b++;
        }           
    }
        System.out.println("Total number of even number are: "+a);
        System.out.println("Total number of odd number are: "+b);
}
}