import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Reception extends JFrame {


    Reception(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280, 5, 1280, 820);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5, 5, 270, 820);
        panel1.setBackground(new Color(3,45,48));
        add(panel1);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/rr.gif"));
        Image i1 = i11.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i1);
        JLabel label  = new JLabel(imageIcon11);
        label.setBounds(300, 20, 800, 800);
        panel.add(label);


        ImageIcon i21 = new ImageIcon(ClassLoader.getSystemResource("icon/GHH.gif"));
        Image i12 = i21.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon imageIcon22 = new ImageIcon(i12);
        JLabel label11 = new JLabel(imageIcon22);
        label11.setBounds(5, 530, 250, 250);
        panel1.add(label11);

        JButton btnNCF = new JButton("NEW CUSTOMER");
        btnNCF.setBounds(30, 30, 200, 30);
        btnNCF.setBackground(Color.BLACK);
        btnNCF.setForeground(Color.WHITE);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    new NewCust();

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnRoom = new JButton("ROOM BOOKING");
        btnRoom.setBounds(30, 70, 200, 30);
        btnRoom.setBackground(Color.BLACK);
        btnRoom.setForeground(Color.WHITE);
        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    new Rooms();

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnDP = new JButton("DEPARTMENT");
        btnDP.setBounds(30, 110, 200, 30);
        btnDP.setBackground(Color.BLACK);
        btnDP.setForeground(Color.WHITE);
        panel1.add(btnDP);
        btnDP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    new Department();

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnEI = new JButton("EMPLOYEE INFORMATION");
        btnEI .setBounds(30, 150, 200, 30);
        btnEI .setBackground(Color.BLACK);
        btnEI .setForeground(Color.WHITE);
        panel1.add( btnEI );
        btnEI .addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    new EmployeeInfo();

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnCI = new JButton("CUSTOMER INFORMATION");
        btnCI.setBounds(30, 190, 200, 30);
        btnCI.setBackground(Color.BLACK);
        btnCI.setForeground(Color.WHITE);
        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    new CustomerInfo();

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnMI = new JButton("MANAGER INFORMATION");
        btnMI.setBounds(30, 230, 200, 30);
        btnMI.setBackground(Color.BLACK);
        btnMI.setForeground(Color.WHITE);
        panel1.add(btnMI);
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    new ManagerInfo();

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnCO = new JButton("CHECK-OUT");
        btnCO.setBounds(30, 270, 200, 30);
        btnCO.setBackground(Color.BLACK);
        btnCO.setForeground(Color.WHITE);
        panel1.add(btnCO);
        btnCO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    new CheckOut();

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnUCI = new JButton("UPDATE CHECK-IN");
        btnUCI.setBounds(30, 310, 200, 30);
        btnUCI.setBackground(Color.BLACK);
        btnUCI.setForeground(Color.WHITE);
        panel1.add(btnUCI);
        btnUCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    new UpdateCheck();

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnURS = new JButton("UPDATE ROOM STATUS");
        btnURS.setBounds(30, 350, 200, 30);
        btnURS.setBackground(Color.BLACK);
        btnURS.setForeground(Color.WHITE);
        panel1.add(btnURS);
        btnURS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    new UpdateRoom();

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnPS = new JButton("PICK-UP SERVICE");
        btnPS.setBounds(30, 390, 200, 30);
        btnPS.setBackground(Color.BLACK);
        btnPS.setForeground(Color.WHITE);
        panel1.add(btnPS);
        btnPS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    new PickUP();

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnRS = new JButton("SEARCH ROOMS");
        btnRS.setBounds(30, 430, 200, 30);
        btnRS.setBackground(Color.BLACK);
        btnRS.setForeground(Color.WHITE);
        panel1.add(btnRS);
        btnRS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    new SearchRoom();

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        
        JButton logout = new JButton("LOGOUT");
        logout.setBounds(30, 490, 95, 25);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        panel1.add(logout);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    System.exit(102);

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton backbtn = new JButton("BACK");
        backbtn .setBounds(150, 490, 95, 25);
        backbtn .setBackground(Color.BLACK);
        backbtn .setForeground(Color.WHITE);
        panel1.add(backbtn);
        backbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    setVisible(false);
                    new Dashboard();

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

















        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1950, 1090);
        setVisible(true);


    }
    public static void main(String[] args) {
        new Reception();
        
    }
}
