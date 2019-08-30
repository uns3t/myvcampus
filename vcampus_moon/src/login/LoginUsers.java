package login;

import javax.swing.*;

public class LoginUsers extends JPanel {
    JLabel jl = new JLabel("用户类型: ");
    JRadioButton rad1 = new JRadioButton("教师");
    JRadioButton rad2 = new JRadioButton("学生");
    JRadioButton rad3 = new JRadioButton("系统管理员");
    ButtonGroup  bg=new ButtonGroup();

    public LoginUsers() {
        add(jl);
        bg.add(rad1);
        bg.add(rad2);
        bg.add(rad3);
        add(rad1);
        add(rad2);
        add(rad3);
    }
    
    public int getCount() {
    	int choButton = 0;
    	if(rad1.isSelected() == true)
    		choButton = 1;
    	else if(rad2.isSelected() == true)
    		choButton = 2;
    	else if(rad3.isSelected() == true)
    		choButton = 3;
    	
    	return choButton;
    }
}
