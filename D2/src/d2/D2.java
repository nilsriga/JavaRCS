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
        //izvadeMatematika();
        //cikli();
        kapinasana();
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
            if (c) {
                System.out.println("Skaitlis IR no 0 - 10 ieskaitot");
            } else if (!c) {
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
    private static void cikli(){
        //for, foreach, while, do..while
        /*for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        int j = 0;
        
        while(j<10) {
            System.out.println(j);
            j++;
        }
        
        j = 10;
        
        do{
            System.out.println(j);
            j++;
        }while(j<10);
        
        String a = "aa";
        String b = "bb";
        String c = a+b;
        c = c + a + b;
        c += a+b; */
        Scanner sc = new Scanner(System.in);
        String a = "";
        while (!a.equals("*****")) {
            System.out.println(a);
            a += "*";
        }
    }
    private static void kapinasana() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ieavdi 1. skaitļus: ");
        int a = sc.nextInt();
        System.out.println("ieavdi 2. skaitļus: ");
        int b = sc.nextInt();
        
        int result = a;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        
        System.out.println(result);

        kapinasana();
    }
    
}
