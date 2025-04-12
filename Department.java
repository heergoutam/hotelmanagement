import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;

import net.proteanit.sql.DbUtils;

public class Department extends JFrame implements ActionListener {
    JButton backbtn;

    Department(){

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 690, 490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(0, 40, 700, 350);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        JLabel label = new JLabel("DEPARTMENT");
        label.setBounds(140, 7, 90, 24);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(label);

        JLabel label1 = new JLabel("BUDGET");
        label1.setBounds(490, 7, 90, 24);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(label1);


        try{
            conn c = new conn();
            String deptInfo = "select* from department";
            ResultSet resultSet = c.statement.executeQuery(deptInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch(Exception E){
            E.printStackTrace();
        }

        backbtn = new JButton("Back");
        backbtn.setBounds(400, 410, 120, 30);
        backbtn.setBackground(Color.BLACK);
        backbtn.setForeground(Color.WHITE);
        backbtn.addActionListener(this);
        panel.add(backbtn);

        setUndecorated(true);
        setLocation(550, 150);
        setSize(700, 500);
        setLayout(null);
        setVisible(true);

        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        
    }

    public static void main(String[] args) {
        new Department();
    }

    
}
