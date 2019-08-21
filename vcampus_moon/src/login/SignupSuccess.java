package login;

import javax.swing.*;
import java.awt.*;

public class SignupSuccess extends JFrame {
    private JLabel label1;
    private JPanel panel1;

    public SignupSuccess(){
        super();
        this.setLayout(new GridLayout(1,1));

        this.setTitle("注册提示页面");
        panel1 = new JPanel();
        this.add(panel1);

        label1 = new JLabel("注册成功！");
        label1.setFont(new Font("微软雅黑",Font.PLAIN,15));
        panel1.add(label1);

        setVisible(true);
    }
}
