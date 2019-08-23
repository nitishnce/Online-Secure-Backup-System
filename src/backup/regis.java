package backup;

import com.jcraft.jsch.SftpException;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nitish Kumar
 */
public class regis extends javax.swing.JFrame {

   //To change body of generated methods, choose Tools | Templates.
    

    /**
     * Creates new form home
     */
    public regis() {
        initComponents();
        trans.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        trans = new javax.swing.JPanel();
        j1 = new javax.swing.JTextField();
        j2 = new javax.swing.JTextField();
        j3 = new javax.swing.JPasswordField();
        j4 = new javax.swing.JTextField();
        l4 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        clck = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        j5 = new javax.swing.JPasswordField();
        l5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration | Knect");
        setBackground(new java.awt.Color(51, 0, 255));
        setForeground(new java.awt.Color(51, 51, 255));
        setPreferredSize(new java.awt.Dimension(852, 502));
        setResizable(false);
        setSize(new java.awt.Dimension(852, 502));
        getContentPane().setLayout(null);

        trans.setLayout(null);

        j1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        j1.setForeground(new java.awt.Color(51, 51, 255));
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });
        trans.add(j1);
        j1.setBounds(170, 140, 270, 30);

        j2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        j2.setForeground(new java.awt.Color(0, 102, 255));
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });
        trans.add(j2);
        j2.setBounds(170, 180, 270, 30);

        j3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        j3.setForeground(new java.awt.Color(51, 51, 255));
        trans.add(j3);
        j3.setBounds(170, 220, 270, 30);

        j4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        j4.setForeground(new java.awt.Color(51, 51, 255));
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });
        j4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j4KeyPressed(evt);
            }
        });
        trans.add(j4);
        j4.setBounds(170, 300, 270, 30);

        l4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        l4.setText("Mobile :");
        trans.add(l4);
        l4.setBounds(90, 270, 80, 80);

        l3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        l3.setText("Password :");
        trans.add(l3);
        l3.setBounds(70, 200, 90, 80);

        l2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        l2.setText("Email ID :");
        trans.add(l2);
        l2.setBounds(80, 170, 80, 50);

        l1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        l1.setText("Name :");
        trans.add(l1);
        l1.setBounds(100, 120, 90, 80);

        clck.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clck.setForeground(new java.awt.Color(255, 204, 0));
        clck.setText("Click Here");
        clck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clckMouseClicked(evt);
            }
        });
        trans.add(clck);
        clck.setBounds(310, 380, 90, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Already User ?");
        trans.add(jLabel4);
        jLabel4.setBounds(180, 370, 140, 50);

        jButton1.setFont(new java.awt.Font("FrankRuehl", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        trans.add(jButton1);
        jButton1.setBounds(230, 340, 150, 40);

        j5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        j5.setForeground(new java.awt.Color(51, 51, 255));
        trans.add(j5);
        j5.setBounds(170, 260, 270, 30);

        l5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        l5.setText("Confirm Password :");
        trans.add(l5);
        l5.setBounds(0, 240, 170, 80);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Gungsuh", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Knect Registration ");
        jLabel1.setAutoscrolls(true);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        trans.add(jLabel1);
        jLabel1.setBounds(10, 80, 440, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\xampp\\htdocs\\PHP\\p2\\images\\logo-dark.png")); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        trans.add(jLabel7);
        jLabel7.setBounds(200, 0, 150, 120);

        getContentPane().add(trans);
        trans.setBounds(380, 30, 460, 420);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/1.jpg"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(962, 456));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, -20, 850, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
        
    }//GEN-LAST:event_j1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        setVisible(false);
        Front.main("");
    }//GEN-LAST:event_jLabel7MouseClicked

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j2ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j4ActionPerformed

    private void clckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clckMouseClicked
        setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_clckMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                if(j1.getText()!="" && j2.getText()!="" && j3.getText().contentEquals("") && j4.getText()!=" " && j5.getText().contentEquals(""))
                {
                        
                    JOptionPane.showMessageDialog(rootPane, "Error: Please enter All Text Field ");
                            return ;
                }
        
        
        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", j2.getText()))) 
                    { 
                           
                           
                            JOptionPane.showMessageDialog(rootPane, "Error: Please enter valid email address ");
                            return ;
                    }
        if(!(j3.getText().equals(j5.getText())))
                {
                     JOptionPane.showMessageDialog(rootPane, "Confirm Password didnot match. ");
                     j3.setText("");
                     j5.setText("");
                     
                     
                            
                     return ;
                }


        
        try {
            Connection Con= ConnectDB.connect();
            PreparedStatement ps=Con.prepareStatement("insert into regis_app(name,email,password,status,allocate_size,size_used,Mobile,UserID) value(?,?,?,?,?,?,?,?)");
             ps.setString(1, j1.getText());
              ps.setString(2, j2.getText());
              
              
                ps.setString(4, "unblock");
                 ps.setLong(5, Long.parseLong("10485760"));
                 ps.setLong(6, Long.parseLong("0"));
                 ps.setLong(7, Long.parseLong(j4.getText()));
                 
                 int z=1;
            Statement st=Con.createStatement();
           ResultSet rs=st.executeQuery("SELECT Sr_no FROM regis_app WHERE Sr_no = ( SELECT MAX(Sr_no) FROM regis_app)");
             while(rs.next()) {
       
                     z=rs.getInt("Sr_no")+z;
             
                         }
                 String str=j1.getText()+z;
                 String safepass=j3.getText()+str;//for safety rainbow table
                 MD5 md=new MD5();
                 String safe=md.getMd5(safepass);
                  ps.setString(3, safe);
                 ps.setString(8, str);
                 ps.execute();
                 
                 String spath;
                  
                rs=st.executeQuery("SELECT * FROM servers ");
                 backup.SFTPBean sftp = new backup.SFTPBean();
                while(rs.next())
                {
                    
                    if(sftp.connect(rs.getString("server_ip"),rs.getInt("server_port") , rs.getString("server_user"), rs.getString("server_pass")))
                     { 
                         
                         spath=rs.getString("server_path");
                         sftp.folder(spath+"/"+str);
                         sftp.close();
                     }
                    
                     
                }
                System.out.println("hello");
                 ps=Con.prepareStatement("insert into log(userid,action,time) value(?,?,?)");
                 ps.setString(1, str);
                 ps.setString(2,"Registration");
                 LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                ps.setString(3, myDateObj.format(myFormatObj));
                ps.execute();
               
                
                 Con.close();
                 
                  JOptionPane.showMessageDialog(rootPane, "Registration Successful ");
                  
                  
                  
                  
                  
                  
      
                 setVisible(false);
                  new home().setVisible(true);
               
                
                
                
              
             
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(regis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(regis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SftpException ex) {
            Logger.getLogger(regis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void j4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j4KeyPressed
        
        String s=j4.getText();
        int l=s.length();
       // char c=evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(l<10)
            {
                j4.setEditable(true);
            }else{
                j4.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                j4.setEditable(true);
            }else{
                j4.setEditable(false);
            }
        }
        
        
        
        
    }//GEN-LAST:event_j4KeyPressed

                                  

 
    /**
     * @param args the command line arguments
     */
    public static void main(String...args) {
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clck;
    private javax.swing.JTextField j1;
    private javax.swing.JTextField j2;
    private javax.swing.JPasswordField j3;
    private javax.swing.JTextField j4;
    private javax.swing.JPasswordField j5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JPanel trans;
    // End of variables declaration//GEN-END:variables
}
