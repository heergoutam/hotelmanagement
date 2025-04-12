import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.*;

public class CheckOut extends JFrame{
    private Choice Customer;
    CheckOut(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5, 5, 790, 390);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JLabel label1 = new JLabel("CHECK-OUT");
        label1.setBounds(124, 11, 222, 25);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(label1);

        JLabel label2 = new JLabel("USER ID");
        label2.setBounds(8, 60, 130, 25);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("serif",Font.BOLD,14));
        panel.add(label2);

        Choice customer = new Choice();
        customer.setBounds(220, 60, 150, 25);
        customer.setBackground(Color.BLACK);
        customer.setForeground(Color.WHITE);
        panel.add(customer);

        JLabel label3 = new JLabel("ROOM NO");
        label3.setBounds(8, 110, 130, 25);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("serif",Font.BOLD,14));
        panel.add(label3);

        JLabel labelroomno = new JLabel();
        labelroomno.setBounds(220, 110, 150, 25);
        labelroomno.setForeground(Color.WHITE);
        labelroomno.setFont(new Font("serif",Font.BOLD,14));
        panel.add( labelroomno);

        JLabel label4 = new JLabel("CHECK-IN TIME");
        label4.setBounds(8, 160, 130, 25);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("serif",Font.BOLD,14));
        panel.add(label4);

        JLabel labelcheckintime = new JLabel();
        labelcheckintime.setBounds(220, 160, 150, 25);
        labelcheckintime.setForeground(Color.WHITE);
        labelcheckintime.setFont(new Font("serif",Font.BOLD,14));
        panel.add(labelcheckintime);

        JLabel label5 = new JLabel("CHECK-OUT TIME");
        label5.setBounds(8, 210, 130, 25);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("serif",Font.BOLD,14));
        panel.add( label5);

        Date date = new Date();

        
        JLabel labelcheckout = new JLabel(""+date);
        labelcheckout.setBounds(220, 210, 150, 25);
        labelcheckout.setForeground(Color.WHITE);
        labelcheckout.setFont(new Font("serif",Font.BOLD,14));
        panel.add(labelcheckout);

        try{
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select* from customer");
            while(resultSet.next()){
                customer.add(resultSet.getString("idno"));
            }

        }catch(Exception E){
            E.printStackTrace();
        }

        JButton checkout = new JButton("CHECKOUT");
        checkout.setBounds(110, 300, 130, 25);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        panel.add(checkout);
        checkout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                conn c = new conn();
                try{
                    c.statement.executeUpdate("delete from customer where idno = '"+customer.getSelectedItem()+"'");
                    c.statement.executeUpdate("update room set availability = 'available'where room = '"+labelroomno.getText()+"'");
                    JOptionPane.showMessageDialog(null, "Done");
                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        
        JButton check = new JButton("CHECK");
        check.setBounds(265, 300, 130, 25);
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        panel.add( check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                conn c = new conn();
                try{
                    ResultSet resultSet = c.statement.executeQuery("select* from customer where idno = '"+customer.getSelectedItem()+"'");
                    while(resultSet.next()){
                        labelroomno.setText(resultSet.getString("allocroomno"));
                        labelcheckintime.setText(resultSet.getString("checkintime"));
                    }

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        
        JButton back = new JButton("BACK");
        back.setBounds(420, 300, 130, 25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });









        setUndecorated(true);
        setLayout(null);
        setSize(800, 400);
        setLocation(500, 210);
        setVisible(true);

    }
    public static void main(String[] args) {
        new CheckOut();
    }
}
