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
public class pattern2 {
    public static void main(String[] args) {
        int row,col;
        for(row=0;row<4;row++){
            for(col=0;col<4-row;col++){ // ye column<4-row isleye kia hai kyuki agar no. of lines total 4 hain aur 
                //hume ek relationship dikhani hai row and no. of total lines ke beech me iss tarah se ki hamare columns aa jae.
                System.out.print("* ");
            }
            System.out.println();
        }
    }
            
}
    

