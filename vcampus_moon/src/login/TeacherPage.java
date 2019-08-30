package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Toolkit;

public class TeacherPage {

	private JFrame frame;

	public TeacherPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\\u5927\u4E09java\u9879\u76EE\\myvcampus\\vcampus_moon\\photo1.jpg"));
		frame.getContentPane().addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				
				
				
			}
		});
		frame.getContentPane().setFont(new Font("宋体", Font.PLAIN, 14));
		frame.setTitle("\u6559\u5E08\u767B\u9646\u754C\u9762");
		frame.setBounds(100, 100, 761, 651);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		
		JButton btnNewButton = new JButton("\u56FE\u4E66\u9986");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {//进入图书馆
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton.setBounds(116, 273, 144, 79);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("\u6821\u56ED\u5546\u5E97");
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {//进入校园商店
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(406, 273, 144, 79);
		frame.getContentPane().add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton("\u9009\u8BFE\u7CFB\u7EDF");
		btnNewButton_2.addActionListener(new ActionListener() {//进入课程系统
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 14));
		btnNewButton_2.setBounds(406, 71, 144, 79);
		frame.getContentPane().add(btnNewButton_2);
		
		
		JButton btnNewButton_3 = new JButton("\u9000\u51FA\u767B\u5F55");
		btnNewButton_3.setFont(new Font("宋体", Font.PLAIN, 14));
		btnNewButton_3.addActionListener(new ActionListener() {//退出登录
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton_3.setBounds(264, 472, 126, 56);
		frame.getContentPane().add(btnNewButton_3);
		
		
		JButton button = new JButton("\u5B66\u7C4D\u7BA1\u7406\u7CFB\u7EDF");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//学籍管理
				
				
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 14));
		button.setBounds(116, 71, 144, 79);
		frame.getContentPane().add(button);
		
	}
}
