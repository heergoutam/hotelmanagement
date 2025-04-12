import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
// import javax.swing.ImageIcon;
// import javax.swing.JButton;
// import javax.swing.JComboBox;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JOptionPane;
// import javax.swing.JPanel;
// import javax.swing.JTextField;

public class AddRooms extends JFrame implements ActionListener{
    JButton b1,b2;
    TextField textField1;
    TextField  textField3;
    JComboBox t2,t4,t5;
    

    AddRooms(){

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 875, 490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("ADD ROOMS");
        label.setBounds(194, 10, 160, 22);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma",Font.BOLD,22));
        panel.add(label);

        JLabel label2 = new JLabel("ROOM NO");
        label2.setBounds(64, 70, 152, 22);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(label2);

        textField1 = new TextField();
        textField1.setBounds(220, 70, 156, 20);
        textField1.setBackground(Color.BLACK);
        textField1.setForeground(Color.WHITE);
        panel.add(textField1);

        JLabel label3 = new JLabel("AVAILABLITY");
        label3.setBounds(64, 110, 152, 22);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(label3);

        t2 = new JComboBox<>(new String[]{"Available", "Occupied"});
        t2.setBounds(220, 110, 156, 20);
        t2.setBackground(Color.BLACK);
        t2.setForeground(Color.WHITE);
        panel.add(t2);

        JLabel label4 = new JLabel("ROOM PRICE");
        label4.setBounds(64, 150, 152, 22);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(label4);

        textField3 = new TextField();
        textField3.setBounds(220, 150, 156, 20);
        textField3.setBackground(Color.BLACK);
        textField3.setForeground(Color.WHITE);
        panel.add(textField3);

        JLabel label5 = new JLabel("CLEANING STATUS");
        label5.setBounds(64, 190, 152, 22);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(label5);

        t4 = new JComboBox<>(new String[]{"Cleaned ", "Dirty"});
        t4 .setBounds(220, 190, 156, 20);
        t4 .setBackground(Color.BLACK);
        t4 .setForeground(Color.WHITE);
        panel.add(t4);

        
        JLabel label6 = new JLabel("BED TYPE");
        label6.setBounds(64, 230, 152, 22);
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add (label6);

        t5 = new JComboBox<>(new String[]{"Single ", "Double"});
        t5.setBounds(220,230, 156, 20);
        t5 .setBackground(Color.BLACK);
        t5 .setForeground(Color.WHITE);
        panel.add(t5);

        b1 = new JButton("ADD");
        b1.setBounds(64,321, 111, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        
        b2 = new JButton("BACK");
        b2.setBounds(198,321, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);


        
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(image);
        JLabel label8 = new JLabel(imageIcon2);
        label8.setBounds(500, 60, 300, 300);
        panel.add(label8);

        setUndecorated(true);
        setLocation(20,200);
        setLayout(null);
        setSize(885, 500);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== b1){
            try{
            conn c = new conn();
            String room = textField1.getText();
            String ava = (String)t2.getSelectedItem();
            String cs = (String)t4.getSelectedItem();
            String type = (String)t5.getSelectedItem();
            String price = textField3.getText();

            String q = "insert into room values('"+room+"','"+ava+"','"+cs+"','"+type+"','"+price+"')";
            c.statement.executeUpdate(q);

            JOptionPane.showMessageDialog(null, "Room Successfully Added");
            setVisible(false);

            }catch(Exception E){
                E.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
        

    public static void main(String[] args) {
        new AddRooms();
        
    }
    
}
