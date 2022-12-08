/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Student;
import Model.StudentDirectory;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
//import javax.mail.Transport;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Session;
import javax.mail.Transport;
/**
 *
 * @author Evita Alice Paul
 */
public class ViewReportissue extends javax.swing.JPanel {

    /**
     * Creates new form ViewReportissue
     */
    StudentDirectory sd = new StudentDirectory();
        ArrayList<Student > slist;
  DefaultTableModel model;
    public ViewReportissue() {
        initComponents();
         sd.getStudentDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbissue = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtissue = new javax.swing.JTextArea();
        btnreport = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 154, 154));

        cmbissue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Payment", "Products", "Broker", "Apartment", "Other" }));

        txtissue.setColumns(20);
        txtissue.setRows(5);
        txtissue.setTabSize(4);
        jScrollPane1.setViewportView(txtissue);

        btnreport.setText("Report");
        btnreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportActionPerformed(evt);
            }
        });

        jLabel1.setText("Email ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(cmbissue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(btnreport))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(cmbissue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtemail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnreport)
                .addGap(115, 115, 115))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
        // TODO add your handling code here:
        
        String report = cmbissue.getSelectedItem().toString();
        
        if(report == "Select"){
            JOptionPane.showMessageDialog(this, "Please select an Option");
        }else if(txtissue.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please describe the issue");
        }else if(txtemail.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter mail Id");
        }else{
        
        
        
       String ToEmail = txtemail.getText();
        String FromEmail = "aedproject123@gmail.com";//studyviral2@gmail.com
        String FromEmailPassword = "wiiwhakaddhmcypq";//You email Password from you want to send email
        String Subjects = cmbissue.getSelectedItem().toString();
        
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        properties.put("mail.smtp.starttls.required", "true");
properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
properties.put("mail.debug", "true");
        
       
           
        
       Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(FromEmail, FromEmailPassword);
            }
     
        });
       try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
            message.setSubject(Subjects);
      
            message.setText(txtissue.getText()+"\n" +"Thank you for contacting us! We will contact you shortly. This is a auto generated email");
            Transport.send(message);
            
                JOptionPane.showMessageDialog(this, "Issue successfully raised");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        }
       
    
    }//GEN-LAST:event_btnreportActionPerformed
                

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreport;
    private javax.swing.JComboBox<String> cmbissue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextArea txtissue;
    // End of variables declaration//GEN-END:variables
}