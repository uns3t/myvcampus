package course;
/**
 * 类 {@code Student_courseSelected} 学生选课界面.
 *
 * <p> 学生选课界面
 *
 * @since 2019/8/19
 */
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import client.ClientThread;
import message.CourseInfo;
import message.CourseMessage;
import message.Message;
import message.StudentMessage;
import message.Studentinfo;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student_courseSelected extends JFrame{
	final int perpage = 4;
	
	private JTextField textField, textField_1, textField_2, textField_3,textField_4, textField_5, textField_6, textField_7, textField_8, textField_9, textField_10,
	textField_11,textField_12, textField_13, textField_14, textField_15, textField_16, textField_17, textField_18, textField_19;
	private JLabel lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5;
	private JButton btnNewButton, button;
	private ArrayList<CourseInfo> courseInfo;
	private ImageIcon image1;
	private JLabel lblNewLabel_6;

	public Student_courseSelected(ClientThread cthread) {
		initialize(cthread);
	}

	private void initialize(ClientThread cthread) {
		setTitle("已选课程查询");
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/windows.jpg"));
		setBounds(100, 100, 631, 431);
		getContentPane().setLayout(null);
		setVisible(true);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 621, 398);
		getContentPane().add(layeredPane);
		
		
		//显示学生信息
		cthread.handleShowStudentMessage();
		Message stuMessage = cthread.getREMessage();
		StudentMessage mess = (StudentMessage)stuMessage.getData();		
		ArrayList<Studentinfo> studentinfo = mess.getStudent();
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("宋体", Font.BOLD, 18));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(textField, 1);
		textField.setBounds(112, 10, 175, 37);
		layeredPane.add(textField);
		textField.setColumns(10);
		textField.setText(studentinfo.get(0).getStudent_id());
		textField.setEditable(false);
		
		textField_1 = new JTextField();
		layeredPane.setLayer(textField_1, 1);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("宋体", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(405, 10, 185, 37);
		layeredPane.add(textField_1);
		textField_1.setText(studentinfo.get(0).getStudent_name());
		textField_1.setEditable(false);
		
		lblNewLabel = new JLabel("学号：");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(lblNewLabel, 1);
		lblNewLabel.setBounds(10, 10, 103, 37);
		layeredPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("姓名：");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(lblNewLabel_1, 1);
		lblNewLabel_1.setBounds(344, 10, 73, 37);
		layeredPane.add(lblNewLabel_1);
		
		
		//得到学生个人课表
		cthread.handleShowCourseTable();
		CourseMessage cMessage = (CourseMessage)cthread.getREMessage().getData();
		courseInfo = cMessage.getCourse();
		int totalSelected = courseInfo.size();
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.WHITE);
		textField_2.setFont(new Font("宋体", Font.BOLD, 20));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(textField_2, 1);
		textField_2.setBounds(10, 85, 116, 54);
		layeredPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setEditable(false);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.WHITE);
		textField_3.setFont(new Font("宋体", Font.BOLD, 20));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(textField_3, 1);
		textField_3.setBounds(125, 85, 166, 54);
		layeredPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setEditable(false);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.WHITE);
		textField_4.setFont(new Font("宋体", Font.BOLD, 20));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(textField_4, 1);
		textField_4.setBounds(290, 85, 147, 54);
		layeredPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setEditable(false);
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.WHITE);
		textField_5.setFont(new Font("宋体", Font.BOLD, 20));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(textField_5, 1);
		textField_5.setBounds(436, 85, 176, 54);
		layeredPane.add(textField_5);
		textField_5.setColumns(10);
		textField_5.setEditable(false);
		
		//初始化
		if(0 < totalSelected)
		{
			textField_2.setText(courseInfo.get(0).getCourse_id());
			textField_3.setText(courseInfo.get(0).getCourse_name());
			textField_4.setText(courseInfo.get(0).getCourse_time());
			textField_5.setText(courseInfo.get(0).getCourse_teacher());
		}
		
		textField_6 = new JTextField();
		layeredPane.setLayer(textField_6, 1);
		textField_6.setBackground(Color.WHITE);
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("宋体", Font.BOLD, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(10, 138, 116, 54);
		layeredPane.add(textField_6);
		textField_6.setEditable(false);
		
		textField_7 = new JTextField();
		layeredPane.setLayer(textField_7, 1);
		textField_7.setBackground(Color.WHITE);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("宋体", Font.BOLD, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(125, 138, 166, 54);
		layeredPane.add(textField_7);
		textField_7.setEditable(false);
		
		textField_8 = new JTextField();
		layeredPane.setLayer(textField_8, 1);
		textField_8.setBackground(Color.WHITE);
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("宋体", Font.BOLD, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(290, 138, 147, 54);
		layeredPane.add(textField_8);
		textField_8.setEditable(false);
		
		textField_9 = new JTextField();
		layeredPane.setLayer(textField_9, 1);
		textField_9.setBackground(Color.WHITE);
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("宋体", Font.BOLD, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(436, 138, 176, 54);
		layeredPane.add(textField_9);
		textField_9.setEditable(false);
		
		if(1 < totalSelected)
		{
			textField_6.setText(courseInfo.get(1).getCourse_id());
			textField_7.setText(courseInfo.get(1).getCourse_name());
			textField_8.setText(courseInfo.get(1).getCourse_time());
			textField_9.setText(courseInfo.get(1).getCourse_teacher());
		}
		
		textField_10 = new JTextField();
		layeredPane.setLayer(textField_10, 1);
		textField_10.setBackground(Color.WHITE);
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("宋体", Font.BOLD, 20));
		textField_10.setColumns(10);
		textField_10.setBounds(10, 191, 116, 54);
		layeredPane.add(textField_10);
		textField_10.setEditable(false);
		
		textField_11 = new JTextField();
		layeredPane.setLayer(textField_11, 1);
		textField_11.setBackground(Color.WHITE);
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("宋体", Font.BOLD, 20));
		textField_11.setColumns(10);
		textField_11.setBounds(125, 191, 166, 54);
		layeredPane.add(textField_11);
		textField_11.setEditable(false);
		
		textField_12 = new JTextField();
		layeredPane.setLayer(textField_12, 1);
		textField_12.setBackground(Color.WHITE);
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("宋体", Font.BOLD, 20));
		textField_12.setColumns(10);
		textField_12.setBounds(290, 191, 147, 54);
		layeredPane.add(textField_12);
		textField_12.setEditable(false);
		
		textField_13 = new JTextField();
		layeredPane.setLayer(textField_13, 1);
		textField_13.setBackground(Color.WHITE);
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("宋体", Font.BOLD, 20));
		textField_13.setColumns(10);
		textField_13.setBounds(436, 191, 176, 54);
		layeredPane.add(textField_13);
		textField_13.setEditable(false);
		
		if(2 < totalSelected)
		{
			textField_10.setText(courseInfo.get(2).getCourse_id());
			textField_11.setText(courseInfo.get(2).getCourse_name());
			textField_12.setText(courseInfo.get(2).getCourse_time());
			textField_13.setText(courseInfo.get(2).getCourse_teacher());
		}
		
		textField_14 = new JTextField();
		layeredPane.setLayer(textField_14, 1);
		textField_14.setBackground(Color.WHITE);
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("宋体", Font.BOLD, 20));
		textField_14.setColumns(10);
		textField_14.setBounds(10, 244, 116, 54);
		layeredPane.add(textField_14);
		textField_14.setEditable(false);
		
		textField_15 = new JTextField();
		layeredPane.setLayer(textField_15, 1);
		textField_15.setBackground(Color.WHITE);
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("宋体", Font.BOLD, 20));
		textField_15.setColumns(10);
		textField_15.setBounds(125, 244, 166, 54);
		layeredPane.add(textField_15);
		textField_15.setEditable(false);
		
		textField_16 = new JTextField();
		layeredPane.setLayer(textField_16, 1);
		textField_16.setBackground(Color.WHITE);
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("宋体", Font.BOLD, 20));
		textField_16.setColumns(10);
		textField_16.setBounds(290, 244, 147, 54);
		layeredPane.add(textField_16);
		textField_16.setEditable(false);
		
		textField_17 = new JTextField();
		layeredPane.setLayer(textField_17, 1);
		textField_17.setBackground(Color.WHITE);
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("宋体", Font.BOLD, 20));
		textField_17.setColumns(10);
		textField_17.setBounds(436, 244, 176, 54);
		layeredPane.add(textField_17);
		textField_17.setEditable(false);
		
		if(3 < totalSelected)
		{
			textField_14.setText(courseInfo.get(3).getCourse_id());
			textField_15.setText(courseInfo.get(3).getCourse_name());
			textField_16.setText(courseInfo.get(3).getCourse_time());
			textField_17.setText(courseInfo.get(3).getCourse_teacher());
		}
		
		lblNewLabel_2 = new JLabel("第");
		lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(lblNewLabel_2, 1);
		lblNewLabel_2.setBounds(67, 328, 37, 29);
		layeredPane.add(lblNewLabel_2);
		
		textField_18 = new JTextField();
		textField_18.setBackground(Color.WHITE);
		textField_18.setFont(new Font("宋体", Font.BOLD, 18));
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(textField_18, 1);
		textField_18.setBounds(106, 328, 37, 29);
		layeredPane.add(textField_18);
		textField_18.setColumns(10);
		textField_18.setText(String.valueOf(1));
		textField_18.setEditable(false);
		
		lblNewLabel_3 = new JLabel("页");
		lblNewLabel_3.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(lblNewLabel_3, 1);
		lblNewLabel_3.setBounds(137, 328, 46, 29);
		layeredPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("/共");
		lblNewLabel_4.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		layeredPane.setLayer(lblNewLabel_4, 1);
		lblNewLabel_4.setBounds(174, 328, 37, 29);
		layeredPane.add(lblNewLabel_4);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("宋体", Font.BOLD, 18));
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setBackground(Color.WHITE);
		layeredPane.setLayer(textField_19, 1);
		textField_19.setBounds(208, 328, 37, 29);
		layeredPane.add(textField_19);
		textField_19.setColumns(10);
		int sum = 1;
		while(sum * perpage < totalSelected)
			sum++;
		int result_sumPage = sum;
		textField_19.setText(String.valueOf(sum));
		textField_19.setEditable(false);
		
		lblNewLabel_5 = new JLabel("页");
		lblNewLabel_5.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBackground(Color.WHITE);
		layeredPane.setLayer(lblNewLabel_5, 1);
		lblNewLabel_5.setBounds(247, 328, 29, 29);
		layeredPane.add(lblNewLabel_5);
		
		btnNewButton = new JButton("上一页");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(textField_18.getText()) > 1 && Integer.parseInt(textField_18.getText()) <= result_sumPage)
				{
					//更新当前页数
					int current = Integer.parseInt(textField_18.getText()) - 1;
					textField_18.setText(String.valueOf(current));
					
					//更新表格信息
					int disp = (current - 1) * perpage;
					textField_2.setText(courseInfo.get(0 + disp).getCourse_id());
					textField_3.setText(courseInfo.get(0 + disp).getCourse_name());
					textField_4.setText(courseInfo.get(0 + disp).getCourse_time());
					textField_5.setText(courseInfo.get(0 + disp).getCourse_teacher());
					
					textField_6.setText(courseInfo.get(1 + disp).getCourse_id());
					textField_7.setText(courseInfo.get(1 + disp).getCourse_name());
					textField_8.setText(courseInfo.get(1 + disp).getCourse_time());
					textField_9.setText(courseInfo.get(1 + disp).getCourse_teacher());
					
					textField_10.setText(courseInfo.get(2 + disp).getCourse_id());
					textField_11.setText(courseInfo.get(2 + disp).getCourse_name());
					textField_12.setText(courseInfo.get(2 + disp).getCourse_time());
					textField_13.setText(courseInfo.get(2 + disp).getCourse_teacher());
					
					textField_14.setText(courseInfo.get(3 + disp).getCourse_id());
					textField_15.setText(courseInfo.get(3 + disp).getCourse_name());
					textField_16.setText(courseInfo.get(3 + disp).getCourse_time());
					textField_17.setText(courseInfo.get(3 + disp).getCourse_teacher());
				}
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 18));
		layeredPane.setLayer(btnNewButton, 1);
		btnNewButton.setBounds(306, 320, 96, 44);
		layeredPane.add(btnNewButton);
		
		button = new JButton("下一页");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(textField_18.getText()) > 0 && Integer.parseInt(textField_18.getText()) < result_sumPage)
				{
					//更新当前页数
					int current = Integer.parseInt(textField_18.getText()) + 1;
					textField_18.setText(String.valueOf(current));
					
					//更新表格信息
					int disp = (current - 1) * perpage;
					if(0 + disp < totalSelected)
					{
						textField_2.setText(courseInfo.get(0 + disp).getCourse_id());
						textField_3.setText(courseInfo.get(0 + disp).getCourse_name());
						textField_4.setText(courseInfo.get(0 + disp).getCourse_time());
						textField_5.setText(courseInfo.get(0 + disp).getCourse_teacher());
					}
					else
					{
						textField_2.setText(null);
						textField_3.setText(null);
						textField_4.setText(null);
						textField_5.setText(null);
					}
					if(1 + disp < totalSelected)
					{
						textField_6.setText(courseInfo.get(1 + disp).getCourse_id());
						textField_7.setText(courseInfo.get(1 + disp).getCourse_name());
						textField_8.setText(courseInfo.get(1 + disp).getCourse_time());
						textField_9.setText(courseInfo.get(1 + disp).getCourse_teacher());
					}
					else
					{
						textField_6.setText(null);
						textField_7.setText(null);
						textField_8.setText(null);
						textField_9.setText(null);
					}
					if(2 + disp < totalSelected)
					{
						textField_10.setText(courseInfo.get(2 + disp).getCourse_id());
						textField_11.setText(courseInfo.get(2 + disp).getCourse_name());
						textField_12.setText(courseInfo.get(2 + disp).getCourse_time());
						textField_13.setText(courseInfo.get(2 + disp).getCourse_teacher());
					}
					else
					{
						textField_10.setText(null);
						textField_11.setText(null);
						textField_12.setText(null);
						textField_13.setText(null);
					}
					if(3 + disp < totalSelected)
					{
						textField_14.setText(courseInfo.get(3 + disp).getCourse_id());
						textField_15.setText(courseInfo.get(3 + disp).getCourse_name());
						textField_16.setText(courseInfo.get(3 + disp).getCourse_time());
						textField_17.setText(courseInfo.get(3 + disp).getCourse_teacher());
					}
					else
					{
						textField_14.setText(null);
						textField_15.setText(null);
						textField_16.setText(null);
						textField_17.setText(null);
					}
				}
			}
		});
		layeredPane.setLayer(button, 1);
		button.setFont(new Font("宋体", Font.BOLD, 18));
		button.setBounds(405, 320, 96, 44);
		layeredPane.add(button);
		
		image1 = new ImageIcon("images/student_course_photo2.jpg");
		lblNewLabel_6 = new JLabel(image1);
		lblNewLabel_6.setBounds(0, 0, 631, 398);
		layeredPane.add(lblNewLabel_6);
	}
}
