package course;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import client.ClientThread;
import message.CourseInfo;
import message.CourseMessage;
import message.Message;

import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Manager_addCoursePage extends JFrame{
	private JTextField textField, textField_1, textField_2, textField_3;
	private JLabel lblNewLabel, label, label_1, label_2, lblNewLabel_1;
	private JButton btnNewButton;
	private JLayeredPane layeredPane;
	private String add_id, add_name, add_time, add_teacher;
	private Message showMess1;
	private CourseMessage courseMess1;
	private ArrayList<CourseInfo> courseList1;
	private int total_course;
	private ImageIcon image1;

	public Manager_addCoursePage(ClientThread cthread) {
		initialize(cthread);
	}

	private void initialize(ClientThread cthread) {
		setBounds(100, 100, 527, 425);
		getContentPane().setLayout(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/windows.jpg"));
		setTitle("添加课程界面");
		setVisible(true);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 509, 388);
		getContentPane().add(layeredPane);
		
		//表头
		lblNewLabel = new JLabel("课程编号：");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 20));
		layeredPane.setLayer(lblNewLabel, 1);
		lblNewLabel.setBounds(51, 10, 104, 40);
		layeredPane.add(lblNewLabel);
		
		label = new JLabel("课程名称：");
		layeredPane.setLayer(label, 1);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.BOLD, 20));
		label.setBounds(51, 74, 104, 40);
		layeredPane.add(label);
		
		label_1 = new JLabel("开课时间：");
		layeredPane.setLayer(label_1, 1);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("宋体", Font.BOLD, 20));
		label_1.setBounds(51, 136, 104, 40);
		layeredPane.add(label_1);
		
		label_2 = new JLabel("任课教师：");
		layeredPane.setLayer(label_2, 1);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("宋体", Font.BOLD, 20));
		label_2.setBounds(51, 198, 104, 40);
		layeredPane.add(label_2);
		
		//表格
		textField = new JTextField();
		textField.setText("课程编号");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("宋体", Font.PLAIN, 20));
		textField.setBackground(Color.WHITE);
		layeredPane.setLayer(textField, 1);
		textField.setBounds(165, 10, 281, 40);
		layeredPane.add(textField);
		textField.setColumns(10);
		textField.setEditable(true);
		textField.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().equals("课程编号"))
					textField.setText("");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		}		
		);
		
		textField_1 = new JTextField();
		layeredPane.setLayer(textField_1, 1);
		textField_1.setText("课程名称");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("宋体", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(165, 74, 281, 40);
		layeredPane.add(textField_1);
		textField_1.setEditable(true);
		textField_1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField_1.getText().equals("课程名称"))
					textField_1.setText("");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
		);
		
		textField_2 = new JTextField();
		layeredPane.setLayer(textField_2, 1);
		textField_2.setText("开课时间");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("宋体", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(165, 136, 281, 40);
		layeredPane.add(textField_2);
		textField_2.setEditable(true);
		textField_2.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField_2.getText().equals("开课时间"))
					textField_2.setText("");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
		);
		
		textField_3 = new JTextField();
		layeredPane.setLayer(textField_3, 1);
		textField_3.setText("任课教师");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("宋体", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(165, 198, 281, 40);
		layeredPane.add(textField_3);
		textField_3.setEditable(true);
		textField_3.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField_3.getText().equals("任课教师"))
					textField_3.setText("");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
		);
		
		btnNewButton = new JButton("确认添加");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add_id = textField.getText();
				add_name = textField_1.getText();
				add_time = textField_2.getText();
				add_teacher = textField_3.getText();
				
				cthread.handleAddCourseMessage(add_id, add_name, add_teacher, add_time);
				cthread.getREMessage();
				
				cthread.handleShowCourseMessage();
				showMess1 = cthread.getREMessage();
				courseMess1 = (CourseMessage)showMess1.getData();
				courseList1 = courseMess1.getCourse();
				total_course = courseList1.size();
				
				JOptionPane.showMessageDialog(new JFrame().getContentPane(), "添加成功!","登陆提示页面", JOptionPane.INFORMATION_MESSAGE);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 22));
		layeredPane.setLayer(btnNewButton, 1);
		btnNewButton.setBounds(170, 263, 134, 60);
		layeredPane.add(btnNewButton);
		
		image1 = new ImageIcon("images/manager_course_photo1.jpg");
		lblNewLabel_1 = new JLabel(image1);
		lblNewLabel_1.setBounds(0, 0, 509, 388);
		layeredPane.add(lblNewLabel_1);
		
	}
}
