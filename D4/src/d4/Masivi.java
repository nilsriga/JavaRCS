/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Masivi {
    
    public static void saraksts() {
        List<Integer> skaitluSaraksts = new ArrayList<>();
        
        skaitluSaraksts.add(2);
        skaitluSaraksts.add(3);
        skaitluSaraksts.add(4);
        
        skaitluSaraksts.remove(0);
        System.out.println(skaitluSaraksts.get(1));
        
        for(int i = 0; i<skaitluSaraksts.size(); i++) {
            System.out.println(skaitluSaraksts.get(i));
        }
        
        //forEach takaa 
        for(int sk : skaitluSaraksts) {
            System.out.println(sk);
        }
    }
    
    public static void izvade(int[] a) {
        for (int i = 0; i<a.length; i++) {
            if ((a[i] % 2) != 0) {
                a[i] = 0;
            }
            System.out.print(a[i] + ", ");
        }
    }
    public static void nepara() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet saraksta garumu: ");
        int a = sc.nextInt();
        
        int[] masivs = new int[a];

        for (int i = 0; i < masivs.length; i++) {
            System.out.println("Ievadiet skaitli: ");
            masivs[i] = sc.nextInt();
        }
        
        izvade(masivs);
    }
    
    public static void viendimensiju() {
        
        Scanner sc = new Scanner(System.in);
        
        int a = 3;        
        int[] masivs = new int[a];
        
        masivs[0] = 1;
        masivs[1] = 2;
        masivs[2] = 3;
        
        for (int i = 0; i<masivs.length; i++) {
            System.out.println("Ievadiet skaitli: ");
            masivs [i] = sc.nextInt();
        }
        
        for (int i = 0; i < masivs.length; i++) {
            System.out.println(masivs[i]);
        }
    }
    
    public static void vMasivs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet saraksta garumu: ");
        int a = sc.nextInt();
        
        int[] masivs = new int[a];
        
        int b = 0;
        for (int i = 0; i < masivs.length; i++) {
            System.out.println("Ievadiet skaitli: ");
            masivs[i] = sc.nextInt();
            b += masivs[i];
        }
        
        for (int i = 0; i < masivs.length; i++) {
            System.out.print(masivs[i] + ", ");
        }

        System.out.println();
        System.out.println(b);
    }

    public void martinaZvaigznites() {
        
        String[] zvaigznes = new String[4];

        for (int i = 0; i < zvaigznes.length; i++) {
            zvaigznes[i] = zvaigznes[i - 1] + "*";
            if (i == 0) {
                zvaigznes[i] = "*";
            } else {
                zvaigznes[i] = zvaigznes[i - 1] + "*";
            }
        }
        for (int i = 0; i < zvaigznes.length; i++) {
            System.out.println(zvaigznes[i]);
        }
        for (int i = zvaigznes.length-2; i>=0; i-- ) {
            System.out.println(zvaigznes[i]);
        }
    }
    
    
    public static void masivuZvaigznites() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet lielāko zvaigznīšu skaitu garumu: ");
        int a = sc.nextInt() - 1;

        String[] masivs = new String[a];

        String b = "*";
        
        if (a == 0) {
            System.out.println("*");
            masivuZvaigznites();
        }
        
        
        if ((a % 2) == 0) {
            for (int i = 0; i <= (masivs.length - (masivs.length / 2)); i++) {
                masivs[i] = b;
                b += "*";
                System.out.println(masivs[i]);
            }
            for (int i = (masivs.length - (masivs.length / 2))-1; i >= 0; i--) {
                System.out.println(masivs[i]);
            }
        } else {
            for (int i = 0; i <= (masivs.length - (masivs.length / 2))-1; i++) {
                masivs[i] = b;
                b += "*";
                System.out.println(masivs[i]);
            }
            for (int i = (masivs.length - (masivs.length / 2))-1; i >=0; i--) {
                System.out.println(masivs[i]);
            }
        }
//        for (int i = 0; i < (masivs.length - (masivs.length / 2))+1; i++) {
//            masivs[i] = b;
//            b = "*";
//        }

//        String c = "*";
//        for (int i = (masivs.length - (masivs.length / 2)) + 1; i > 0; i--) {
//            masivs[i] = b;
//            
//        }
        masivuZvaigznites();
    }
}




