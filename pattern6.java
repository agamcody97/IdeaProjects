package com.agam_programs;

public class pattern6 {
    public static void main(String[] args) {
        int row,col;
        for(int i=0;i<10;i++){
            for(int k=0;k<=i;k++){ //spaces ke lie ek aur loop aur dono loop pehle wale for loop ke andr hi lagenge
<<<<<<< HEAD
                System.out.print(" ");//spaces ka formula pata krne ke lie apko spaces and rows ke beech me relation nikalna hoga
=======
                System.out.print(" ");
>>>>>>> origin/master
            }
            for(int j=0;j<10-i;j++) {
                System.out.print("*");//agar yahan space nikal denge toh ek alag pattern banega....try krke dekhna
            }
            System.out.println(" ");
        }
    }
}
