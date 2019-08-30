package login;

import javax.swing.*;

import client.Client;
import client.ClientThread;

//import message.LoginMessage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginPage extends JFrame {
	private JPanel c1, c2, c4, c5;
    private JLabel j1, j2;
    private JTextField tf1;
    private JPasswordField tf2;
    private JButton registe, login;

    public LoginPage(Client logClient){
        super();
     //   ClientThread newThread = new ClientThread(logClient,100);
        this.setLayout(new GridLayout(4,1));
       
//        //添加背景图片
//        ImageIcon img = new ImageIcon("photo1.jpg");
//        JLabel label = new JLabel(img);
//        this.getLayeredPane().setLayout(null);
//        label.setBounds(0, 0, 1000, 1000);
//        this.getLayeredPane().add(label);

        this.setTitle("用户登陆界面");
        c1 = new JPanel();
        c2 = new JPanel();
        c4 = new JPanel();

        this.add(c1);
        this.add(c2);
        this.add(c4);
        
//        c1.setOpaque(false);
//        c2.setOpaque(false);
//        c4.setOpaque(false);

        j1 = new JLabel("一卡通号  :");
        j2 = new JLabel("密码    :");

        tf1 = new JTextField("请输入一卡通号",20);//一卡通号
        tf2 = new JPasswordField("请输入密码",20);//密码

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

        c1.add(j1);
        c1.add(tf1);
        c2.add(j2);
        c2.add(tf2);

        LoginUsers logUser = new LoginUsers();
        c4.add(logUser);

        c5 = new JPanel();
        this.add(c5);
      //  c5.setOpaque(false);

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
            	new ManagerPage();
            	break;

            	default:
            		break;
            	}
            }
        }
        );

        setSize(700,500);
        setVisible(true);
    }
}
