package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import client.Client;
import client.ClientThread;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;

public class SignupPage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private ImageIcon image1;

	public SignupPage(/*Client clientSign*/) /*throws IOException*/ {
		//ClientThread cthread = new ClientThread(clientSign);
		initialize(/*cthread*/);
	}
	
	private void initialize(/*ClientThread cthread*/) {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 636, 513);
		frame.getContentPane().add(layeredPane);
		
		JLabel label = new JLabel("用户类型：");
		layeredPane.setLayer(label, 1);
		label.setBounds(128, 10, 100, 54);
		layeredPane.add(label);
		label.setFont(new Font("宋体", Font.BOLD, 18));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JRadioButton radioButton = new JRadioButton("学生");
		radioButton.setOpaque(false);
		layeredPane.setLayer(radioButton, 1);
		radioButton.setBounds(278, 12, 127, 51);
		layeredPane.add(radioButton);
		radioButton.setBackground(new Color(240, 248, 255));
		radioButton.setFont(new Font("宋体", Font.BOLD, 18));
		radioButton.setHorizontalAlignment(SwingConstants.CENTER);
		radioButton.setSelected(true);
		radioButton.setEnabled(false);
		
		JLabel label_1 = new JLabel("用户名：");
		layeredPane.setLayer(label_1, 1);
		label_1.setBounds(138, 75, 90, 33);
		layeredPane.add(label_1);
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("宋体", Font.BOLD, 18));
		
		textField = new JTextField();
		textField.setOpaque(false);
		layeredPane.setLayer(textField, 1);
		textField.setBounds(278, 69, 224, 45);
		layeredPane.add(textField);
		textField.setFont(new Font("宋体", Font.BOLD, 18));
		textField.setText("请输入用户名");
		textField.setColumns(10);
		textField.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().equals("请输入用户名"))
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
		
		
		JLabel label_2 = new JLabel("一卡通号：");
		layeredPane.setLayer(label_2, 1);
		label_2.setBounds(128, 141, 99, 45);
		layeredPane.add(label_2);
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("宋体", Font.BOLD, 18));
		
		textField_1 = new JTextField();
		textField_1.setOpaque(false);
		layeredPane.setLayer(textField_1, 1);
		textField_1.setBounds(278, 141, 224, 45);
		layeredPane.add(textField_1);
		textField_1.setToolTipText("");
		textField_1.setFont(new Font("宋体", Font.BOLD, 18));
		textField_1.setText("请输入一卡通号");
		textField_1.setColumns(10);
		textField_1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField_1.getText().equals("请输入一卡通号"))
					textField_1.setText("");
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
		
		
		JLabel label_3 = new JLabel("密码：");
		layeredPane.setLayer(label_3, 1);
		label_3.setBounds(128, 213, 100, 39);
		layeredPane.add(label_3);
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setFont(new Font("宋体", Font.BOLD, 18));
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setOpaque(false);
		layeredPane.setLayer(passwordField_1, 1);
		passwordField_1.setBounds(278, 210, 224, 45);
		layeredPane.add(passwordField_1);
		passwordField_1.setFont(new Font("宋体", Font.BOLD, 18));
		passwordField_1.setText("请输入密码");
		passwordField_1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				char[] str_1 = passwordField_1.getPassword();
				String str1 = String.copyValueOf(str_1);
				if(str1.equals("请输入密码"))
					passwordField_1.setText("");
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
		
		
		JLabel label_4 = new JLabel("密码确认：");
		layeredPane.setLayer(label_4, 1);
		label_4.setBounds(128, 285, 100, 45);
		layeredPane.add(label_4);
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("宋体", Font.BOLD, 18));
		
		passwordField = new JPasswordField();
		passwordField.setOpaque(false);
		layeredPane.setLayer(passwordField, 1);
		passwordField.setBounds(278, 285, 224, 45);
		layeredPane.add(passwordField);
		passwordField.setFont(new Font("宋体", Font.BOLD, 18));
		passwordField.setText("请确认密码");
		passwordField.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				char[] str_2 = passwordField.getPassword();
				String str2 = String.copyValueOf(str_2);
				if(str2.equals("请确认密码"))
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
		
		
		JButton button = new JButton("确认注册");
		button.setBackground(new Color(50, 205, 50));
		button.setOpaque(false);
		layeredPane.setLayer(button, 1);
		button.setBounds(175, 358, 120, 51);
		layeredPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String S_id = textField_1.getText();
				String S_pwd = String.valueOf(passwordField_1.getPassword());
				String S_name = textField.getText();
				
				char[] str_1 = passwordField_1.getPassword();
				String str1 = String.copyValueOf(str_1);
				char[] str_2 = passwordField.getPassword();
				String str2 = String.copyValueOf(str_2);
				
				if((S_id.equals(null)) || (S_id.equals("")) || (S_id.equals("请输入一卡通号")))
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "一卡通号不能为空","注册提示页面", JOptionPane.INFORMATION_MESSAGE);
				else if((S_name.equals(null)) || (S_name.equals("")) || (S_name.equals("请输入用户名")))
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "用户名不能为空","注册提示页面", JOptionPane.INFORMATION_MESSAGE);
				else if((str1.equals(null)) || (str1.equals("")) || (str1.equals("请输入密码")))
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "密码不能为空","注册提示页面", JOptionPane.INFORMATION_MESSAGE);
				else if((str2.equals(null)) || (str2.equals("")) || (str2.equals("请确认密码")))
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "请确认密码","注册提示页面", JOptionPane.INFORMATION_MESSAGE);
				//输入内容不为空
				else
				{
					//两次输入的密码不一致
					if(str1.equals(str2) == false)
						JOptionPane.showMessageDialog(new JFrame().getContentPane(), "密码不一致，注册失败！","注册提示页面", JOptionPane.INFORMATION_MESSAGE);
					else
						//cthread.handleSignUpMessage(S_id, S_pwd, S_name);
						JOptionPane.showMessageDialog(new JFrame().getContentPane(), "注册成功！","注册提示页面", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		button.setFont(new Font("宋体", Font.BOLD, 18));
		
		
		JButton button_1 = new JButton("返回登陆");
		button_1.setBackground(new Color(50, 205, 50));
		button_1.setOpaque(false);
		layeredPane.setLayer(button_1, 1);
		button_1.setBounds(337, 358, 120, 51);
		layeredPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();//关闭当前页面
			}
		});
		button_1.setFont(new Font("宋体", Font.BOLD, 18));
		
		image1 = new ImageIcon("images/login_photo1.jpg");
		JLabel lblNewLabel = new JLabel(image1);
		lblNewLabel.setBounds(0, 0, 636, 513);
		layeredPane.add(lblNewLabel);
		
		
		frame.setBackground(new Color(240, 248, 255));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\大三java项目\\myvcampus\\vcampus_moon\\images\\windows.jpg"));
		frame.setTitle("用户注册界面");
		frame.setBounds(100, 100, 650, 550);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
