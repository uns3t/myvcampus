package login;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import client.*;
import message.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;

public class LoginPage extends JFrame{

	private JTextField textField;
	private JPasswordField passwordField;
	private ImageIcon image1;

	public LoginPage(ClientThread cthread){
		initialize(cthread);
	}

	private void initialize(ClientThread cthread) {
		getContentPane().setBackground(new Color(240, 248, 255));
		getContentPane().setLayout(null);
		setVisible(true);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 537, 397);
		getContentPane().add(layeredPane);
		
		JLabel label = new JLabel("一卡通号：");
		layeredPane.setLayer(label, 1);
		label.setBounds(48, 28, 136, 46);
		layeredPane.add(label);
		label.setFont(new Font("宋体", Font.BOLD, 18));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
				textField = new JTextField();
				textField.setOpaque(false);
				layeredPane.setLayer(textField, 1);
				textField.setBounds(211, 24, 257, 46);
				layeredPane.add(textField);
				textField.setText("请输入一卡通号");
				textField.setFont(new Font("宋体", Font.BOLD, 18));
				textField.setHorizontalAlignment(SwingConstants.LEFT);
				textField.setColumns(10);
				textField.addMouseListener(new MouseListener() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if(textField.getText().equals("请输入一卡通号"))
							textField.setText("");
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
				
				JLabel label_1 = new JLabel("密码：");
				layeredPane.setLayer(label_1, 1);
				label_1.setBounds(50, 107, 136, 46);
				layeredPane.add(label_1);
				label_1.setFont(new Font("宋体", Font.BOLD, 18));
				label_1.setHorizontalAlignment(SwingConstants.CENTER);
				
				passwordField = new JPasswordField();
				passwordField.setFont(new Font("宋体", Font.BOLD, 18));
				passwordField.setOpaque(false);
				layeredPane.setLayer(passwordField, 1);
				passwordField.setBounds(211, 103, 257, 46);
				layeredPane.add(passwordField);
				passwordField.setText("请输入密码");
				passwordField.addMouseListener(new MouseListener() {
					public void mouseClicked(MouseEvent e) {
						char[] str = passwordField.getPassword();
						String str_pwd = String.copyValueOf(str);
						if(str_pwd.equals("请输入密码"))
							passwordField.setText("");
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

				
				JButton button = new JButton("注册");
				button.setBackground(new Color(50, 205, 50));
				button.setOpaque(false);
				layeredPane.setLayer(button, 1);
				button.setBounds(122, 203, 85, 38);
				layeredPane.add(button);
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						new SignupPage(cthread);
						dispose();
					}
				});
				button.setFont(new Font("宋体", Font.BOLD, 18));
				
				
				JButton button_1 = new JButton("登陆");
				button_1.setBackground(new Color(50, 205, 50));
				button_1.setOpaque(false);
				layeredPane.setLayer(button_1, 1);
				button_1.setBounds(291, 203, 87, 38);
				layeredPane.add(button_1);
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String str1 = textField.getText();
						char[] str_2 = passwordField.getPassword();
						String str2 = String.copyValueOf(str_2);
						
						if((str1.equals(null)) || (str1.equals("")) || (str1.equals("请输入一卡通号")))
							JOptionPane.showMessageDialog(new JFrame().getContentPane(), "一卡通号不能为空","登陆提示页面", JOptionPane.INFORMATION_MESSAGE);
						else if((str2.equals(null)) || (str2.equals("")) || (str2.equals("请输入密码")))
							JOptionPane.showMessageDialog(new JFrame().getContentPane(), "密码不能为空","登陆提示页面", JOptionPane.INFORMATION_MESSAGE);
						else//输入内容不为空
						{
							cthread.handleLoginMessage(str1, str2);
							Message remessage = cthread.getREMessage();	
							if(remessage.getResponse() == false)
								JOptionPane.showMessageDialog(new JFrame().getContentPane(), "登录不成功!","登陆提示页面", JOptionPane.INFORMATION_MESSAGE);
							else
							{
								UsrMessage umessage = (UsrMessage)remessage.getData();
								if(umessage.get_isadmin())
								{
									new ManagerPage(cthread);
									dispose();
									
								}
								else
								{
									new StudentPage(cthread);
									dispose();
								}
							}
						}
					}
				});
				button_1.setFont(new Font("宋体", Font.BOLD, 18));
				
				image1 = new ImageIcon("images/login_photo1.jpg");
				JLabel label_3 = new JLabel(image1);
				label_3.setBounds(0, 0, 537, 311);
				layeredPane.add(label_3);
	
		setBackground(new Color(240, 248, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/windows.jpg"));
		setTitle("用户登陆界面");
		setBounds(100, 100, 553, 342);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
