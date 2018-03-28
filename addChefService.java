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

/**
 *
 * @author SnowGirl
 */
public class addChefService extends javax.swing.JFrame {
Connection con=null;
    PreparedStatement pat=null;
    ResultSet ra=null;
    /**
     * Creates new form addChefService
     */
    public addChefService() {
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
        Form_Panel = new javax.swing.JPanel();
        qte_label = new javax.swing.JLabel();
        prix_label = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        date_field = new javax.swing.JFormattedTextField();
        add_button = new javax.swing.JToggleButton();
        cancel_button = new javax.swing.JToggleButton();
        name_label = new javax.swing.JLabel();
        nom_icon = new javax.swing.JLabel();
        date_icon = new javax.swing.JLabel();
        action_label = new javax.swing.JLabel();
        qte_min_label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        name_label1 = new javax.swing.JLabel();
        nom_icon1 = new javax.swing.JLabel();
        lieu = new javax.swing.JTextField();
        date_label = new javax.swing.JLabel();
        lieu_label = new javax.swing.JLabel();
        nom_icon2 = new javax.swing.JLabel();
        lname_field = new javax.swing.JTextField();
        qte_min_label1 = new javax.swing.JLabel();
        nom_icon4 = new javax.swing.JLabel();
        nom_icon5 = new javax.swing.JLabel();
        nom_icon6 = new javax.swing.JLabel();
        nom_icon7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adresse = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        diplome = new javax.swing.JTextArea();
        tel = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        nom_icon3 = new javax.swing.JLabel();
        name_label2 = new javax.swing.JLabel();
        nom_icon8 = new javax.swing.JLabel();
        name_label3 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        pseudo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 702));

        Form_Panel.setBorder(new javax.swing.border.MatteBorder(null));

        qte_label.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        qte_label.setText("Adresse:");

        prix_label.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        prix_label.setText("Email:");

        name_field.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        name_field.setForeground(new java.awt.Color(0, 51, 51));
        name_field.setText("le nom du Chef Service:");
        name_field.setToolTipText("");
        name_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                name_fieldFocusGained(evt);
            }
        });
        name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_fieldActionPerformed(evt);
            }
        });

        date_field.setForeground(new java.awt.Color(0, 51, 51));
        date_field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        date_field.setText("aaaa/mm/jj");
        date_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                date_fieldFocusGained(evt);
            }
        });
        date_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_fieldActionPerformed(evt);
            }
        });

        add_button.setBackground(new java.awt.Color(255, 255, 255));
        add_button.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        add_button.setForeground(new java.awt.Color(74, 173, 173));
        add_button.setText("Ajouter");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        cancel_button.setBackground(new java.awt.Color(255, 255, 255));
        cancel_button.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        cancel_button.setForeground(new java.awt.Color(74, 173, 173));
        cancel_button.setText("Annuler");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        name_label.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        name_label.setText("Nom:");

        nom_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Name_Tag_20px.png"))); // NOI18N

        date_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Expired_20px.png"))); // NOI18N

        action_label.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        action_label.setForeground(new java.awt.Color(74, 173, 173));
        action_label.setText("Ajouter le Chef Service:");

        qte_min_label.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        qte_min_label.setText("Téléphone:");

        jSeparator1.setBackground(new java.awt.Color(74, 173, 173));

        name_label1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        name_label1.setText("Prénom:");

        nom_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Name_Tag_20px.png"))); // NOI18N

        lieu.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        lieu.setForeground(new java.awt.Color(0, 51, 51));
        lieu.setText("le lieu de naissance");
        lieu.setToolTipText("");
        lieu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lieuFocusGained(evt);
            }
        });
        lieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lieuActionPerformed(evt);
            }
        });

        date_label.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        date_label.setText("Date de naissance:");

        lieu_label.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        lieu_label.setText("Lieu de naissance:");

        nom_icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Name_Tag_20px.png"))); // NOI18N

        lname_field.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        lname_field.setForeground(new java.awt.Color(0, 51, 51));
        lname_field.setText("le prénom du Chef Service:");
        lname_field.setToolTipText("");
        lname_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lname_fieldFocusGained(evt);
            }
        });
        lname_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lname_fieldActionPerformed(evt);
            }
        });

        qte_min_label1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        qte_min_label1.setText("Diplome:");

        nom_icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Name_Tag_20px.png"))); // NOI18N

        nom_icon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Name_Tag_20px.png"))); // NOI18N

        nom_icon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Name_Tag_20px.png"))); // NOI18N

        nom_icon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Name_Tag_20px.png"))); // NOI18N

        adresse.setColumns(20);
        adresse.setRows(5);
        jScrollPane1.setViewportView(adresse);

        diplome.setColumns(20);
        diplome.setRows(5);
        jScrollPane2.setViewportView(diplome);

        tel.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        tel.setForeground(new java.awt.Color(0, 51, 51));
        tel.setText("numéro de téléphone");
        tel.setToolTipText("");
        tel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telFocusGained(evt);
            }
        });
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });

        email.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 51, 51));
        email.setText("l'adresse e-mail");
        email.setToolTipText("");
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        nom_icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Name_Tag_20px.png"))); // NOI18N

        name_label2.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        name_label2.setText("Pseudo:");

        nom_icon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Name_Tag_20px.png"))); // NOI18N

        name_label3.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        name_label3.setText("Password:");

        password.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(0, 51, 51));
        password.setText("entrer un password");
        password.setToolTipText("");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        pseudo.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        pseudo.setForeground(new java.awt.Color(0, 51, 51));
        pseudo.setText("entrer un pseudonyme");
        pseudo.setToolTipText("");
        pseudo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pseudoFocusGained(evt);
            }
        });
        pseudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pseudoActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Subtract_30px_1.png"))); // NOI18N
        jLabel15.setToolTipText("Réduire");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Delete_30px.png"))); // NOI18N
        jLabel5.setToolTipText("Fermer");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Form_PanelLayout = new javax.swing.GroupLayout(Form_Panel);
        Form_Panel.setLayout(Form_PanelLayout);
        Form_PanelLayout.setHorizontalGroup(
            Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Form_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nom_icon3)
                    .addComponent(nom_icon8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_label3)
                    .addComponent(name_label2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Form_PanelLayout.createSequentialGroup()
                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Form_PanelLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(action_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(Form_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Form_PanelLayout.createSequentialGroup()
                                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nom_icon)
                                        .addComponent(nom_icon6)
                                        .addComponent(nom_icon5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nom_icon2, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(date_icon))
                                .addGap(18, 18, 18)
                                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Form_PanelLayout.createSequentialGroup()
                                        .addComponent(lieu_label)
                                        .addGap(41, 41, 41)
                                        .addComponent(lieu))
                                    .addGroup(Form_PanelLayout.createSequentialGroup()
                                        .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(name_label1)
                                            .addComponent(name_label))
                                        .addGap(113, 113, 113)
                                        .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(name_field)
                                            .addComponent(lname_field)
                                            .addComponent(password)
                                            .addComponent(pseudo)))
                                    .addGroup(Form_PanelLayout.createSequentialGroup()
                                        .addComponent(date_label)
                                        .addGap(32, 32, 32)
                                        .addComponent(date_field))
                                    .addGroup(Form_PanelLayout.createSequentialGroup()
                                        .addComponent(qte_label)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(Form_PanelLayout.createSequentialGroup()
                                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Form_PanelLayout.createSequentialGroup()
                                        .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nom_icon7)
                                            .addComponent(nom_icon4))
                                        .addGap(18, 18, 18)
                                        .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(qte_min_label)
                                            .addComponent(prix_label)))
                                    .addGroup(Form_PanelLayout.createSequentialGroup()
                                        .addComponent(nom_icon1)
                                        .addGap(18, 18, 18)
                                        .addComponent(qte_min_label1)))
                                .addGap(94, 94, 94)
                                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tel)
                                    .addComponent(jScrollPane1)
                                    .addComponent(email)
                                    .addComponent(jScrollPane2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Form_PanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancel_button)))))
                .addContainerGap())
        );
        Form_PanelLayout.setVerticalGroup(
            Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Form_PanelLayout.createSequentialGroup()
                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Form_PanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(action_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nom_icon3)
                    .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name_label2)
                        .addComponent(pseudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(name_label3))
                    .addComponent(nom_icon8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nom_icon)
                    .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name_label)
                        .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(name_label1))
                    .addComponent(nom_icon2))
                .addGap(25, 25, 25)
                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(date_label)
                        .addComponent(date_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(date_icon))
                .addGap(18, 18, 18)
                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nom_icon5)
                    .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lieu_label)
                        .addComponent(lieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nom_icon6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qte_label))
                .addGap(18, 18, 18)
                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Form_PanelLayout.createSequentialGroup()
                        .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Form_PanelLayout.createSequentialGroup()
                        .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qte_min_label)
                            .addComponent(nom_icon4))
                        .addGap(18, 18, 18)
                        .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nom_icon7)
                            .addComponent(prix_label))
                        .addGap(18, 18, 18)
                        .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nom_icon1)
                            .addComponent(qte_min_label1))))
                .addGap(18, 18, 18)
                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_button)
                    .addComponent(cancel_button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Form_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Form_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_fieldFocusGained
        name_field.setText("");
    }//GEN-LAST:event_name_fieldFocusGained

    private void name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_fieldActionPerformed
        name_field.setText("");
    }//GEN-LAST:event_name_fieldActionPerformed

    private void date_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_date_fieldFocusGained
        date_field.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_date_fieldFocusGained

    private void date_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_fieldActionPerformed
        date_field.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_date_fieldActionPerformed

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        try{

            String sql="INSERT INTO `doctor`"
            + "(`pseudo`, `password`,`Nom`, `Prenom`, `Adresse`, `Tel`,  `email`, `diplome`,`LieuNaissance`, `dateNaissance`)"
            + " VALUES (?,?,?,?,?,?,?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/maternite_profile","root","mysql");
            pat = con.prepareStatement(sql);
            pat.setString(1,pseudo.getText());
            pat.setString(2,password.getText());
            pat.setString(3,name_field.getText());
            pat.setString(4,lname_field.getText());
            pat.setString(5,adresse.getText());
            pat.setString(6,tel.getText());
            pat.setString(7,email.getText());
            pat.setString(8,diplome.getText());
            pat.setString(9,lieu.getText());
            pat.setString(10,date_field.getText());

            pat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Le médicament a été ajouté");
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);

        }

        clear();
    }//GEN-LAST:event_add_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        clear();
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void lieuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lieuFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_lieuFocusGained

    private void lieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lieuActionPerformed

    private void lname_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lname_fieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_lname_fieldFocusGained

    private void lname_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lname_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lname_fieldActionPerformed

    private void telFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_telFocusGained

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFocusGained

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFocusGained

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void pseudoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pseudoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_pseudoFocusGained

    private void pseudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pseudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pseudoActionPerformed

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
    public void clear(){
    pseudo.setText("");
    password.setText("");
    name_field.setText("");
    adresse.setText("");
    email.setText("");
    tel.setText("");
    diplome.setText("");
    lieu.setText("");
    lname_field.setText("");
    date_field.setText("0000/00/00");
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
            java.util.logging.Logger.getLogger(addChefService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addChefService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addChefService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addChefService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addChefService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Form_Panel;
    private javax.swing.JLabel action_label;
    private javax.swing.JToggleButton add_button;
    private javax.swing.JTextArea adresse;
    private javax.swing.JToggleButton cancel_button;
    private javax.swing.JFormattedTextField date_field;
    private javax.swing.JLabel date_icon;
    private javax.swing.JLabel date_label;
    private javax.swing.JTextArea diplome;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lieu;
    private javax.swing.JLabel lieu_label;
    private javax.swing.JTextField lname_field;
    private javax.swing.JTextField name_field;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel name_label1;
    private javax.swing.JLabel name_label2;
    private javax.swing.JLabel name_label3;
    private javax.swing.JLabel nom_icon;
    private javax.swing.JLabel nom_icon1;
    private javax.swing.JLabel nom_icon2;
    private javax.swing.JLabel nom_icon3;
    private javax.swing.JLabel nom_icon4;
    private javax.swing.JLabel nom_icon5;
    private javax.swing.JLabel nom_icon6;
    private javax.swing.JLabel nom_icon7;
    private javax.swing.JLabel nom_icon8;
    private javax.swing.JTextField password;
    private javax.swing.JLabel prix_label;
    private javax.swing.JTextField pseudo;
    private javax.swing.JLabel qte_label;
    private javax.swing.JLabel qte_min_label;
    private javax.swing.JLabel qte_min_label1;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
