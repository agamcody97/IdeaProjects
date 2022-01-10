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
public class Forloopattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int row,col;
        for(row=0;row<4;row++){ //this is outer for loop
            for(col=0;col<=row;col++){ //this is inner for loop
        System.out.print("* "); // to print in the same line using print function
            }
            System.out.println(); // to print in the different line using print function
        }
    }
    }
    

