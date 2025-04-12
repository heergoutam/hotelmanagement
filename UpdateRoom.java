import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class UpdateRoom extends JFrame{
    UpdateRoom(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5, 5, 940, 490);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/update.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500, 60, 300, 300);
        panel.add(label);

        JLabel label1 = new JLabel("UPDATE ROOM ");
        label1.setBounds(124, 11, 222, 25);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(label1);

        JLabel label2 = new JLabel("ID");
        label2.setBounds(25, 88, 110, 14);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("serif",Font.BOLD,14));
        panel.add(label2);

        Choice c= new Choice();
        c.setBounds(230, 85, 140, 20);
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        panel.add(c);

        try{
            conn C = new conn();
            ResultSet resultSet = C.statement.executeQuery("select* from customer");
            while(resultSet.next()){
                c.add(resultSet.getString("idno"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel label3 = new JLabel("ROOM NO");
        label3 .setBounds(25, 134, 110, 14);
        label3 .setForeground(Color.WHITE);
        label3 .setFont(new Font("serif",Font.BOLD,14));
        panel.add(label3 );

        JTextField textField1 = new JTextField();
        textField1.setBounds(230, 134, 140, 20);
        textField1.setBackground(Color.BLACK);
        textField1.setForeground(Color.WHITE);
        panel.add(textField1);

        JLabel label4 = new JLabel("AVAILABILITY");
        label4 .setBounds(25, 182, 110, 14);
        label4 .setForeground(Color.WHITE);
        label4 .setFont(new Font("serif",Font.BOLD,14));
        panel.add(label4 );

        JTextField textField2 = new JTextField();
        textField2.setBounds(230, 182, 140, 20);
        textField2.setBackground(Color.BLACK);
        textField2.setForeground(Color.WHITE);
        panel.add(textField2);

        JLabel label5 = new JLabel("CLEAN STATUS");
        label5 .setBounds(25, 232, 110, 14);
        label5 .setForeground(Color.WHITE);
        label5 .setFont(new Font("serif",Font.BOLD,14));
        panel.add(label5 );

        JTextField textField3 = new JTextField();
        textField3.setBounds(230, 232, 140, 20);
        textField3.setBackground(Color.BLACK);
        textField3.setForeground(Color.WHITE);
        panel.add(textField3);

        // JLabel label6 = new JLabel("AMOUNT PAID");
        // label6 .setBounds(25, 282, 110, 14);
        // label6 .setForeground(Color.WHITE);
        // label6 .setFont(new Font("serif",Font.BOLD,14));
        // panel.add(label6 );

        // JTextField textField4 = new JTextField();
        // textField4.setBounds(230, 282, 140, 20);
        // textField4.setBackground(Color.BLACK);
        // textField4.setForeground(Color.WHITE);
        // panel.add(textField4);

        // JLabel label7 = new JLabel("DUE AMOUNT");
        // label7 .setBounds(25, 332, 110, 14);
        // label7 .setForeground(Color.WHITE);
        // label7 .setFont(new Font("serif",Font.BOLD,14));
        // panel.add(label7 );

        // JTextField textField5 = new JTextField();
        // textField5.setBounds(230, 332, 140, 20);
        // textField5.setBackground(Color.BLACK);
        // textField5.setForeground(Color.WHITE);
        // panel.add(textField5);

        JButton update = new JButton("UPDATE");
        update.setBounds(110, 350, 100, 25);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        panel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    conn C = new conn();
                    String status = textField3.getText();
                    C.statement.executeUpdate("update room set cleaning_status = '"+status+"' where room =" +textField1.getText());
                    JOptionPane.showMessageDialog(null, "Updated Successfully");
                    setVisible(false);

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton check = new JButton("CHECK");
        check.setBounds(230, 350, 100, 25);
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        panel.add( check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String id = c.getSelectedItem();
                String q = "select * from customer where idno = '"+id+"'";

                try{
                    conn c = new conn();
                    ResultSet resultSet = c.statement.executeQuery(q);

                    while(resultSet.next()){
                        textField1.setText(resultSet.getString("allocroomno"));
                        // textField4.setText(resultSet.getString("deposit"));
                    }

                    ResultSet resultSet2 = c.statement.executeQuery("select* from room where room = '"+textField1.getText()+"'");

                    while (resultSet2.next()) {
                        textField2.setText(resultSet2.getString("availability"));
                        textField3.setText(resultSet2.getString("cleaning_status"));
                        // String price = resultSet2.getString("price");
                        // int amtPaid = Integer.parseInt(price) - Integer.parseInt(textField4.getText());
                        // textField5.setText(""+amtPaid);
                        
                    }

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("BACK");
        back.setBounds(350, 350, 100, 25);
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
        setLocation(400, 200);
        setSize(950, 450);
        setVisible(true);

    }
    public static void main(String[] args) {
        new UpdateRoom();
    }
}
