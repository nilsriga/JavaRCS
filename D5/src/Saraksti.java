
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */


public class Saraksti {
    
    public void skaitluSumma() {
        
        ArrayList<Integer> skaitluSaraksts = new ArrayList<>();
        skaitluSaraksts = ievade(skaitluSaraksts);
        
        int skaitluSumma = 0;
        
        for(int sk : skaitluSaraksts) {
            skaitluSumma += sk;
        }
        
        System.out.println(skaitluSumma);
    }
    
    public void paraVaiNepara() {
        ArrayList<Integer> skaitluSaraksts = new ArrayList<>();
        skaitluSaraksts = ievade(skaitluSaraksts);
        
        for(int sk : skaitluSaraksts) {
            if ((sk % 2) != 0) {
                sk = 0;
            }
            System.out.print(sk + ", ");
        }
    }
    
    public ArrayList<Integer> ievade(ArrayList<Integer> skaitluSaraksts) {
        System.out.println("Ievadiet Skaitļus. Kad gribat pārtraukt ievadi nospiediet ENTER");
        
        Scanner sc = new Scanner(System.in);
        String ievade = "0";
        int ievadesReize = 2;
        boolean vaiSkaitlis = true;
        
        while(isStringInt(ievade)) {
            System.out.println("Ievadiet " + (ievadesReize - 1) + ". skaitli, vai ENTER");
            skaitluSaraksts.add(sc.nextInt());
//            ievade = Integer.parseInt(skaitluSaraksts.get(skaitluSaraksts.size()-1));
            ievadesReize += 1;
        }
        return skaitluSaraksts;
//         tas sākumā uztasi tukšu stringu un tad pārbaudi vai tas ir string vai skaitis, ja skaitlis - ievadi, ja nē - tad apsātidini. takā skaitlis.typeof() līdzīgu

    }

    public boolean isStringInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
