package login;

import javax.swing.*;

//import message.LoginMessage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginPage extends JFrame {
	private JPanel c1, c2, c3, c4, c5;
    private JLabel j1, j2, j3;
    private JTextField tf1, tf3;
    private JPasswordField tf2;
    private JButton registe, login;

    LoginUsers logUser = new LoginUsers();

    public LoginPage(){

        super();
        this.setLayout(new GridLayout(5,1));

        this.setTitle("用户登陆界面");
        c1 = new JPanel();
        c2 = new JPanel();
        c3 = new JPanel();
        c4 = new JPanel();

        this.add(c1);
        this.add(c2);
        this.add(c3);
        this.add(c4);

        j1 = new JLabel("用户名  :");
        j2 = new JLabel("密码    :");
        j3 = new JLabel("一卡通号 :");

        tf1 = new JTextField("请输入用户名",20);//用户名
        tf2 = new JPasswordField("请输入密码",20);//密码
        tf3 = new JTextField("请输入一卡通号",20);//一卡通号

        tf1.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent arg0) {
                tf1.setText("");
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

        tf2.addMouseListener(new MouseListener(){
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
            public void mouseClicked(MouseEvent e) {
                tf3.setText("");
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

        c1.add(j1);
        c1.add(tf1);
        c2.add(j2);
        c2.add(tf2);
        c3.add(j3);
        c3.add(tf3);
        c4.add(logUser);

        c5 = new JPanel();
        this.add(c5);

        registe = new JButton("注册");
        c5.add(registe);
        registe.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
//            	LoginMessage regInfo = new  LoginMessage();
//            	regInfo.setLogin_id(tf1.getText().toString());
//            	String str_psw = String.valueOf(tf2.getPassword());
//                regInfo.setLogin_pwd(str_psw);

               /* System.out.println(logInfo.getLogin_id());
                System.out.println(logInfo.getLogin_pwd());
                System.out.println(logInfo.getLogin_cardID());*/

                SignupPage sPage = new SignupPage();
                sPage.setVisible(true);
            }
        });

        login = new JButton("登录");
        c5.add(login);
        login.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //根据不同登陆者的身份跳出不同的界面
            	int choiceButton = logUser.getCount();
            	switch(choiceButton)
            	{
            	case 1:
            	new TeacherPage();
            	break;

            	case 2:
            	new StudentPage();
            	break;

            	case 3:
            	new MangerPage();
            	break;

            	default:
            		break;
            	}
            }
        }
        );

        setSize(300,200);
        setVisible(true);
    }
}
