package shop;
/**
 * 类 {@code ShopAdmin} 管理员商店管理界面.
 *
 * <p> 管理员商店管理界面
 *
 * @since 2019/8/19
 */
import client.ClientThread;
import message.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Icon;

public class ShopAdmin extends JFrame {
	private JTextField textField, textField_1, textField_2, textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_20;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JLabel lblNewLabel, lblNewLabel_4, label, label_4, label_5, label_6, label_7;
	private ArrayList<GoodsInfo> goodsinfo, tempinfo = new ArrayList<GoodsInfo>();
	private int number, pagenum, currentpage = 1;
	private JButton button, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9,
			button_10, button_11, button_12, button_13, button_14, button_15, button_16, button_17;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public ShopAdmin(ClientThread cthread) {
		initialize(cthread);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ClientThread cthread) {
		getContentPane().setBackground(SystemColor.control);
		setBackground(new Color(210, 180, 140));
		setTitle("\u9009\u62E9\u5546\u54C1\u754C\u9762\uFF08\u7528\u6237\uFF09");
		setBounds(100, 100, 1069, 615);
		getContentPane().setLayout(null);
		setVisible(true);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(-1, 0, 1056, 578);
		getContentPane().add(layeredPane);
		layeredPane.setLayout(null);

		textField = new JTextField();
		layeredPane.setLayer(textField, 2);
		textField.setText("\u5546\u54C1\u7F16\u53F7");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("宋体", Font.BOLD, 20));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(224, 255, 255));
		textField.setBounds(71, 143, 116, 54);
		layeredPane.add(textField);

		textField_1 = new JTextField();
		layeredPane.setLayer(textField_1, 2);
		textField_1.setText("\u5546\u54C1\u540D\u79F0");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("宋体", Font.BOLD, 20));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(224, 255, 255));
		textField_1.setBounds(186, 143, 166, 54);
		layeredPane.add(textField_1);

		textField_2 = new JTextField();
		layeredPane.setLayer(textField_2, 2);
		textField_2.setText("\u53EF\u8D2D\u4E70\u6570\u91CF");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("宋体", Font.BOLD, 20));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(224, 255, 255));
		textField_2.setBounds(351, 143, 147, 54);
		layeredPane.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(0, 85, 86, -61);
		layeredPane.setLayer(textField_4, 1);
		layeredPane.add(textField_4);
		textField_4.setColumns(10);

		textField_6 = new JTextField();
		layeredPane.setLayer(textField_6, 2);
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("宋体", Font.BOLD, 20));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(351, 196, 147, 54);
		layeredPane.add(textField_6);

		textField_7 = new JTextField();
		layeredPane.setLayer(textField_7, 2);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("宋体", Font.BOLD, 20));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(186, 196, 166, 54);
		layeredPane.add(textField_7);

		textField_8 = new JTextField();
		layeredPane.setLayer(textField_8, 2);
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("宋体", Font.BOLD, 20));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(71, 196, 116, 54);
		layeredPane.add(textField_8);

		textField_9 = new JTextField();
		layeredPane.setLayer(textField_9, 2);
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("宋体", Font.BOLD, 20));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(71, 248, 116, 54);
		layeredPane.add(textField_9);

		textField_10 = new JTextField();
		layeredPane.setLayer(textField_10, 2);
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("宋体", Font.BOLD, 20));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(186, 248, 166, 54);
		layeredPane.add(textField_10);

		textField_11 = new JTextField();
		layeredPane.setLayer(textField_11, 2);
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("宋体", Font.BOLD, 20));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(351, 248, 147, 54);
		layeredPane.add(textField_11);

		textField_12 = new JTextField();
		layeredPane.setLayer(textField_12, 2);
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("宋体", Font.BOLD, 18));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(97, 485, 43, 45);
		layeredPane.add(textField_12);

		textField_13 = new JTextField();
		layeredPane.setLayer(textField_13, 2);
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("宋体", Font.BOLD, 18));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(203, 485, 43, 45);
		layeredPane.add(textField_13);

		textField_14 = new JTextField();
		layeredPane.setLayer(textField_14, 2);
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("宋体", Font.BOLD, 20));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(351, 301, 147, 54);
		layeredPane.add(textField_14);

		textField_15 = new JTextField();
		layeredPane.setLayer(textField_15, 2);
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("宋体", Font.BOLD, 20));
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBackground(Color.WHITE);
		textField_15.setBounds(186, 301, 166, 54);
		layeredPane.add(textField_15);

		textField_16 = new JTextField();
		layeredPane.setLayer(textField_16, 2);
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("宋体", Font.BOLD, 20));
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBackground(Color.WHITE);
		textField_16.setBounds(71, 301, 116, 54);
		layeredPane.add(textField_16);

		textField_17 = new JTextField();
		layeredPane.setLayer(textField_17, 2);
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("宋体", Font.BOLD, 20));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBackground(Color.WHITE);
		textField_17.setBounds(71, 354, 116, 54);
		layeredPane.add(textField_17);

		textField_18 = new JTextField();
		layeredPane.setLayer(textField_18, 2);
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("宋体", Font.BOLD, 20));
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBackground(Color.WHITE);
		textField_18.setBounds(186, 354, 166, 54);
		layeredPane.add(textField_18);

		textField_19 = new JTextField();
		layeredPane.setLayer(textField_19, 2);
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("宋体", Font.BOLD, 20));
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBackground(Color.WHITE);
		textField_19.setBounds(351, 354, 147, 54);
		layeredPane.add(textField_19);
		
		textField_20 = new JTextField();
		layeredPane.setLayer(textField_20, 2);
		textField_20.setText("\u5355\u4EF7");
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setFont(new Font("宋体", Font.BOLD, 20));
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBackground(new Color(224, 255, 255));
		textField_20.setBounds(497, 143, 147, 54);
		layeredPane.add(textField_20);

		textField_21 = new JTextField();
		layeredPane.setLayer(textField_21, 2);
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setFont(new Font("宋体", Font.BOLD, 20));
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBackground(Color.WHITE);
		textField_21.setBounds(71, 407, 116, 54);
		layeredPane.add(textField_21);

		textField_22 = new JTextField();
		layeredPane.setLayer(textField_22, 2);
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setFont(new Font("宋体", Font.BOLD, 20));
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBackground(Color.WHITE);
		textField_22.setBounds(186, 407, 166, 54);
		layeredPane.add(textField_22);

		textField_23 = new JTextField();
		layeredPane.setLayer(textField_23, 2);
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setFont(new Font("宋体", Font.BOLD, 20));
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBackground(Color.WHITE);
		textField_23.setBounds(351, 407, 147, 54);
		layeredPane.add(textField_23);
		
		textField_24 = new JTextField();
		layeredPane.setLayer(textField_24, 2);
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setFont(new Font("宋体", Font.BOLD, 20));
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBackground(Color.WHITE);
		textField_24.setBounds(497, 196, 147, 54);
		layeredPane.add(textField_24);

		textField_25 = new JTextField();
		layeredPane.setLayer(textField_25, 2);
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setFont(new Font("宋体", Font.BOLD, 20));
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBackground(Color.WHITE);
		textField_25.setBounds(497, 248, 147, 54);
		layeredPane.add(textField_25);

		textField_26 = new JTextField();
		layeredPane.setLayer(textField_26, 2);
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setFont(new Font("宋体", Font.BOLD, 20));
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBackground(Color.WHITE);
		textField_26.setBounds(497, 301, 147, 54);
		layeredPane.add(textField_26);

		textField_27 = new JTextField();
		layeredPane.setLayer(textField_27, 2);
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setFont(new Font("宋体", Font.BOLD, 20));
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBackground(Color.WHITE);
		textField_27.setBounds(497, 354, 147, 54);
		layeredPane.add(textField_27);

		textField_28 = new JTextField();
		layeredPane.setLayer(textField_28, 2);
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setFont(new Font("宋体", Font.BOLD, 20));
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		textField_28.setBackground(Color.WHITE);
		textField_28.setBounds(497, 407, 147, 54);
		layeredPane.add(textField_28);

		lblNewLabel = new JLabel("\u7F51\u4E0A\u5546\u5E97\u7BA1\u7406\u7CFB\u7EDFv1.0");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 24));
		layeredPane.setLayer(lblNewLabel, 2);
		lblNewLabel.setBounds(449, 40, 260, 41);
		layeredPane.add(lblNewLabel);
		
		ImageIcon image1 = new ImageIcon("images/shop_photo2.jpg");
		lblNewLabel_4 = new JLabel(image1);
		layeredPane.setLayer(lblNewLabel_4, 0);
		lblNewLabel_4.setIcon(new ImageIcon("D:\\IDEA\\share\\myvcampus\\vcampus_moon\\images\\ShopBuy.jpg"));
		lblNewLabel_4.setBounds(0, 0, 1056, 578);
		layeredPane.add(lblNewLabel_4);
		
		ImageIcon image = new ImageIcon("images/seu.jpg");
		label = new JLabel(image);
		layeredPane.setLayer(label, 2);
		label.setBounds(263, 10, 116, 112);
		layeredPane.add(label);

		label_4 = new JLabel("第");
		layeredPane.setLayer(label_4, 2);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("宋体", Font.BOLD, 20));
		label_4.setBounds(59, 485, 50, 45);
		layeredPane.add(label_4);

		label_5 = new JLabel("页");
		layeredPane.setLayer(label_5, 2);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("宋体", Font.BOLD, 18));
		label_5.setBounds(125, 485, 50, 45);
		layeredPane.add(label_5);

		label_6 = new JLabel("/共");
		layeredPane.setLayer(label_6, 2);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("宋体", Font.BOLD, 18));
		label_6.setBounds(161, 485, 50, 45);
		layeredPane.add(label_6);

		label_7 = new JLabel("页");
		layeredPane.setLayer(label_7, 2);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("宋体", Font.BOLD, 20));
		label_7.setBounds(237, 485, 50, 45);
		layeredPane.add(label_7);

		button = new JButton("\u4FEE\u6539");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button.setEnabled(false);
				button_7.setEnabled(true);
				button_8.setEnabled(false);
				
				textField_7.setEditable(true);
				textField_6.setEditable(true);
				textField_24.setEditable(true);
			}
		});
		layeredPane.setLayer(button, 2);
		button.setFont(new Font("宋体", Font.BOLD, 19));
		button.setEnabled(false);
		button.setBounds(663, 203, 97, 41);
		layeredPane.add(button);

		button_1 = new JButton("\u4FEE\u6539");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_1.setEnabled(false);
				button_9.setEnabled(true);
				button_13.setEnabled(false);
				
				textField_10.setEditable(true);
				textField_11.setEditable(true);
				textField_25.setEditable(true);
			}
		});
		layeredPane.setLayer(button_1, 2);
		button_1.setFont(new Font("宋体", Font.BOLD, 19));
		button_1.setEnabled(false);
		button_1.setBounds(663, 255, 97, 41);
		layeredPane.add(button_1);

		button_2 = new JButton("\u4FEE\u6539");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_2.setEnabled(false);
				button_10.setEnabled(true);
				button_14.setEnabled(false);
				
				textField_15.setEditable(true);
				textField_14.setEditable(true);
				textField_26.setEditable(true);
			}
		});
		layeredPane.setLayer(button_2, 2);
		button_2.setFont(new Font("宋体", Font.BOLD, 19));
		button_2.setEnabled(false);
		button_2.setBounds(663, 308, 97, 41);
		layeredPane.add(button_2);

		button_3 = new JButton("\u4FEE\u6539");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_3.setEnabled(false);
				button_11.setEnabled(true);
				button_15.setEnabled(false);
				
				textField_18.setEditable(true);
				textField_19.setEditable(true);
				textField_27.setEditable(true);
			}
		});
		layeredPane.setLayer(button_3, 2);
		button_3.setFont(new Font("宋体", Font.BOLD, 19));
		button_3.setEnabled(false);
		button_3.setBounds(663, 361, 97, 41);
		layeredPane.add(button_3);

		button_4 = new JButton("上一页");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentpage > 1) {
					currentpage--;
				initText(cthread);
				}
			}
		});
		layeredPane.setLayer(button_4, 2);
		button_4.setFont(new Font("宋体", Font.BOLD, 20));
		button_4.setBounds(328, 485, 104, 45);
		layeredPane.add(button_4);

		button_5 = new JButton("下一页");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentpage < pagenum) {
					currentpage++;
				initText(cthread);
				}
			}
		});
		layeredPane.setLayer(button_5, 2);
		button_5.setFont(new Font("宋体", Font.BOLD, 20));
		button_5.setBounds(446, 485, 104, 45);
		layeredPane.add(button_5);

		button_6 = new JButton("\u5237\u65B0");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				initText(cthread);
			}
		});
		layeredPane.setLayer(button_6, 2);
		button_6.setFont(new Font("宋体", Font.BOLD, 20));
		button_6.setBounds(586, 485, 104, 45);
		layeredPane.add(button_6);

		button_7 = new JButton("\u786E\u8BA4");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cthread.handleUpdateGood(textField_7.getText(), textField_8.getText(), Integer.valueOf(textField_24.getText()), Integer.valueOf(textField_6.getText()), 0);
				if(cthread.getREMessage().getResponse())
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "修改成功！","修改提示页面", JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "修改失败！","修改提示页面", JOptionPane.INFORMATION_MESSAGE);
				
				button.setEnabled(true);
				button_7.setEnabled(false);
				button_8.setEnabled(true);
				
				textField_7.setEditable(false);
				textField_6.setEditable(false);
				textField_24.setEditable(false);
				
				initText(cthread);
			}
		});
		layeredPane.setLayer(button_7, 2);
		button_7.setFont(new Font("宋体", Font.BOLD, 19));
		button_7.setEnabled(false);
		button_7.setBounds(770, 203, 97, 41);
		layeredPane.add(button_7);

		button_8 = new JButton("\u5220\u9664");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(new JFrame().getContentPane(), "确认删除？", "提示信息", JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION)
				{
					cthread.handleDeleteGoodMessage(textField_8.getText());
					if(cthread.getREMessage().getResponse())
					{
						JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除成功！","删除提示页面", JOptionPane.INFORMATION_MESSAGE);
						initText(cthread);
					}
					else
						JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除失败！","删除提示页面", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		layeredPane.setLayer(button_8, 2);
		button_8.setFont(new Font("宋体", Font.BOLD, 19));
		button_8.setEnabled(false);
		button_8.setBounds(877, 203, 97, 41);
		layeredPane.add(button_8);

		button_9 = new JButton("\u786E\u8BA4");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cthread.handleUpdateGood(textField_10.getText(), textField_9.getText(), Integer.valueOf(textField_25.getText()), Integer.valueOf(textField_11.getText()), 0);
				if(cthread.getREMessage().getResponse())
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "修改成功！","修改提示页面", JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "修改失败！","修改提示页面", JOptionPane.INFORMATION_MESSAGE);
				
				button_1.setEnabled(true);
				button_9.setEnabled(false);
				button_13.setEnabled(true);
				
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_25.setEditable(false);
				
				initText(cthread);
			}
		});
		layeredPane.setLayer(button_9, 2);
		button_9.setFont(new Font("宋体", Font.BOLD, 19));
		button_9.setEnabled(false);
		button_9.setBounds(770, 255, 97, 41);
		layeredPane.add(button_9);

		button_10 = new JButton("\u786E\u8BA4");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cthread.handleUpdateGood(textField_15.getText(), textField_16.getText(), Integer.valueOf(textField_26.getText()), Integer.valueOf(textField_14.getText()), 0);
				if(cthread.getREMessage().getResponse())
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "修改成功！","修改提示页面", JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "修改失败！","修改提示页面", JOptionPane.INFORMATION_MESSAGE);
				
				button_2.setEnabled(true);
				button_10.setEnabled(false);
				button_14.setEnabled(true);
				
				textField_15.setEditable(false);
				textField_14.setEditable(false);
				textField_26.setEditable(false);
				
				initText(cthread);
			}
		});
		layeredPane.setLayer(button_10, 2);
		button_10.setFont(new Font("宋体", Font.BOLD, 19));
		button_10.setEnabled(false);
		button_10.setBounds(770, 308, 97, 41);
		layeredPane.add(button_10);

		button_11 = new JButton("\u786E\u8BA4");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cthread.handleUpdateGood(textField_18.getText(), textField_17.getText(), Integer.valueOf(textField_27.getText()), Integer.valueOf(textField_19.getText()), 0);
				if(cthread.getREMessage().getResponse())
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "修改成功！","修改提示页面", JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "修改失败！","修改提示页面", JOptionPane.INFORMATION_MESSAGE);
				
				button_3.setEnabled(true);
				button_11.setEnabled(false);
				button_15.setEnabled(true);
				
				textField_18.setEditable(false);
				textField_19.setEditable(false);
				textField_27.setEditable(false);
				
				initText(cthread);
			}
		});
		layeredPane.setLayer(button_11, 2);
		button_11.setFont(new Font("宋体", Font.BOLD, 19));
		button_11.setEnabled(false);
		button_11.setBounds(770, 361, 97, 41);
		layeredPane.add(button_11);

		button_12 = new JButton("\u786E\u8BA4");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cthread.handleUpdateGood(textField_22.getText(), textField_21.getText(), Integer.valueOf(textField_28.getText()), Integer.valueOf(textField_23.getText()), 0);
				if(cthread.getREMessage().getResponse())
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "修改成功！","修改提示页面", JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "修改失败！","修改提示页面", JOptionPane.INFORMATION_MESSAGE);
				
				button_17.setEnabled(true);
				button_12.setEnabled(false);
				button_16.setEnabled(true);
				
				textField_22.setEditable(false);
				textField_23.setEditable(false);
				textField_28.setEditable(false);
				
				initText(cthread);
			}
		});
		layeredPane.setLayer(button_12, 2);
		button_12.setFont(new Font("宋体", Font.BOLD, 19));
		button_12.setEnabled(false);
		button_12.setBounds(770, 414, 97, 41);
		layeredPane.add(button_12);

		button_13 = new JButton("\u5220\u9664");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(new JFrame().getContentPane(), "确认删除？", "提示信息", JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION)
				{
					cthread.handleDeleteGoodMessage(textField_9.getText());
					if(cthread.getREMessage().getResponse())
					{
						JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除成功！","删除提示页面", JOptionPane.INFORMATION_MESSAGE);
						initText(cthread);
					}
					else
						JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除失败！","删除提示页面", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		layeredPane.setLayer(button_13, 2);
		button_13.setFont(new Font("宋体", Font.BOLD, 19));
		button_13.setEnabled(false);
		button_13.setBounds(877, 255, 97, 41);
		layeredPane.add(button_13);

		button_14 = new JButton("\u5220\u9664");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(new JFrame().getContentPane(), "确认删除？", "提示信息", JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION)
				{
					cthread.handleDeleteGoodMessage(textField_16.getText());
					if(cthread.getREMessage().getResponse())
					{
						JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除成功！","删除提示页面", JOptionPane.INFORMATION_MESSAGE);
						initText(cthread);
					}
					else
						JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除失败！","删除提示页面", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		layeredPane.setLayer(button_14, 2);
		button_14.setFont(new Font("宋体", Font.BOLD, 19));
		button_14.setEnabled(false);
		button_14.setBounds(877, 308, 97, 41);
		layeredPane.add(button_14);

		button_15 = new JButton("\u5220\u9664");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(new JFrame().getContentPane(), "确认删除？", "提示信息", JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION)
				{
					cthread.handleDeleteGoodMessage(textField_17.getText());
					if(cthread.getREMessage().getResponse())
					{
						JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除成功！","删除提示页面", JOptionPane.INFORMATION_MESSAGE);
						initText(cthread);
					}
					else
						JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除失败！","删除提示页面", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		layeredPane.setLayer(button_15, 2);
		button_15.setFont(new Font("宋体", Font.BOLD, 19));
		button_15.setEnabled(false);
		button_15.setBounds(877, 361, 97, 41);
		layeredPane.add(button_15);

		button_16 = new JButton("\u5220\u9664");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(new JFrame().getContentPane(), "确认删除？", "提示信息", JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION)
				{
					cthread.handleDeleteGoodMessage(textField_21.getText());
					if(cthread.getREMessage().getResponse())
					{
						JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除成功！","删除提示页面", JOptionPane.INFORMATION_MESSAGE);
						initText(cthread);
					}
					else
						JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除失败！","删除提示页面", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		layeredPane.setLayer(button_16, 2);
		button_16.setFont(new Font("宋体", Font.BOLD, 19));
		button_16.setEnabled(false);
		button_16.setBounds(877, 414, 97, 41);
		layeredPane.add(button_16);

		button_17 = new JButton("\u4FEE\u6539");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_17.setEnabled(false);
				button_12.setEnabled(true);
				button_16.setEnabled(false);
				
				textField_22.setEditable(true);
				textField_23.setEditable(true);
				textField_28.setEditable(true);
			}
		});
		layeredPane.setLayer(button_17, 2);
		button_17.setFont(new Font("宋体", Font.BOLD, 19));
		button_17.setEnabled(false);
		button_17.setBounds(663, 414, 97, 41);
		layeredPane.add(button_17);
		
		JButton button_18 = new JButton("\u6DFB\u52A0\u5546\u54C1");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ShopAdd(cthread);
				initText(cthread);
			}
		});
		layeredPane.setLayer(button_18, 2);
		button_18.setFont(new Font("宋体", Font.BOLD, 20));
		button_18.setBounds(749, 126, 147, 45);
		layeredPane.add(button_18);

		initText(cthread);
	}

	public void initText(ClientThread cthread) {
		cthread.handleShowGoodsMessage();
		ShopMessage smessage = (ShopMessage) cthread.getREMessage().getData();
		goodsinfo = smessage.getGoodsInfo();
		number = goodsinfo.size();
		pagenum = (number + 4) / 5;
		textField_13.setText(String.valueOf(pagenum));

		if (currentpage > pagenum)
			currentpage--;
		textField_12.setText(String.valueOf(currentpage));

		tempinfo.clear();
		for (int i = (currentpage - 1) * 5; i < (currentpage * 5 < number ? currentpage * 5 : number); i++)
			tempinfo.add(goodsinfo.get(i));
		int num = tempinfo.size();

		switch (num) {
		case 5:
			textField_21.setText(tempinfo.get(4).getGoods_id());
			textField_22.setText(tempinfo.get(4).getGoods_name());
			textField_23.setText(String.valueOf(Integer.valueOf(tempinfo.get(4).getGoods_quantity())));
			textField_28.setText(String.valueOf(tempinfo.get(4).getGoods_price()));
			button_17.setEnabled(true);
			button_16.setEnabled(true);

			textField_17.setText(tempinfo.get(3).getGoods_id());
			textField_18.setText(tempinfo.get(3).getGoods_name());
			textField_19.setText(String.valueOf(Integer.valueOf(tempinfo.get(3).getGoods_quantity())));
			textField_27.setText(String.valueOf(tempinfo.get(3).getGoods_price()));
			button_3.setEnabled(true);
			button_15.setEnabled(true);

			textField_16.setText(tempinfo.get(2).getGoods_id());
			textField_15.setText(tempinfo.get(2).getGoods_name());
			textField_14.setText(String.valueOf(Integer.valueOf(tempinfo.get(2).getGoods_quantity())));
			textField_26.setText(String.valueOf(tempinfo.get(2).getGoods_price()));
			button_2.setEnabled(true);
			button_14.setEnabled(true);

			textField_9.setText(tempinfo.get(1).getGoods_id());
			textField_10.setText(tempinfo.get(1).getGoods_name());
			textField_11.setText(String.valueOf(Integer.valueOf(tempinfo.get(1).getGoods_quantity())));
			textField_25.setText(String.valueOf(tempinfo.get(1).getGoods_price()));
			button_1.setEnabled(true);
			button_13.setEnabled(true);

			textField_8.setText(tempinfo.get(0).getGoods_id());
			textField_7.setText(tempinfo.get(0).getGoods_name());
			textField_6.setText(String.valueOf(Integer.valueOf(tempinfo.get(0).getGoods_quantity())));
			textField_24.setText(String.valueOf(tempinfo.get(0).getGoods_price()));
			button.setEnabled(true);
			button_8.setEnabled(true);

			break;

		case 4:
			textField_21.setText("");
			textField_22.setText("");
			textField_23.setText("");
			textField_28.setText("");
			button_17.setEnabled(false);
			button_16.setEnabled(false);

			textField_17.setText(tempinfo.get(3).getGoods_id());
			textField_18.setText(tempinfo.get(3).getGoods_name());
			textField_19.setText(String.valueOf(Integer.valueOf(tempinfo.get(3).getGoods_quantity())));
			textField_27.setText(String.valueOf(tempinfo.get(3).getGoods_price()));
			button_3.setEnabled(true);
			button_15.setEnabled(true);

			textField_16.setText(tempinfo.get(2).getGoods_id());
			textField_15.setText(tempinfo.get(2).getGoods_name());
			textField_14.setText(String.valueOf(Integer.valueOf(tempinfo.get(2).getGoods_quantity())));
			textField_26.setText(String.valueOf(tempinfo.get(2).getGoods_price()));
			button_2.setEnabled(true);
			button_14.setEnabled(true);

			textField_9.setText(tempinfo.get(1).getGoods_id());
			textField_10.setText(tempinfo.get(1).getGoods_name());
			textField_11.setText(String.valueOf(Integer.valueOf(tempinfo.get(1).getGoods_quantity())));
			textField_25.setText(String.valueOf(tempinfo.get(1).getGoods_price()));
			button_1.setEnabled(true);
			button_13.setEnabled(true);

			textField_8.setText(tempinfo.get(0).getGoods_id());
			textField_7.setText(tempinfo.get(0).getGoods_name());
			textField_6.setText(String.valueOf(Integer.valueOf(tempinfo.get(0).getGoods_quantity())));
			textField_24.setText(String.valueOf(tempinfo.get(0).getGoods_price()));
			button.setEnabled(true);
			button_8.setEnabled(true);

			break;

		case 3:
			textField_21.setText("");
			textField_22.setText("");
			textField_23.setText("");
			textField_28.setText("");
			button_17.setEnabled(false);
			button_16.setEnabled(false);

			textField_17.setText("");
			textField_18.setText("");
			textField_19.setText("");
			textField_27.setText("");
			button_3.setEnabled(false);
			button_15.setEnabled(false);

			textField_16.setText(tempinfo.get(2).getGoods_id());
			textField_15.setText(tempinfo.get(2).getGoods_name());
			textField_14.setText(String.valueOf(Integer.valueOf(tempinfo.get(2).getGoods_quantity())));
			textField_26.setText(String.valueOf(tempinfo.get(2).getGoods_price()));
			button_2.setEnabled(true);
			button_14.setEnabled(true);

			textField_9.setText(tempinfo.get(1).getGoods_id());
			textField_10.setText(tempinfo.get(1).getGoods_name());
			textField_11.setText(String.valueOf(Integer.valueOf(tempinfo.get(1).getGoods_quantity())));
			textField_25.setText(String.valueOf(tempinfo.get(1).getGoods_price()));
			button_1.setEnabled(true);
			button_13.setEnabled(true);

			textField_8.setText(tempinfo.get(0).getGoods_id());
			textField_7.setText(tempinfo.get(0).getGoods_name());
			textField_6.setText(String.valueOf(Integer.valueOf(tempinfo.get(0).getGoods_quantity())));
			textField_24.setText(String.valueOf(tempinfo.get(0).getGoods_price()));
			button.setEnabled(true);
			button_8.setEnabled(true);

			break;

		case 2:
			textField_21.setText("");
			textField_22.setText("");
			textField_23.setText("");
			textField_28.setText("");
			button_17.setEnabled(false);
			button_16.setEnabled(false);

			textField_17.setText("");
			textField_18.setText("");
			textField_19.setText("");
			textField_27.setText("");
			button_3.setEnabled(false);
			button_15.setEnabled(false);

			textField_16.setText("");
			textField_15.setText("");
			textField_14.setText("");
			textField_26.setText("");
			button_2.setEnabled(false);
			button_14.setEnabled(false);

			textField_9.setText(tempinfo.get(1).getGoods_id());
			textField_10.setText(tempinfo.get(1).getGoods_name());
			textField_11.setText(String.valueOf(Integer.valueOf(tempinfo.get(1).getGoods_quantity())));
			textField_25.setText(String.valueOf(tempinfo.get(1).getGoods_price()));
			button_1.setEnabled(true);
			button_13.setEnabled(true);

			textField_8.setText(tempinfo.get(0).getGoods_id());
			textField_7.setText(tempinfo.get(0).getGoods_name());
			textField_6.setText(String.valueOf(Integer.valueOf(tempinfo.get(0).getGoods_quantity())));
			textField_24.setText(String.valueOf(tempinfo.get(0).getGoods_price()));
			button.setEnabled(true);
			button_8.setEnabled(true);

			break;

		case 1:
			textField_21.setText("");
			textField_22.setText("");
			textField_23.setText("");
			textField_28.setText("");
			button_17.setEnabled(false);
			button_16.setEnabled(false);

			textField_17.setText("");
			textField_18.setText("");
			textField_19.setText("");
			textField_27.setText("");
			button_3.setEnabled(false);
			button_15.setEnabled(false);

			textField_16.setText("");
			textField_15.setText("");
			textField_14.setText("");
			textField_26.setText("");
			button_2.setEnabled(false);
			button_14.setEnabled(false);

			textField_9.setText("");
			textField_10.setText("");
			textField_11.setText("");
			textField_25.setText("");
			button_1.setEnabled(false);
			button_13.setEnabled(false);

			textField_8.setText(tempinfo.get(0).getGoods_id());
			textField_7.setText(tempinfo.get(0).getGoods_name());
			textField_6.setText(String.valueOf(Integer.valueOf(tempinfo.get(0).getGoods_quantity())));
			textField_24.setText(String.valueOf(tempinfo.get(0).getGoods_price()));
			button.setEnabled(true);
			button_8.setEnabled(true);
			break;

		default:
			break;
		}
	}
}
