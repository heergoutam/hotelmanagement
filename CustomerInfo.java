import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

import net.proteanit.sql.DbUtils;

public class CustomerInfo extends JFrame implements ActionListener{

    JButton backbtn;

    CustomerInfo(){

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890, 590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        
        JTable table = new JTable();
        table.setBounds(0, 39, 910, 450);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            conn c = new conn();
            String q = "select * from customer";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
            

        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel label1 = new JLabel("NAME");
        label1.setBounds(45, 7, 80, 19);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("serif",Font.BOLD,12));
        panel.add(label1);

        JLabel label2 = new JLabel("AGE");
        label2.setBounds(150, 7, 80, 19);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("serif",Font.BOLD,12));
        panel.add(label2);

        JLabel label3 = new JLabel("GENDER");
        label3.setBounds(230, 7, 80, 19);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("serif",Font.BOLD,12));
        panel.add(label3);

        JLabel label4 = new JLabel("ID-NO");
        label4.setBounds(345, 7, 80, 19);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("serif",Font.BOLD,12));
        panel.add(label4);

        JLabel label5 = new JLabel("ID");
        label5.setBounds(450, 7, 80, 19);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("serif",Font.BOLD,12));
        panel.add(label5);

        JLabel label6 = new JLabel("COUNTRY");
        label6.setBounds(525, 7, 80, 19);
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("serif",Font.BOLD,12));
        panel.add(label6);

        JLabel label7 = new JLabel("ROOM-NO");
        label7.setBounds(625, 7, 80, 19);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("serif",Font.BOLD,12));
        panel.add(label7);

        JLabel label8 = new JLabel("CHECK-IN");
        label8.setBounds(725, 7, 80, 19);
        label8.setForeground(Color.WHITE);
        label8.setFont(new Font("serif",Font.BOLD,12));
        panel.add(label8);

        JLabel label9 = new JLabel("DEPOSIT");
        label9.setBounds(820, 7, 80, 19);
        label9.setForeground(Color.WHITE);
        label9.setFont(new Font("serif",Font.BOLD,12));
        panel.add(label9);

        backbtn = new JButton("BACK");
        backbtn.setBounds(450, 500, 120, 30);
        backbtn.setBackground(Color.BLACK);
        backbtn.setForeground(Color.WHITE);
        backbtn.addActionListener(this);
        panel.add(backbtn);


        setUndecorated(true);
        setLayout(null);
        setLocation(500, 100);
        setSize(900, 600);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new CustomerInfo();
    }
    
}
