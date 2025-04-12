import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.*;

public class NewCust extends JFrame implements ActionListener{
    JTextField textField1,textField2,textField3,textField4,textField5;
    JRadioButton  radioButtonM,radioButtonF;
    JComboBox comboBox;
    Choice c1;
    JLabel date;
    JButton addbtn,backbtn;
    NewCust(){

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(550, 150, 200, 200);
        panel.add(label);

        JLabel label1 = new JLabel("NEW CUSTOMER FORM");
        label1.setBounds(118, 3, 260, 53);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(label1);

        JLabel label2 = new JLabel("NAME");
        label2.setBounds(33, 71, 200, 16);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label2);
        textField1 = new JTextField();
        textField1.setBounds(250, 71, 150, 20);
        textField1.setBackground(Color.BLACK);
        textField1.setForeground(Color.WHITE);
        textField1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(textField1);

        JLabel label3 = new JLabel("AGE");
        label3.setBounds(30, 111, 200, 16);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label3);
        textField2 = new JTextField();
        textField2.setBounds(250, 111, 150, 20);
        textField2.setBackground(Color.BLACK);
        textField2.setForeground(Color.WHITE);
        textField2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(textField2);

        JLabel label4 = new JLabel("GENDER");
        label4.setBounds(30, 151, 200, 16);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label4);
        radioButtonM = new JRadioButton("MALE");
        radioButtonM.setBounds(250, 151, 80, 20);
        radioButtonM.setFont(new Font("Tahoma",Font.BOLD,14));
        radioButtonM.setBackground(new Color(3,45,48));
        radioButtonM.setForeground(Color.WHITE);
        panel.add(radioButtonM);
        radioButtonF = new JRadioButton("FEMALE");
        radioButtonF.setBounds(325, 151, 97, 20);
        radioButtonF.setFont(new Font("Tahoma",Font.BOLD,14));
        radioButtonF.setBackground(new Color(3,45,48));
        radioButtonF.setForeground(Color.WHITE);
        panel.add(radioButtonF);

        JLabel label5 = new JLabel("ID-NO");
        label5.setBounds(30, 191, 200, 16);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label5);
        textField3 = new JTextField();
        textField3.setBounds(250, 191, 150, 20);
        textField3.setBackground(Color.BLACK);
        textField3.setForeground(Color.WHITE);
        textField3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(textField3);

        JLabel label6 = new JLabel("ID PROOF");
        label6.setBounds(30, 231, 200, 16);
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label6);

        comboBox = new JComboBox<>(new String[]{"AADHAR","PASSPORT"});
        comboBox.setBounds(250, 231, 150, 20);
        comboBox.setBackground(Color.BLACK);
        comboBox.setForeground(Color.WHITE);
        comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(comboBox);

        JLabel label7 = new JLabel("COUNTRY");
        label7.setBounds(30, 271, 200, 16);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label7);
        textField4 = new JTextField();
        textField4.setBounds(250, 271, 150, 20);
        textField4.setBackground(Color.BLACK);
        textField4.setForeground(Color.WHITE);
        textField4.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(textField4);

        JLabel label8 = new JLabel("ALLOC ROOM-NO");
        label8.setBounds(30, 310, 200, 16);
        label8.setForeground(Color.WHITE);
        label8.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label8);
        c1 = new Choice();
        try{
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select* from room");
            while(resultSet.next()){
                c1.add(resultSet.getString("room"));

            }
        }catch(Exception e){
            e.printStackTrace();
        }
        c1.setBounds(250, 310, 150, 20);
        c1.setBackground(Color.BLACK);
        c1.setForeground(Color.WHITE);
        c1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(c1);

        JLabel label9 = new JLabel("CHECKED-IN");
        label9.setBounds(30, 351, 200, 16);
        label9.setForeground(Color.WHITE);
        label9.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label9);

        Date date1 = new Date();

        date = new JLabel(""+date1);
        date.setBounds(250, 351, 150, 14);
        date.setForeground(Color.WHITE);
        date.setFont(new Font("serif",Font.BOLD,17));
        panel.add(date);

        JLabel label10 = new JLabel("DEPOSIT");
        label10.setBounds(30, 391, 200, 16);
        label10.setForeground(Color.WHITE);
        label10.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label10);
        textField5 = new JTextField();
        textField5.setBounds(250, 391, 150, 20);
        textField5.setBackground(Color.BLACK);
        textField5.setForeground(Color.WHITE);
        textField5.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(textField5);

        addbtn = new JButton("ADD");
        addbtn.setBounds(70, 450, 100, 30);
        addbtn.setBackground(Color.BLACK);
        addbtn.setForeground(Color.WHITE);
        addbtn.addActionListener(this);
        panel.add(addbtn);
    
        backbtn = new JButton("BACK");
        backbtn.setBounds(200, 450, 100, 30);
        backbtn.setBackground(Color.BLACK);
        backbtn.setForeground(Color.WHITE);
        backbtn.addActionListener(this);
        panel.add(backbtn);
        





        setUndecorated(true);
        setLayout(null);
        setSize(850, 550);
        setLocation(500, 100);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== addbtn){
            conn c = new conn();
            String name = textField1.getText();
            String age = textField2.getText();
            String gender = null;
            if(radioButtonM.isSelected()){
                gender = ("MALE");
            }else if(radioButtonF.isSelected()){
                gender = ("FEMALE");
            }
            String idno = textField3.getText();
            String id = (String)comboBox.getSelectedItem();
            String country = textField4.getText();
            String allocroomno = c1.getSelectedItem();
            String dateString = date.getText();
            String deposit = textField5.getText();
            
            try{
                String q = "insert into customer values('"+name+"','"+age+"','"+gender+"','"+idno+"','"+id+"','"+country+"','"+allocroomno+"','"+dateString+"','"+deposit+"')";
                String q1 = "update room set availability = 'occupied'where room ="+allocroomno;
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);
                JOptionPane.showMessageDialog(null, "Customer Added Successfully");
                setVisible(false);

            }catch(Exception E){
                E.printStackTrace();
            }

        }else{
            setVisible(false);
        }
        
        
    }
    public static void main(String[] args) {
        new NewCust();
    }
    
}
