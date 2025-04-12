import javax.swing.*;
import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class PickUP extends JFrame {
    // Choice choice;
    
    PickUP(){

        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5, 5, 790, 590);
        panel.setBackground(new ColorUIResource(3,45,48));
        add(panel);

        JLabel label1 = new JLabel("PICK-UP SERVICE");
        label1.setBounds(90, 11, 200, 18);
        label1.setForeground(ColorUIResource.WHITE);
        label1.setFont(new FontUIResource("Tahoma",FontUIResource.BOLD,20));
        panel.add(label1);

        JLabel label2 = new JLabel("CAR TYPE");
        label2.setBounds(32, 95, 100, 20);
        label2.setForeground(ColorUIResource.WHITE);
        label2.setFont(new FontUIResource("serif",FontUIResource.BOLD,17));
        panel.add(label2);

        Choice c = new Choice();
        c.setBounds(155, 97, 140, 18);
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        panel.add(c);

        try{
            conn C = new conn();
            ResultSet resultSet = C.statement.executeQuery("select* from driver");
            while(resultSet.next()){
                c.add(resultSet.getString("car_name"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        JTable table = new JTable();
        table.setBounds(0, 233, 800, 250);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3,45,48));
        panel.add(table);

        try{
            conn C = new conn();
            String q = "select* from driver";
            ResultSet resultSet = C.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet)); 
        }catch(Exception e){
            e.printStackTrace();
        }

        
        JLabel label3 = new JLabel("NAME");
        label3.setBounds(50, 205, 100, 18);
        label3.setForeground(ColorUIResource.WHITE);
        label3.setFont(new FontUIResource("serif",FontUIResource.BOLD,14));
        panel.add(label3);

        JLabel label4 = new JLabel("AGE");
        label4.setBounds(170, 205, 100, 20);
        label4.setForeground(ColorUIResource.WHITE);
        label4.setFont(new FontUIResource("serif",FontUIResource.BOLD,14));
        panel.add(label4);

        
        JLabel label5 = new JLabel("GENDER");
        label5.setBounds(265, 205, 100, 18);
        label5.setForeground(ColorUIResource.WHITE);
        label5.setFont(new FontUIResource("serif",FontUIResource.BOLD,14));
        panel.add(label5);

        JLabel label6 = new JLabel("CAR TYPE");
        label6.setBounds(375, 205, 100, 20);
        label6.setForeground(ColorUIResource.WHITE);
        label6.setFont(new FontUIResource("serif",FontUIResource.BOLD,14));
        panel.add(label6);

        
        JLabel label7 = new JLabel("CAR NAME");
        label7.setBounds(480, 205, 100, 18);
        label7.setForeground(ColorUIResource.WHITE);
        label7.setFont(new FontUIResource("serif",FontUIResource.BOLD,14));
        panel.add(label7);

        JLabel label8 = new JLabel("AVAILABLE");
        label8.setBounds(590, 205, 100, 20);
        label8.setForeground(ColorUIResource.WHITE);
        label8.setFont(new FontUIResource("serif",FontUIResource.BOLD,14));
        panel.add(label8);

        JLabel label9 = new JLabel("LOCATION");
        label9.setBounds(700, 205, 100, 20);
        label9.setForeground(ColorUIResource.WHITE);
        label9.setFont(new FontUIResource("serif",FontUIResource.BOLD,14));
        panel.add(label9);


        JButton display = new JButton("DISPLAY");
        display.setBounds(200, 500, 120, 30);
        display.setBackground(Color.BLACK);
        display.setForeground(Color.WHITE);
        panel.add(display);
        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String q = "select * from driver where car_name = '"+c.getSelectedItem()+"'";
                try{
                    conn c = new conn();
                    ResultSet resultSet = c.statement.executeQuery(q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));
                }catch(Exception E){
                    E.printStackTrace();
                }

            }
        });
        // display.addActionListener(new ActionListener() {
        // //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         String q = "select * from driver where car_name = '"+choice.getSelectedIndex()+"'";
        //         try{
        //             conn c = new conn();
        //             ResultSet resultSet = c.statement.executeQuery(q);
        //             table.setModel(DbUtils.resultSetToTableModel(resultSet)); 
        
        //         }catch(Exception E){
        //             E.printStackTrace();
        //         }
                
        //     }
        // });

        JButton backbtn = new JButton("BACK");
        backbtn.setBounds(350, 500, 120, 30);
        backbtn.setBackground(Color.BLACK);
        backbtn.setForeground(Color.WHITE);
        panel.add(backbtn);
        backbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });

        

        setUndecorated(true);
        setLayout(null);
        setSize(800, 600);
        setLocation(500, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new PickUP();
    }
}
