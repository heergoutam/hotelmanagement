import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

import net.proteanit.sql.DbUtils;

public class ManagerInfo extends JFrame {
    ManagerInfo(){
        
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 990, 590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10, 39, 980, 450);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try {
            conn c = new conn(); 
            String q = "select * from employee where job = 'Manager'";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet)); 
    
        } catch (Exception e) {
         e.printStackTrace();
       }


        JButton  backbtn = new JButton("BACK");
        backbtn.setBounds(350, 500, 120, 30);
        backbtn.setBackground(Color.BLACK);
        backbtn.setForeground(Color.WHITE);
        panel.add(backbtn);
        backbtn.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });

        JLabel label1 = new JLabel("NAME");
        label1.setBounds(80, 7, 80, 19);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(label1);

        JLabel label2 = new JLabel("AGE");
        label2.setBounds(215, 7, 80, 19);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(label2);

        JLabel label3 = new JLabel("GENDER");
        label3.setBounds(315, 7, 80, 19);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(label3);

        JLabel label4 = new JLabel("JOB");
        label4.setBounds(460, 7, 80, 19);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(label4);

        JLabel label5 = new JLabel("SALARY");
        label5.setBounds(560, 7, 80, 19);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(label5);

        JLabel label6 = new JLabel("CONTACT");
        label6.setBounds(670, 7, 80, 19);
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(label6);

        JLabel label7 = new JLabel("AADHAR");
        label7.setBounds(800, 7, 80, 19);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(label7);

        JLabel label8 = new JLabel("EMAIL");
        label8.setBounds(910, 7, 80, 19);
        label8.setForeground(Color.WHITE);
        label8.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(label8);





        setUndecorated(true);
        setLocation(430,100);
        setLayout(null);
        setSize(1000, 600);
        setVisible(true);
    }
        

    public static void main(String[] args) {
        new ManagerInfo();
    }
    
}
