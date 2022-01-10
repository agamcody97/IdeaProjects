/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsplitfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author agamk
 */
public class StringSplitFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        name=sc.nextLine();
        String[] b=name.split("[ ]+");// split() is very important function which takes delimeter as a input. Humesha iske argument me ek "" hoga hi aur [ ] iska matlab space hai 
        System.out.println(""+b[3]); // space ki jagah :,?,/ kuch bhi ho skta hai bas wahi same chhez sentence me bhi honi chahiye jo har word ko alag karti ho. 
//        //Chahe toh koi A-Z albhabet bhi ho skta h.

    }  
    }
		

     

