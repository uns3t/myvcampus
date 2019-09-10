package course;

import javax.swing.JFrame;

import message.*;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import client.ClientThread;

import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class StudentCoursePage extends JFrame{

	final int perpage_course = 8;
	private ArrayList<CourseInfo> courseList, stu_courseinfo;
	private JTextField textField, textField_1, textField_2, textField_3, textField_4, textField_5, textField_6, textField_7, textField_8, textField_9,
	textField_10, textField_11, textField_12, textField_13, textField_14, textField_15, textField_16, textField_17, textField_18, textField_19,
	textField_20, textField_21, textField_22, textField_23, textField_24, textField_25, textField_26, textField_27, textField_28, textField_29,
	textField_30, textField_31, textField_32, textField_33, textField_34, textField_35, textField_36, textField_37, textField_38, textField_39,
	textField_40, textField_41, textField_42, textField_43, textField_44, textField_45, textField_46, textField_47, textField_48;
	private JButton btnNewButton, btnNewButton_1, button_6, button_7, button_8, button_9, button, button_1, button_2, button_3, button_4, button_5, button_10
	, button_11, button_12, button_13, btnNewButton_2, btnNewButton_3, button_14;
	private JLabel lblNewLabel, lblNewLabel_1, lblNewLabel_2, label, lblNewLabel_3, label_1, lblNewLabel_4;
	private ImageIcon image1;
	private Message stu_courseMessage;
	private CourseMessage mess;
	private int person_course;
	private JLabel lblNewLabel_5;
	
	public StudentCoursePage(ClientThread cthread) {
		initialize(cthread);
	}

	private void initialize(ClientThread cthread) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/windows.jpg"));
		setTitle("\u5B66\u751F\u9009\u8BFE\u7CFB\u7EDF\u754C\u9762");
		setBounds(100, 100, 898, 653);
		getContentPane().setLayout(null);
		setVisible(true);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(Color.WHITE);
		layeredPane.setBounds(0, 0, 884, 616);
		getContentPane().add(layeredPane);
		layeredPane.setLayout(null);
		
		//表头
		textField = new JTextField();
		textField.setBackground(new Color(224, 255, 255));
		textField.setFont(new Font("宋体", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("课程编号");
		layeredPane.setLayer(textField, 1);
		textField.setBounds(10, 74, 116, 54);
		layeredPane.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(224, 255, 255));
		textField_1.setFont(new Font("宋体", Font.BOLD, 20));
		textField_1.setText("课程名称");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(textField_1, 1);
		textField_1.setBounds(125, 74, 166, 54);
		layeredPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setEditable(false);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(224, 255, 255));
		textField_2.setFont(new Font("宋体", Font.BOLD, 20));
		textField_2.setText("开课时间");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(textField_2, 1);
		textField_2.setBounds(290, 74, 147, 54);
		layeredPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setEditable(false);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(224, 255, 255));
		textField_3.setFont(new Font("宋体", Font.BOLD, 20));
		textField_3.setText("任课教师");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(textField_3, 1);
		textField_3.setBounds(436, 74, 176, 54);
		layeredPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setEditable(false);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(224, 255, 255));
		textField_4.setFont(new Font("宋体", Font.BOLD, 20));
		textField_4.setText("状态");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(textField_4, 1);
		textField_4.setBounds(611, 74, 259, 54);
		layeredPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setEditable(false);
		
		
		//得到全部课程
		cthread.handleShowCourseMessage();
		Message showMessage = cthread.getREMessage();
		CourseMessage cmessage = (CourseMessage)showMessage.getData();
		courseList = cmessage.getCourse();
		int totalCourse = courseList.size();
		
		//得到学生个人课表
		cthread.handleShowCourseTable();
		stu_courseMessage = cthread.getREMessage();
		mess = (CourseMessage)stu_courseMessage.getData();		
		stu_courseinfo = mess.getCourse();
		person_course = stu_courseinfo.size();
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(255, 255, 255));
		textField_5.setFont(new Font("宋体", Font.BOLD, 20));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(textField_5, 1);
		textField_5.setBounds(10, 127, 116, 54);
		layeredPane.add(textField_5);
		textField_5.setColumns(10);
		if(courseList.size() > 0)
			textField_5.setText(courseList.get(0).getCourse_id());
		textField_5.setEditable(false);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("宋体", Font.BOLD, 20));
		layeredPane.setLayer(textField_6, 1);
		textField_6.setBackground(new Color(255, 255, 255));
		textField_6.setBounds(125, 127, 166, 54);
		layeredPane.add(textField_6);
		textField_6.setColumns(10);
		if(courseList.size() > 0)
			textField_6.setText(courseList.get(0).getCourse_name());
		textField_6.setEditable(false);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("宋体", Font.BOLD, 20));
		layeredPane.setLayer(textField_7, 1);
		textField_7.setBackground(new Color(255, 255, 255));
		textField_7.setBounds(290, 127, 147, 54);
		layeredPane.add(textField_7);
		textField_7.setColumns(10);
		if(courseList.size() > 0)
			textField_7.setText(courseList.get(0).getCourse_time());
		textField_7.setEditable(false);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("宋体", Font.BOLD, 20));
		layeredPane.setLayer(textField_8, 1);
		textField_8.setBackground(new Color(255, 255, 255));
		textField_8.setBounds(436, 127, 176, 54);
		layeredPane.add(textField_8);
		textField_8.setColumns(10);
		if(courseList.size() > 0)
			textField_8.setText(courseList.get(0).getCourse_teacher());
		textField_8.setEditable(false);
		
		textField_9 = new JTextField();
		layeredPane.setLayer(textField_9, 1);
		textField_9.setBackground(new Color(255, 255, 255));
		textField_9.setBounds(611, 127, 259, 54);
		layeredPane.add(textField_9);
		textField_9.setColumns(10);
		textField_9.setEditable(false);
		
		btnNewButton = new JButton("添加");
		btnNewButton_1 = new JButton("取消");
		//初始化添加按钮状态
		for(int i = 0;i < person_course;i++)
			if(stu_courseinfo.get(i).getCourse_id().equals(textField_5.getText()))//该门课程已经选择
			{
				btnNewButton.setEnabled(false);
				break;
			}
		//初始化取消按钮
		if(btnNewButton.isEnabled())
			btnNewButton_1.setEnabled(false);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//如果按钮可选，添加课程
				if(textField_5.getText().equals(null) == false && textField_5.getText().equals("") == false && btnNewButton.isEnabled())
				{
					cthread.handleCourseSelectMessage(textField_5.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "添加成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					btnNewButton.setEnabled(false);
					btnNewButton_1.setEnabled(true);
					
					cthread.handleShowCourseTable();
					stu_courseMessage = cthread.getREMessage();
					mess = (CourseMessage)stu_courseMessage.getData();		
					stu_courseinfo = mess.getCourse();
					person_course = stu_courseinfo.size();
				}
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 18));
		layeredPane.setLayer(btnNewButton, 2);
		btnNewButton.setBounds(633, 134, 82, 43);
		layeredPane.add(btnNewButton);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//如果按钮可选，取消课程
				if(textField_5.getText().equals(null) == false && textField_5.getText().equals("") == false && btnNewButton_1.isEnabled())
				{
					cthread.handleDeleteCourseSelectMessage(textField_5.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "取消成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					btnNewButton.setEnabled(true);
					btnNewButton_1.setEnabled(false);
					
					cthread.handleShowCourseTable();
					stu_courseMessage = cthread.getREMessage();
					mess = (CourseMessage)stu_courseMessage.getData();		
					stu_courseinfo = mess.getCourse();
					person_course = stu_courseinfo.size();
				}
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 18));
		layeredPane.setLayer(btnNewButton_1, 2);
		btnNewButton_1.setBounds(757, 134, 82, 43);
		layeredPane.add(btnNewButton_1);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("宋体", Font.BOLD, 20));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(10, 179, 116, 54);
		if(courseList.size() > 1)
			textField_10.setText(courseList.get(1).getCourse_id());
		layeredPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("宋体", Font.BOLD, 20));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(125, 179, 166, 54);
		if(courseList.size() > 1)
			textField_11.setText(courseList.get(1).getCourse_name());
		layeredPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("宋体", Font.BOLD, 20));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(290, 179, 147, 54);
		if(courseList.size() > 1)
			textField_12.setText(courseList.get(1).getCourse_time());
		layeredPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("宋体", Font.BOLD, 20));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(436, 179, 176, 54);
		if(courseList.size() > 1)
			textField_13.setText(courseList.get(1).getCourse_teacher());
		layeredPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(611, 179, 259, 54);
		layeredPane.add(textField_14);
		
		button_6 = new JButton("添加");
		button_7 = new JButton("取消");
		//初始化添加按钮状态
		for(int i = 0;i < person_course;i++)
			if(stu_courseinfo.get(i).getCourse_id().equals(textField_10.getText()))
			{
				button_6.setEnabled(false);
				break;
			}		
		//初始化取消按钮
		if(button_6.isEnabled())
			button_7.setEnabled(false);
		
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_10.getText().equals(null) == false && textField_10.getText().equals("") == false && button_6.isEnabled())
				{
					cthread.handleCourseSelectMessage(textField_10.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "添加成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_6.setEnabled(false);
					button_7.setEnabled(true);
					
					cthread.handleShowCourseTable();
					stu_courseMessage = cthread.getREMessage();
					mess = (CourseMessage)stu_courseMessage.getData();		
					stu_courseinfo = mess.getCourse();
					person_course = stu_courseinfo.size();
				}
			}
		});
		layeredPane.setLayer(button_6, 2);
		button_6.setFont(new Font("宋体", Font.BOLD, 18));
		button_6.setBounds(633, 186, 82, 43);
		layeredPane.add(button_6);
		
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//如果按钮可选，取消课程
				if(textField_10.getText().equals(null) == false && textField_10.getText().equals("") == false && button_7.isEnabled())
				{
					cthread.handleDeleteCourseSelectMessage(textField_10.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "取消成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_6.setEnabled(true);
					button_7.setEnabled(false);
					
					cthread.handleShowCourseTable();
					stu_courseMessage = cthread.getREMessage();
					mess = (CourseMessage)stu_courseMessage.getData();		
					stu_courseinfo = mess.getCourse();
					person_course = stu_courseinfo.size();
				}
			}
		});
		layeredPane.setLayer(button_7, 2);
		button_7.setFont(new Font("宋体", Font.BOLD, 18));
		button_7.setBounds(757, 186, 82, 43);
		layeredPane.add(button_7);
		
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("宋体", Font.BOLD, 20));
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBackground(Color.WHITE);
		textField_15.setBounds(10, 232, 116, 54);
		if(courseList.size() > 2)
			textField_15.setText(courseList.get(2).getCourse_id());
		layeredPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("宋体", Font.BOLD, 20));
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBackground(Color.WHITE);
		textField_16.setBounds(125, 232, 166, 54);
		if(courseList.size() > 2)
			textField_16.setText(courseList.get(2).getCourse_name());
		layeredPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("宋体", Font.BOLD, 20));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBackground(Color.WHITE);
		textField_17.setBounds(290, 232, 147, 54);
		if(courseList.size() > 2)
			textField_17.setText(courseList.get(2).getCourse_time());
		layeredPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("宋体", Font.BOLD, 20));
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBackground(Color.WHITE);
		textField_18.setBounds(436, 232, 176, 54);
		if(courseList.size() > 2)
			textField_18.setText(courseList.get(2).getCourse_teacher());
		layeredPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBackground(Color.WHITE);
		textField_19.setBounds(611, 232, 259, 54);
		layeredPane.add(textField_19);
		
		button_8 = new JButton("添加");
		button_9 = new JButton("取消");
		//初始化添加按钮状态
		for(int i = 0;i < person_course;i++)
			if(stu_courseinfo.get(i).getCourse_id().equals(textField_15.getText()))
			{
				button_8.setEnabled(false);
				break;
			}
		// 初始化取消按钮
		if (button_8.isEnabled())
			button_9.setEnabled(false);
		
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_15.getText().equals(null) == false && textField_15.getText().equals("") == false && button_8.isEnabled())
				{
					cthread.handleCourseSelectMessage(textField_15.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "添加成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_8.setEnabled(false);
					button_9.setEnabled(true);
					
					cthread.handleShowCourseTable();
					stu_courseMessage = cthread.getREMessage();
					mess = (CourseMessage)stu_courseMessage.getData();		
					stu_courseinfo = mess.getCourse();
					person_course = stu_courseinfo.size();
				}
			}
		});
		layeredPane.setLayer(button_8, 2);
		button_8.setFont(new Font("宋体", Font.BOLD, 18));
		button_8.setBounds(633, 239, 82, 43);
		layeredPane.add(button_8);
		
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//如果按钮可选，取消课程
				if(textField_15.getText().equals(null) == false && textField_15.getText().equals("") == false && button_9.isEnabled())
				{
					cthread.handleDeleteCourseSelectMessage(textField_15.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "取消成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_8.setEnabled(true);
					button_9.setEnabled(false);
					
					cthread.handleShowCourseTable();
					stu_courseMessage = cthread.getREMessage();
					mess = (CourseMessage)stu_courseMessage.getData();		
					stu_courseinfo = mess.getCourse();
					person_course = stu_courseinfo.size();
				}
			}
		});
		layeredPane.setLayer(button_9, 2);
		button_9.setFont(new Font("宋体", Font.BOLD, 18));
		button_9.setBounds(757, 239, 82, 43);
		layeredPane.add(button_9);
		
		
		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setFont(new Font("宋体", Font.BOLD, 20));
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBackground(Color.WHITE);
		textField_20.setBounds(10, 285, 116, 54);
		if(courseList.size() > 3)
			textField_20.setText(courseList.get(3).getCourse_id());
		layeredPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setFont(new Font("宋体", Font.BOLD, 20));
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBackground(Color.WHITE);
		textField_21.setBounds(125, 285, 166, 54);
		if(courseList.size() > 3)
			textField_21.setText(courseList.get(3).getCourse_name());
		layeredPane.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setFont(new Font("宋体", Font.BOLD, 20));
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBackground(Color.WHITE);
		textField_22.setBounds(290, 285, 147, 54);
		if(courseList.size() > 3)
			textField_22.setText(courseList.get(3).getCourse_time());
		layeredPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setFont(new Font("宋体", Font.BOLD, 20));
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBackground(Color.WHITE);
		textField_23.setBounds(436, 285, 176, 54);
		if(courseList.size() > 3)
			textField_23.setText(courseList.get(3).getCourse_teacher());
		layeredPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBackground(Color.WHITE);
		textField_24.setBounds(611, 285, 259, 54);
		layeredPane.add(textField_24);
		
		button = new JButton("添加");
		button_1 = new JButton("取消");
		//初始化添加按钮状态
		for(int i = 0;i < person_course;i++)
			if(stu_courseinfo.get(i).getCourse_id().equals(textField_20.getText()))
			{
				button.setEnabled(false);
				break;
			}
		// 初始化取消按钮
		if (button.isEnabled())
			button_1.setEnabled(false);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_20.getText().equals(null) == false && textField_20.getText().equals("") == false && button.isEnabled())
				{
					cthread.handleCourseSelectMessage(textField_20.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "添加成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button.setEnabled(false);
					button_1.setEnabled(true);
					
					cthread.handleShowCourseTable();
					stu_courseMessage = cthread.getREMessage();
					mess = (CourseMessage)stu_courseMessage.getData();		
					stu_courseinfo = mess.getCourse();
					person_course = stu_courseinfo.size();
				}
			}
		});
		layeredPane.setLayer(button, 2);
		button.setFont(new Font("宋体", Font.BOLD, 18));
		button.setBounds(633, 292, 82, 43);
		layeredPane.add(button);
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//如果按钮可选，取消课程
				if(textField_20.getText().equals(null) == false && textField_20.getText().equals("") == false && button_1.isEnabled())
				{
					cthread.handleDeleteCourseSelectMessage(textField_20.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "取消成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button.setEnabled(true);
					button_1.setEnabled(false);
					
					cthread.handleShowCourseTable();
					stu_courseMessage = cthread.getREMessage();
					mess = (CourseMessage)stu_courseMessage.getData();		
					stu_courseinfo = mess.getCourse();
					person_course = stu_courseinfo.size();
				}
			}
		});
		layeredPane.setLayer(button_1, 2);
		button_1.setFont(new Font("宋体", Font.BOLD, 18));
		button_1.setBounds(757, 292, 82, 43);
		layeredPane.add(button_1);
		
		
		textField_25 = new JTextField();
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setFont(new Font("宋体", Font.BOLD, 20));
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBackground(Color.WHITE);
		textField_25.setBounds(10, 338, 116, 54);
		if(courseList.size() > 4)
			textField_25.setText(courseList.get(4).getCourse_id());
		layeredPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setFont(new Font("宋体", Font.BOLD, 20));
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBackground(Color.WHITE);
		textField_26.setBounds(125, 338, 166, 54);
		if(courseList.size() > 4)
			textField_26.setText(courseList.get(4).getCourse_name());
		layeredPane.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setFont(new Font("宋体", Font.BOLD, 20));
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBackground(Color.WHITE);
		textField_27.setBounds(290, 338, 147, 54);
		if(courseList.size() > 4)
			textField_27.setText(courseList.get(4).getCourse_time());
		layeredPane.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setFont(new Font("宋体", Font.BOLD, 20));
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		textField_28.setBackground(Color.WHITE);
		textField_28.setBounds(436, 338, 176, 54);
		if(courseList.size() > 4)
			textField_28.setText(courseList.get(4).getCourse_teacher());
		layeredPane.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setEditable(false);
		textField_29.setColumns(10);
		textField_29.setBackground(Color.WHITE);
		textField_29.setBounds(611, 338, 259, 54);
		layeredPane.add(textField_29);
		
		button_2 = new JButton("添加");
		button_3 = new JButton("取消");
		//初始化添加按钮状态
		for(int i = 0;i < person_course;i++)
			if(stu_courseinfo.get(i).getCourse_id().equals(textField_25.getText()))
			{
				button_2.setEnabled(false);
				break;
			}
		// 初始化取消按钮
		if (button_2.isEnabled())
			button_3.setEnabled(false);
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_25.getText().equals(null) == false && textField_25.getText().equals("") == false && button_2.isEnabled())
				{
					cthread.handleCourseSelectMessage(textField_25.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "添加成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_2.setEnabled(false);
					button_3.setEnabled(true);
					
					cthread.handleShowCourseTable();
					stu_courseMessage = cthread.getREMessage();
					mess = (CourseMessage)stu_courseMessage.getData();		
					stu_courseinfo = mess.getCourse();
					person_course = stu_courseinfo.size();
				}
			}
		});
		layeredPane.setLayer(button_2, 2);
		button_2.setFont(new Font("宋体", Font.BOLD, 18));
		button_2.setBounds(633, 345, 82, 43);
		layeredPane.add(button_2);
		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//如果按钮可选，取消课程
				if(textField_25.getText().equals(null) == false && textField_25.getText().equals("") == false && button_3.isEnabled())
				{
					cthread.handleDeleteCourseSelectMessage(textField_25.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "取消成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_2.setEnabled(true);
					button_3.setEnabled(false);
					
					cthread.handleShowCourseTable();
					stu_courseMessage = cthread.getREMessage();
					mess = (CourseMessage)stu_courseMessage.getData();		
					stu_courseinfo = mess.getCourse();
					person_course = stu_courseinfo.size();
				}
				
			}
		});
		layeredPane.setLayer(button_3, 2);
		button_3.setFont(new Font("宋体", Font.BOLD, 18));
		button_3.setBounds(757, 345, 82, 43);
		layeredPane.add(button_3);
		
		
		textField_30 = new JTextField();
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setFont(new Font("宋体", Font.BOLD, 20));
		textField_30.setEditable(false);
		textField_30.setColumns(10);
		textField_30.setBackground(Color.WHITE);
		textField_30.setBounds(10, 391, 116, 54);
		if(courseList.size() > 5)
			textField_30.setText(courseList.get(5).getCourse_id());
		layeredPane.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setFont(new Font("宋体", Font.BOLD, 20));
		textField_31.setEditable(false);
		textField_31.setColumns(10);
		textField_31.setBackground(Color.WHITE);
		textField_31.setBounds(125, 391, 166, 54);
		if(courseList.size() > 5)
			textField_31.setText(courseList.get(5).getCourse_name());
		layeredPane.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setFont(new Font("宋体", Font.BOLD, 20));
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		textField_32.setBackground(Color.WHITE);
		textField_32.setBounds(290, 391, 147, 54);
		if(courseList.size() > 5)
			textField_32.setText(courseList.get(5).getCourse_time());
		layeredPane.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setFont(new Font("宋体", Font.BOLD, 20));
		textField_33.setEditable(false);
		textField_33.setColumns(10);
		textField_33.setBackground(Color.WHITE);
		textField_33.setBounds(436, 391, 176, 54);
		if(courseList.size() > 5)
			textField_33.setText(courseList.get(5).getCourse_teacher());
		layeredPane.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setEditable(false);
		textField_34.setColumns(10);
		textField_34.setBackground(Color.WHITE);
		textField_34.setBounds(611, 391, 259, 54);
		layeredPane.add(textField_34);
		
		button_4 = new JButton("添加");
		button_5 = new JButton("取消");
		//初始化添加按钮状态
		for(int i = 0;i < person_course;i++)
			if(stu_courseinfo.get(i).getCourse_id().equals(textField_30.getText()))
			{
				button_4.setEnabled(false);
				break;
			}
		// 初始化取消按钮
		if (button_4.isEnabled())
			button_5.setEnabled(false);
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_30.getText().equals(null) == false && textField_30.getText().equals("") == false && button_4.isEnabled())
				{
					cthread.handleCourseSelectMessage(textField_30.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "添加成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_4.setEnabled(false);
					button_5.setEnabled(true);
					
					cthread.handleShowCourseTable();
					stu_courseMessage = cthread.getREMessage();
					mess = (CourseMessage)stu_courseMessage.getData();		
					stu_courseinfo = mess.getCourse();
					person_course = stu_courseinfo.size();
				}
			}
		});
		layeredPane.setLayer(button_4, 2);
		button_4.setFont(new Font("宋体", Font.BOLD, 18));
		button_4.setBounds(633, 398, 82, 43);
		layeredPane.add(button_4);
		
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//如果按钮可选，取消课程
				if(textField_30.getText().equals(null) == false && textField_30.getText().equals("") == false && button_5.isEnabled())
				{
					cthread.handleDeleteCourseSelectMessage(textField_30.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "取消成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_4.setEnabled(true);
					button_5.setEnabled(false);
					
					cthread.handleShowCourseTable();
					stu_courseMessage = cthread.getREMessage();
					mess = (CourseMessage)stu_courseMessage.getData();		
					stu_courseinfo = mess.getCourse();
					person_course = stu_courseinfo.size();
				}
				
			}
		});
		layeredPane.setLayer(button_5, 2);
		button_5.setFont(new Font("宋体", Font.BOLD, 18));
		button_5.setBounds(757, 398, 82, 43);
		layeredPane.add(button_5);
		
		
		textField_35 = new JTextField();
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setFont(new Font("宋体", Font.BOLD, 20));
		textField_35.setEditable(false);
		textField_35.setColumns(10);
		textField_35.setBackground(Color.WHITE);
		textField_35.setBounds(10, 444, 116, 54);
		if(courseList.size() > 6)
			textField_35.setText(courseList.get(6).getCourse_id());
		layeredPane.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36.setFont(new Font("宋体", Font.BOLD, 20));
		textField_36.setEditable(false);
		textField_36.setColumns(10);
		textField_36.setBackground(Color.WHITE);
		textField_36.setBounds(125, 444, 166, 54);
		if(courseList.size() > 6)
			textField_36.setText(courseList.get(6).getCourse_name());
		layeredPane.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setHorizontalAlignment(SwingConstants.CENTER);
		textField_37.setFont(new Font("宋体", Font.BOLD, 20));
		textField_37.setEditable(false);
		textField_37.setColumns(10);
		textField_37.setBackground(Color.WHITE);
		textField_37.setBounds(290, 444, 147, 54);
		if(courseList.size() > 6)
			textField_37.setText(courseList.get(6).getCourse_time());
		layeredPane.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setHorizontalAlignment(SwingConstants.CENTER);
		textField_38.setFont(new Font("宋体", Font.BOLD, 20));
		textField_38.setEditable(false);
		textField_38.setColumns(10);
		textField_38.setBackground(Color.WHITE);
		textField_38.setBounds(436, 444, 176, 54);
		if(courseList.size() > 6)
			textField_38.setText(courseList.get(6).getCourse_teacher());
		layeredPane.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setEditable(false);
		textField_39.setColumns(10);
		textField_39.setBackground(Color.WHITE);
		textField_39.setBounds(611, 444, 259, 54);
		layeredPane.add(textField_39);
		
		button_10 = new JButton("添加");
		button_11 = new JButton("取消");
		// 初始化添加按钮状态
		for (int i = 0; i < person_course; i++)
			if (stu_courseinfo.get(i).getCourse_id().equals(textField_35.getText())) 
			{
				button_10.setEnabled(false);
				break;
			}
		// 初始化取消按钮
		if (button_10.isEnabled())
			button_11.setEnabled(false);
		
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_35.getText().equals(null) == false && textField_35.getText().equals("") == false && button_10.isEnabled())
				{
					cthread.handleCourseSelectMessage(textField_35.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "添加成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_10.setEnabled(false);
					button_11.setEnabled(true);
					
					cthread.handleShowCourseTable();
					stu_courseMessage = cthread.getREMessage();
					mess = (CourseMessage)stu_courseMessage.getData();		
					stu_courseinfo = mess.getCourse();
					person_course = stu_courseinfo.size();
				}
			}
		});
		layeredPane.setLayer(button_10, 2);
		button_10.setFont(new Font("宋体", Font.BOLD, 18));
		button_10.setBounds(633, 451, 82, 43);
		layeredPane.add(button_10);
		
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//如果按钮可选，取消课程
				if(textField_35.getText().equals(null) == false && textField_35.getText().equals("") == false && button_11.isEnabled())
				{
					cthread.handleDeleteCourseSelectMessage(textField_35.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "取消成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_10.setEnabled(true);
					button_11.setEnabled(false);
					
					cthread.handleShowCourseTable();
					stu_courseMessage = cthread.getREMessage();
					mess = (CourseMessage)stu_courseMessage.getData();		
					stu_courseinfo = mess.getCourse();
					person_course = stu_courseinfo.size();
				}
				
			}
		});
		layeredPane.setLayer(button_11, 2);
		button_11.setFont(new Font("宋体", Font.BOLD, 18));
		button_11.setBounds(757, 451, 82, 43);
		layeredPane.add(button_11);
		
		
		textField_40 = new JTextField();
		textField_40.setHorizontalAlignment(SwingConstants.CENTER);
		textField_40.setFont(new Font("宋体", Font.BOLD, 20));
		textField_40.setEditable(false);
		textField_40.setColumns(10);
		textField_40.setBackground(Color.WHITE);
		textField_40.setBounds(10, 497, 116, 54);
		if(courseList.size() > 7)
			textField_40.setText(courseList.get(7).getCourse_id());
		layeredPane.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setHorizontalAlignment(SwingConstants.CENTER);
		textField_41.setFont(new Font("宋体", Font.BOLD, 20));
		textField_41.setEditable(false);
		textField_41.setColumns(10);
		textField_41.setBackground(Color.WHITE);
		textField_41.setBounds(125, 497, 166, 54);
		if(courseList.size() > 7)
			textField_41.setText(courseList.get(7).getCourse_name());
		layeredPane.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setHorizontalAlignment(SwingConstants.CENTER);
		textField_42.setFont(new Font("宋体", Font.BOLD, 20));
		textField_42.setEditable(false);
		textField_42.setColumns(10);
		textField_42.setBackground(Color.WHITE);
		textField_42.setBounds(290, 497, 147, 54);
		if(courseList.size() > 7)
			textField_42.setText(courseList.get(7).getCourse_time());
		layeredPane.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setHorizontalAlignment(SwingConstants.CENTER);
		textField_43.setFont(new Font("宋体", Font.BOLD, 20));
		textField_43.setEditable(false);
		textField_43.setColumns(10);
		textField_43.setBackground(Color.WHITE);
		textField_43.setBounds(436, 497, 176, 54);
		if(courseList.size() > 7)
			textField_43.setText(courseList.get(7).getCourse_teacher());
		layeredPane.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setEditable(false);
		textField_44.setColumns(10);
		textField_44.setBackground(Color.WHITE);
		textField_44.setBounds(611, 497, 259, 54);
		layeredPane.add(textField_44);
		
		button_12 = new JButton("添加");
		button_13 = new JButton("取消");
		// 初始化添加按钮状态
		for (int i = 0; i < person_course; i++)
			if (stu_courseinfo.get(i).getCourse_id().equals(textField_40.getText()))
			{
				button_12.setEnabled(false);
				break;
			}
		// 初始化取消按钮
		if (button_12.isEnabled())
			button_13.setEnabled(false);
		
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_40.getText().equals(null) == false && textField_40.getText().equals("") == false && button_12.isEnabled())
				{
					cthread.handleCourseSelectMessage(textField_40.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "添加成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_12.setEnabled(false);
					button_13.setEnabled(true);
					
					cthread.handleShowCourseTable();
					stu_courseMessage = cthread.getREMessage();
					mess = (CourseMessage)stu_courseMessage.getData();		
					stu_courseinfo = mess.getCourse();
					person_course = stu_courseinfo.size();
				}
			}
		});
		layeredPane.setLayer(button_12, 2);
		button_12.setFont(new Font("宋体", Font.BOLD, 18));
		button_12.setBounds(633, 504, 82, 43);
		layeredPane.add(button_12);
		
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//如果按钮可选，取消课程
				if(textField_40.getText().equals(null) == false && textField_40.getText().equals("") == false && button_13.isEnabled())
				{
					cthread.handleDeleteCourseSelectMessage(textField_40.getText());
					cthread.getREMessage();
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "取消成功!","提示页面", JOptionPane.INFORMATION_MESSAGE);
					button_12.setEnabled(true);
					button_13.setEnabled(false);
					
					cthread.handleShowCourseTable();
					stu_courseMessage = cthread.getREMessage();
					mess = (CourseMessage)stu_courseMessage.getData();		
					stu_courseinfo = mess.getCourse();
					person_course = stu_courseinfo.size();
				}
				
			}
		});
		layeredPane.setLayer(button_13, 2);
		button_13.setFont(new Font("宋体", Font.BOLD, 18));
		button_13.setBounds(757, 504, 82, 43);
		layeredPane.add(button_13);
		
		//翻页
		lblNewLabel_2 = new JLabel("/共");
		lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(lblNewLabel_2, 1);
		lblNewLabel_2.setBounds(326, 561, 50, 45);
		layeredPane.add(lblNewLabel_2);
		
		textField_46 = new JTextField();
		textField_46.setBackground(Color.WHITE);
		textField_46.setHorizontalAlignment(SwingConstants.CENTER);
		textField_46.setFont(new Font("宋体", Font.BOLD, 18));
		textField_46.setColumns(10);
		textField_46.setBounds(368, 561, 43, 45);
		layeredPane.add(textField_46);
		
		int maxPage = 1;
		while((maxPage * perpage_course) < totalCourse)
			maxPage++;
		int Mpage = maxPage;
		textField_46.setText(String.valueOf(maxPage));
		textField_46.setEditable(false);
		
		label = new JLabel("页");
		layeredPane.setLayer(label, 1);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.BOLD, 20));
		label.setBounds(402, 561, 50, 45);
		layeredPane.add(label);
		
		lblNewLabel = new JLabel("第");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(lblNewLabel, 1);
		lblNewLabel.setBounds(224, 561, 50, 45);
		layeredPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("页");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(lblNewLabel_1, 1);
		lblNewLabel_1.setBounds(290, 561, 50, 45);
		layeredPane.add(lblNewLabel_1);
		
		textField_45 = new JTextField();
		textField_45.setBackground(Color.WHITE);
		textField_45.setFont(new Font("宋体", Font.BOLD, 18));
		textField_45.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(textField_45, 1);
		textField_45.setBounds(262, 561, 43, 45);
		layeredPane.add(textField_45);
		textField_45.setColumns(10);
		textField_45.setText(String.valueOf(1));
		textField_45.setEditable(false);
		
		btnNewButton_3 = new JButton("上一页");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(textField_45.getText()) > 1 && Integer.parseInt(textField_45.getText()) <= Mpage)
				{
					//更新当前页数
					int result = Integer.parseInt(textField_45.getText()) - 1;
					textField_45.setText(String.valueOf(result));
					
					//更新表格课程
					int disp = (result - 1) * perpage_course;
					textField_5.setText(courseList.get(0 + disp).getCourse_id());
					textField_6.setText(courseList.get(0 + disp).getCourse_name());
					textField_7.setText(courseList.get(0 + disp).getCourse_time());
					textField_8.setText(courseList.get(0 + disp).getCourse_teacher());
					btnNewButton.setVisible(true);
					btnNewButton_1.setVisible(true);
					
					//更新按钮状态
					btnNewButton.setEnabled(true);
					btnNewButton_1.setEnabled(false);
					for(int i = 0;i < person_course;i++)
						if(textField_5.getText().equals(stu_courseinfo.get(i).getCourse_id()))
						{
							btnNewButton.setEnabled(false);
							btnNewButton_1.setEnabled(true);
							break;
						}
					
					textField_10.setText(courseList.get(1 + disp).getCourse_id());
					textField_11.setText(courseList.get(1 + disp).getCourse_name());
					textField_12.setText(courseList.get(1 + disp).getCourse_time());
					textField_13.setText(courseList.get(1 + disp).getCourse_teacher());
					button_6.setVisible(true);
					button_7.setVisible(true);
					button_6.setEnabled(true);
					button_7.setEnabled(false);
					for(int i = 0;i < person_course;i++)
						if(textField_10.getText().equals(stu_courseinfo.get(i).getCourse_id()))
						{
							button_6.setEnabled(false);
							button_7.setEnabled(true);
							break;
						}
					
					textField_15.setText(courseList.get(2 + disp).getCourse_id());
					textField_16.setText(courseList.get(2 + disp).getCourse_name());
					textField_17.setText(courseList.get(2 + disp).getCourse_time());
					textField_18.setText(courseList.get(2 + disp).getCourse_teacher());
					button_8.setVisible(true);
					button_9.setVisible(true);
					button_8.setEnabled(true);
					button_9.setEnabled(false);
					for(int i = 0;i < person_course;i++)
						if(textField_15.getText().equals(stu_courseinfo.get(i).getCourse_id()))
						{
							button_8.setEnabled(false);
							button_9.setEnabled(true);
							break;
						}
					
					textField_20.setText(courseList.get(3 + disp).getCourse_id());
					textField_21.setText(courseList.get(3 + disp).getCourse_name());
					textField_22.setText(courseList.get(3 + disp).getCourse_time());
					textField_23.setText(courseList.get(3 + disp).getCourse_teacher());
					button.setVisible(true);
					button_1.setVisible(true);
					button.setEnabled(true);
					button_1.setEnabled(false);
					for(int i = 0;i < person_course;i++)
						if(textField_20.getText().equals(stu_courseinfo.get(i).getCourse_id()))
						{
							button.setEnabled(false);
							button_1.setEnabled(true);
							break;
						}
					
					textField_25.setText(courseList.get(4 + disp).getCourse_id());
					textField_26.setText(courseList.get(4 + disp).getCourse_name());
					textField_27.setText(courseList.get(4 + disp).getCourse_time());
					textField_28.setText(courseList.get(4 + disp).getCourse_teacher());
					button_2.setVisible(true);
					button_3.setVisible(true);
					button_2.setEnabled(true);
					button_3.setEnabled(false);
					for(int i = 0;i < person_course;i++)
						if(textField_25.getText().equals(stu_courseinfo.get(i).getCourse_id()))
						{
							button_2.setEnabled(false);
							button_3.setEnabled(true);
							break;
						}
					
					textField_30.setText(courseList.get(5 + disp).getCourse_id());
					textField_31.setText(courseList.get(5 + disp).getCourse_name());
					textField_32.setText(courseList.get(5 + disp).getCourse_time());
					textField_33.setText(courseList.get(5 + disp).getCourse_teacher());
					button_4.setVisible(true);
					button_5.setVisible(true);
					button_4.setEnabled(true);
					button_5.setEnabled(false);
					for(int i = 0;i < person_course;i++)
						if(textField_30.getText().equals(stu_courseinfo.get(i).getCourse_id()))
						{
							button_4.setEnabled(false);
							button_5.setEnabled(true);
							break;
						}
					
					textField_35.setText(courseList.get(6 + disp).getCourse_id());
					textField_36.setText(courseList.get(6 + disp).getCourse_name());
					textField_37.setText(courseList.get(6 + disp).getCourse_time());
					textField_38.setText(courseList.get(6 + disp).getCourse_teacher());
					button_10.setVisible(true);
					button_11.setVisible(true);
					button_10.setEnabled(true);
					button_11.setEnabled(false);
					for(int i = 0;i < person_course;i++)
						if(textField_35.getText().equals(stu_courseinfo.get(i).getCourse_id()))
						{
							button_10.setEnabled(false);
							button_11.setEnabled(true);
							break;
						}
					
					textField_40.setText(courseList.get(7 + disp).getCourse_id());
					textField_41.setText(courseList.get(7 + disp).getCourse_name());
					textField_42.setText(courseList.get(7 + disp).getCourse_time());
					textField_43.setText(courseList.get(7 + disp).getCourse_teacher());
					button_12.setVisible(true);
					button_13.setVisible(true);
					button_12.setEnabled(true);
					button_13.setEnabled(false);
					for(int i = 0;i < person_course;i++)
						if(textField_40.getText().equals(stu_courseinfo.get(i).getCourse_id()))
						{
							button_12.setEnabled(false);
							button_13.setEnabled(true);
							break;
						}
				}
			}
		});
		btnNewButton_3.setFont(new Font("宋体", Font.BOLD, 20));
		layeredPane.setLayer(btnNewButton_3, 1);
		btnNewButton_3.setBounds(493, 561, 104, 45);
		layeredPane.add(btnNewButton_3);
		
		
		button_14 = new JButton("下一页");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(textField_45.getText()) > 0 && Integer.parseInt(textField_45.getText()) < Mpage)
				{
					//更新当前页数
					int result = Integer.parseInt(textField_45.getText()) + 1;
					textField_45.setText(String.valueOf(result));
					
					//更新表格信息
					int disp = (result - 1) * perpage_course;
					if(0 + disp < totalCourse)
					{
						textField_5.setText(courseList.get(0 + disp).getCourse_id());
						textField_6.setText(courseList.get(0 + disp).getCourse_name());
						textField_7.setText(courseList.get(0 + disp).getCourse_time());
						textField_8.setText(courseList.get(0 + disp).getCourse_teacher());
						//更新按钮状态
						btnNewButton.setEnabled(true);
						btnNewButton_1.setEnabled(false);
						for(int i = 0;i < person_course;i++)
							if(textField_5.getText().equals(stu_courseinfo.get(i).getCourse_id()))
							{
								btnNewButton.setEnabled(false);
								btnNewButton_1.setEnabled(true);
								break;
							}
					}
					else
					{
						textField_5.setText(null);
						textField_6.setText(null);
						textField_7.setText(null);
						textField_8.setText(null);
						btnNewButton.setVisible(false);
						btnNewButton_1.setVisible(false);
					}
					if(1 + disp < totalCourse)
					{
						textField_10.setText(courseList.get(1 + disp).getCourse_id());
						textField_11.setText(courseList.get(1 + disp).getCourse_name());
						textField_12.setText(courseList.get(1 + disp).getCourse_time());
						textField_13.setText(courseList.get(1 + disp).getCourse_teacher());
						button_6.setEnabled(true);
						button_7.setEnabled(false);
						for(int i = 0;i < person_course;i++)
							if(textField_10.getText().equals(stu_courseinfo.get(i).getCourse_id()))
							{
								button_6.setEnabled(false);
								button_7.setEnabled(true);
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
						button_7.setVisible(false);
					}
					if(2 + disp < totalCourse)
					{
						textField_15.setText(courseList.get(2 + disp).getCourse_id());
						textField_16.setText(courseList.get(2 + disp).getCourse_name());
						textField_17.setText(courseList.get(2 + disp).getCourse_time());
						textField_18.setText(courseList.get(2 + disp).getCourse_teacher());
						button_8.setEnabled(true);
						button_9.setEnabled(false);
						for(int i = 0;i < person_course;i++)
							if(textField_15.getText().equals(stu_courseinfo.get(i).getCourse_id()))
							{
								button_8.setEnabled(false);
								button_9.setEnabled(true);
								break;
							}
					}
					else
					{
						textField_15.setText(null);
						textField_16.setText(null);
						textField_17.setText(null);
						textField_18.setText(null);
						button_8.setVisible(false);
						button_9.setVisible(false);
					}
					if(3 + disp < totalCourse)
					{
						textField_20.setText(courseList.get(3 + disp).getCourse_id());
						textField_21.setText(courseList.get(3 + disp).getCourse_name());
						textField_22.setText(courseList.get(3 + disp).getCourse_time());
						textField_23.setText(courseList.get(3 + disp).getCourse_teacher());
						button.setEnabled(true);
						button_1.setEnabled(false);
						for(int i = 0;i < person_course;i++)
							if(textField_20.getText().equals(stu_courseinfo.get(i).getCourse_id()))
							{
								button.setEnabled(false);
								button_1.setEnabled(true);
								break;
							}
					}
					else
					{
						textField_20.setText(null);
						textField_21.setText(null);
						textField_22.setText(null);
						textField_23.setText(null);
						button.setVisible(false);
						button_1.setVisible(false);
					}
					if(4 + disp < totalCourse)
					{
						textField_25.setText(courseList.get(4 + disp).getCourse_id());
						textField_26.setText(courseList.get(4 + disp).getCourse_name());
						textField_27.setText(courseList.get(4 + disp).getCourse_time());
						textField_28.setText(courseList.get(4 + disp).getCourse_teacher());
						button_2.setEnabled(true);
						button_3.setEnabled(false);
						for(int i = 0;i < person_course;i++)
							if(textField_25.getText().equals(stu_courseinfo.get(i).getCourse_id()))
							{
								button_2.setEnabled(false);
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
						button_2.setVisible(false);
						button_3.setVisible(false);
					}
					if(5 + disp < totalCourse)
					{
						textField_30.setText(courseList.get(5 + disp).getCourse_id());
						textField_31.setText(courseList.get(5 + disp).getCourse_name());
						textField_32.setText(courseList.get(5 + disp).getCourse_time());
						textField_33.setText(courseList.get(5 + disp).getCourse_teacher());
						button_4.setEnabled(true);
						button_5.setEnabled(false);
						for(int i = 0;i < person_course;i++)
							if(textField_30.getText().equals(stu_courseinfo.get(i).getCourse_id()))
							{
								button_4.setEnabled(false);
								button_5.setEnabled(true);
								break;
							}
					}
					else
					{
						textField_30.setText(null);
						textField_31.setText(null);
						textField_32.setText(null);
						textField_33.setText(null);
						button_4.setVisible(false);
						button_5.setVisible(false);
					}
					if(6 + disp < totalCourse)
					{
						textField_35.setText(courseList.get(6 + disp).getCourse_id());
						textField_36.setText(courseList.get(6 + disp).getCourse_name());
						textField_37.setText(courseList.get(6 + disp).getCourse_time());
						textField_38.setText(courseList.get(6 + disp).getCourse_teacher());
						button_10.setEnabled(true);
						button_11.setEnabled(false);
						for(int i = 0;i < person_course;i++)
							if(textField_35.getText().equals(stu_courseinfo.get(i).getCourse_id()))
							{
								button_10.setEnabled(false);
								button_11.setEnabled(true);
								break;
							}
					}
					else
					{
						textField_35.setText(null);
						textField_36.setText(null);
						textField_37.setText(null);
						textField_38.setText(null);
						button_10.setVisible(false);
						button_11.setVisible(false);
					}
					if(7 + disp < totalCourse)
					{
						textField_40.setText(courseList.get(7 + disp).getCourse_id());
						textField_41.setText(courseList.get(7 + disp).getCourse_name());
						textField_42.setText(courseList.get(7 + disp).getCourse_time());
						textField_43.setText(courseList.get(7 + disp).getCourse_teacher());
						button_12.setEnabled(true);
						button_13.setEnabled(false);
						for(int i = 0;i < person_course;i++)
							if(textField_40.getText().equals(stu_courseinfo.get(i).getCourse_id()))
							{
								button_12.setEnabled(false);
								button_13.setEnabled(true);
								break;
							}
					}
					else
					{
						textField_40.setText(null);
						textField_41.setText(null);
						textField_42.setText(null);
						textField_43.setText(null);
						button_12.setVisible(false);
						button_13.setVisible(false);
					}
				}
			}
		});
		layeredPane.setLayer(button_14, 1);
		button_14.setFont(new Font("宋体", Font.BOLD, 20));
		button_14.setBounds(611, 561, 104, 45);
		layeredPane.add(button_14);
		
		
		//学生信息
		cthread.handleShowStudentMessage();
		Message stuMessage = cthread.getREMessage();
		StudentMessage mess1 = (StudentMessage)stuMessage.getData();
		ArrayList<Studentinfo> studentinfo = mess1.getStudent();
		if(studentinfo.isEmpty())
			JOptionPane.showMessageDialog(new JFrame().getContentPane(), "请先完善你的学籍信息!","提示页面", JOptionPane.INFORMATION_MESSAGE);
		
		textField_47 = new JTextField();
		textField_47.setBackground(Color.WHITE);
		textField_47.setFont(new Font("宋体", Font.BOLD, 18));
		textField_47.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(textField_47, 1);
		textField_47.setBounds(136, 16, 147, 43);
		layeredPane.add(textField_47);
		textField_47.setColumns(10);
		textField_47.setText(studentinfo.get(0).getStudent_id());//显示学生一卡通号
		textField_47.setEditable(false);
		
		textField_48 = new JTextField();
		textField_48.setBackground(Color.WHITE);
		layeredPane.setLayer(textField_48, 1);
		textField_48.setHorizontalAlignment(SwingConstants.CENTER);
		textField_48.setFont(new Font("宋体", Font.BOLD, 18));
		textField_48.setColumns(10);
		textField_48.setBounds(381, 16, 158, 43);
		layeredPane.add(textField_48);
		textField_48.setText(studentinfo.get(0).getStudent_name());//显示学生姓名
		textField_48.setEditable(false);
		
		btnNewButton_2 = new JButton("已选课程查询");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Student_courseSelected(cthread);
			}
		});
		btnNewButton_2.setBackground(new Color(173, 216, 230));
		btnNewButton_2.setFont(new Font("宋体", Font.BOLD, 18));
		layeredPane.setLayer(btnNewButton_2, 1);
		btnNewButton_2.setBounds(632, 12, 176, 50);
		layeredPane.add(btnNewButton_2);
		
		label_1 = new JLabel("学号:");
		label_1.setFont(new Font("宋体", Font.BOLD, 18));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(label_1, 1);
		label_1.setBounds(37, 16, 89, 48);
		layeredPane.add(label_1);
		
		lblNewLabel_4 = new JLabel("姓名：");
		lblNewLabel_4.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(lblNewLabel_4, 1);
		lblNewLabel_4.setBounds(320, 21, 72, 43);
		layeredPane.add(lblNewLabel_4);
		
		image1 = new ImageIcon("images/student_course_photo1.jpg");
		lblNewLabel_5 = new JLabel(image1);
		lblNewLabel_5.setBounds(0, 0, 884, 627);
		layeredPane.add(lblNewLabel_5);
		
	}
}