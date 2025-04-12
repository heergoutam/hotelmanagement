import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

import com.mysql.cj.protocol.Resultset;

import net.proteanit.sql.DbUtils;

public class SearchRoom extends JFrame implements ActionListener{
    JCheckBox checkBox;
    Choice choice;
    JTable table;
    JButton addbtn,backbtn;
    SearchRoom(){

        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5, 5, 690, 490);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JLabel label1 = new JLabel("ROOM SEARCH");
        label1.setBounds(250, 11, 186, 31);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(label1);

        
        JLabel label2 = new JLabel("BED TYPE");
        label2.setBounds(35, 68, 120, 20);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("serif",Font.BOLD,18));
        panel.add(label2);

        JLabel label3 = new JLabel("ROOM NO");
        label3.setBounds(50, 162, 150, 20);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("serif",Font.BOLD,14));
        panel.add(label3);

        JLabel label4 = new JLabel("SPACE");
        label4.setBounds(200, 162, 150, 20);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("serif",Font.BOLD,14));
        panel.add(label4);

        JLabel label5 = new JLabel("STATUS");
        label5.setBounds(340, 162, 150, 20);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("serif",Font.BOLD,14));
        panel.add(label5);

        JLabel label6 = new JLabel("BED TYPE");
        label6.setBounds(470, 162, 150, 20);
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("serif",Font.BOLD,14));
        panel.add(label6);

        JLabel label7 = new JLabel("PRICE");
        label7.setBounds(610, 162, 150, 20);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("serif",Font.BOLD,14));
        panel.add(label7);

        checkBox = new JCheckBox("AVAILABLE");
        checkBox.setBounds(500, 69, 205, 23);
        checkBox.setForeground(Color.WHITE);
        checkBox.setBackground(new Color(3,45,48));
        panel.add(checkBox);

        choice = new Choice();
        choice.add("SINGLE");
        choice.add("DOUBLE");
        choice.setBounds(158, 70, 120, 20);
        panel.add(choice);

        table =new JTable();
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        table.setBounds(0, 187, 700, 150);
        panel.add(table);

        try{
            conn c = new conn();
            String q = "select * from room";
            ResultSet resultset = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultset));


        }catch(Exception e){
            e.printStackTrace();
        }

        addbtn = new JButton("SEARCH");
        addbtn.setBounds(200, 400, 100, 30);
        addbtn.setBackground(Color.BLACK);
        addbtn.setForeground(Color.WHITE);
        addbtn.addActionListener(this);
        panel.add(addbtn);
        backbtn = new JButton("BACK");
        backbtn.setBounds(400, 400, 100, 30);
        backbtn.setBackground(Color.BLACK);
        backbtn.setForeground(Color.WHITE);
        backbtn.addActionListener(this);
        panel.add(backbtn);


        setUndecorated(true);
        setLayout(null);
        setSize(700, 500);
        setLocation(500, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == addbtn){
        String Q = "select * from room where bed_type = '"+choice.getSelectedItem()+"'";
        String Q1 = "select * from room where availability = 'Available' And bed_type = '"+choice.getSelectedItem()+"'";
        try{
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery(Q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

            if(checkBox.isSelected()){
                ResultSet resultSet2 = c.statement.executeQuery(Q1);
                table.setModel(DbUtils.resultSetToTableModel(resultSet2));
            }

        }catch(Exception E){
            E.printStackTrace();
        }
       }else{
        setVisible(false);
       }
        
    }
    public static void main(String[] args) {
        new SearchRoom();
    }
}
