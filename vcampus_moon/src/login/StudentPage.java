package login;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import client.ClientThread;
import student.StuStudentsPage;
import course.*;
import shop.ShopUser;

import java.awt.Toolkit;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;

public class StudentPage extends JFrame{

	private ImageIcon image1;

	public StudentPage(ClientThread cthread) {
		initialize(cthread);
	}

	private void initialize(ClientThread cthread) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/windows.jpg"));
		setForeground(new Color(224, 255, 255));
		getContentPane().setBackground(new Color(248, 248, 255));
		setBackground(new Color(248, 248, 255));
		setTitle("\u5B66\u751F\u767B\u9646\u754C\u9762");
		setBounds(100, 100, 695, 641);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);	
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 681, 604);
		getContentPane().add(layeredPane);
		
		JButton btnNewButton = new JButton("\u9000\u51FA\u767B\u5F55");
		layeredPane.setLayer(btnNewButton, 1);
		btnNewButton.setBounds(238, 312, 153, 75);
		layeredPane.add(btnNewButton);
		btnNewButton.setBackground(new Color(255, 248, 220));
		btnNewButton.addActionListener(new ActionListener() {//退出登录
			public void actionPerformed(ActionEvent e) {
				try {
					new LoginPage(cthread);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 22));
		
		JButton btnNewButton_1 = new JButton("\u9009\u8BFE\u7CFB\u7EDF");
		btnNewButton_1.setOpaque(false);
		layeredPane.setLayer(btnNewButton_1, 1);
		btnNewButton_1.setBounds(326, 27, 194, 88);
		layeredPane.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(240, 248, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//选课系统
				new StudentCoursePage(cthread);
				
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 28));
		
		
		JButton button = new JButton("\u56FE\u4E66\u9986");
		button.setOpaque(false);
		layeredPane.setLayer(button, 1);
		button.setBounds(121, 139, 192, 88);
		layeredPane.add(button);
		button.setBackground(new Color(240, 248, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//图书馆
				
				
			}
		});
		button.setFont(new Font("宋体", Font.BOLD, 28));
		
		
		JButton button_1 = new JButton("\u6821\u56ED\u5546\u5E97");
		button_1.setOpaque(false);
		layeredPane.setLayer(button_1, 1);
		button_1.setBounds(326, 139, 194, 88);
		layeredPane.add(button_1);
		button_1.setBackground(new Color(240, 248, 255));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//校园商店
				new ShopUser(cthread);
			}
		});
		button_1.setFont(new Font("宋体", Font.BOLD, 28));
		
		
		JButton button_2 = new JButton("\u5B66\u7C4D\u7BA1\u7406");
		button_2.setOpaque(false);
		layeredPane.setLayer(button_2, 1);
		button_2.setBounds(121, 27, 192, 88);
		layeredPane.add(button_2);
		button_2.setForeground(new Color(0, 0, 0));
		button_2.setBackground(new Color(240, 248, 255));
		button_2.addActionListener(new ActionListener() {//学籍管理
			public void actionPerformed(ActionEvent e) {
				try {
					new StuStudentsPage(cthread);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		button_2.setFont(new Font("宋体", Font.BOLD, 28));
		
		image1 = new ImageIcon("images/change_photo2.jpg");
		JLabel lblNewLabel = new JLabel(image1);
		lblNewLabel.setBounds(0, 0, 681, 603);
		layeredPane.add(lblNewLabel);

	}
}
