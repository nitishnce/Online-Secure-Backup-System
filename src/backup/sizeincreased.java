/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup;

import static backup.ConnectDB.Con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nitish Kumar
 */
public class sizeincreased extends javax.swing.JFrame {

    /**
     * Creates new form sizeincreased
     */
    public sizeincreased() {
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

        sizep = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        u1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        blockh1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        s1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setTitle("ADD SIZE");
        setPreferredSize(new java.awt.Dimension(609, 346));
        setResizable(false);
        setSize(new java.awt.Dimension(609, 346));
        getContentPane().setLayout(null);

        sizep.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Enter User ProfileId:");
        sizep.add(jLabel5);
        jLabel5.setBounds(30, 130, 250, 60);

        u1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        u1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u1ActionPerformed(evt);
            }
        });
        sizep.add(u1);
        u1.setBounds(280, 130, 290, 60);

        jButton5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        sizep.add(jButton5);
        jButton5.setBounds(240, 260, 160, 50);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Allocated Size Increase");

        javax.swing.GroupLayout blockh1Layout = new javax.swing.GroupLayout(blockh1);
        blockh1.setLayout(blockh1Layout);
        blockh1Layout.setHorizontalGroup(
            blockh1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blockh1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        blockh1Layout.setVerticalGroup(
            blockh1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blockh1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sizep.add(blockh1);
        blockh1.setBounds(100, 10, 470, 102);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Enter Size (in MB):");
        sizep.add(jLabel7);
        jLabel7.setBounds(30, 190, 250, 60);

        s1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        sizep.add(s1);
        s1.setBounds(280, 190, 290, 60);

        jButton6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton6.setText("ADD");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        sizep.add(jButton6);
        jButton6.setBounds(430, 260, 160, 50);

        getContentPane().add(sizep);
        sizep.setBounds(0, 0, 600, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void u1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
        //  sizep.setLocation();
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
          String u=u1.getText();
          String s=s1.getText();
          Long l=0l;
          try {
            Con = ConnectDB.connect();
            Statement st=Con.createStatement();
           ResultSet rs=st.executeQuery("SELECT allocate_size FROM regis_app WHERE UserID ='"+u+"'");
           
           if(rs.next())
           {
               l=rs.getLong("allocate_size");
             
               
           }
           if(l==0l)
               {
                   JOptionPane.showMessageDialog(rootPane, "Id Not Found");
                   return ;
               }
            l=l+Long.parseLong(s)*1024;
        
            PreparedStatement  ps=Con.prepareStatement("UPDATE `regis_app` SET `allocate_size`='"+l+"' where`UserID`='"+s+"'");
       
            ps.execute();
 
            ps=Con.prepareStatement("insert into log(userid,action,time) value(?,?,?)");
            ps.setString(1, "Admin :Nah ");
            ps.setString(2, "Allocated Size of User :"+u + "by size "+s+"MB");
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            ps.setString(3, myDateObj.format(myFormatObj));
            ps.execute();
            Con.close();
            u1.setText("");
            s1.setText("");
            JOptionPane.showMessageDialog(rootPane, "Allocated Size Increased Successfully");

        } catch (Exception ex) {

            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(sizeincreased.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sizeincreased.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sizeincreased.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sizeincreased.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sizeincreased().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel blockh1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField s1;
    private javax.swing.JPanel sizep;
    private javax.swing.JTextField u1;
    // End of variables declaration//GEN-END:variables
}
