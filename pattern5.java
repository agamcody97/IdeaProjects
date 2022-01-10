/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopattern;

/**
 *
 * @author agamk
 */
public class pattern5 {
    public static void main(String[] args) {
        int row,col;
        for(row=0;row<4;row++){ //this is outer for-loop for printing rows from 0,1,2,3
            for(col=0;col<=row;col++){ //this is inner for-loop for printing elements in the column 
        System.out.print("* "); // to print in the same line using print function
            }
            System.out.println(); // to print in the different line using print function
        }
        
        for(row=1;row<6;row++){ //if you will see the output...you will notice that this for loop is starting from 5th row of output
            for(col=0;col<6-row;col++){ // ye column<6-row isleye kia hai kyuki agar no. of lines total 6 hain aur 
                //hume ek relationship dikhani hai row and no. of total lines ke beech me iss tarah se ki hamare columns aa jae.
                System.out.print("* ");
            }
            System.out.println();
        }               
        }
        
    }

