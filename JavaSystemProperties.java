/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author agamk
 */
public class JavaSystemProperties {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Java Version: "+System.getProperty("java.version")); 
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));  
        System.out.println("Java Home: "+System.getProperty("java.home"));  
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));  
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));  
        System.out.println("Java Class Path: "+System.getProperty("java.class.path"));  
        
        System.out.println(System.getProperties());  
        System.out.println(""+System.getenv());
    }
    
}
