import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddEmployee extends JFrame implements ActionListener{
    JTextField textField1,textField2,textField3,textField4,textField5,textField6;
    JRadioButton radioButtonM,radioButtonF;
    JComboBox comboBox;
    JButton addbtn,backbtn;

    AddEmployee(){

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890, 490);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JLabel label = new JLabel("NAME");
        label.setBounds(60, 35, 150, 27);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label);
        textField1 = new JTextField();
        textField1.setBounds(200, 35, 150, 27);
        textField1.setBackground(Color.BLACK);
        textField1.setForeground(Color.WHITE);
        textField1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(textField1);

        JLabel label1 = new JLabel("AGE");
        label1.setBounds(60, 80, 150, 27);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label1);
        textField2 = new JTextField();
        textField2.setBounds(200, 80, 150, 27);
        textField2.setBackground(Color.BLACK);
        textField2.setForeground(Color.WHITE);
        textField2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(textField2);

        JLabel label3 = new JLabel("GENDER");
        label3.setBounds(60, 125, 150, 27);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label3);
        radioButtonM = new JRadioButton("MALE");
        radioButtonM.setBounds(199, 125, 70, 27);
        radioButtonM.setFont(new Font("Tahoma",Font.BOLD,14));
        radioButtonM.setBackground(new Color(3,45,48));
        radioButtonM.setForeground(Color.WHITE);
        panel.add(radioButtonM);
        radioButtonF = new JRadioButton("FEMALE");
        radioButtonF.setBounds(280, 125, 100, 27);
        radioButtonF.setFont(new Font("Tahoma",Font.BOLD,14));
        radioButtonF.setBackground(new Color(3,45,48));
        radioButtonF.setForeground(Color.WHITE);
        panel.add(radioButtonF);

        JLabel label4 = new JLabel("JOB");
        label4.setBounds(60, 170, 150, 27);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label4);
        comboBox = new JComboBox<>(new String[]{"Font Desk","House keeping","Kitchen Staff","Room Service","Acountant","Manager","Chef"});
        comboBox.setBounds(200, 170, 150, 27);
        comboBox.setBackground(Color.BLACK);
        comboBox.setForeground(Color.WHITE);
        comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(comboBox);

        JLabel label5 = new JLabel("SALARY");
        label5 .setBounds(60, 215, 150, 27);
        label5 .setForeground(Color.WHITE);
        label5.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label5);
        textField3 = new JTextField();
        textField3.setBounds(200, 215, 150, 27);
        textField3.setBackground(Color.BLACK);
        textField3.setForeground(Color.WHITE);
        textField3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(textField3);

        JLabel label6 = new JLabel("CONTACT");
        label6 .setBounds(60, 260, 150, 27);
        label6 .setForeground(Color.WHITE);
        label6.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label6);
        textField4 = new JTextField();
        textField4.setBounds(200, 260, 150, 27);
        textField4.setBackground(Color.BLACK);
        textField4.setForeground(Color.WHITE);
        textField4.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(textField4);

        JLabel label7 = new JLabel("AADHAR");
        label7.setBounds(60, 305, 150, 27);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label7);
        textField5 = new JTextField();
        textField5.setBounds(200, 305, 150, 27);
        textField5.setBackground(Color.BLACK);
        textField5.setForeground(Color.WHITE);
        textField5.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(textField5);

        JLabel label8 = new JLabel("E-MAIL");
        label8.setBounds(60, 350, 150, 27);
        label8.setForeground(Color.WHITE);
        label8.setFont(new Font("serif",Font.BOLD,17));
        panel.add(label8);
        textField6 = new JTextField();
        textField6.setBounds(200, 350, 150, 27);
        textField6.setBackground(Color.BLACK);
        textField6.setForeground(Color.WHITE);
        textField6.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(textField6);

        JLabel label9 = new JLabel("ADD EMPLOYEE DETAILS");
        label9.setBounds(400, 20, 445, 33);
        label9.setForeground(Color.WHITE);
        label9.setFont(new Font("Tahoma",Font.BOLD,31));
        panel.add(label9);

        addbtn = new JButton("ADD");
        addbtn.setBounds(70, 420, 100, 30);
        addbtn.setBackground(Color.BLACK);
        addbtn.setForeground(Color.WHITE);
        addbtn.addActionListener(this);
        panel.add(addbtn);
        backbtn = new JButton("BACK");
        backbtn.setBounds(200, 420, 100, 30);
        backbtn.setBackground(Color.BLACK);
        backbtn.setForeground(Color.WHITE);
        backbtn.addActionListener(this);
        panel.add(backbtn);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label10 = new JLabel(imageIcon1);
        label10.setBounds(440, 80, 300, 300);
        panel.add(label10);
        
        
        setUndecorated(true);
        setLocation(60, 160);
        setSize(900, 500);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== addbtn){

            String name = textField1.getText();
            String age = textField2.getText();
            String sal = textField3.getText();
            String cont = textField4.getText();
            String aadh = textField5.getText();
            String mail = textField6.getText();
            String job = (String) comboBox.getSelectedItem();
            String gend = null;
            if(radioButtonM.isSelected()){
                gend = "MALE";
            }else if(radioButtonF.isSelected()){
                gend = "FEMALE";
            }
            try{
                conn c = new conn();
                String q = "insert into employee values('"+name+"','"+age+"','"+gend+"','"+job+"','"+sal+"','"+cont+"','"+aadh+"','"+mail+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Employee Details Added");


            }catch(Exception E){
                E.printStackTrace();
            }
        }else{
            setVisible(false);
        }
        
    }
    public static void main(String[] args) {

        new AddEmployee();
        
    }
}
