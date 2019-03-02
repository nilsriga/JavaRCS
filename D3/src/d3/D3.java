/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class D3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //skaitluSumma();
        //menuSaskaitisana();
        kalkulators();
        parKlasem jaunsObjeks  = new parKlasem();
        parKlasem.fun();
        // nestradas, jo nav statiska parKlasem.notStaticFun();
    }
    
    public static void kalkulators() {
        Scanner sc = new Scanner(System.in);
        String izvele = "";
        
        while(!izvele.equals("iziet")) {
            System.out.println("izvelies darbibu. Raksti \"+\", \"-\", \"*\", \"/\", \"^\", vai \"iziet\" ");
            izvele = sc.nextLine();
            
            switch(izvele) {
                case "+" :
                    System.out.println("saskaitisana");
                    saskaitisanaArIzvadi();
                    break;
                case "-" :
                    System.out.println("atnemsana");
                    atnemsanaArIzvadi();
                    break;
                case "*" :
                    System.out.println("reizinasana");
                    reizinasanaArIzvadi();
                    break;
                case "/" :
                    System.out.println("dalisana");
                    dalisanaArIzvadi();
                    break;
                case "^" :
                    System.out.println("kapinasana");
                    kapinasanaArIzvadi();
                    break;
                case "iziet" :
                    break;
                default :
                    System.out.println("Nepareiza ievade");
                    break;
            }
        }
    }
    
    private static void menu1(){
        Scanner sc = new Scanner(System.in);
        int izvele = 1;
        
        while(izvele != 0) {
            System.out.println("Izvēlieties darbību: 1(saskaitisana), 2(atnemsana), vai 0");
            izvele = sc.nextInt();
            
            switch(izvele) {
                case 1 :
                    System.out.println("1. izvēle");
                    saskaitisanaArIzvadi();
                    break;
                case 2 :
                    System.out.println("2. izvēle");
                    atnemsanaArIzvadi();
                    break;
                case 0 :
                    break;
                default :
                    System.out.println("Nepareiza ievade");
                    break;
            }
        }
    }
    
    
    
    
        private static void skaitluSumma() {
        Scanner sc = new Scanner(System.in);
        
        double summa = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("ieavdi " + i + ". skaitli: ");
            summa += sc.nextInt();
        }
        
        System.out.println(summa);
    }
        
        private static void menuSaskaitisana() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("izvelies darbibu. Raksti \"+\" vai \"-\", vai \"iziet\" ");
        String darbiba = sc.next();
        
        double a = 0;
        double b = 0;
       
        while (!darbiba.equals("iziet")) {
            switch (darbiba) {
                case "+":
                    System.out.println("ieavdi 1. skaitļus: ");
                    a = sc.nextInt();
                    System.out.println("ieavdi 2. skaitļus: ");
                    b = sc.nextInt();
                    System.out.println(saskaitisana(a, b));
                    System.out.println("izvelies darbibu. Raksti \"+\" vai \"-\", vai \"iziet\" ");
                    darbiba = sc.next();
                    break;
                case "-":
                    System.out.println("ieavdi 1. skaitļus: ");
                    a = sc.nextInt();
                    System.out.println("ieavdi 2. skaitļus: ");
                    b = sc.nextInt();
                    System.out.println(atnemsana(a, b));
                    System.out.println("izvelies darbibu. Raksti \"+\" vai \"-\", vai \"iziet\" ");
                    darbiba = sc.next();
                    break;
                default:
                    System.out.println("kļūda darbibas izvēlē");
                    System.out.println("izvelies darbibu. Raksti \"+\" vai \"-\", vai \"iziet\" ");
                    darbiba = sc.next();
                    break;
            }
        }

    }
        
        private static double saskaitisana(double a, double b) {
        double result = 0;

        result = a + b;
        
        return result; 
    }
        
        private static double atnemsana(double a, double b) {
        double result = 0;
        
        result = a - b;
        
        return result;
    }
        
//        public static int mainigie() {
//            int a = 0;
//            int b
//        }

        
    public static double ievade(double i) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ieavdi " + (int)i + ". skaitli: ");
        double x = sc.nextDouble();

        return x;
    }
    
    private static void rezultataIzvade(double x) {

        if (x == Math.ceil(x)) {
            System.out.println((int)x); 
        } else {
            System.out.println(x);
        }
        
    }
        
    private static void saskaitisanaArIzvadi() {
        double result = 0;
        double a = ievade(1);
        double b = ievade(2);       
        result = a + b;
        
        rezultataIzvade(result);
    }
        
    private static void atnemsanaArIzvadi() {
        double result = 0;
        double a = ievade(1);
        double b = ievade(2);
        result = a - b;
        
        rezultataIzvade(result);

    }
        
    private static void reizinasanaArIzvadi() {
        double result = 0;
        double a = ievade(1);
        double b = ievade(2);
        result = a * b;
        
        rezultataIzvade(result);

    }
                
    private static void dalisanaArIzvadi() {
        double result = 0;
        double a = ievade(1);
        double b = ievade(2);
        result = a / b;
        
        rezultataIzvade(result);

    }
                        
    private static void kapinasanaArIzvadi() {
        double a = ievade(1);
        System.out.println("kapinataja skaitlis - pakape");
        double b = ievade(2);

        double result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        
        rezultataIzvade(result);

    }
}
