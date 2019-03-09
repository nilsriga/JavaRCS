/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package augosaseciba;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AugosaSeciba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        augosaSeciba();
    }

    public static void augosaSeciba() {

        ArrayList<Integer> s = new ArrayList<>();
        s = ievade(s);


        for (int i = 0; i < s.size(); i++) {
            for (int j = 0; j < s.size(); j++) {
                if (s.get(i) <= s.get(j)) {
                    int temp = s.get(i);
                    s.set(i, s.get(j));
                    s.set(j, temp);
                }
            }
        }
        for (int i = 0; i < s.size(); i++) {
            for (int j = 0; j < s.size(); j++) {
                int temp = s.get(i);
                if (temp <= s.get(j)) {
                    s.set(i, s.get(j));
                    s.set(j, temp);
                }
            }
        }
 
        System.out.println(s);

    }

    public static ArrayList<Integer> ievade(ArrayList<Integer> skaitluSaraksts) {
        System.out.println("Ievadiet Skaitļus. Kad gribat pārtraukt ievadi nospiediet ENTER");

        Scanner sc = new Scanner(System.in);
        String ievade = "0";
        int ievadesReize = 2;

        while (isStringInt(ievade)) {
            System.out.println("Ievadiet " + (ievadesReize - 1) + ". skaitli, vai ENTER");
            String s = sc.nextLine();
            ievadesReize += 1;

            if (s.equals("")) {
                break;
            } else {
                skaitluSaraksts.add(Integer.parseInt(s));
            }
        }

        return skaitluSaraksts;
    }

    public static boolean isStringInt(String s) {

        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
