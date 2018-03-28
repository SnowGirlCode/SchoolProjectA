/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondematernite;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author SnowGirl
 */
public class NurseDetails extends javax.swing.JFrame {
Connection con=null;
    PreparedStatement pat=null;
    ResultSet ra=null;
    /**
     * Creates new form NurseDetails
     */
    public NurseDetails() {
        initComponents();
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
          
        Image image = new ImageIcon("D:\\5.Etude\\3rd Year Licence\\Projet de fin d'etude\\icones\\hopi2.png").getImage();
setIconImage(image);
showTableData();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        med_details1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        action_label = new javax.swing.JLabel();
        search_panel = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        reset_panel = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        prenom = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jScrollPane1.setBorder(new javax.swing.border.MatteBorder(null));

        med_details1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        med_details1.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        med_details1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pseudo", "Password", "Nom", "Prénom", "Date de naissance", "Lieu de naissance", "Adresse", "Téléphone", "Email", "Diplome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        med_details1.setGridColor(new java.awt.Color(255, 255, 255));
        med_details1.setSelectionBackground(new java.awt.Color(0, 119, 135));
        med_details1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                med_details1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(med_details1);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Delete_30px.png"))); // NOI18N
        jLabel5.setToolTipText("Fermer");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Subtract_30px_1.png"))); // NOI18N
        jLabel15.setToolTipText("Réduire");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(74, 173, 173));

        action_label.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        action_label.setForeground(new java.awt.Color(74, 173, 173));
        action_label.setText("Details sur les sages femmes");

        search_panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                search_panelMousePressed(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Search_25px.png"))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(41, 39, 40));
        jLabel34.setText("Rechercher");

        javax.swing.GroupLayout search_panelLayout = new javax.swing.GroupLayout(search_panel);
        search_panel.setLayout(search_panelLayout);
        search_panelLayout.setHorizontalGroup(
            search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addContainerGap())
        );
        search_panelLayout.setVerticalGroup(
            search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34))
                .addContainerGap())
        );

        reset_panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reset_panelMousePressed(evt);
            }
        });

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Reset_25px.png"))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(41, 39, 40));
        jLabel32.setText("Annuler");

        javax.swing.GroupLayout reset_panelLayout = new javax.swing.GroupLayout(reset_panel);
        reset_panel.setLayout(reset_panelLayout);
        reset_panelLayout.setHorizontalGroup(
            reset_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reset_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        reset_panelLayout.setVerticalGroup(
            reset_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reset_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reset_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel32))
                .addContainerGap())
        );

        nom.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        nom.setToolTipText("Nom de la sage-femme");

        jLabel12.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(41, 39, 40));
        jLabel12.setText("Nom:");

        jLabel16.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(41, 39, 40));
        jLabel16.setText("Prenom:");

        prenom.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        prenom.setToolTipText("Prénom de la sage-femme");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(search_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(reset_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(262, 262, 262))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(action_label))
                            .addGap(293, 293, 293)))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(755, 755, 755)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel5)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(action_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reset_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(319, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        setExtendedState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel15MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        Toolkit.getDefaultToolkit().beep();
        int confirmed = JOptionPane.showConfirmDialog(null,
            "Êtes-vous sûr de vouloir quitter le programme?", "Message de Confirmation de sortie",
            JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            dispose();
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MousePressed

    private void med_details1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_med_details1MouseClicked

/*
        DefaultTableModel model = (DefaultTableModel) med_details1.getModel();
        int index =*/
    }//GEN-LAST:event_med_details1MouseClicked

    private void search_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_panelMousePressed
    showTableDataSpecial();
    }//GEN-LAST:event_search_panelMousePressed

    private void reset_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_panelMousePressed
     nom.setText("");
     prenom.setText("");
     showTableData();
    }//GEN-LAST:event_reset_panelMousePressed
public void showTableData(){
    try{
        
      con = DriverManager.getConnection("jdbc:mysql://localhost/maternite_profile","root","mysql");
      String sql = "SELECT * FROM nurse";
      pat = con.prepareStatement(sql);
      ra = pat.executeQuery();
     
    med_details1.setModel(DbUtils.resultSetToTableModel(ra));
    
    }
    catch (Exception ex){
          JOptionPane.showMessageDialog(null, ex);
    }
}
    public void showTableDataSpecial(){
    try{
        
      con = DriverManager.getConnection("jdbc:mysql://localhost/maternite_profile","root","mysql");
      String sql = "SELECT * FROM nurse where Nom =? and Prenom=?";
      pat = con.prepareStatement(sql);
      pat.setString(1,nom.getText());
            pat.setString(2,prenom.getText());
                  
           ra = pat.executeQuery();
    med_details1.setModel(DbUtils.resultSetToTableModel(ra));
    
    }
    catch (Exception ex){
          JOptionPane.showMessageDialog(null, ex);
    }
}
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
            java.util.logging.Logger.getLogger(NurseDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NurseDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NurseDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NurseDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NurseDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel action_label;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable med_details1;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    private javax.swing.JPanel reset_panel;
    private javax.swing.JPanel search_panel;
    // End of variables declaration//GEN-END:variables
}
