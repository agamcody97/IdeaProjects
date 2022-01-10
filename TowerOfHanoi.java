/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerofhanoi;

import java.util.Scanner;

/**
 *
 * @author agamk
 */
public class TowerOfHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // s=2^n-1  where n is number of disks and s is the steps it will take to solve ToH
        int x=2,y,num=1,n=1;
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the Number to calculate power of any number");
//        x=sc.nextInt();     
        System.out.println("Enter the number of disks for Tower of Hanoi");
        y=sc.nextInt(); 
        for(int i=1;i<=y;i++){
            num=num*x;          //calculate the power of 2^n here                 
            n=num-1;            //then minus -1 every time it calculates the power 2^n
            System.out.println("Total steps taken for "+i+" disks is: "+n);
        }       
    }   
}
