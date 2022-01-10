package com.agam_programs;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agamk
 */

import java.util.*;
import java.io.*;
//import static towerofhanoi.ToH.toh;

class ToH{
    public static void toh(int n,char source,char destination, char help){
        if(n==0)
            return;
        toh(n-1,source, help, destination);
        System.out.println(source+"->"+destination);
        toh(n-1,help,source,destination);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Disks");
        n=sc.nextInt();
        toh(n,'A','C','B');
    } 
   }
