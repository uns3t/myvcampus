package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class loginpage extends JFrame {
    public loginpage(){

        super();
        this.setLayout(new GridLayout(4,1));

        JPanel c1 = new JPanel();
        JPanel c2 = new JPanel();
        JPanel c3 = new JPanel();

        this.add(c1);
        this.add(c2);
        this.add(c3);

        JLabel j1 = new JLabel("用户名 :");
        JLabel j2 = new JLabel("密码  :");

        JTextField tf1 = new JTextField(20);
        JPasswordField tf2 = new JPasswordField(20);

        c1.add(j1);
        c1.add(tf1);
        c2.add(j2);
        c2.add(tf2);
        c3.add(new loginUsers());

        JPanel cpane = new JPanel();
        this.add(cpane);
        JButton registe = new JButton("注册用户");
        cpane.add(registe);
        JButton login = new JButton("用户登录");
        cpane.add(login);

        this.add(cpane);

        setSize(300,200);
        setVisible(true);
    }
}
