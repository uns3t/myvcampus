package login;

import javax.swing.*;

public class loginUsers extends JPanel {
    JLabel jl = new JLabel("用户类型: ");
    JRadioButton rad1 = new JRadioButton("教师");
    JRadioButton rad2 = new JRadioButton("学生");
    JRadioButton rad3 = new JRadioButton("系统管理员");
    ButtonGroup  bg=new ButtonGroup();

    public loginUsers() {
        //setLayout(new GridLayout(5, 1));
        add(jl);
        bg.add(rad1);
        bg.add(rad2);
        bg.add(rad3);
        add(rad1);
        add(rad2);
        add(rad3);
    }
}
