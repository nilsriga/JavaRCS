/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
public class D10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        menu();
//        nolasīt failu un izvadīt uzdevumus kas jādara
//        txt failā viena rinda 1 uzdevums.
//        javar pievonot jaunu
//          javar izdzest konnkretu
//          javar notirit failu
//          ja ir komandrinda, tad jāieliek ciklā
//          ja GUI tad patstavigi jāiemacas darboties ar awt-list
        // TODO code application logic here
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);

        String izvele = "";

        while (!izvele.equals("5")) {
            System.out.println("Ievadīt = 1, Nolasīt = 2, Iztīrīt Failu = 3, Vērtību Maina = 4 Izslēgt = 5");
            izvele = Integer.toString(sc.nextInt());
            if (izvele.equals("1")) {
                ievadeFaila();
                izvele = "";
                failaNolasisana();
                menu();
            }
            if (izvele.equals("2")) {
                failaNolasisana();
                izvele = "";
                menu();
            }
            if (izvele.equals("3")) {
                izdzesana();
                izvele = "";
                menu();
            }
            if (izvele.equals("4")) {
                vertibuMaina();
                izvele = "";
                menu();
            }
            break;
        }
    }

    public static void vertibuMaina() {
        String path = "C:\\Users\\User\\JavaRCS\\D10\\menu.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line = bufferedReader.readLine();

            ArrayList<String> vertibuSaraksts = new ArrayList<>();
            int vertibasIndex = 0;
            Scanner sc = new Scanner(System.in);

            String izvele = "";

            while (line != null) {
                System.out.println("Vertiba numur " + vertibasIndex + ". :" + line);
                line = bufferedReader.readLine();
                vertibuSaraksts.add(line);
                vertibasIndex++;
            }
            vertibasIndex = 0;

            while (!izvele.equals("4")) {
                System.out.println("Nomainīt vērtību = 1, Izdzest vērtību = 2 Nolasīt = 3, Uz Galveno Menu = 4");
                izvele = Integer.toString(sc.nextInt());
                if (izvele.equals("1")) {
                    String mainasIzvele = "1";
                    while (!mainasIzvele.equals("")) {
                        System.out.println("Ievadiet vērtības indeksu, kuru vēlaties izmainīt vai ENTER, lai izietu. Indekss: ");

                        String izdzesamaisIndex = sc.nextLine();

                        System.out.println("Ievadiet vērtības indeksu, kuru vēlaties izmainīt vai ENTER, lai izietu. Indekss: ");

                        String jaunaVertiba = sc.nextLine();

                        if (mainasIzvele.equals("") || izvele.equals("")) {
                            break;
                        } else {
                            vertibuSaraksts.set(Integer.parseInt(izdzesamaisIndex), jaunaVertiba);
                        }

                        izdzesamaisIndex = "";

                        for (String sk : vertibuSaraksts) {
                            if (bufferedReader.readLine() == "") {
                                bufferedWriter.newLine();
                            }
                            bufferedWriter.write(sk);
                            bufferedWriter.newLine();
                        }
                        bufferedWriter.close();

                        vertibuSaraksts.clear();

                        while (line != null) {
                            System.out.println("Vertiba numur " + vertibasIndex + ". :" + line);
                            line = bufferedReader.readLine();
                            vertibuSaraksts.add(line);
                            vertibasIndex++;
                        }
                        vertibasIndex = 0;

                        System.out.println("Vai velaties izdzest citu vertibu? Ja = 1, nē = 2");

                        mainasIzvele = sc.nextLine();

                        if (mainasIzvele.equals("")) {
                            break;
                        } else {
                            System.out.println("Ievadiet vērtības indeksu, un vērtība tiks izdzēsta vai ENTER, lai izietu. Indekss: ");

                            izdzesamaisIndex = sc.nextLine();

                            vertibuSaraksts.remove(Integer.parseInt(izdzesamaisIndex));

                            izdzesamaisIndex = "";

                            for (String sk : vertibuSaraksts) {
                                if (bufferedReader.readLine() == "") {
                                    bufferedWriter.newLine();
                                }
                                bufferedWriter.write(sk);
                                bufferedWriter.newLine();
                            }
                            bufferedWriter.close();

                            vertibuSaraksts.clear();
                        }
                    }

                    izvele = "";
                    vertibuSaraksts.clear();
                    vertibuMaina();
                    izvele = "";
                    vertibuSaraksts.clear();
                    vertibuMaina();
                }
                if (izvele.equals("2")) {

                    String mainasIzvele = "1";
                    while (!mainasIzvele.equals("")) {
                        vertibuSaraksts.clear();

                        
                        while (line != null) {
                            line = bufferedReader.readLine();
                            vertibuSaraksts.add(line);
                        }

                        
                        System.out.println("Ievadiet vērtības indeksu, un vērtība tiks izdzēsta vai ENTER, lai izietu. Indekss: ");

                        String izdzesamaisIndex = "";

                        izdzesamaisIndex = Integer.toString(sc.nextInt());

                        vertibuSaraksts.remove(izdzesamaisIndex);

                        izdzesamaisIndex = "";
                        
                        

                        File f = new File("C:\\Users\\User\\JavaRCS\\D10\\menu.txt");
                        
                            f.delete();
                        

                        for (String sk : vertibuSaraksts) {

                            bufferedWriter.append(sk);
                            bufferedWriter.newLine();
                        }
                        bufferedWriter.close();

                        vertibuSaraksts.clear();

                        while (line != null) {
                            System.out.println("Vertiba numur " + vertibasIndex + ". :" + line);
                            line = bufferedReader.readLine();
                            vertibuSaraksts.add(line);
                            vertibasIndex++;
                        }
                        vertibasIndex = 0;

                        System.out.println("Vai velaties izdzest citu vertibu? Ja = 1, nē = 2");

                        mainasIzvele = sc.nextLine();

                        if (mainasIzvele.equals("")) {
                            break;
                        } else {
                            System.out.println("Ievadiet vērtības indeksu, un vērtība tiks izdzēsta vai ENTER, lai izietu. Indekss: ");

                            izdzesamaisIndex = sc.nextLine();

                            vertibuSaraksts.remove(Integer.parseInt(izdzesamaisIndex));

                            izdzesamaisIndex = "";

                            for (String sk : vertibuSaraksts) {
                                if (bufferedReader.readLine() == "") {
                                    bufferedWriter.newLine();
                                }
                                bufferedWriter.write(sk);
                                bufferedWriter.newLine();
                            }
                            bufferedWriter.close();

                            vertibuSaraksts.clear();
                        }
                    }

                    izvele = "";
                    vertibuSaraksts.clear();
                    vertibuMaina();
                }
                if (izvele.equals("3")) {

                    while (line != null) {
                        System.out.println("Vertiba numur " + vertibasIndex + ". :" + line);
                        line = bufferedReader.readLine();
                        vertibuSaraksts.add(line);
                        vertibasIndex++;
                        vertibuSaraksts.clear();
                        vertibasIndex = 0;

                    }

                    izvele = "";
                    vertibuMaina();
                }
                if (izvele.equals("4")) {
                    izvele = "";
                    vertibuSaraksts.clear();
                    menu();
                }
                break;
            }

            bufferedWriter.close();

//            for (String sk : s) {
//                if (bufferedReader.readLine() != null) {
//                    bufferedWriter.newLine();
//                }
//                bufferedWriter.write(sk);
//                bufferedWriter.newLine();
//
//            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
        }
    }

    public static void izdzesana() {
        String path = "C:\\Users\\User\\JavaRCS\\D10\\menu.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {

            bufferedWriter.write("");
            bufferedWriter.close();
        } catch (IOException e) {
        }
    }

    public static void failaNolasisana() {
        String path = "C:\\Users\\User\\JavaRCS\\D10\\menu.txt";

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
        String path = "C:\\Users\\User\\JavaRCS\\D10\\menu.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            ArrayList<String> s = new ArrayList<>(ievade());

            for (String sk : s) {
                if (bufferedReader.readLine() == "") {
                    bufferedWriter.newLine();
                }
                bufferedWriter.write(sk);
                bufferedWriter.newLine();

            }

            bufferedWriter.close();
        } catch (IOException e) {
        }
    }

    public static ArrayList<String> ievade() {
        System.out.println("Ievadiet Skaitļus. Kad gribat pārtraukt ievadi nospiediet ENTER");

        ArrayList<String> skaitluSaraksts = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String ievade = "0";
        int ievadesReize = 2;

        while (1 == 1) {
            System.out.println("Ievadiet " + (ievadesReize - 1) + ". uzdevumu, vai ENTER");
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
}
