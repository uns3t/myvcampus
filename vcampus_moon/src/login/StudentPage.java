package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JToolBar;


import java.awt.Toolkit;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;

public class StudentPage {

	private JFrame frame;
	private ImageIcon image1;

	public StudentPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\大三java项目\\myvcampus\\vcampus_moon\\images\\windows.jpg"));
		frame.setForeground(new Color(224, 255, 255));
		frame.getContentPane().setBackground(new Color(248, 248, 255));
		frame.setBackground(new Color(248, 248, 255));
		frame.setTitle("\u5B66\u751F\u767B\u9646\u754C\u9762");
		frame.setBounds(100, 100, 723, 590);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);	
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 709, 563);
		frame.getContentPane().add(layeredPane);
		
		JButton btnNewButton = new JButton("\u9000\u51FA\u767B\u5F55");
		layeredPane.setLayer(btnNewButton, 1);
		btnNewButton.setBounds(286, 452, 135, 66);
		layeredPane.add(btnNewButton);
		btnNewButton.setBackground(new Color(216, 191, 216));
		btnNewButton.addActionListener(new ActionListener() {//退出登录
			public void actionPerformed(ActionEvent e) {
				new LoginPage();
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 18));
		
		
		JButton btnNewButton_1 = new JButton("\u9009\u8BFE\u7CFB\u7EDF");
		btnNewButton_1.setOpaque(false);
		layeredPane.setLayer(btnNewButton_1, 1);
		btnNewButton_1.setBounds(370, 42, 149, 76);
		layeredPane.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(240, 248, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//选课系统
				
				
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 20));
		
		
		JButton button = new JButton("\u56FE\u4E66\u9986");
		button.setOpaque(false);
		layeredPane.setLayer(button, 1);
		button.setBounds(211, 161, 140, 76);
		layeredPane.add(button);
		button.setBackground(new Color(240, 248, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//图书馆
				
				
			}
		});
		button.setFont(new Font("宋体", Font.BOLD, 20));
		
		
		JButton button_1 = new JButton("\u6821\u56ED\u5546\u5E97");
		button_1.setOpaque(false);
		layeredPane.setLayer(button_1, 1);
		button_1.setBounds(374, 161, 149, 76);
		layeredPane.add(button_1);
		button_1.setBackground(new Color(240, 248, 255));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//校园商店
				
				
			}
		});
		button_1.setFont(new Font("宋体", Font.BOLD, 20));
		
		
		JButton button_2 = new JButton("\u5B66\u7C4D\u7BA1\u7406");
		button_2.setOpaque(false);
		layeredPane.setLayer(button_2, 1);
		button_2.setBounds(210, 42, 140, 76);
		layeredPane.add(button_2);
		button_2.setForeground(new Color(0, 0, 0));
		button_2.setBackground(new Color(240, 248, 255));
		button_2.addActionListener(new ActionListener() {//学籍管理
			public void actionPerformed(ActionEvent e) {
				//new StudentsPage();
				
			}
		});
		button_2.setFont(new Font("宋体", Font.BOLD, 20));
		
		image1 = new ImageIcon("images/teacher_photo.jpg");
		JLabel lblNewLabel = new JLabel(image1);
		lblNewLabel.setBounds(0, 0, 709, 563);
		layeredPane.add(lblNewLabel);

	}
}
