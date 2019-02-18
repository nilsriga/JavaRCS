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
        System.out.println("Kā tevi sauc?");
        //int, char, bool, double, string, float
        
        Scanner sc = new Scanner(System.in);
        
        String simboli;
        
        simboli = sc.nextLine(); // ja tas ir String
        
        System.out.println("Tevi sauc " + simboli);

    }
    
}
