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
public class pattern3 {
    public static void main(String[] args) {
        // isse ap aaram se square and rectangle bana skte ho bas agar row<5 and col<5 kr doge toh square ban jaega agar alag alag karoge like
        //row<5 and col<4 then rectangle banega stars se
        int row,col;
        for(row=0;row<5;row++){
            for(col=0;col<4;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
