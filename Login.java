import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{
    JTextField textField;
    JPasswordField passwordField;
    JButton b1,b2;

    Login(){

        JLabel label1 = new JLabel("username");
        label1.setBounds(40, 30, 100, 30);
        label1.setFont(new Font("Tahoma",Font.BOLD,16 ));
        label1.setForeground(Color.WHITE);
        add(label1);

        JLabel label2 = new JLabel("password");
        label2.setBounds(40, 80, 100, 30);
        label2.setFont(new Font("Tahoma",Font.BOLD,16 ));
        label2.setForeground(Color.WHITE);
        add(label2);

        textField = new JTextField();
        textField.setBounds(150, 34, 150, 25);
        textField.setForeground(Color.WHITE);
        textField.setBackground(new Color(26,104,110));
        textField.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(textField);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 84, 150, 25);
        passwordField.setForeground(Color.WHITE);
        passwordField.setBackground(new Color(26,104,110));
        add(passwordField);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/GHH.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(255, 300,Image.SCALE_DEFAULT);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(316, 6, 255, 300);
        add(label);

        b1 = new JButton("Login");
        b1.setBounds(40, 160, 120, 30);
        b1.setFont(new Font("serif", Font.BOLD,15));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180, 160, 120, 30);
        b2.setFont(new Font("serif", Font.BOLD,15));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);

        
        
        getContentPane().setBackground(new Color(3, 45, 48));
        setLayout(null);
        setLocation(400, 270);
        setSize(600, 300);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== b1){
            try{
                conn c = new conn();
                String user = textField.getText();
                String pass = passwordField.getText();

                String q = "select * from login where username = '"+user+"' and password = '"+pass+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if(resultSet.next()){
                    new Dashboard();
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid username or Password");
                }



            }catch(Exception E){
                E.printStackTrace();

            }

        }else{
            System.exit(104);
        }
        
    }

    public static void main(String[] args) {
      new Login();  
    }
    
}
