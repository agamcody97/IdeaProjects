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
public class pattern4 {
    public static void main(String[] args) {
        int row,col;                  //LOGIC BUILDING
        for(row=0;row<4;row++){
            int TotalColsInRow=row+1; //ye rows and lines ke combination ka formula hai jisse hume total no. of elements ka pata chalega in column 1,
            //column 2, column3 and column 4
            int noOfspaces=4-TotalColsInRow;
            for(int s=0;s<noOfspaces; s++){ // ye loop space dene ke lie chal rha hai
                System.out.print(" ");
            }
            for(col=0;col<TotalColsInRow;col++){ // ye loop column ke lie chal rha hai
                System.out.print("* "); //agar yahan space nikal denge toh ek alag pattern baneg....try krke dekhna 
            } 
            
            System.out.println();
        }
    }
    }

