package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLayeredPane;

import course.ManagerCoursePage;

import javax.swing.JLabel;

public class ManagerPage {

	private JFrame frame;
	private ImageIcon image1;

	public ManagerPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(248, 248, 255));
		frame.setBackground(new Color(248, 248, 255));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\大三java项目\\myvcampus\\vcampus_moon\\images\\windows.jpg"));
		frame.setFont(new Font("宋体", Font.PLAIN, 14));
		frame.setTitle("\u7BA1\u7406\u5458\u767B\u9646\u754C\u9762");
		frame.setBounds(100, 100, 733, 613);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 719, 576);
		frame.getContentPane().add(layeredPane);
		
				JButton button = new JButton("\u9000\u51FA\u767B\u5F55");
				layeredPane.setLayer(button, 1);
				button.setBounds(283, 477, 125, 63);
				layeredPane.add(button);
				button.setBackground(new Color(216, 191, 216));
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {//退出登录
						new LoginPage();
						frame.dispose();
					}
				});
				button.setFont(new Font("宋体", Font.BOLD, 18));
				
				
				JButton button_1 = new JButton("课程系统");
				button_1.setOpaque(false);
				layeredPane.setLayer(button_1, 1);
				button_1.setBounds(356, 44, 142, 75);
				layeredPane.add(button_1);
				button_1.setBackground(new Color(240, 248, 255));
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {//选课系统
						new ManagerCoursePage();
						
					}
				});
				button_1.setFont(new Font("宋体", Font.BOLD, 20));
				
				
				JButton button_2 = new JButton("\u56FE\u4E66\u9986");
				button_2.setOpaque(false);
				layeredPane.setLayer(button_2, 1);
				button_2.setBounds(204, 143, 142, 75);
				layeredPane.add(button_2);
				button_2.setBackground(new Color(240, 248, 255));
				button_2.setFont(new Font("宋体", Font.BOLD, 20));
				button_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {//图书馆
						
						
					}
				});
				
				
				JButton button_3 = new JButton("\u6821\u56ED\u5546\u5E97");
				button_3.setOpaque(false);
				layeredPane.setLayer(button_3, 1);
				button_3.setBounds(356, 143, 140, 75);
				layeredPane.add(button_3);
				button_3.setBackground(new Color(240, 248, 255));
				button_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {//校园商店
						
						
					}
				});
				button_3.setFont(new Font("宋体", Font.BOLD, 20));
				
				
				JButton button_4 = new JButton("\u5B66\u7C4D\u7BA1\u7406");
				button_4.setOpaque(false);
				layeredPane.setLayer(button_4, 1);
				button_4.setBounds(204, 44, 142, 75);
				layeredPane.add(button_4);
				button_4.setBackground(new Color(240, 248, 255));
				button_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {//学籍管理
						
						
					}
				});
				button_4.setFont(new Font("宋体", Font.BOLD, 20));
				
				image1 = new ImageIcon("images/teacher_photo.jpg");
				JLabel lblNewLabel = new JLabel(image1);
				lblNewLabel.setBounds(0, 0, 719, 576);
				layeredPane.add(lblNewLabel);
				
		
	}
}
