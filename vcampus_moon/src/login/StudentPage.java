package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JToolBar;
import java.awt.Toolkit;

public class StudentPage {

	private JFrame frame;

	public StudentPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\\u5927\u4E09java\u9879\u76EE\\myvcampus\\vcampus_moon\\photo1.jpg"));
		frame.setForeground(new Color(224, 255, 255));
		frame.getContentPane().setBackground(new Color(248, 248, 255));
		frame.setBackground(new Color(248, 248, 255));
		frame.setTitle("\u5B66\u751F\u767B\u9646\u754C\u9762");
		frame.setBounds(100, 100, 723, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);	
		
		JButton btnNewButton = new JButton("\u9000\u51FA\u767B\u5F55");
		btnNewButton.setBackground(new Color(240, 248, 255));
		btnNewButton.addActionListener(new ActionListener() {//退出登录
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 14));
		btnNewButton.setBounds(276, 388, 135, 66);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("\u9009\u8BFE\u7CFB\u7EDF");
		btnNewButton_1.setBackground(new Color(240, 248, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//选课系统
				
				
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 14));
		btnNewButton_1.setBounds(400, 68, 149, 86);
		frame.getContentPane().add(btnNewButton_1);
		
		
		JButton button = new JButton("\u56FE\u4E66\u9986");
		button.setBackground(new Color(240, 248, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//图书馆
				
				
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		button.setBounds(138, 247, 140, 76);
		frame.getContentPane().add(button);
		
		
		JButton button_1 = new JButton("\u6821\u56ED\u5546\u5E97");
		button_1.setBackground(new Color(240, 248, 255));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//校园商店
				
				
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBounds(400, 242, 149, 86);
		frame.getContentPane().add(button_1);
		
		
		JButton button_2 = new JButton("\u5B66\u7C4D\u7BA1\u7406");
		button_2.setForeground(new Color(0, 0, 0));
		button_2.setBackground(new Color(240, 248, 255));
		button_2.addActionListener(new ActionListener() {//学籍管理
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		button_2.setFont(new Font("宋体", Font.PLAIN, 14));
		button_2.setBounds(138, 68, 140, 86);
		frame.getContentPane().add(button_2);

	}
}
