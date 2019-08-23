/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup;

/**
 *
 * @author Thimus
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class SearchResult implements ActionListener{
JFrame frame, frame1;
JLabel label;
JButton button;
JPanel panel;
static JTable table;

String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/sftp?zeroDateTimeBehavior=convertToNull";
String userName = "root";
String password = "";
String[] columnNames = {"S", "Name", "Email", "Contact", "Status","Directory", "Password"};

public void createUI()
{
frame = new JFrame("Database Search Result");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);

button = new JButton("Click me to fuck youself");
button.setBounds(120,130,150,20);
button.addActionListener(this);
frame.add(button);
frame.setVisible(true);
frame.setSize(500, 400); 
} 

public void actionPerformed(ActionEvent ae)
{
button = (JButton)ae.getSource();
System.out.println("Showing Table Data.......");
showTableData(); 
} 

public void showTableData()
{
String[] columnNames = {"Sr No", "UserID", "Action", "Time"};
frame1 = new JFrame("Database Search Result");
frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
frame1.setLayout(new BorderLayout());
DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(columnNames);
table = new JTable();
table.setModel(model); 
table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
table.setFillsViewportHeight(true);
JScrollPane scroll = new JScrollPane(table);
scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
int Sr_no = 0;
String name= "";
String action = "";
String time = "";

try
{ 
Connection con=ConnectDB.connect();
String sql = "select * from log";
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
int i =0;
while(rs.next())
{
Sr_no = rs.getInt("Sr_no");
name = rs.getString("userid");
action = rs.getString("action");
time = rs.getString("time");

model.addRow(new Object[]{Sr_no, name, action, time});
i++; 
}
if(i <1)
{
JOptionPane.showMessageDialog(null, "No Record Found","Error",JOptionPane.ERROR_MESSAGE);
}
if(i ==1)
{
System.out.println(i+" Record Found");
}
else
{
System.out.println(i+" Records Found");
}
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}
frame1.add(scroll);
frame1.setVisible(true);
frame1.setSize(400,300);
}

public static void main(String args[])
{
SearchResult sr = new SearchResult();
sr.createUI(); 
}
}