package com.agam_programs;

public class pattern7 {
    public static void main(String[] args) {
        for(int i=5;i>=0;i--){    //lower half
            for (int j = 0; j <=i; j++)
            {
                System.out.print("*");
            }

            for(int j=0;j<2*(5-i);j++){
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<=5;i++){    //upper half
            for (int j = 0; j <=i; j++)
            {
                System.out.print("*");
            }

            for(int j=0;j<2*(5-i);j++){
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
