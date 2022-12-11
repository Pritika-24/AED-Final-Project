/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.SQLconnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Evita Alice Paul
 */
public class AddstudentsPage extends javax.swing.JPanel {

    /**
     * Creates new form AddstudentsPage
     */
    public AddstudentsPage() {
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

        lblid = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblcontactno = new javax.swing.JLabel();
        lblemailid = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtcontactno = new javax.swing.JTextField();
        txtemailid = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        btnaddstudent = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N

        lblid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblid.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblid.setText("ID:");

        lblname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblname.setText("Name:");

        lblcontactno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblcontactno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblcontactno.setText("Contact No:");

        lblemailid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblemailid.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblemailid.setText("Email ID:");

        lblusername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblusername.setText("Username:");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        lblpassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblpassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpassword.setText("Password:");

        btnaddstudent.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnaddstudent.setText("Add Student");
        btnaddstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddstudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(lblusername))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblemailid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcontactno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(txtname)
                    .addComponent(txtemailid)
                    .addComponent(txtcontactno)
                    .addComponent(txtusername)
                    .addComponent(txtpassword))
                .addContainerGap(264, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnaddstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblid)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcontactno)
                    .addComponent(txtcontactno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemailid)
                    .addComponent(txtemailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusername))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpassword))
                .addGap(58, 58, 58)
                .addComponent(btnaddstudent)
                .addContainerGap(125, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnaddstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddstudentActionPerformed
        // TODO add your handling code here:
         String name = txtname.getText();
        String id= txtid.getText();
        String contactno = txtcontactno.getText();
        String emailid = txtemailid.getText();
       
        String username = txtusername.getText();
        String password = txtpassword.getText();
        
        
        if(name.isBlank() ){
            JOptionPane.showMessageDialog(this,"Please enter the Name");
        }else if(id.isBlank()){
            JOptionPane.showMessageDialog(this,"Please enter the ID");
        }else if(contactno.isBlank()){
             JOptionPane.showMessageDialog(this,"Please enter the Contact Number");
        }else if(emailid.isBlank()){
               JOptionPane.showMessageDialog(this,"Please enter the Email ID");
        
        }else if(username.isBlank()){
            JOptionPane.showMessageDialog(this,"Please enter the Username");
        }else if(password.isBlank()){
            JOptionPane.showMessageDialog(this,"Please enter the Password");
        }else{
            //JOptionPane.showMessageDialog(this,"Registeration Successfull");
        
        System.out.println("Before try statement executed");
       
        try {
            System.out.println("Inside try statement executed");
              Connection con=SQLconnection.dbconnector();
            Statement stmt=con.createStatement();
            
          String Query= "INSERT INTO Student (ID,Name,ContactNumber,EmailId,USERNAME,PASSWORD) values('"+txtname.getText()+"','"+txtid.getText()+"','"+txtcontactno.getText()+"','"+txtemailid.getText()+"','"+txtusername.getText()+"','"+txtpassword.getText()+"')";
          
         
            stmt.executeUpdate(Query);
          stmt.close();
          con.close();
            JOptionPane.showMessageDialog(this, "Registered Sucessfully");
       
            
        
       
        } catch (SQLException ex) {
            Logger.getLogger(AddstudentsPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
    }//GEN-LAST:event_btnaddstudentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddstudent;
    private javax.swing.JLabel lblcontactno;
    private javax.swing.JLabel lblemailid;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTextField txtcontactno;
    private javax.swing.JTextField txtemailid;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
