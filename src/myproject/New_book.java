/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.math.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static org.codehaus.groovy.ast.tools.GeneralUtils.stmt;

/**
 *
 * @author ok
 */
public class New_book extends javax.swing.JFrame {

    /**
     * Creates new form JFrame5
     */
    public New_book() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        book_id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        author_name = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        publishing_year = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        language = new javax.swing.JTextField();
        count = new javax.swing.JTextField();
        add_btn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        copies = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        txt_filename = new javax.swing.JTextField();
        lbl_image = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(85, 74, 87));

        jPanel2.setBackground(new java.awt.Color(197, 144, 122));

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel2.setText("Add A New Book");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(21, 21, 21))
        );

        jPanel3.setBackground(new java.awt.Color(197, 144, 122));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 15)); // NOI18N
        jLabel3.setText("Book ID:");

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 15)); // NOI18N
        jLabel4.setText("Title:");

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 15)); // NOI18N
        jLabel5.setText("Author:");

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 15)); // NOI18N
        jLabel6.setText("Type:");

        book_id.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        book_id.setForeground(new java.awt.Color(85, 74, 87));

        name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        name.setForeground(new java.awt.Color(85, 74, 87));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        author_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        author_name.setForeground(new java.awt.Color(85, 74, 87));

        type.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        type.setForeground(new java.awt.Color(85, 74, 87));

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 15)); // NOI18N
        jLabel7.setText("Year:");

        publishing_year.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        publishing_year.setForeground(new java.awt.Color(85, 74, 87));

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 15)); // NOI18N
        jLabel8.setText("Language:");

        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 15)); // NOI18N
        jLabel9.setText("Page Count:");

        language.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        language.setForeground(new java.awt.Color(85, 74, 87));
        language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageActionPerformed(evt);
            }
        });

        count.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        count.setForeground(new java.awt.Color(85, 74, 87));
        count.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countActionPerformed(evt);
            }
        });

        add_btn.setBackground(new java.awt.Color(204, 204, 255));
        add_btn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 15)); // NOI18N
        jLabel10.setText("Status:");

        status.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status.setForeground(new java.awt.Color(85, 74, 87));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setText(" Copies:");

        copies.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        copies.setForeground(new java.awt.Color(85, 74, 87));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel12.setText("Price:");

        price.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        price.setForeground(new java.awt.Color(85, 74, 87));

        description.setColumns(20);
        description.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setText("Discription:");

        pic.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        pic.setText("picture:");

        txt_filename.setEditable(false);
        txt_filename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filenameActionPerformed(evt);
            }
        });

        lbl_image.setBackground(new java.awt.Color(0, 0, 0));
        lbl_image.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\index.png")); // NOI18N

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Browes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(29, 29, 29))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(54, 54, 54)))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(35, 35, 35)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(41, 41, 41)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(41, 41, 41)))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(author_name, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(publishing_year, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(book_id, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(status, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(count)
                                    .addComponent(copies)
                                    .addComponent(price))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(pic)
                                .addGap(36, 36, 36)
                                .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_filename, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 51, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(book_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pic))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(author_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(publishing_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_filename, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(add_btn))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(214, 214, 214))
        );

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 641, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void countActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(url,"myPROJuser","654321");
             Statement s = con.createStatement();
             BigDecimal id = new BigDecimal(book_id.getText());
            BigDecimal year = new BigDecimal(publishing_year.getText());
            BigDecimal pagecount = new BigDecimal(count.getText());
            BigDecimal bookcopies = new BigDecimal(copies.getText());
            BigDecimal bookprice = new BigDecimal(price.getText());
            String a_name =author_name.getText();
            String book_name=name.getText();
            String b_type=type.getText();
            String b_lang=language.getText();
            String b_status=status.getText();
            String desc=description.getText();
             String image=txt_filename.getText();
            image=image.replace("\\", "\\\\");
            String sql2 ="select author_id from author where author_name = '"+a_name+"'";
            ResultSet rs= s.executeQuery(sql2); 
            if(rs.next()) {
            //save author id& book id into authorBook table
            BigDecimal a_id = (rs.getBigDecimal(1));
            String statement = "insert into book values ("+id+",'"+book_name+"','"+b_type+"',"+year+",'"+b_lang+"',"+pagecount+",'"+b_status+"',"+bookcopies+","+bookprice+",'"+desc+"','"+image+"')";
             s.executeUpdate(statement);
            String a="insert into authorbook values("+a_id+","+id+")";
             String sql= "UPDATE author SET num_books = num_books+1  WHERE author_id = "+a_id+"";
            s.executeUpdate(a);
            s.executeUpdate(sql);
           
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(null, "done!");
            }
            else{
                //open add author .. then return to add book
                JOptionPane.showMessageDialog(null, "the auther is not in the database! ,please add author");
                new add_author().setVisible(true);
                this.setVisible(false);
            }
             
            
        } catch (SQLException ex) {
            Logger.getLogger(New_book.class.getName()).log(Level.SEVERE, null, ex);
        }
 
            
    }//GEN-LAST:event_add_btnActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_languageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Admin_welcome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void txt_filenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filenameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_filenameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f =chooser.getSelectedFile();
        String filename =f.getAbsolutePath();
        txt_filename.setText(filename);
        Image getAbsolutePath =null;
        ImageIcon icon =new ImageIcon(filename);
        Image image= icon.getImage().getScaledInstance(lbl_image.getWidth(),lbl_image.getHeight(),Image.SCALE_SMOOTH);
        lbl_image.setIcon(icon);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(New_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTextField author_name;
    private javax.swing.JTextField book_id;
    private javax.swing.JTextField copies;
    private javax.swing.JTextField count;
    private javax.swing.JTextArea description;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField language;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JTextField name;
    private javax.swing.JLabel pic;
    private javax.swing.JTextField price;
    private javax.swing.JTextField publishing_year;
    private javax.swing.JTextField status;
    private javax.swing.JTextField txt_filename;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
