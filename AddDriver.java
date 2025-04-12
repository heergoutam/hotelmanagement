import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddDriver extends JFrame  implements ActionListener{
    JTextField textField1,textField2,textField3,textField4,textField5;
    JComboBox comboBox,comboBox2;
    JButton addbtn,backbtn;

    AddDriver(){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890, 490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("ADD DRIVER DETAILS");
        label.setBounds(300, 10, 280, 22);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma",Font.BOLD,22));
        panel.add(label);

        JLabel label1 = new JLabel("NAME");
        label1.setBounds(64, 70, 102, 22);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("serif",Font.BOLD,16));
        panel.add(label1);
        textField1 = new JTextField();
        textField1.setBounds(185, 70, 156, 22);
        textField1.setBackground(Color.BLACK);
        textField1.setForeground(Color.WHITE);
        textField1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(textField1);

        JLabel label2 = new JLabel("AGE");
        label2.setBounds(64, 110, 102, 22);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("serif",Font.BOLD,16));
        panel.add(label2);
        textField2 = new JTextField();
        textField2.setBounds(185, 110, 156, 22);
        textField2.setBackground(Color.BLACK);
        textField2.setForeground(Color.WHITE);
        textField2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(textField2);

        JLabel label3 = new JLabel("GENDER");
        label3.setBounds(64, 150, 102, 22);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("serif",Font.BOLD,16));
        panel.add( label3);
        comboBox = new JComboBox<>(new String []{"MALE","FEMALE"});
        comboBox.setBounds(185, 150, 156, 22);
        comboBox.setBackground(Color.BLACK);
        comboBox.setForeground(Color.WHITE);
        comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(comboBox);

        
        JLabel label4 = new JLabel("CAR TYPE");
        label4.setBounds(64, 190, 102, 22);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("serif",Font.BOLD,16));
        panel.add(label4);
        textField3 = new JTextField();
        textField3.setBounds(185, 190, 156, 22);
        textField3.setBackground(Color.BLACK);
        textField3.setForeground(Color.WHITE);
        textField3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(textField3);

        JLabel label5 = new JLabel("CAR NAME");
        label5.setBounds(64, 230, 102, 22);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("serif",Font.BOLD,16));
        panel.add(label5);
        textField4 = new JTextField();
        textField4.setBounds(185, 230, 156, 22);
        textField4.setBackground(Color.BLACK);
        textField4.setForeground(Color.WHITE);
        textField4.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(textField4);

        JLabel label6 = new JLabel("AVAILABLE");
        label6.setBounds(64, 270, 102, 22);
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("serif",Font.BOLD,16));
        panel.add( label6);
        comboBox2 = new JComboBox<>(new String []{"YES","NO"});
        comboBox2.setBounds(185, 270, 156, 22);
        comboBox2.setBackground(Color.BLACK);
        comboBox2.setForeground(Color.WHITE);
        comboBox2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(comboBox2);

        JLabel label7 = new JLabel("LOCATION");
        label7.setBounds(64, 310, 102, 22);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("serif",Font.BOLD,16));
        panel.add(label7);
        textField5= new JTextField();
        textField5.setBounds(185, 310, 156, 22);
        textField5.setBackground(Color.BLACK);
        textField5.setForeground(Color.WHITE);
        textField5.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(textField5);

        addbtn = new JButton("ADD");
        addbtn.setBounds(64, 390, 111, 33);
        addbtn.setBackground(Color.BLACK);
        addbtn.setForeground(Color.WHITE);
        addbtn.addActionListener(this);
        panel.add(addbtn);

        backbtn = new JButton("BACK");
        backbtn.setBounds(198, 390, 111, 33);
        backbtn.setBackground(Color.BLACK);
        backbtn.setForeground(Color.WHITE);
        backbtn.addActionListener(this);
        panel.add(backbtn);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/license.png"));
        Image i2 = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(i2);
        JLabel label8 = new JLabel(imageIcon2);
        label8.setBounds(430, 70, 300, 300);
        panel.add(label8);
        
        setUndecorated(true);
        setLocation(20, 200);
        setLayout(null);
        setSize(900, 500);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== addbtn){
            String name = textField1.getText();
            String age = textField2.getText();
            String gender = (String) comboBox.getSelectedItem();
            String car_type = textField3.getText();
            String car_name = textField4.getText();
            String avail = (String)comboBox2.getSelectedItem();
            String loc = textField5.getText();

            try{
                conn c = new conn();
                String q = "insert into driver values('"+name+"','"+age+"','"+gender+"','"+car_type+"','"+car_name+"','"+avail+"','"+loc+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Driver Details Added");
                setVisible(false);


            }catch(Exception E){
                E.printStackTrace();;
            }

        }else{
            setVisible(false);
        }
        
    }

    public static void main(String[] args) {
        new AddDriver();
    }
    
}
