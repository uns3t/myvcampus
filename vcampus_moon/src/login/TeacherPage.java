package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLayeredPane;

public class TeacherPage {

	private JFrame frame;
	private ImageIcon image1;

	public TeacherPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(248, 248, 255));
		frame.setBackground(new Color(248, 248, 255));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\大三java项目\\myvcampus\\vcampus_moon\\images\\windows.jpg"));
		
		frame.getContentPane().setFont(new Font("宋体", Font.PLAIN, 14));
		frame.setTitle("\u6559\u5E08\u767B\u9646\u754C\u9762");
		frame.setBounds(100, 100, 743, 637);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 729, 600);
		frame.getContentPane().add(layeredPane);
		
		
		JButton btnNewButton = new JButton("\u56FE\u4E66\u9986");
		btnNewButton.setOpaque(false);
		layeredPane.setLayer(btnNewButton, 1);
		btnNewButton.setBounds(187, 171, 155, 79);
		layeredPane.add(btnNewButton);
		btnNewButton.setBackground(new Color(175, 238, 238));
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {//进入图书馆
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("\u6821\u56ED\u5546\u5E97");
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBounds(393, 171, 144, 79);
		layeredPane.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(175, 238, 238));
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_1.addActionListener(new ActionListener() {//进入校园商店
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		
		
		JButton btnNewButton_2 = new JButton("\u9009\u8BFE\u7CFB\u7EDF");
		btnNewButton_2.setOpaque(false);
		layeredPane.setLayer(btnNewButton_2, 1);
		btnNewButton_2.setBounds(393, 40, 144, 79);
		layeredPane.add(btnNewButton_2);
		btnNewButton_2.setBackground(new Color(175, 238, 238));
		btnNewButton_2.addActionListener(new ActionListener() {//进入课程系统
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton_2.setFont(new Font("宋体", Font.BOLD, 18));
		
		
		JButton btnNewButton_3 = new JButton("\u9000\u51FA\u767B\u5F55");
		//btnNewButton_3.setOpaque(false);
		btnNewButton_3.setBounds(290, 520, 126, 56);
		layeredPane.add(btnNewButton_3);
		btnNewButton_3.setBackground(new Color(216, 191, 216));
		btnNewButton_3.setFont(new Font("宋体", Font.BOLD, 16));
		btnNewButton_3.addActionListener(new ActionListener() {//退出登录
			public void actionPerformed(ActionEvent e) {
				new LoginPage();
				frame.dispose();
				
			}
		});
		
		
		JButton button = new JButton("\u5B66\u7C4D\u7BA1\u7406\u7CFB\u7EDF");
		button.setOpaque(false);
		layeredPane.setLayer(button, 1);
		button.setBounds(187, 40, 155, 79);
		layeredPane.add(button);
		button.setBackground(new Color(175, 238, 238));
		button.addActionListener(new ActionListener() {//学籍管理
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		button.setFont(new Font("宋体", Font.BOLD, 18));
		
		image1 = new ImageIcon("images/teacher_photo.jpg");
		JLabel lblNewLabel = new JLabel(image1);
		lblNewLabel.setBounds(0, 0, 739, 600);
		layeredPane.add(lblNewLabel);
		
	}
}
