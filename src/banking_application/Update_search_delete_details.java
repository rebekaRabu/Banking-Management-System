/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author rebeka
 */
public class Update_search_delete_details extends javax.swing.JFrame {

    /**
     * Creates new form Update_search_delete_details
     */
    public Update_search_delete_details() {
        initComponents();
    }
    

  public void getAllRecord(){
      String State,Addres;
      int phone, AccNo;
      
      State = CMBState.getSelectedItem().toString();
      Addres =TAAddress.getText() ;
      phone =Integer.parseInt(TFPhoneNo.getText());
      AccNo =Integer.parseInt(TFAccountNo.getText());      
        
      
      //(Acc,Phone, Address,State)
      //Acc='"+AccNo+"',
      
      Connection con=null;
      Statement stmt=null;
      try{
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","123");
          
          stmt=con.createStatement();
          int count=0;
          count=stmt.executeUpdate("update customer_information_table set Phone='"+phone+"',Address='"+Addres+"',State='"+State+"' where Acc='"+AccNo+"'  ");
          if(count>0){
                JOptionPane.showMessageDialog(rootPane, "Updated complete");
          }else{
              JOptionPane.showMessageDialog(rootPane, "Updated Failed");
          }
          
      }catch(Exception e){
          e.printStackTrace();
      }
  
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFPhoneNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAAddress = new javax.swing.JTextArea();
        TFAccountNo = new javax.swing.JTextField();
        CMBState = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        BTSearch = new javax.swing.JButton();
        BTUpdate = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Phone No :");

        jLabel2.setText("Account No : ");

        jLabel3.setText("State : ");

        jLabel4.setText("Address : ");

        TAAddress.setColumns(20);
        TAAddress.setRows(5);
        jScrollPane1.setViewportView(TAAddress);

        TFAccountNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFAccountNoActionPerformed(evt);
            }
        });

        CMBState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Select State---", "Dhaka", "Rajshahi", "Khulna", "Cummilla", "Chottogram" }));
        CMBState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMBStateActionPerformed(evt);
            }
        });

        jButton2.setText("Details");

        BTSearch.setText("Search");
        BTSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSearchActionPerformed(evt);
            }
        });

        BTUpdate.setText("Update");
        BTUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTUpdateActionPerformed(evt);
            }
        });

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CMBState, 0, 152, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TFAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addComponent(TFPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton5)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(BTSearch)
                    .addComponent(BTUpdate))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TFPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TFAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(35, 35, 35)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CMBState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTSearch))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTUpdate)
                        .addGap(36, 36, 36)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFAccountNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFAccountNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFAccountNoActionPerformed

    private void CMBStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMBStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMBStateActionPerformed

    private void BTUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTUpdateActionPerformed
        // Updated
        getAllRecord();
    }//GEN-LAST:event_BTUpdateActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void BTSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSearchActionPerformed
        // Search/show
        
       int AccNo =Integer.parseInt(TFAccountNo.getText()); 
       
       Connection con=null;
       Statement stmt=null;
       ResultSet rs=null;
       
       try{
           Class.forName("com.mysql.jdbc.Driver");
           
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
           
           stmt=con.createStatement();
           rs=stmt.executeQuery("select    Name, DOB, Phone, Address, District, State, Gender, MaritalStatus, MotherName, FatherName, Balance, CurrentDate from customer_information_table where Acc='"+AccNo+"'   ");
           
           int count=0;
           while(rs.next()){
               CMBState.setSelectedItem(rs.getString("State"));
               TAAddress.setText(rs.getString("Address")) ;
               TFPhoneNo.setText(rs.getString("Phone"));
               count++;
               
           }
           if(count==0){
               JOptionPane.showMessageDialog(rootPane, " There is no such query.");
           }
       }catch(Exception e){
           e.printStackTrace();
       
       }
    }//GEN-LAST:event_BTSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Update_search_delete_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_search_delete_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_search_delete_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_search_delete_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_search_delete_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTSearch;
    private javax.swing.JButton BTUpdate;
    private javax.swing.JComboBox CMBState;
    private javax.swing.JTextArea TAAddress;
    private javax.swing.JTextField TFAccountNo;
    private javax.swing.JTextField TFPhoneNo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
