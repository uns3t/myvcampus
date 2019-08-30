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
       
//        //��ӱ���ͼƬ
//        ImageIcon img = new ImageIcon("photo1.jpg");
//        JLabel label = new JLabel(img);
//        this.getLayeredPane().setLayout(null);
//        label.setBounds(0, 0, 1000, 1000);
//        this.getLayeredPane().add(label);

        this.setTitle("�û���½����");
        c1 = new JPanel();
        c2 = new JPanel();
        c4 = new JPanel();

        this.add(c1);
        this.add(c2);
        this.add(c4);
        
//        c1.setOpaque(false);
//        c2.setOpaque(false);
//        c4.setOpaque(false);

        j1 = new JLabel("һ��ͨ��  :");
        j2 = new JLabel("����    :");

        tf1 = new JTextField("������һ��ͨ��",20);//һ��ͨ��
        tf2 = new JPasswordField("����������",20);//����

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

        registe = new JButton("ע��");
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

        login = new JButton("��¼");
        c5.add(login);
        login.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //���ݲ�ͬ��½�ߵ����������ͬ�Ľ���
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
