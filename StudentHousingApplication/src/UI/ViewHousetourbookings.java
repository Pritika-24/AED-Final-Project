/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Apartmenthistory;
import Model.Requestapartment;
import Model.Requeststudent;
import Model.Studenthistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pritika
 */
public class ViewHousetourbookings extends javax.swing.JPanel {

    /**
     * Creates new form ViewHousetourbookings
     */
     Studenthistory history = new Studenthistory();
     Apartmenthistory hist = new Apartmenthistory();
    public ViewHousetourbookings() {
        initComponents();
        
       history.getStudentHistory();
       hist.getApartmentHistory();
        PopulateTable();
        populateTable();
        
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
        tblviewstudent = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblviewapartment = new javax.swing.JTable();
        btnrequest = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        tblviewstudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Contact Number", "Email ID", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tblviewstudent);
        if (tblviewstudent.getColumnModel().getColumnCount() > 0) {
            tblviewstudent.getColumnModel().getColumn(4).setMinWidth(0);
            tblviewstudent.getColumnModel().getColumn(4).setPreferredWidth(0);
            tblviewstudent.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        tblviewapartment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Apartment Name", "Apartment type", "Price ", "Landlord Name", "Apartment ID"
            }
        ));
        jScrollPane2.setViewportView(tblviewapartment);

        btnrequest.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnrequest.setText("Request Landlord");
        btnrequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(38, 38, 38))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(btnrequest, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnrequest)
                .addContainerGap(156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnrequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblviewstudent.getSelectedRow();
        
       DefaultTableModel model= (DefaultTableModel) tblviewstudent.getModel();
        model.setRowCount(0);
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this,"Please select a row ");
        }
        else{
            model.removeRow(selectedRow);
        }
    }//GEN-LAST:event_btnrequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnrequest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblviewapartment;
    private javax.swing.JTable tblviewstudent;
    // End of variables declaration//GEN-END:variables
 private void PopulateTable() {
        
        DefaultTableModel model= (DefaultTableModel) tblviewstudent.getModel();
        model.setRowCount(0);
        
        for (Requeststudent s : history.getHistory()){
        
        Object[] row = new Object[5];
            row[0] = s.getId();
            row[1] = s.getName();
            row[2] = s.getContactNumber();
            row[3] = s.getEmailId();
            row[4] = s;
           
            model.addRow(row);
        }
        
        }
 private void populateTable(){
       
        DefaultTableModel model= (DefaultTableModel) tblviewapartment.getModel();
        model.setRowCount(0);
        
        for (Requestapartment a : hist.getHistory()){
        
        Object[] row = new Object[6];
            row[0] = a.getApartmentName();
            row[1] = a.getApartmentType();
            row[2] = a.getPrice();
            row[3] = a.getLandlordName();
            row[4] = a.getApartmentID();
            row[5]=a;
           
            model.addRow(row);
     
        }
 }
 }