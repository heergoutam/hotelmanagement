
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

import com.mysql.cj.protocol.Resultset;

import net.proteanit.sql.DbUtils;

public class Rooms extends JFrame{
    JTable table;
    JButton backbtn;

    Rooms(){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890, 590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image i23 = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(i23);
        JLabel label = new JLabel(imageIcon2);
        label.setBounds(600, 200, 200, 200);
        panel.add(label);
        
        table = new JTable();
        table.setBounds(10, 60, 500, 400);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        backbtn = new JButton("Back");
        backbtn.setBounds(200, 500, 120, 30);
        backbtn.setBackground(Color.BLACK);
        backbtn.setForeground(Color.WHITE);
        panel.add(backbtn);
        backbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);

            }
        });

        JLabel label1 = new JLabel("ROOM NO");
        label1.setBounds(10, 15, 80, 19);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(label1);

        JLabel label2 = new JLabel("AVAILABILITY");
        label2.setBounds(108, 15, 80, 19);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(label2);

        JLabel label3 = new JLabel("CLEANING STATUS");
        label3.setBounds(208, 15, 80, 19);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(label3);

        JLabel label4 = new JLabel("BED TYPE");
        label4.setBounds(310, 15, 80, 19);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(label4);

        JLabel label5 = new JLabel("PRICE");
        label5.setBounds(412, 15, 80, 19);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Tahoma",Font.BOLD,12));
        panel.add(label5);



        try{
            conn c = new conn();
            String RoomInfo = "select* from room";
            ResultSet resultSet = c.statement.executeQuery(RoomInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch(Exception E){
            E.printStackTrace();
        }



        setUndecorated(true);
        setLayout(null);
        setLocation(500,100);
        setSize(900, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Rooms();
    }
    
}
