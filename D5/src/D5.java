/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author User
 */
public class D5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PirmaUzdevumaMenu();
    }

    private static void PirmaUzdevumaMenu() {
        Scanner sc = new Scanner(System.in);
        Saraksti izvade = new Saraksti();
        int darbiba = 666;

        while (darbiba != 0) {
            System.out.println("Izvēlieties darbību. Nospiediet \"1\", lai saskaitītu,\"2\" , lai nomainītu pret nullināšanu, un \"0\", lai izietu");
            darbiba = sc.nextInt();
            if (darbiba == 1) {
                izvade.skaitluSumma();
            } else if (darbiba == 2) {
                izvade.paraVaiNepara();
            } else {
                System.out.println("Tāda darbiba neeksistē!");
                System.out.println("Izvēlieties darbību. Nospiediet \"1\", lai saskaitītu,\"2\" , lai nomainītu pret nullināšanu, un \"0\", lai izietu");
                darbiba = sc.nextInt();
            }
        }
    }

}
