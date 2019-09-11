package shop;
/**
 * 类 {@code ShopAdd} 添加商品界面.
 *
 * <p> 添加商品界面
 *
 * @since 2019/8/19
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import client.ClientThread;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShopAdd extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;


	public ShopAdd(ClientThread cthread) {
		setTitle("\u5546\u54C1\u6DFB\u52A0");
		setBounds(100, 100, 527, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u5546\u54C1\u7F16\u53F7\uFF1A");
		label.setFont(new Font("宋体", Font.BOLD, 20));
		label.setBackground(SystemColor.inactiveCaption);
		label.setBounds(64, 54, 166, 33);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(234, 54, 224, 38);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u5546\u54C1\u540D\u79F0\uFF1A");
		label_1.setFont(new Font("宋体", Font.BOLD, 20));
		label_1.setBackground(SystemColor.inactiveCaption);
		label_1.setBounds(64, 123, 166, 33);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(234, 123, 224, 38);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("\u8BF7\u8F93\u5165\u5546\u54C1\u4EF7\u683C\uFF1A");
		label_2.setFont(new Font("宋体", Font.BOLD, 20));
		label_2.setBackground(SystemColor.inactiveCaption);
		label_2.setBounds(64, 192, 166, 33);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(234, 192, 224, 38);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cthread.handleAddGood(textField_1.getText(), textField.getText(), Integer.valueOf(textField_2.getText()), Integer.valueOf(textField_3.getText()), 0);
				if(cthread.getREMessage().getResponse())
				{
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "添加成功！","添加提示页面", JOptionPane.INFORMATION_MESSAGE);
					dispose();
				}
				else
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "添加失败！","添加提示页面", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton.setBounds(115, 334, 103, 38);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u53D6\u6D88");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setFont(new Font("宋体", Font.BOLD, 20));
		button.setBounds(277, 334, 103, 38);
		contentPane.add(button);
		
		JLabel label_3 = new JLabel("\u8BF7\u8F93\u5165\u5546\u54C1\u6570\u91CF\uFF1A");
		label_3.setFont(new Font("宋体", Font.BOLD, 20));
		label_3.setBackground(SystemColor.inactiveCaption);
		label_3.setBounds(64, 261, 166, 33);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(234, 261, 224, 38);
		contentPane.add(textField_3);
		setVisible(true);
	}
}
