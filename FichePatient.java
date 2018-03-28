/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondematernite;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author SnowGirl
 */
public class FichePatient extends javax.swing.JFrame {

    /**
     * Creates new form FichePatient
     */
    public FichePatient() {
        initComponents();
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
          setTitle("Gestion de Maternié: Interface d'Administrateur");
        Image image = new ImageIcon("D:\\5.Etude\\3rd Year Licence\\Projet de fin d'etude\\icones\\hopi2.png").getImage();
setIconImage(image);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        sidepic = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        patient = new javax.swing.JLabel();
        patientNom = new javax.swing.JLabel();
        patient1 = new javax.swing.JLabel();
        patient2 = new javax.swing.JLabel();
        patient3 = new javax.swing.JLabel();
        patient4 = new javax.swing.JLabel();
        patient5 = new javax.swing.JLabel();
        patient6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        sidepic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wallpaperPatient.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Delete_30px_4.png"))); // NOI18N
        jLabel5.setToolTipText("Fermer");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Subtract_30px_2.png"))); // NOI18N
        jLabel15.setToolTipText("Réduire");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });

        patient.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        patient.setForeground(new java.awt.Color(0, 0, 51));
        patient.setText("PATIENTE:");

        patientNom.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N

        patient1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        patient1.setForeground(new java.awt.Color(41, 50, 40));
        patient1.setText("Nom & Prénom:");

        patient2.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        patient2.setForeground(new java.awt.Color(41, 50, 40));
        patient2.setText("Date Naissance:");

        patient3.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        patient3.setForeground(new java.awt.Color(41, 50, 40));
        patient3.setText("Assurance:");

        patient4.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        patient4.setForeground(new java.awt.Color(41, 50, 40));
        patient4.setText("Code:");

        patient5.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        patient5.setForeground(new java.awt.Color(41, 50, 40));
        patient5.setText("Telephone:");

        patient6.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        patient6.setForeground(new java.awt.Color(41, 50, 40));
        patient6.setText("Adresse:");

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addComponent(sidepic)
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sidepanelLayout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(patient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patientNom))
                            .addGroup(sidepanelLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(patient2)
                                    .addComponent(patient1)
                                    .addComponent(patient3)
                                    .addComponent(patient4)
                                    .addComponent(patient5)
                                    .addComponent(patient6))))
                        .addGap(0, 368, Short.MAX_VALUE))))
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(2, 2, 2)
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patient)
                    .addComponent(patientNom))
                .addGap(50, 50, 50)
                .addComponent(patient1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patient2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patient3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patient4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patient5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patient6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        Toolkit.getDefaultToolkit().beep();
        int confirmed = JOptionPane.showConfirmDialog(null,
            "Êtes-vous sûr de vouloir quitter le programme?", "Message de Confirmation de sortie",
            JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            dispose();
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        setExtendedState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel15MousePressed

        
    int xy;
    int xx;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }                                    

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
         xx = evt.getX();
        xy = evt.getY();
    }                                    

    
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
            java.util.logging.Logger.getLogger(FichePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FichePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FichePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FichePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FichePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel patient;
    private javax.swing.JLabel patient1;
    private javax.swing.JLabel patient2;
    private javax.swing.JLabel patient3;
    private javax.swing.JLabel patient4;
    private javax.swing.JLabel patient5;
    private javax.swing.JLabel patient6;
    private javax.swing.JLabel patientNom;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JLabel sidepic;
    // End of variables declaration//GEN-END:variables
}