/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longeststringinarray;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author agamk
 */
public class LongestStringInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          String[] name=new String[4];
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter");
          for(int i=0;i<4;i++)
          name[i]=sc.nextLine();
          //UPR LIKHI LINES KE BAAD AP KOI BHI CODE USE KR SKTE HO
          String longest=Stream.of(name).max(Comparator.comparingInt(String::length)).get();
          System.out.println("Longest word is: "+longest); 
          
          //YE CODE BHI SAHI HAI**********************************************************************
//          int index=0;
//          int elementLength=name[0].length();
//          for(int i=1;i<name.length;i++){
//              if(name[i].length()>elementLength){
//                  index=i;
//                  elementLength=name[i].length();
//              }
//          }
//          System.out.println("LONGEST WORD IS: "+name[index]);

    }
    
}
