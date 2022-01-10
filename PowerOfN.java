/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powerofn;

import java.util.Scanner;

/**
 *
 * @author agamk
 */
public class PowerOfN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,num=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to calculate power of any number");
        x=sc.nextInt();     
        System.out.println("Enter the Power you want to calculate");
        y=sc.nextInt(); 
        for(int i=1;i<=y;i++){
            num=num*x;            
        }
        System.out.println(""+x+" to the power "+y+" is: "+num);
    }   
}
