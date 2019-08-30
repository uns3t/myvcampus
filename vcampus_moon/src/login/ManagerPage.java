package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ManagerPage {

	private JFrame frame;

	public ManagerPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\\u5927\u4E09java\u9879\u76EE\\myvcampus\\vcampus_moon\\photo1.jpg"));
		frame.setFont(new Font("宋体", Font.PLAIN, 14));
		frame.setTitle("\u7BA1\u7406\u5458\u767B\u9646\u754C\u9762");
		frame.setBounds(100, 100, 807, 595);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		
		JButton button = new JButton("\u9000\u51FA\u767B\u5F55");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//退出登录
				
				
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		button.setBounds(312, 417, 142, 75);
		frame.getContentPane().add(button);
		
		
		JButton button_1 = new JButton("\u9009\u8BFE\u7CFB\u7EDF");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//选课系统
				
				
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 14));
		button_1.setBounds(472, 71, 142, 83);
		frame.getContentPane().add(button_1);
		
		
		JButton button_2 = new JButton("\u56FE\u4E66\u9986");
		button_2.setFont(new Font("宋体", Font.PLAIN, 14));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//图书馆
				
				
			}
		});
		button_2.setBounds(121, 284, 142, 83);
		frame.getContentPane().add(button_2);
		
		
		JButton button_3 = new JButton("\u6821\u56ED\u5546\u5E97");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//校园商店
				
				
			}
		});
		button_3.setFont(new Font("宋体", Font.PLAIN, 14));
		button_3.setBounds(481, 284, 133, 83);
		frame.getContentPane().add(button_3);
		
		
		JButton button_4 = new JButton("\u5B66\u7C4D\u7BA1\u7406");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//学籍管理
				
				
			}
		});
		button_4.setFont(new Font("宋体", Font.PLAIN, 14));
		button_4.setBounds(121, 71, 142, 83);
		frame.getContentPane().add(button_4);
		
		
	}
}
