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

public class TeacherPage {

	private JFrame frame;

	public TeacherPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("宋体", Font.PLAIN, 14));
		frame.setTitle("\u6559\u5E08\u767B\u9646\u754C\u9762");
		frame.setBounds(100, 100, 761, 651);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnNewButton = new JButton("\u56FE\u4E66\u9986\u5165\u53E3");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {//进入图书馆
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton.setBounds(90, 60, 144, 79);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("\u8FDB\u5165\u6821\u56ED\u5546\u5E97");
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {//进入校园商店
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(386, 60, 144, 79);
		frame.getContentPane().add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton("\u8FDB\u5165\u8BFE\u7A0B\u7CFB\u7EDF");
		btnNewButton_2.addActionListener(new ActionListener() {//进入课程系统
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 14));
		btnNewButton_2.setBounds(90, 205, 144, 79);
		frame.getContentPane().add(btnNewButton_2);
		
		
		JButton btnNewButton_3 = new JButton("\u9000\u51FA\u767B\u5F55");
		btnNewButton_3.addActionListener(new ActionListener() {//退出登录
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton_3.setBounds(264, 472, 126, 56);
		frame.getContentPane().add(btnNewButton_3);
		
	}
}
