/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

 import javax.swing.*;
 import java.awt.event.*;
 
 public class FormPertambahanDuaAngka extends javax.swing.JFrame {
 
     public FormPertambahanDuaAngka() {
         initComponents();
     }
 
     @SuppressWarnings("unchecked")
     private void initComponents() {
 
         jPanel1 = new javax.swing.JPanel();
         jLabel1 = new javax.swing.JLabel();
         jTextField1 = new javax.swing.JTextField();
         jLabel2 = new javax.swing.JLabel();
         jTextField2 = new javax.swing.JTextField();
         jLabel3 = new javax.swing.JLabel();
         jTextField3 = new javax.swing.JTextField();
         jButton1 = new javax.swing.JButton();
         jButton2 = new javax.swing.JButton();
         jButton3 = new javax.swing.JButton();
 
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         setTitle("Aplikasi Pertambahan Dua Angka");
 
         jLabel1.setText("Angka Pertama");
         jLabel2.setText("Angka Kedua");
         jLabel3.setText("Hasil");
 
         jTextField3.setEditable(false); // hasil tidak bisa diketik
 
         // Tombol Tambah
         jButton1.setText("Tambah");
         jButton1.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 btnTambahActionPerformed(evt);
             }
         });
 
         // Tombol Hapus
         jButton2.setText("Hapus");
         jButton2.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 btnHapusActionPerformed(evt);
             }
         });
 
         // Tombol Keluar
         jButton3.setText("Keluar");
         jButton3.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 btnKeluarActionPerformed(evt);
             }
         });
 
         // Batasi input hanya angka
         jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
             public void keyTyped(java.awt.event.KeyEvent evt) {
                 char c = evt.getKeyChar();
                 if (!Character.isDigit(c) && c != '.') {
                     evt.consume();
                 }
             }
         });
 
         jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
             public void keyTyped(java.awt.event.KeyEvent evt) {
                 char c = evt.getKeyChar();
                 if (!Character.isDigit(c) && c != '.') {
                     evt.consume();
                 }
             }
         });
 
         // FocusListener untuk membersihkan field saat difokuskan
         jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
             public void focusGained(java.awt.event.FocusEvent evt) {
                 jTextField1.setText("");
             }
         });
         jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
             public void focusGained(java.awt.event.FocusEvent evt) {
                 jTextField2.setText("");
             }
         });
 
         // Layout otomatis
         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
         jPanel1.setLayout(jPanel1Layout);
         jPanel1Layout.setHorizontalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addGap(20, 20, 20)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel1)
                     .addComponent(jLabel2)
                     .addComponent(jLabel3))
                 .addGap(30, 30, 30)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(jTextField1)
                     .addComponent(jTextField2)
                     .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addContainerGap(40, Short.MAX_VALUE))
             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                 .addComponent(jButton1)
                 .addGap(18, 18, 18)
                 .addComponent(jButton2)
                 .addGap(18, 18, 18)
                 .addComponent(jButton3)
                 .addGap(25, 25, 25))
         );
         jPanel1Layout.setVerticalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addGap(25, 25, 25)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel1)
                     .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(18, 18, 18)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel2)
                     .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(18, 18, 18)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel3)
                     .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(30, 30, 30)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jButton1)
                     .addComponent(jButton2)
                     .addComponent(jButton3))
                 .addContainerGap(25, Short.MAX_VALUE))
         );
 
         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addGap(40, 40, 40)
                 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addContainerGap(40, Short.MAX_VALUE))
         );
         layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addGap(40, 40, 40)
                 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addContainerGap(40, Short.MAX_VALUE))
         );
 
         pack();
         setLocationRelativeTo(null);
     }
 
     // =========================
     // EVENT HANDLER SECTION
     // =========================
     private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {
         try {
             double angka1 = Double.parseDouble(jTextField1.getText());
             double angka2 = Double.parseDouble(jTextField2.getText());
             double hasil = angka1 + angka2;
             jTextField3.setText(String.valueOf(hasil));
         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(this,
                 "Input harus berupa angka!",
                 "Error", JOptionPane.ERROR_MESSAGE);
         }
     }
 
     private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {
         jTextField1.setText("");
         jTextField2.setText("");
         jTextField3.setText("");
         jTextField1.requestFocus();
     }
 
     private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {
         System.exit(0);
     }
 
     public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(() -> {
             new FormPertambahanDuaAngka().setVisible(true);
         });
     }
 
     // Variables declaration
     private javax.swing.JButton jButton1;
     private javax.swing.JButton jButton2;
     private javax.swing.JButton jButton3;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JTextField jTextField1;
     private javax.swing.JTextField jTextField2;
     private javax.swing.JTextField jTextField3;
     // End of variables declaration
 }
 