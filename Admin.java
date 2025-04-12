import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Admin extends JFrame implements ActionListener{

JButton add_Employee,add_Rooms,add_Driver,Logout,Back;

    Admin(){

        add_Employee = new JButton("ADD EMPLOYEE");
        add_Employee.setBounds(250, 230, 200, 30);
        add_Employee.setBackground(Color.WHITE);
        add_Employee.setForeground(Color.BLACK);
        add_Employee.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Employee.addActionListener(this);
        add(add_Employee);

        add_Rooms = new JButton("ADD ROOM");
        add_Rooms.setBounds(250, 380, 200, 30);
        add_Rooms.setBackground(Color.WHITE);
        add_Rooms.setForeground(Color.BLACK);
        add_Rooms.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Rooms.addActionListener(this);
        add(add_Rooms);

        add_Driver = new JButton("ADD DRIVER");
        add_Driver.setBounds(250, 530, 200, 30);
        add_Driver.setBackground(Color.WHITE);
        add_Driver.setForeground(Color.BLACK);
        add_Driver.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Driver.addActionListener(this);
        add(add_Driver);

        Logout = new JButton("Logout");
        Logout.setBounds(10, 750, 95, 30);
        Logout.setBackground(Color.WHITE);
        Logout.setForeground(Color.BLACK);
        Logout.setFont(new Font("Tahoma",Font.BOLD,15));
        Logout.addActionListener(this);
        add(Logout);

        Back = new JButton("Back");
        Back.setBounds(110, 750, 95, 30);
        Back.setBackground(Color.WHITE);
        Back.setForeground(Color.BLACK);
        Back.setFont(new Font("Tahoma",Font.BOLD,15));
        Back.addActionListener(this);
        add(Back);

        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image i1 = imageIcon1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(70, 180, 120, 120);
        add(label);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image i3 = imageIcon2.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon4 = new ImageIcon(i3);
        JLabel label1 = new JLabel(imageIcon4);
        label1.setBounds(70, 330, 120, 120);
        add(label1);

        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image i4 = imageIcon3.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon5 = new ImageIcon(i4);
        JLabel label2 = new JLabel(imageIcon5);
        label2.setBounds(70, 490, 120, 120);
        add(label2);

        
        ImageIcon imageIcon8 = new ImageIcon(ClassLoader.getSystemResource("icon/GHH.gif"));
        Image i5 = imageIcon8.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon6 = new ImageIcon(i5);
        JLabel label3 = new JLabel(imageIcon6);
        label3.setBounds(1000, 250, 400, 400);
        add(label3);







        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);

    }
    
@Override
public void actionPerformed(ActionEvent e) {
    if(e.getSource()== add_Employee){
        new AddEmployee();

    }else if(e.getSource()== add_Driver){
        new AddDriver();

    }else if(e.getSource()== add_Rooms){
        new AddRooms();

    }else if(e.getSource()== Logout){
        System.exit(102);
    }else if(e.getSource()== Back){
        new Dashboard();
        setVisible(false);
    }
    
}

    public static void main(String[] args) {
        new Admin();
    }
    
}
