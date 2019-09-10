package course;

import java.awt.EventQueue;

import javax.swing.JFrame;

import client.ClientThread;
import message.CourseInfo;
import message.CourseMessage;
import message.Message;

import java.awt.Toolkit;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ManagerCoursePage extends JFrame{
	final int perpage_course = 6;
	
	private JTextField textField, textField_1, textField_2, textField_3, textField_4, textField_5, textField_6, textField_7, textField_8, textField_9,
	textField_10, textField_11, textField_12, textField_13, textField_14, textField_15, textField_16, textField_17, textField_18, textField_19,
	textField_20, textField_21, textField_22, textField_23, textField_24, textField_25, textField_26, textField_27, textField_28, textField_29,
	textField_30, textField_31, textField_32, textField_33, textField_34, textField_35, textField_36;
	private JLabel lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, label_3;
	private JButton btnNewButton, btnNewButton_1, btnNewButton_2, btnNewButton_3, btnNewButton_4, button, button_1, button_2, button_3, button_4, button_5,
	button_6, button_7, button_8, button_9, button_10, button_11;
	private Message showMess1;
	private CourseMessage courseMess1;
	private ArrayList<CourseInfo> courseList1;
	private int total_course, maxPage;
	private String update_id, update_name, update_time, update_teacher;
	private ImageIcon image1;
	
	public ManagerCoursePage(ClientThread cthread) {
		initialize(cthread);
	}

	private void initialize(ClientThread cthread) {
		setBounds(100, 100, 953, 621);
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/windows.jpg"));
		setTitle("管理员课程系统");
		getContentPane().setLayout(null);
		setVisible(true);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 939, 584);
		getContentPane().add(layeredPane);
		
		image1 = new ImageIcon("images/manager_course_photo2.jpg");
		label_3 = new JLabel(image1);
		layeredPane.setLayer(label_3, 0);
		label_3.setBounds(0, 0, 939, 584);
		layeredPane.add(label_3);
		
		// 表头
		textField = new JTextField();
		layeredPane.setLayer(textField, 1);
		textField.setText("课程编号");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("宋体", Font.BOLD, 20));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(224, 255, 255));
		textField.setBounds(43, 102, 116, 54);
		textField.setEditable(false);
		layeredPane.add(textField);

		textField_1 = new JTextField();
		layeredPane.setLayer(textField_1, 1);
		textField_1.setText("课程名称");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("宋体", Font.BOLD, 20));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(224, 255, 255));
		textField_1.setBounds(158, 102, 166, 54);
		textField_1.setEditable(false);
		layeredPane.add(textField_1);

		textField_2 = new JTextField();
		layeredPane.setLayer(textField_2, 1);
		textField_2.setText("开课时间");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("宋体", Font.BOLD, 20));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(224, 255, 255));
		textField_2.setBounds(323, 102, 147, 54);
		textField_2.setEditable(false);
		layeredPane.add(textField_2);

		textField_3 = new JTextField();
		layeredPane.setLayer(textField_3, 1);
		textField_3.setText("任课教师");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("宋体", Font.BOLD, 20));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(224, 255, 255));
		textField_3.setBounds(469, 102, 176, 54);
		textField_3.setEditable(false);
		layeredPane.add(textField_3);

		textField_4 = new JTextField();
		layeredPane.setLayer(textField_4, 1);
		textField_4.setText("状态");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("宋体", Font.BOLD, 20));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(224, 255, 255));
		textField_4.setBounds(644, 102, 250, 54);
		textField_4.setEditable(false);
		layeredPane.add(textField_4);
		
		//得到所有课程
		cthread.handleShowCourseMessage();
		showMess1 = cthread.getREMessage();
		courseMess1 = (CourseMessage)showMess1.getData();
		courseList1 = courseMess1.getCourse();
		total_course = courseList1.size();
		
		
		lblNewLabel = new JLabel("第");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(lblNewLabel, 1);
		lblNewLabel.setBounds(113, 483, 40, 45);
		layeredPane.add(lblNewLabel);
		
		textField_35 = new JTextField();
		textField_35.setFont(new Font("宋体", Font.BOLD, 20));
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setBackground(Color.WHITE);
		layeredPane.setLayer(textField_35, 1);
		textField_35.setBounds(152, 483, 40, 45);
		layeredPane.add(textField_35);
		textField_35.setEditable(false);
		textField_35.setColumns(10);
		textField_35.setText(String.valueOf(1));
		
		lblNewLabel_1 = new JLabel("页");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(lblNewLabel_1, 1);
		lblNewLabel_1.setBounds(188, 483, 40, 45);
		layeredPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("/共");
		lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(lblNewLabel_2, 1);
		lblNewLabel_2.setBounds(221, 483, 40, 45);
		layeredPane.add(lblNewLabel_2);
		
		textField_36 = new JTextField();
		textField_36.setFont(new Font("宋体", Font.BOLD, 20));
		textField_36.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36.setBackground(Color.WHITE);
		layeredPane.setLayer(textField_36, 1);
		textField_36.setBounds(262, 483, 40, 45);
		layeredPane.add(textField_36);
		textField_36.setColumns(10);
		textField_36.setEditable(false);
		maxPage = 1;
		while(maxPage * perpage_course < total_course)
			maxPage++;
		textField_36.setText(String.valueOf(maxPage));
		
		lblNewLabel_3 = new JLabel("页");
		lblNewLabel_3.setFont(new Font("宋体", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(lblNewLabel_3, 1);
		lblNewLabel_3.setBounds(300, 483, 40, 45);
		layeredPane.add(lblNewLabel_3);
		
		
		btnNewButton_4 = new JButton("确认修改");
		btnNewButton_4.setFont(new Font("宋体", Font.BOLD, 20));
		layeredPane.setLayer(btnNewButton_4, 1);
		btnNewButton_4.setBounds(708, 476, 122, 58);
		layeredPane.add(btnNewButton_4);
		
		//课程信息
		textField_5 = new JTextField();
		layeredPane.setLayer(textField_5, 1);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("宋体", Font.BOLD, 20));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(43, 155, 116, 54);
		textField_5.setEditable(false);
		layeredPane.add(textField_5);
		if(courseList1.size() > 0)
			textField_5.setText(courseList1.get(0).getCourse_id());
		
		textField_6 = new JTextField();
		layeredPane.setLayer(textField_6, 1);
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("宋体", Font.BOLD, 20));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(158, 155, 166, 54);
		textField_6.setEditable(false);
		layeredPane.add(textField_6);
		if(courseList1.size() > 0)
			textField_6.setText(courseList1.get(0).getCourse_name());
		
		textField_7 = new JTextField();
		layeredPane.setLayer(textField_7, 1);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("宋体", Font.BOLD, 20));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(323, 155, 147, 54);
		textField_7.setEditable(false);
		layeredPane.add(textField_7);
		if(courseList1.size() > 0)
			textField_7.setText(courseList1.get(0).getCourse_time());
		
		textField_8 = new JTextField();
		layeredPane.setLayer(textField_8, 1);
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("宋体", Font.BOLD, 20));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(469, 155, 176, 54);
		textField_8.setEditable(false);
		layeredPane.add(textField_8);
		if(courseList1.size() > 0)
			textField_8.setText(courseList1.get(0).getCourse_teacher());
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("宋体", Font.PLAIN, 12));
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(textField_9, 1);
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(644, 155, 250, 54);
		textField_9.setEditable(false);
		layeredPane.add(textField_9);
		
		button_5 = new JButton("修改");
		btnNewButton_2 = new JButton("删除");
		//初始化按钮
		button_5.setEnabled(true);
		btnNewButton_2.setEnabled(true);
		
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_5.getText().equals(null) == false && textField_5.getText().equals("") == false && button_5.isEnabled())
				{
					btnNewButton_4.setEnabled(true);
					button_5.setEnabled(false);
					textField_5.setEditable(true);
					textField_6.setEditable(true);
					textField_7.setEditable(true);
					textField_8.setEditable(true);
				}
			}
		});
		layeredPane.setLayer(button_5, 2);
		button_5.setFont(new Font("宋体", Font.BOLD, 20));
		button_5.setBounds(669, 166, 86, 33);
		layeredPane.add(button_5);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_5.getText().equals(null) == false && textField_5.getText().equals("") == false && btnNewButton_2.isEnabled())
				{
					cthread.handleDeleteCourseMessage(textField_5.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_5.setEnabled(false);
					btnNewButton_2.setEnabled(false);
					
					cthread.handleShowCourseMessage();
					showMess1 = cthread.getREMessage();
					courseMess1 = (CourseMessage)showMess1.getData();
					courseList1 = courseMess1.getCourse();
					total_course = courseList1.size();
					
				}
			}
		});
		btnNewButton_2.setFont(new Font("宋体", Font.BOLD, 20));
		layeredPane.setLayer(btnNewButton_2, 2);
		btnNewButton_2.setBounds(777, 166, 86, 33);
		layeredPane.add(btnNewButton_2);
		
		
		textField_10 = new JTextField();
		layeredPane.setLayer(textField_10, 1);
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("宋体", Font.BOLD, 20));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(43, 207, 116, 54);
		textField_10.setEditable(false);
		layeredPane.add(textField_10);
		if(courseList1.size() > 1)
			textField_10.setText(courseList1.get(1).getCourse_id());
		
		textField_11 = new JTextField();
		layeredPane.setLayer(textField_11, 1);
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("宋体", Font.BOLD, 20));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(158, 207, 166, 54);
		textField_11.setEditable(false);
		layeredPane.add(textField_11);
		if(courseList1.size() > 1)
			textField_11.setText(courseList1.get(1).getCourse_name());
		
		textField_12 = new JTextField();
		layeredPane.setLayer(textField_12, 1);
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("宋体", Font.BOLD, 20));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(323, 207, 147, 54);
		textField_12.setEditable(false);
		layeredPane.add(textField_12);
		if(courseList1.size() > 1)
			textField_12.setText(courseList1.get(1).getCourse_time());
		
		textField_13 = new JTextField();
		layeredPane.setLayer(textField_13, 1);
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("宋体", Font.BOLD, 20));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(469, 207, 176, 54);
		textField_13.setEditable(false);
		layeredPane.add(textField_13);
		if(courseList1.size() > 1)
			textField_13.setText(courseList1.get(1).getCourse_teacher());
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(textField_14, 1);
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(644, 207, 250, 54);
		textField_14.setEditable(false);
		layeredPane.add(textField_14);
		
		button_6 = new JButton("修改");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_10.getText().equals(null) == false && textField_10.getText().equals("") == false && button_6.isEnabled())
				{
					btnNewButton_4.setEnabled(true);
					button_6.setEnabled(false);
					textField_10.setEditable(true);
					textField_11.setEditable(true);
					textField_12.setEditable(true);
					textField_13.setEditable(true);
				}
			}
		});
		layeredPane.setLayer(button_6, 2);
		button_6.setFont(new Font("宋体", Font.BOLD, 20));
		button_6.setBounds(669, 219, 86, 33);
		layeredPane.add(button_6);
		
		button = new JButton("删除");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_10.getText().equals(null) == false && textField_10.getText().equals("") == false && button.isEnabled())
				{
					cthread.handleDeleteCourseMessage(textField_10.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_6.setEnabled(false);
					button.setEnabled(false);
					
					cthread.handleShowCourseMessage();
					showMess1 = cthread.getREMessage();
					courseMess1 = (CourseMessage)showMess1.getData();
					courseList1 = courseMess1.getCourse();
					total_course = courseList1.size();
				}
			}
		});
		layeredPane.setLayer(button, 2);
		button.setFont(new Font("宋体", Font.BOLD, 20));
		button.setBounds(777, 219, 86, 33);
		layeredPane.add(button);
		
		
		textField_15 = new JTextField();
		layeredPane.setLayer(textField_15, 1);
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("宋体", Font.BOLD, 20));
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBackground(Color.WHITE);
		textField_15.setBounds(43, 260, 116, 54);
		textField_15.setEditable(false);
		layeredPane.add(textField_15);
		if(courseList1.size() > 2)
			textField_15.setText(courseList1.get(2).getCourse_id());
		
		textField_16 = new JTextField();
		layeredPane.setLayer(textField_16, 1);
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("宋体", Font.BOLD, 20));
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBackground(Color.WHITE);
		textField_16.setBounds(158, 260, 166, 54);
		textField_16.setEditable(false);
		layeredPane.add(textField_16);
		if(courseList1.size() > 2)
			textField_16.setText(courseList1.get(2).getCourse_name());
		
		textField_17 = new JTextField();
		layeredPane.setLayer(textField_17, 1);
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("宋体", Font.BOLD, 20));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBackground(Color.WHITE);
		textField_17.setBounds(323, 260, 147, 54);
		textField_17.setEditable(false);
		layeredPane.add(textField_17);
		if(courseList1.size() > 2)
			textField_17.setText(courseList1.get(2).getCourse_time());
		
		textField_18 = new JTextField();
		layeredPane.setLayer(textField_18, 1);
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("宋体", Font.BOLD, 20));
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBackground(Color.WHITE);
		textField_18.setBounds(469, 260, 176, 54);
		textField_18.setEditable(false);
		layeredPane.add(textField_18);
		if(courseList1.size() > 2)
			textField_18.setText(courseList1.get(2).getCourse_teacher());
		
		textField_19 = new JTextField();
		layeredPane.setLayer(textField_19, 1);
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBackground(Color.WHITE);
		textField_19.setBounds(644, 260, 250, 54);
		textField_19.setEditable(false);
		layeredPane.add(textField_19);
		
		button_7 = new JButton("修改");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_15.getText().equals(null) == false && textField_15.getText().equals("") == false && button_7.isEnabled())
				{
					btnNewButton_4.setEnabled(true);
					button_7.setEnabled(false);
					textField_15.setEditable(true);
					textField_16.setEditable(true);
					textField_17.setEditable(true);
					textField_18.setEditable(true);
				}
			}
		});
		layeredPane.setLayer(button_7, 2);
		button_7.setFont(new Font("宋体", Font.BOLD, 20));
		button_7.setBounds(669, 271, 86, 33);
		layeredPane.add(button_7);
		
		button_1 = new JButton("删除");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_15.getText().equals(null) == false && textField_15.getText().equals("") == false && button_1.isEnabled())
				{
					cthread.handleDeleteCourseMessage(textField_15.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_7.setEnabled(false);
					button_1.setEnabled(false);
					
					cthread.handleShowCourseMessage();
					showMess1 = cthread.getREMessage();
					courseMess1 = (CourseMessage)showMess1.getData();
					courseList1 = courseMess1.getCourse();
					total_course = courseList1.size();
				}
			}
		});
		layeredPane.setLayer(button_1, 2);
		button_1.setFont(new Font("宋体", Font.BOLD, 20));
		button_1.setBounds(777, 271, 86, 33);
		layeredPane.add(button_1);
		
		
		textField_20 = new JTextField();
		layeredPane.setLayer(textField_20, 1);
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setFont(new Font("宋体", Font.BOLD, 20));
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBackground(Color.WHITE);
		textField_20.setBounds(43, 313, 116, 54);
		textField_20.setEditable(false);
		layeredPane.add(textField_20);
		if(courseList1.size() > 3)
			textField_20.setText(courseList1.get(3).getCourse_id());
		
		textField_21 = new JTextField();
		layeredPane.setLayer(textField_21, 1);
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setFont(new Font("宋体", Font.BOLD, 20));
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBackground(Color.WHITE);
		textField_21.setBounds(158, 313, 166, 54);
		textField_21.setEditable(false);
		layeredPane.add(textField_21);
		if(courseList1.size() > 3)
			textField_21.setText(courseList1.get(3).getCourse_name());
		
		textField_22 = new JTextField();
		layeredPane.setLayer(textField_22, 1);
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setFont(new Font("宋体", Font.BOLD, 20));
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBackground(Color.WHITE);
		textField_22.setBounds(323, 313, 147, 54);
		textField_22.setEditable(false);
		layeredPane.add(textField_22);
		if(courseList1.size() > 3)
			textField_22.setText(courseList1.get(3).getCourse_time());
		
		textField_23 = new JTextField();
		layeredPane.setLayer(textField_23, 1);
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setFont(new Font("宋体", Font.BOLD, 20));
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBackground(Color.WHITE);
		textField_23.setBounds(469, 313, 176, 54);
		textField_23.setEditable(false);
		layeredPane.add(textField_23);
		if(courseList1.size() > 3)
			textField_23.setText(courseList1.get(3).getCourse_teacher());
		
		textField_24 = new JTextField();
		layeredPane.setLayer(textField_24, 1);
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBackground(Color.WHITE);
		textField_24.setBounds(644, 313, 250, 54);
		textField_24.setEditable(false);
		layeredPane.add(textField_24);
		
		button_8 = new JButton("修改");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_20.getText().equals(null) == false && textField_20.getText().equals("") == false && button_8.isEnabled())
				{
					btnNewButton_4.setEnabled(true);
					button_8.setEnabled(false);
					textField_20.setEditable(true);
					textField_21.setEditable(true);
					textField_22.setEditable(true);
					textField_23.setEditable(true);
				}
			}
		});
		layeredPane.setLayer(button_8, 2);
		button_8.setFont(new Font("宋体", Font.BOLD, 20));
		button_8.setBounds(669, 324, 86, 33);
		layeredPane.add(button_8);
		
		button_2 = new JButton("删除");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_20.getText().equals(null) == false && textField_20.getText().equals("") == false && button_2.isEnabled())
				{
					cthread.handleDeleteCourseMessage(textField_20.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_8.setEnabled(false);
					button_2.setEnabled(false);
					
					cthread.handleShowCourseMessage();
					showMess1 = cthread.getREMessage();
					courseMess1 = (CourseMessage)showMess1.getData();
					courseList1 = courseMess1.getCourse();
					total_course = courseList1.size();
				}
				
			}
		});
		layeredPane.setLayer(button_2, 2);
		button_2.setFont(new Font("宋体", Font.BOLD, 20));
		button_2.setBounds(777, 324, 86, 33);
		layeredPane.add(button_2);
		
		
		textField_25 = new JTextField();
		layeredPane.setLayer(textField_25, 1);
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setFont(new Font("宋体", Font.BOLD, 20));
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBackground(Color.WHITE);
		textField_25.setBounds(43, 366, 116, 54);
		textField_25.setEditable(false);
		layeredPane.add(textField_25);
		if(courseList1.size() > 4)
			textField_25.setText(courseList1.get(4).getCourse_id());
		
		textField_26 = new JTextField();
		layeredPane.setLayer(textField_26, 1);
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setFont(new Font("宋体", Font.BOLD, 20));
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBackground(Color.WHITE);
		textField_26.setBounds(158, 366, 166, 54);
		textField_26.setEditable(false);
		layeredPane.add(textField_26);
		if(courseList1.size() > 4)
			textField_26.setText(courseList1.get(4).getCourse_name());
		
		textField_27 = new JTextField();
		layeredPane.setLayer(textField_27, 1);
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setFont(new Font("宋体", Font.BOLD, 20));
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBackground(Color.WHITE);
		textField_27.setBounds(323, 366, 147, 54);
		textField_27.setEditable(false);
		layeredPane.add(textField_27);
		if(courseList1.size() > 4)
			textField_27.setText(courseList1.get(4).getCourse_time());
		
		textField_28 = new JTextField();
		layeredPane.setLayer(textField_28, 1);
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setFont(new Font("宋体", Font.BOLD, 20));
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		textField_28.setBackground(Color.WHITE);
		textField_28.setBounds(469, 366, 176, 54);
		textField_28.setEditable(false);
		layeredPane.add(textField_28);
		if(courseList1.size() > 4)
			textField_28.setText(courseList1.get(4).getCourse_teacher());
		
		textField_29 = new JTextField();
		layeredPane.setLayer(textField_29, 1);
		textField_29.setEditable(false);
		textField_29.setColumns(10);
		textField_29.setBackground(Color.WHITE);
		textField_29.setBounds(644, 366, 250, 54);
		textField_29.setEditable(false);
		layeredPane.add(textField_29);
		
		button_9 = new JButton("修改");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_25.getText().equals(null) == false && textField_25.getText().equals("") == false && button_9.isEnabled())
				{
					btnNewButton_4.setEnabled(true);
					button_9.setEnabled(false);
					textField_25.setEditable(true);
					textField_26.setEditable(true);
					textField_27.setEditable(true);
					textField_28.setEditable(true);
				}
			}
		});
		layeredPane.setLayer(button_9, 2);
		button_9.setFont(new Font("宋体", Font.BOLD, 20));
		button_9.setBounds(669, 377, 86, 33);
		layeredPane.add(button_9);
		
		button_3 = new JButton("删除");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_25.getText().equals(null) == false && textField_25.getText().equals("") == false && button_3.isEnabled())
				{
					cthread.handleDeleteCourseMessage(textField_25.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_9.setEnabled(false);
					button_3.setEnabled(false);
					
					cthread.handleShowCourseMessage();
					showMess1 = cthread.getREMessage();
					courseMess1 = (CourseMessage)showMess1.getData();
					courseList1 = courseMess1.getCourse();
					total_course = courseList1.size();
				}
			}
		});
		layeredPane.setLayer(button_3, 2);
		button_3.setFont(new Font("宋体", Font.BOLD, 20));
		button_3.setBounds(777, 377, 86, 33);
		layeredPane.add(button_3);
		
		
		textField_30 = new JTextField();
		layeredPane.setLayer(textField_30, 1);
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setFont(new Font("宋体", Font.BOLD, 20));
		textField_30.setEditable(false);
		textField_30.setColumns(10);
		textField_30.setBackground(Color.WHITE);
		textField_30.setBounds(43, 419, 116, 54);
		textField_30.setEditable(false);
		layeredPane.add(textField_30);
		if(courseList1.size() > 5)
			textField_30.setText(courseList1.get(5).getCourse_id());
		
		textField_31 = new JTextField();
		layeredPane.setLayer(textField_31, 1);
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setFont(new Font("宋体", Font.BOLD, 20));
		textField_31.setEditable(false);
		textField_31.setColumns(10);
		textField_31.setBackground(Color.WHITE);
		textField_31.setBounds(158, 419, 166, 54);
		textField_31.setEditable(false);
		layeredPane.add(textField_31);
		if(courseList1.size() > 5)
			textField_31.setText(courseList1.get(5).getCourse_name());
		
		textField_32 = new JTextField();
		layeredPane.setLayer(textField_32, 1);
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setFont(new Font("宋体", Font.BOLD, 20));
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		textField_32.setBackground(Color.WHITE);
		textField_32.setBounds(323, 419, 147, 54);
		textField_32.setEditable(false);
		layeredPane.add(textField_32);
		if(courseList1.size() > 5)
			textField_32.setText(courseList1.get(5).getCourse_time());
		
		textField_33 = new JTextField();
		layeredPane.setLayer(textField_33, 1);
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setFont(new Font("宋体", Font.BOLD, 20));
		textField_33.setEditable(false);
		textField_33.setColumns(10);
		textField_33.setBackground(Color.WHITE);
		textField_33.setBounds(469, 419, 176, 54);
		textField_33.setEditable(false);
		layeredPane.add(textField_33);
		if(courseList1.size() > 5)
			textField_33.setText(courseList1.get(5).getCourse_teacher());
		
		textField_34 = new JTextField();
		layeredPane.setLayer(textField_34, 1);
		textField_34.setEditable(false);
		textField_34.setColumns(10);
		textField_34.setBackground(Color.WHITE);
		textField_34.setBounds(644, 419, 250, 54);
		textField_34.setEditable(false);
		layeredPane.add(textField_34);
		
		button_10 = new JButton("修改");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_30.getText().equals(null) == false && textField_30.getText().equals("") == false && button_10.isEnabled())
				{
					btnNewButton_4.setEnabled(true);
					button_10.setEnabled(false);
					textField_30.setEditable(true);
					textField_31.setEditable(true);
					textField_32.setEditable(true);
					textField_33.setEditable(true);
				}
			}
		});
		layeredPane.setLayer(button_10, 2);
		button_10.setFont(new Font("宋体", Font.BOLD, 20));
		button_10.setBounds(669, 430, 86, 33);
		layeredPane.add(button_10);
		
		button_4 = new JButton("删除");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_30.getText().equals(null) == false && textField_30.getText().equals("") == false && button_4.isEnabled())
				{
					cthread.handleDeleteCourseMessage(textField_30.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_10.setEnabled(false);
					button_4.setEnabled(false);
					
					cthread.handleShowCourseMessage();
					showMess1 = cthread.getREMessage();
					courseMess1 = (CourseMessage)showMess1.getData();
					courseList1 = courseMess1.getCourse();
					total_course = courseList1.size();
				}
				
			}
		});
		layeredPane.setLayer(button_4, 2);
		button_4.setFont(new Font("宋体", Font.BOLD, 20));
		button_4.setBounds(777, 430, 86, 33);
		layeredPane.add(button_4);
		
		btnNewButton_4.setEnabled(false);//确认修改按钮
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_5.isEditable())
				{
					update_id = textField_5.getText();
					update_name = textField_6.getText();
					update_time = textField_7.getText();
					update_teacher = textField_8.getText();
					
					cthread.handleUpdateCourseMessage(update_id, update_name, update_teacher, update_time);
					cthread.getREMessage();
					
					textField_5.setEditable(false);
					textField_6.setEditable(false);
					textField_7.setEditable(false);
					textField_8.setEditable(false);
					
					cthread.handleShowCourseMessage();
					showMess1 = cthread.getREMessage();
					courseMess1 = (CourseMessage)showMess1.getData();
					courseList1 = courseMess1.getCourse();
					
					btnNewButton_4.setEnabled(false);
					button_5.setEnabled(true);
				}
				else if(textField_10.isEditable())
				{
					update_id = textField_10.getText();
					update_name = textField_11.getText();
					update_time = textField_12.getText();
					update_teacher = textField_13.getText();
					
					cthread.handleUpdateCourseMessage(update_id, update_name, update_teacher, update_time);
					cthread.getREMessage();
					
					textField_10.setEditable(false);
					textField_11.setEditable(false);
					textField_12.setEditable(false);
					textField_13.setEditable(false);
					
					cthread.handleShowCourseMessage();
					showMess1 = cthread.getREMessage();
					courseMess1 = (CourseMessage)showMess1.getData();
					courseList1 = courseMess1.getCourse();
					
					btnNewButton_4.setEnabled(false);
					button_6.setEnabled(true);
				}
				else if(textField_15.isEditable())
				{
					update_id = textField_15.getText();
					update_name = textField_16.getText();
					update_time = textField_17.getText();
					update_teacher = textField_18.getText();
					
					cthread.handleUpdateCourseMessage(update_id, update_name, update_teacher, update_time);
					cthread.getREMessage();
					
					textField_15.setEditable(false);
					textField_16.setEditable(false);
					textField_17.setEditable(false);
					textField_18.setEditable(false);
					
					cthread.handleShowCourseMessage();
					showMess1 = cthread.getREMessage();
					courseMess1 = (CourseMessage)showMess1.getData();
					courseList1 = courseMess1.getCourse();
					
					btnNewButton_4.setEnabled(false);
					button_7.setEnabled(true);
				}
				else if(textField_20.isEditable())
				{
					update_id = textField_20.getText();
					update_name = textField_21.getText();
					update_time = textField_22.getText();
					update_teacher = textField_23.getText();
					
					cthread.handleUpdateCourseMessage(update_id, update_name, update_teacher, update_time);
					cthread.getREMessage();
					
					textField_20.setEditable(false);
					textField_21.setEditable(false);
					textField_22.setEditable(false);
					textField_23.setEditable(false);
					
					cthread.handleShowCourseMessage();
					showMess1 = cthread.getREMessage();
					courseMess1 = (CourseMessage)showMess1.getData();
					courseList1 = courseMess1.getCourse();
					
					btnNewButton_4.setEnabled(false);
					button_8.setEnabled(true);
				}
				else if(textField_25.isEditable())
				{
					update_id = textField_25.getText();
					update_name = textField_26.getText();
					update_time = textField_27.getText();
					update_teacher = textField_28.getText();
					
					cthread.handleUpdateCourseMessage(update_id, update_name, update_teacher, update_time);
					cthread.getREMessage();
					
					textField_25.setEditable(false);
					textField_26.setEditable(false);
					textField_27.setEditable(false);
					textField_28.setEditable(false);
					
					cthread.handleShowCourseMessage();
					showMess1 = cthread.getREMessage();
					courseMess1 = (CourseMessage)showMess1.getData();
					courseList1 = courseMess1.getCourse();
					
					btnNewButton_4.setEnabled(false);
					button_9.setEnabled(true);
				}
				else if(textField_30.isEditable())
				{
					update_id = textField_30.getText();
					update_name = textField_31.getText();
					update_time = textField_32.getText();
					update_teacher = textField_33.getText();
					
					cthread.handleUpdateCourseMessage(update_id, update_name, update_teacher, update_time);
					cthread.getREMessage();
					
					textField_30.setEditable(false);
					textField_31.setEditable(false);
					textField_32.setEditable(false);
					textField_33.setEditable(false);
					
					cthread.handleShowCourseMessage();
					showMess1 = cthread.getREMessage();
					courseMess1 = (CourseMessage)showMess1.getData();
					courseList1 = courseMess1.getCourse();
					
					btnNewButton_4.setEnabled(false);
					button_10.setEnabled(true);
				}
				
				JOptionPane.showMessageDialog(new JFrame().getContentPane(), "修改成功!","注册提示页面", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
		btnNewButton = new JButton("上一页");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(textField_35.getText()) > 1 && Integer.parseInt(textField_35.getText()) <= maxPage)
				{
					//更新当前页数
					int result = Integer.parseInt(textField_35.getText()) - 1;
					textField_35.setText(String.valueOf(result));
					
					cthread.handleShowCourseMessage();
					cthread.getREMessage();
					
					//更新表格课程
					int disp = (result - 1) * perpage_course;
					textField_5.setText(courseList1.get(0 + disp).getCourse_id());
					textField_6.setText(courseList1.get(0 + disp).getCourse_name());
					textField_7.setText(courseList1.get(0 + disp).getCourse_time());
					textField_8.setText(courseList1.get(0 + disp).getCourse_teacher());
					
					//更新按钮状态
					button_5.setVisible(true);
					btnNewButton_2.setVisible(true);
					for(int i = 0;i < total_course;i++)
						if(textField_5.getText().equals(courseList1.get(i).getCourse_id()))
						{
							button_5.setEnabled(true);
							btnNewButton_2.setEnabled(true);
							break;
						}
					
					textField_10.setText(courseList1.get(1 + disp).getCourse_id());
					textField_11.setText(courseList1.get(1 + disp).getCourse_name());
					textField_12.setText(courseList1.get(1 + disp).getCourse_time());
					textField_13.setText(courseList1.get(1 + disp).getCourse_teacher());
					button_6.setVisible(true);
					button.setVisible(true);
					for(int i = 0;i < total_course;i++)
						if(textField_10.getText().equals(courseList1.get(i).getCourse_id()))
						{
							button_6.setEnabled(true);
							button.setEnabled(true);
							break;
						}

					textField_15.setText(courseList1.get(2 + disp).getCourse_id());
					textField_16.setText(courseList1.get(2 + disp).getCourse_name());
					textField_17.setText(courseList1.get(2 + disp).getCourse_time());
					textField_18.setText(courseList1.get(2 + disp).getCourse_teacher());
					button_7.setVisible(true);
					button_1.setVisible(true);
					for(int i = 0;i < total_course;i++)
						if(textField_15.getText().equals(courseList1.get(i).getCourse_id()))
						{
							button_7.setEnabled(true);
							button_1.setEnabled(true);
							break;
						}
					
					textField_20.setText(courseList1.get(3 + disp).getCourse_id());
					textField_21.setText(courseList1.get(3 + disp).getCourse_name());
					textField_22.setText(courseList1.get(3 + disp).getCourse_time());
					textField_23.setText(courseList1.get(3 + disp).getCourse_teacher());
					button_8.setVisible(true);
					button_2.setVisible(true);
					for(int i = 0;i < total_course;i++)
						if(textField_20.getText().equals(courseList1.get(i).getCourse_id()))
						{
							button_8.setEnabled(true);
							button_2.setEnabled(true);
							break;
						}
					
					textField_25.setText(courseList1.get(4 + disp).getCourse_id());
					textField_26.setText(courseList1.get(4 + disp).getCourse_name());
					textField_27.setText(courseList1.get(4 + disp).getCourse_time());
					textField_28.setText(courseList1.get(4 + disp).getCourse_teacher());
					button_9.setVisible(true);
					button_3.setVisible(true);
					for(int i = 0;i < total_course;i++)
						if(textField_25.getText().equals(courseList1.get(i).getCourse_id()))
						{
							button_9.setEnabled(true);
							button_3.setEnabled(true);
							break;
						}
					
					textField_30.setText(courseList1.get(5 + disp).getCourse_id());
					textField_31.setText(courseList1.get(5 + disp).getCourse_name());
					textField_32.setText(courseList1.get(5 + disp).getCourse_time());
					textField_33.setText(courseList1.get(5 + disp).getCourse_teacher());
					button_10.setVisible(true);
					button_4.setVisible(true);
					for(int i = 0;i < total_course;i++)
						if(textField_30.getText().equals(courseList1.get(i).getCourse_id()))
						{
							button_10.setEnabled(true);
							button_4.setEnabled(true);
							break;
						}
				}
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 20));
		layeredPane.setLayer(btnNewButton, 1);
		btnNewButton.setBounds(368, 483, 109, 45);
		layeredPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("下一页");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(textField_35.getText()) > 0 && Integer.parseInt(textField_35.getText()) < maxPage)
				{
					//更新当前页面
					int result = Integer.parseInt(textField_35.getText()) + 1;
					textField_35.setText(String.valueOf(result));
					
					cthread.handleShowCourseMessage();
					cthread.getREMessage();
					
					//更新表格信息
					int disp = (result - 1) * perpage_course;
					if(0 + disp < total_course)
					{
						textField_5.setText(courseList1.get(0 + disp).getCourse_id());
						textField_6.setText(courseList1.get(0 + disp).getCourse_name());
						textField_7.setText(courseList1.get(0 + disp).getCourse_time());
						textField_8.setText(courseList1.get(0 + disp).getCourse_teacher());
						for(int i = 0;i < total_course;i++)
							if(textField_5.getText().equals(courseList1.get(i).getCourse_id()))
							{
								button_5.setEnabled(true);
								btnNewButton_2.setEnabled(true);
								break;
							}
					}
					else
					{
						textField_5.setText(null);
						textField_6.setText(null);
						textField_7.setText(null);
						textField_8.setText(null);
						button_5.setVisible(false);
						btnNewButton_2.setVisible(false);
					}
					if(1 + disp < total_course)
					{
						textField_10.setText(courseList1.get(1 + disp).getCourse_id());
						textField_11.setText(courseList1.get(1 + disp).getCourse_name());
						textField_12.setText(courseList1.get(1 + disp).getCourse_time());
						textField_13.setText(courseList1.get(1 + disp).getCourse_teacher());
						for(int i = 0;i < total_course;i++)
							if(textField_10.getText().equals(courseList1.get(i).getCourse_id()))
							{
								button_6.setEnabled(true);
								button.setEnabled(true);
								break;
							}
					}
					else
					{
						textField_10.setText(null);
						textField_11.setText(null);
						textField_12.setText(null);
						textField_13.setText(null);
						button_6.setVisible(false);
						button.setVisible(false);
					}
					if(2 + disp < total_course)
					{
						textField_15.setText(courseList1.get(2 + disp).getCourse_id());
						textField_16.setText(courseList1.get(2 + disp).getCourse_name());
						textField_17.setText(courseList1.get(2 + disp).getCourse_time());
						textField_18.setText(courseList1.get(2 + disp).getCourse_teacher());
						for(int i = 0;i < total_course;i++)
							if(textField_15.getText().equals(courseList1.get(i).getCourse_id()))
							{
								button_7.setEnabled(true);
								button_1.setEnabled(true);
								break;
							}
					}
					else
					{
						textField_15.setText(null);
						textField_16.setText(null);
						textField_17.setText(null);
						textField_18.setText(null);
						button_7.setVisible(false);
						button_1.setVisible(false);
					}
					if(3 + disp < total_course)
					{
						textField_20.setText(courseList1.get(3 + disp).getCourse_id());
						textField_21.setText(courseList1.get(3 + disp).getCourse_name());
						textField_22.setText(courseList1.get(3 + disp).getCourse_time());
						textField_23.setText(courseList1.get(3 + disp).getCourse_teacher());
						for(int i = 0;i < total_course;i++)
							if(textField_20.getText().equals(courseList1.get(i).getCourse_id()))
							{
								button_8.setEnabled(true);
								button_2.setEnabled(true);
								break;
							}
					}
					else
					{
						textField_20.setText(null);
						textField_21.setText(null);
						textField_22.setText(null);
						textField_23.setText(null);
						button_8.setVisible(false);
						button_2.setVisible(false);
					}
					if(4 + disp < total_course)
					{
						textField_25.setText(courseList1.get(4 + disp).getCourse_id());
						textField_26.setText(courseList1.get(4 + disp).getCourse_name());
						textField_27.setText(courseList1.get(4 + disp).getCourse_time());
						textField_28.setText(courseList1.get(4 + disp).getCourse_teacher());
						for(int i = 0;i < total_course;i++)
							if(textField_25.getText().equals(courseList1.get(i).getCourse_id()))
							{
								button_9.setEnabled(true);
								button_3.setEnabled(true);
								break;
							}
					}
					else
					{
						textField_25.setText(null);
						textField_26.setText(null);
						textField_27.setText(null);
						textField_28.setText(null);
						button_9.setVisible(false);
						button_3.setVisible(false);
					}
					if(5 + disp < total_course)
					{
						textField_30.setText(courseList1.get(5 + disp).getCourse_id());
						textField_31.setText(courseList1.get(5 + disp).getCourse_name());
						textField_32.setText(courseList1.get(5 + disp).getCourse_time());
						textField_33.setText(courseList1.get(5 + disp).getCourse_teacher());
						for(int i = 0;i < total_course;i++)
							if(textField_30.getText().equals(courseList1.get(i).getCourse_id()))
							{
								button_10.setEnabled(true);
								button_4.setEnabled(true);
								break;
							}
					}
					else
					{
						textField_30.setText(null);
						textField_31.setText(null);
						textField_32.setText(null);
						textField_33.setText(null);
						button_10.setVisible(false);
						button_4.setVisible(false);
					}
				}
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 20));
		layeredPane.setLayer(btnNewButton_1, 1);
		btnNewButton_1.setBounds(482, 483, 109, 45);
		layeredPane.add(btnNewButton_1);
		
		
		btnNewButton_3 = new JButton("添加课程");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Manager_addCoursePage(cthread);
				
			}
		});
		btnNewButton_3.setFont(new Font("宋体", Font.BOLD, 22));
		layeredPane.setLayer(btnNewButton_3, 1);
		btnNewButton_3.setBounds(272, 10, 141, 67);
		layeredPane.add(btnNewButton_3);
		
		button_11 = new JButton("刷新列表");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//重新显示课表
				cthread.handleShowCourseMessage();
				showMess1 = cthread.getREMessage();
				courseMess1 = (CourseMessage)showMess1.getData();
				courseList1 = courseMess1.getCourse();
				total_course = courseList1.size();
				
				//更新页数
				maxPage = (total_course + 5) / perpage_course;
				textField_36.setText(String.valueOf(maxPage));
				if(Integer.parseInt(textField_35.getText()) > maxPage)
					textField_35.setText(String.valueOf(maxPage));
				
				//重新显示课程列表
				int disp = (Integer.parseInt(textField_35.getText()) - 1) * perpage_course;
				if(0 + disp < total_course)
				{
					textField_5.setText(courseList1.get(0 + disp).getCourse_id());
					textField_6.setText(courseList1.get(0 + disp).getCourse_name());
					textField_7.setText(courseList1.get(0 + disp).getCourse_time());
					textField_8.setText(courseList1.get(0 + disp).getCourse_teacher());
					button_5.setVisible(true);
					btnNewButton_2.setVisible(true);
					for(int i = 0;i < total_course;i++)
						if(textField_5.getText().equals(courseList1.get(i).getCourse_id()))
						{
							button_5.setEnabled(true);
							btnNewButton_2.setEnabled(true);
							break;
						}
				}
				else
				{
					textField_5.setText(null);
					textField_6.setText(null);
					textField_7.setText(null);
					textField_8.setText(null);
					button_5.setVisible(false);
					btnNewButton_2.setVisible(false);
				}
				if(1 + disp < total_course)
				{
					textField_10.setText(courseList1.get(1 + disp).getCourse_id());
					textField_11.setText(courseList1.get(1 + disp).getCourse_name());
					textField_12.setText(courseList1.get(1 + disp).getCourse_time());
					textField_13.setText(courseList1.get(1 + disp).getCourse_teacher());
					button_6.setVisible(true);
					button.setVisible(true);
					for(int i = 0;i < total_course;i++)
						if(textField_10.getText().equals(courseList1.get(i).getCourse_id()))
						{
							button_6.setEnabled(true);
							button.setEnabled(true);
							break;
						}
				}
				else
				{
					textField_10.setText(null);
					textField_11.setText(null);
					textField_12.setText(null);
					textField_13.setText(null);
					button_6.setVisible(false);
					button.setVisible(false);
				}
				if(2 + disp < total_course)
				{
					textField_15.setText(courseList1.get(2 + disp).getCourse_id());
					textField_16.setText(courseList1.get(2 + disp).getCourse_name());
					textField_17.setText(courseList1.get(2 + disp).getCourse_time());
					textField_18.setText(courseList1.get(2 + disp).getCourse_teacher());
					button_7.setVisible(true);
					button_1.setVisible(true);
					for(int i = 0;i < total_course;i++)
						if(textField_15.getText().equals(courseList1.get(i).getCourse_id()))
						{
							button_7.setEnabled(true);
							button_1.setEnabled(true);
							break;
						}
				}
				else
				{
					textField_15.setText(null);
					textField_16.setText(null);
					textField_17.setText(null);
					textField_18.setText(null);
					button_7.setVisible(false);
					button_1.setVisible(false);
				}
				if(3 + disp < total_course)
				{
					textField_20.setText(courseList1.get(3 + disp).getCourse_id());
					textField_21.setText(courseList1.get(3 + disp).getCourse_name());
					textField_22.setText(courseList1.get(3 + disp).getCourse_time());
					textField_23.setText(courseList1.get(3 + disp).getCourse_teacher());
					button_8.setVisible(true);
					button_2.setVisible(true);
					for(int i = 0;i < total_course;i++)
						if(textField_20.getText().equals(courseList1.get(i).getCourse_id()))
						{
							button_8.setEnabled(true);
							button_2.setEnabled(true);
							break;
						}
				}
				else
				{
					textField_20.setText(null);
					textField_21.setText(null);
					textField_22.setText(null);
					textField_23.setText(null);
					button_8.setVisible(false);
					button_2.setVisible(false);
				}
				if(4 + disp < total_course)
				{
					textField_25.setText(courseList1.get(4 + disp).getCourse_id());
					textField_26.setText(courseList1.get(4 + disp).getCourse_name());
					textField_27.setText(courseList1.get(4 + disp).getCourse_time());
					textField_28.setText(courseList1.get(4 + disp).getCourse_teacher());
					button_9.setVisible(true);
					button_3.setVisible(true);
					for(int i = 0;i < total_course;i++)
						if(textField_25.getText().equals(courseList1.get(i).getCourse_id()))
						{
							button_9.setEnabled(true);
							button_3.setEnabled(true);
							break;
						}
				}
				else
				{
					textField_25.setText(null);
					textField_26.setText(null);
					textField_27.setText(null);
					textField_28.setText(null);
					button_9.setVisible(false);
					button_3.setVisible(false);
				}
				if(5 + disp < total_course)
				{
					textField_30.setText(courseList1.get(5 + disp).getCourse_id());
					textField_31.setText(courseList1.get(5 + disp).getCourse_name());
					textField_32.setText(courseList1.get(5 + disp).getCourse_time());
					textField_33.setText(courseList1.get(5 + disp).getCourse_teacher());
					button_10.setVisible(true);
					button_4.setVisible(true);
					for(int i = 0;i < total_course;i++)
						if(textField_30.getText().equals(courseList1.get(i).getCourse_id()))
						{
							button_10.setEnabled(true);
							button_4.setEnabled(true);
							break;
						}
				}
				else
				{
					textField_30.setText(null);
					textField_31.setText(null);
					textField_32.setText(null);
					textField_33.setText(null);
					button_10.setVisible(false);
					button_4.setVisible(false);
				}
			}
		});
		layeredPane.setLayer(button_11, 1);
		button_11.setFont(new Font("宋体", Font.BOLD, 22));
		button_11.setBounds(469, 10, 141, 67);
		layeredPane.add(button_11);
	}
}