/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //uzd1();
        //zarosanas();
        loginsUnParole();
    }
    
    public static void uzd1() {
        
        System.out.println("Kā tevi sauc?");
        //int, char, bool, double, string, float
        
        Scanner sc = new Scanner(System.in);
        
        String simboli;
        
        simboli = sc.nextLine(); // ja tas ir String
        
        System.out.println("Tevi sauc " + simboli);
        
        
        Scanner xc = new Scanner (System.in);
        
        System.out.println("Kā jūs sauc?");
        
        String ievade = xc.nextLine();
        
        System.out.println("Sveiki, " + ievade + "!");
        
        uzd1();
    }
    
    private static void zarosanas(){
        
        /*String b = "e";
        if(b.equals("a")){
            
        }
        else{
            
        }
                
        if(b.equals("a")) {
            
        }
        else if
                (b.equals("c")) {
            
        }
        else{
            
        }
        int a = 3;
        
        switch(a){
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        } */
        
        System.out.println("Ievadi skaitli: ");
        Scanner sc = new Scanner(System.in);
        
        int skaitlis;
        
        skaitlis = sc.nextInt();
        
        if (skaitlis < 5) {
            System.out.println("*");
        } else if (skaitlis >= 5) {
            System.out.println("**");
        }
        
        zarosanas();
        
    }
    
    public static void salidzinasana() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ievadi susliku (skaitli): ");
        int skaitlis = sc.nextInt();
        
        if(skaitlis>=5) {
            System.out.println("*");}
                    else {
                            System.out.println("**");
                            }
        String simboli = "AAA";
        int simboluSkaits = simboli.length();
        
    }
    
    private static void loginsUnParole() {
        String loginsEx = "lietotajs";
        String paroleEx = "abc123";

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Lietotajvards: ");
        String lietotajvards = sc.nextLine();
        System.out.println("Parole: ");
        String parole = sc.nextLine();
        
        if (lietotajvards.length() <= 12 && lietotajvards.length() >= 3 && parole.length() > 5 && parole.length() <= 10 && lietotajvards.equals(loginsEx) && parole.equals(paroleEx)) {
                System.out.println("Login Succesful!");
            }else {
                System.out.println("Error in login and/or password");
        }
        
        //3-12 simobli
        //5-10 parole
        
        // ja kluda - tad pasaka ka kluda
        // ja nav kluda, tad japarbauda vai sakrit ar augsejiem
        
        loginsUnParole();
    }

    
    
}
