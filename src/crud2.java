import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class crud2 extends javax.swing.JFrame {

    public crud2() {
        initComponents();
        
        btngrpgender.add(rbn1);
        btngrpgender.add(rbn2);
        
        /* */
            
    
                
        try{
            Connection cn = null;
            cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/employeedb","root","");
            String sql = ("SELECT * FROM `tblemployee");
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            DefaultTableModel model = (DefaultTableModel)tblemployee.getModel();
            while(rs.next()==true){
            model.addRow(new Object[]{
                rs.getInt("ID"),
                rs.getString("fullname"),
                rs.getString("birthdate"),
                rs.getString("position"),
                rs.getString("department"),
                rs.getString("gender")
            });
        }
                    
        }catch(Exception e){
        JOptionPane.showMessageDialog(this, e.toString(), "Title", JOptionPane.INFORMATION_MESSAGE);
     }
}
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpgender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtfullname = new javax.swing.JTextField();
        txtbirthdate = new javax.swing.JTextField();
        rbn1 = new javax.swing.JRadioButton();
        rbn2 = new javax.swing.JRadioButton();
        cboposition = new javax.swing.JComboBox<>();
        txtdepartment = new javax.swing.JTextField();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblemployee = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Birthdate:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Position:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Department:");

        rbn1.setBackground(new java.awt.Color(0, 0, 0));
        btngrpgender.add(rbn1);
        rbn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbn1.setForeground(new java.awt.Color(255, 255, 255));
        rbn1.setText("Male");

        rbn2.setBackground(new java.awt.Color(0, 0, 0));
        btngrpgender.add(rbn2);
        rbn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbn2.setForeground(new java.awt.Color(255, 255, 255));
        rbn2.setText("Female");

        cboposition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEO", "Manager", "Assistant Manager", "Secretary", "Campaign Manager", "Trash Collector" }));
        cboposition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbopositionActionPerformed(evt);
            }
        });

        btnedit.setBackground(new java.awt.Color(0, 0, 0));
        btnedit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnedit.setForeground(new java.awt.Color(255, 255, 255));
        btnedit.setText("EDIT");
        btnedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneditMouseClicked(evt);
            }
        });
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(0, 0, 0));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(0, 0, 0));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        tblemployee.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        tblemployee.setForeground(new java.awt.Color(255, 0, 51));
        tblemployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "Birthdate", "Position", "Department", "Gender"
            }
        ));
        tblemployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblemployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblemployee);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EMPLOYEE DATABASE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(rbn1)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbn2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtbirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cboposition, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtdepartment)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                                        .addComponent(txtfullname, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                .addGap(3, 3, 3)))))
                                .addGap(15, 15, 15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnedit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtbirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbn1)
                            .addComponent(rbn2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btndelete)
                            .addComponent(btnadd))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       
        try {
            Connection cn = null;
            cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/employeedb","root","");
            
            String gender = rbn1.isSelected() ? "M": "F";
            String sql = "";
            
            sql += "INSERT INTO `tblemployee`(`fullname`,`birthdate`,`position`,`department`,`gender`)";
            sql += "VALUES (";
            sql += "'" + txtfullname.getText()+ "',";
            sql += "'" + txtbirthdate.getText()+ "',";
            sql += "'"+ String.valueOf(cboposition.getSelectedItem()) +"',";
            sql += "'" + txtdepartment.getText()+ "',";
            sql += "'"+ gender+"'";
            sql += ")";
            
            Statement stmt = cn.createStatement();
            stmt.execute(sql);
            cn.close();
            ;
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this, e.toString(), "Title", JOptionPane.INFORMATION_MESSAGE);
        }
        
       
        
        displayAll();
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void tblemployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblemployeeMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblemployee.getModel();
        int selectedrow = tblemployee.getSelectedRow();
        int ID = Integer.parseInt(model.getValueAt(selectedrow, 0).toString());
        String fullname = model.getValueAt(selectedrow, 1).toString();
        String birthdate = model.getValueAt(selectedrow, 2).toString();        
        String position = model.getValueAt(selectedrow, 3).toString();
        String department = model.getValueAt(selectedrow, 4).toString();
        
        if(model.getValueAt(selectedrow, 5).equals("M")){
        rbn1.setSelected(true);
        }
        else if(model.getValueAt(selectedrow, 5).equals("F")){
        rbn2.setSelected(true);
        }
        
        if(model.getValueAt(selectedrow, 3).equals("CEO")){
        cboposition.setSelectedIndex(0);
        }
        else if(model.getValueAt(selectedrow, 3).equals("Manager")){
        cboposition.setSelectedIndex(1);
        }
        else if(model.getValueAt(selectedrow, 3).equals("Assistant Manager")){
        cboposition.setSelectedIndex(2);
        }
        else if(model.getValueAt(selectedrow, 3).equals("Secretary")){
        cboposition.setSelectedIndex(3);
        }
        else if(model.getValueAt(selectedrow, 3).equals("Campaign Manager")){
        cboposition.setSelectedIndex(4);
        }
        else if(model.getValueAt(selectedrow, 3).equals("Trash Collector")){
        cboposition.setSelectedIndex(5);
        }
        
        txtID.setText(String.valueOf(ID));
        txtfullname.setText(String.valueOf(fullname));
        txtbirthdate.setText(String.valueOf(birthdate));
        txtdepartment.setText(String.valueOf(department));
        
        
    }//GEN-LAST:event_tblemployeeMouseClicked

    private void cbopositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbopositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbopositionActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = null;
            cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/employeedb","root","");
            
            String gender = rbn1.isSelected() ? "M": "F";
            String sql = "";
            
            sql += "UPDATE `tblemployee`";
            sql += "SET";
            sql += "`fullname`='" + txtfullname.getText()+ "',";
            sql += "`birthdate`='" + txtbirthdate.getText()+ "',";
            sql += "`position`='"+ String.valueOf(cboposition.getSelectedItem()) +"',";
            sql += "`department`='" + txtdepartment.getText()+ "',";
            sql += "`gender`='"+ gender+"'";
            sql += " " + "WHERE " + "`id` = " + Integer.parseInt(txtID.getText());
            
            Statement stmt = cn.createStatement();
            stmt.execute(sql);
            cn.close();
            ;
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this, e.toString(), "Title", JOptionPane.INFORMATION_MESSAGE);
        }
         
        
        DefaultTableModel model = (DefaultTableModel)tblemployee.getModel();
       
        
        
        
        
    }//GEN-LAST:event_btneditActionPerformed

    private void btneditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseClicked
       
    }//GEN-LAST:event_btneditMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        
    

         try {
            Connection cn = null;
            cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/employeedb","root","");
            
            String gender = rbn1.isSelected() ? "M": "F";
            String sql = "";
            
            sql += "DELETE FROM `tblemployee`";
            sql += " WHERE " +"`tblemployee`"+ ". `ID` = " + Integer.parseInt(txtID.getText());
            
            Statement stmt = cn.createStatement();
            stmt.execute(sql);
            cn.close();
            
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this, e.toString(), "Title", JOptionPane.INFORMATION_MESSAGE);
        }
         
         
    }//GEN-LAST:event_btndeleteActionPerformed
    public void displayAll(){
        try{
            Connection cn = null;
            cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/employeedb","root","");
            String sql = ("SELECT * FROM `tblemployee");
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            DefaultTableModel model = (DefaultTableModel)tblemployee.getModel();
            while(rs.next()==true){
            model.addRow(new Object[]{
                rs.getInt("ID"),
                rs.getString("fullname"),
                rs.getString("birthdate"),
                rs.getString("position"),
                rs.getString("department"),
                rs.getString("gender")
            });
        }          
                  
                    
        }catch(Exception e){
        JOptionPane.showMessageDialog(this, e.toString(), "Title", JOptionPane.INFORMATION_MESSAGE);
     }
    }

    

    
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
            java.util.logging.Logger.getLogger(crud2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crud2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crud2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crud2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crud2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.ButtonGroup btngrpgender;
    private javax.swing.JComboBox<String> cboposition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbn1;
    private javax.swing.JRadioButton rbn2;
    private javax.swing.JTable tblemployee;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtbirthdate;
    private javax.swing.JTextField txtdepartment;
    private javax.swing.JTextField txtfullname;
    // End of variables declaration//GEN-END:variables
}
