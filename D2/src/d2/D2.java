/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class D2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        izvadeMatematika();

        // TODO code application logic here
    }
    private static void izvadeMatematika() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ieavdi 1. skaitļus: ");
        int a = sc.nextInt();
        System.out.println("ieavdi 2. skaitļus: ");
        int b = sc.nextInt();
       
        System.out.println("izvelies darbibu. Raksti \"+\" vai \"-\", via \"vaiIr\" ");
        String darbiba = sc.next();
       
        
        if(darbiba.equals("+")) {
            System.out.println(saskaitisana(a, b));            
        } else if (darbiba.equals("-")) {
            System.out.println(atnemsana(a, b));
        } else if (darbiba.equals("vaiIr")) {
            boolean c = nulleLidzDesmit(a, b);
            if (c == true) {
                System.out.println("Skaitlis IR no 0 - 10 ieskaitot");
            } else if (c == false) {
                System.out.println("Skaitlis NAV no 0 - 10 ieskaitot");
            }
        }else {
            System.out.println("kļūda darbibas izvēlē");

        }
        izvadeMatematika();
    }
    
    private static int saskaitisana(int a, int b) {
        int result = 0;

        result = a + b;
        
        return result; 
    }
    
    private static int atnemsana(int a, int b) {
        int result = 0;
        
        result = a - b;
        
        return result;
    }
    
    private static boolean nulleLidzDesmit(int a, int b) {
        boolean result = true;
        
        if (a >= 0 && a <= 10 && b >= 0 && b <= 10) {
            return result = true;
        } else {
            return result = false;
        }
    }
}
