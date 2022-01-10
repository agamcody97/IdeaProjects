/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiplication;

import java.util.Scanner;

/**
 *
 * @author agamk
 */
public class MatrixMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,k,row1,column1,row2,column2;
        boolean done=true;
        Scanner sc=new Scanner(System.in);   
        System.out.println("Enter the number of rows in Matrix 1: ");
        row1=sc.nextInt();
        System.out.println("Enter the number of columns in Matrix 1: ");
        column1=sc.nextInt();
        System.out.println("Enter the number of rows in Matrix 2: ");
        row2=sc.nextInt();
        System.out.println("Enter the number of columns in Matrix 2: ");
        column2=sc.nextInt();
        
        if(column1!=row2)
            System.out.println("Matrix Multiplication not possible!");
        else if(column1==row2){
            
        
            int[][]MatrixElements1=new int[50][50];
            System.out.println("Enter the elements of Matrix 1");           
            for(i=0;i<row1;i++){
                for(j=0;j<column1;j++){
                    MatrixElements1[i][j]=sc.nextInt(); //giving the values to matrix 1
                }
            }
            int[][] MatrixElements2=new int[50][50];
            System.out.println("Enter the elements of Matrix 2");  
            for(i=0;i<row2;i++){
                for(j=0;j<column2;j++){
                    MatrixElements2[i][j]=sc.nextInt();//giving the values to matrix 2
                }
            }
            int[][] Result=new int[50][50]; //this is the resulting matrix
            System.out.println("Multiplication of Matrices is:");  
            for(i=0;i<row1;i++){ //first matrix ki row tak chalega ye loop
                for(j=0;j<column2;j++){ //second matrix ke column tak chalega ye loop
                    for(k=0;k<row2;k++){ //koi fark nhi padta agar mai yahan row2 ki jagah column1 likhta becoz column1=row2 hota h tabhi matrix multiplication is possible
                        Result[i][j]=Result[i][j]+MatrixElements1[i][k]*MatrixElements2[k][j];                  //c[i][j] += a[i][k] * b[k][j]
                    }
                    System.out.print(" "+Result[i][j]);
                }
                System.out.println(); 
            }       
    }    
}
}