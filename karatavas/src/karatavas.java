/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

/**
 *
 * @author User
 */
public class karatavas extends javax.swing.JFrame {
    /**
     * Creates new form karatavas
     */
    public karatavas() {
        initComponents();
        Scanner sc = new Scanner(System.in);
        boolean irVinnejis = false;
        ArrayList<String> burtuSaraksts = charedWord();

        String vards = "";

        for (String burts : burtuSaraksts) {
            vards += burts;
        }
        jLabel1.setText(vards);

        String lastLetter = "";

//         = System.console().readLine();
//        System.out.println(lastLetter);
        while (jLabel1.getText().contains("*")) {
            irVinnejis = false;

            jTextField1.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                    JTextField textField = (JTextField) e.getSource();
                    String text = textField.getText();

                    if (e.getKeyCode() == KeyEvent.VK_ENTER && text.matches("([A-Za-z])")) {
                        System.out.println("ENTER key pressed");
                        System.out.println(text);
                        textField.setText("");
                        // nevarēju nosūtīt mainīgā vērtību arpus listenera, jo teica, ka tas nav final, bet string es nevarēju pielikt AtomicReference
                    } else {

                    }
                }
            });
        }
//            for (int i = 0; i < vards.length(); i++) {
//
////                lastLetter = sc.nextLine();
//
//                if (vards.contains(lastLetter)) {
//                    System.out.println("contains jaa");
//                }
//            }
//            irVinnejis = true;

        }

    

    private ArrayList<String> charedWord() {
        String vards = wordBank();

        ArrayList<String> burtuSaraksts = new ArrayList<String>(Arrays.asList(vards.split("")));

        // viens variants kā parveidot char masīvu par listu un tad var iet cauri. Tad eju cauri un pielieku lista elementu stirngam ar append(). String vētība ir vētība + list.get(i);
        return burtuSaraksts;
    }

    private String wordBank() {
        ArrayList<String> vardi = new ArrayList<String>();
        vardi.add("taurenis");
        vardi.add("mašīna");
        vardi.add("ābece");
        vardi.add("kafija");
        vardi.add("burtnīca");
        vardi.add("paklājs");
        vardi.add("dzelzsceļš");
        vardi.add("šūpoles");
        vardi.add("vārdnīca");

        for (String vards : vardi) {
            vards.toUpperCase();
        }

        int randomNum = (int) (Math.random() * vardi.size());

        String vards = vardi.get(randomNum);

        return vards;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");

        jTextField1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(karatavas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(karatavas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(karatavas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(karatavas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new karatavas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
