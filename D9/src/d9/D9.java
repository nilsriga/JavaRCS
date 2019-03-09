/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class D9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String izvele = "";

        while (!izvele.equals("2")) {
            System.out.println("Ievadīt = 0, izvadīt = 1, beigt darbu = 2");
            izvele = Integer.toString(sc.nextInt());
            if (izvele.equals("0")) {
                ievadeFaila();
                izvele = "";
            }
            if (izvele.equals("1")) {
                failaNolasisana();
                izvele = "";
            }
            break;
        }
    }

    public static void failaNolasisana() {
        String path = "C:\\Users\\User\\JavaRCS\\D9\\settings.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            // exception handling
        } catch (IOException e) {
            // exception handling
        }
    }

    public static void ievadeFaila() {
        String path = "C:\\Users\\User\\JavaRCS\\D9\\settings.txt";

//        ArrayList<Integer> skaitluSaraksts = new ArrayList<>();
//        skaitluSaraksts = ievade(skaitluSaraksts);
//        StringBuilder skaitli = new StringBuilder();
//        for (int sk : skaitluSaraksts) {
//            s.add(Integer.parseInt(sk));
//            skaitli.append(sk + "\n");
//        }
//        System.out.println(skaitli);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
//            String fileContent = "";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            ArrayList<String> s = new ArrayList<>(ievade());
//            ArrayList<String> s = new ArrayList<String>();
//            s = ievade(skaitluSaraksts);

            for (String sk : s) {
//            s.add(Integer.parseInt(sk));
                if (bufferedReader.readLine() == "") {
                    bufferedWriter.newLine();
                }
                bufferedWriter.write(sk);
                bufferedWriter.newLine();

            }

            bufferedWriter.close();
        } catch (IOException e) {
            // exception handling
        }
    }

    public static ArrayList<String> ievade() {
        System.out.println("Ievadiet Skaitļus. Kad gribat pārtraukt ievadi nospiediet ENTER");

        ArrayList<String> skaitluSaraksts = new ArrayList<>();

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
                skaitluSaraksts.add(s);
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
