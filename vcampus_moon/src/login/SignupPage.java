package login;

import javax.swing.*;

import message.SignupMessage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SignupPage extends JFrame {
    private JPanel c, c1, c2, c3, c4, c5;
    private JLabel j, j1, j2, j3, j4;
    private JTextField tf1, tf2;
    private JPasswordField tf3, tf4;
    private JButton b1;
    private JRadioButton rad;

    public SignupPage() {
        super();
        this.setLayout(new GridLayout(6,1));

        this.setTitle("用户注册界面");
        c = new JPanel();
        c1 = new JPanel();
        c2 = new JPanel();
        c3 = new JPanel();
        c4 = new JPanel();
        c5 = new JPanel();

        this.add(c);
        this.add(c1);
        this.add(c2);
        this.add(c3);
        this.add(c4);
        this.add(c5);

        j = new JLabel("用户类型:");
        rad = new JRadioButton("学生");
        
        j1 = new JLabel("用户名:");
        j2 = new JLabel("一卡通号 :");
        j3 = new JLabel("密码     :");
        j4 = new JLabel("密码确认 :");

        tf1 = new JTextField("请输入用户名",20);//用户名
        tf2 = new JTextField("请输入一卡通号",20);//一卡通号
        tf3 = new JPasswordField("请输入密码",20);//密码
        tf4 = new JPasswordField("请确认密码",20);//密码确认

        tf1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText("");
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
        	
        }
        );
        
        tf2.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                tf2.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        }
        );

        tf3.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) { tf3.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        }
        );

        tf4.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                tf4.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        }
        );

        c.add(j);
        c.add(rad);
        c1.add(j1);
        c1.add(tf1);
        c2.add(j2);
        c2.add(tf2);
        c3.add(j3);
        c3.add(tf3);
        c4.add(j4);
        c4.add(tf4);

        b1 = new JButton("确认注册");
        c5.add(b1);
        b1.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(new JFrame().getContentPane(), "注册成功","注册提示页面", JOptionPane.INFORMATION_MESSAGE);
              
                SignupMessage siupInfo = new SignupMessage();
                siupInfo.setSignup_name(tf1.getText().toString());//用户名
                siupInfo.setSignup_id(tf2.getText().toString());//一卡通
                String str_psw = String.valueOf(tf3.getPassword());//密码
                siupInfo.setSignup_pwd(str_psw);
                
            }
        }
        );

        setSize(700,500);
        setVisible(true);
    }
}
