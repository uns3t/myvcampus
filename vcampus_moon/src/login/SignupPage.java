package login;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import client.ClientThread;
import message.Message;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;

public class SignupPage extends JFrame{

	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private ImageIcon image1;
	private JTextField textField_2;
	private String verifyCode;
	private JLayeredPane layeredPane;

	public SignupPage(ClientThread cthread) throws IOException {
		initialize(cthread);
	}
	
	private void initialize(ClientThread cthread) throws IOException {
		getContentPane().setBackground(new Color(240, 248, 255));
		getContentPane().setLayout(null);
		setVisible(true);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 636, 513);
		getContentPane().add(layeredPane);
		
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
		label_1.setBounds(138, 82, 90, 33);
		layeredPane.add(label_1);
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("宋体", Font.BOLD, 18));
		
		textField = new JTextField();
		textField.setOpaque(false);
		layeredPane.setLayer(textField, 1);
		textField.setBounds(278, 76, 224, 45);
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
		label_2.setBounds(128, 148, 99, 45);
		layeredPane.add(label_2);
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("宋体", Font.BOLD, 18));
		
		textField_1 = new JTextField();
		textField_1.setOpaque(false);
		layeredPane.setLayer(textField_1, 1);
		textField_1.setBounds(278, 148, 224, 45);
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
		label_3.setBounds(128, 220, 100, 39);
		layeredPane.add(label_3);
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setFont(new Font("宋体", Font.BOLD, 18));
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setOpaque(false);
		layeredPane.setLayer(passwordField_1, 1);
		passwordField_1.setBounds(278, 217, 224, 45);
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
		label_4.setBounds(128, 292, 100, 45);
		layeredPane.add(label_4);
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("宋体", Font.BOLD, 18));
		
		passwordField = new JPasswordField();
		passwordField.setOpaque(false);
		layeredPane.setLayer(passwordField, 1);
		passwordField.setBounds(278, 292, 224, 45);
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
		
		int w = 100, h = 40;
        verifyCode = VerifyCode.generateVerifyCode(4);
        File file = new File("images/" + verifyCode + ".jpg");
        VerifyCode.outputImage(w, h, file, verifyCode);
        ImageIcon image2 = new ImageIcon("images/" + verifyCode + ".jpg");
        final JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(image2);
		layeredPane.setLayer(lblNewLabel_1, 1);
		lblNewLabel_1.setBounds(245, 364, 100, 40);
		layeredPane.add(lblNewLabel_1);
		
		JButton button = new JButton("确认注册");
		button.setBackground(new Color(50, 205, 50));
		button.setOpaque(false);
		layeredPane.setLayer(button, 1);
		button.setBounds(175, 432, 120, 51);
		layeredPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String S_code = textField_2.getText();
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
				else if(!S_code.equals(verifyCode))
				{
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "验证码错误！","注册提示页面", JOptionPane.INFORMATION_MESSAGE);
					
					verifyCode = VerifyCode.generateVerifyCode(4);
			        File file = new File("images/" + verifyCode + ".jpg");
			        try {
						VerifyCode.outputImage(w, h, file, verifyCode);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			        ImageIcon image2 = new ImageIcon("images/" + verifyCode + ".jpg");
			        lblNewLabel_1.setIcon(image2);
			        lblNewLabel_1.repaint();
				}
				else
				{
					//两次输入的密码不一致
					if(str1.equals(str2) == false)
						JOptionPane.showMessageDialog(new JFrame().getContentPane(), "密码不一致，注册失败！","注册提示页面", JOptionPane.INFORMATION_MESSAGE);
					else
					{
						cthread.handleSignUpMessage(S_id, S_pwd, S_name);
						Message simessage = cthread.getREMessage();
						if(simessage.getResponse() == false)
							JOptionPane.showMessageDialog(new JFrame().getContentPane(), "注册失败！","注册提示页面", JOptionPane.INFORMATION_MESSAGE);
						else
							JOptionPane.showMessageDialog(new JFrame().getContentPane(), "注册成功！","注册提示页面", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		button.setFont(new Font("宋体", Font.BOLD, 18));
		
		
		JButton button_1 = new JButton("返回登陆");
		button_1.setBackground(new Color(50, 205, 50));
		button_1.setOpaque(false);
		layeredPane.setLayer(button_1, 1);
		button_1.setBounds(337, 432, 120, 51);
		layeredPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();//关闭当前页面
				try {
					new LoginPage(cthread);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_1.setFont(new Font("宋体", Font.BOLD, 18));
		
		image1 = new ImageIcon("images/login_photo1.jpg");
		JLabel lblNewLabel = new JLabel(image1);
		lblNewLabel.setBounds(0, 0, 636, 513);
		layeredPane.add(lblNewLabel);
		
		JLabel label_5 = new JLabel("验证码：");
		layeredPane.setLayer(label_5, 1);
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("宋体", Font.BOLD, 18));
		label_5.setBounds(125, 361, 100, 45);
		layeredPane.add(label_5);
		
		textField_2 = new JTextField();
		layeredPane.setLayer(textField_2, 1);
		textField_2.setToolTipText("");
		textField_2.setOpaque(false);
		textField_2.setFont(new Font("宋体", Font.BOLD, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(382, 363, 120, 40);
		layeredPane.add(textField_2);
		
		
		setBackground(new Color(240, 248, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/windows.jpg"));
		setTitle("用户注册界面");
		setBounds(100, 100, 650, 550);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
