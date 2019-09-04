package student;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import client.*;
import message.*;



public class StuStudentsPage extends JFrame{

	private JLabel lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3;
	private JLayeredPane layeredPane;
	private ImageIcon image1, image2;
	private JTextField textField, textField_1, textField_2, textField_3, textField_4, textField_5, textField_6, textField_7, textField_8, textField_9, textField_10, 
	textField_11, textField_12, textField_13, textField_14, textField_15, textField_16, textField_17, textField_18, textField_19, textField_20, textField_21, 
	textField_22, textField_23, textField_24, textField_25, textField_28, textField_29, textField_30, textField_31, textField_36, textField_37;
	private JLabel label, label_1, label_2, label_3, label_4, label_6, label_8, label_9, label_14, label_15, label_18;
	private String name, sex, birthday, shengyuandi, id, onecardid, college, phone, cardtype, cardid, ins;
	private JButton btnNewButton, button, button_1;
	private JTextArea textArea;
	private boolean isAdd = false;

	
	public StuStudentsPage(ClientThread cthread) throws IOException {
		initialize(cthread);
	}


	private void initialize(ClientThread cthread) {
		InitializeText(cthread);
		
		getContentPane().setBackground(new Color(224, 255, 255));
		setBounds(100, 100, 1124, 717);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("\u4E2A\u4EBA\u57FA\u672C\u4FE1\u606F\u7EF4\u62A4");
		lblNewLabel.setFont(new Font("华文楷体", Font.BOLD, 29));
		lblNewLabel.setBounds(408, 25, 356, 29);
		getContentPane().add(lblNewLabel);
		
		image1 = new ImageIcon("images/bk1.png");
		lblNewLabel_1 = new JLabel(image1);
		lblNewLabel_1.setBounds(0, 0, 1110, 680);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(224, 255, 255));
		layeredPane.setBounds(0, 0, 1110, 680);
		layeredPane.add(lblNewLabel_1, JLayeredPane.DEFAULT_LAYER);
		getContentPane().add(layeredPane);
		
		lblNewLabel_2 = new JLabel("\u60A8\u7684\u7167\u7247");
		lblNewLabel_2.setFont(new Font("华文中宋", Font.PLAIN, 19));
		layeredPane.setLayer(lblNewLabel_2, 2);
		lblNewLabel_2.setBounds(84, 322, 82, 38);
		layeredPane.add(lblNewLabel_2);
		
		image2 = new ImageIcon("images/head.jpg");
		lblNewLabel_3 = new JLabel(image2);
		layeredPane.setLayer(lblNewLabel_3, 2);
		lblNewLabel_3.setBounds(45, 104, 162, 213);
		layeredPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		layeredPane.setLayer(textField, 1);
		textField.setBackground(new Color(240, 248, 255));
		textField.setEditable(false);
		textField.setBounds(240, 104, 206, 45);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		layeredPane.setLayer(textField_1, 1);
		textField_1.setBackground(new Color(240, 248, 255));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(240, 191, 206, 45);
		layeredPane.add(textField_1);
		
		textField_2 = new JTextField();
		layeredPane.setLayer(textField_2, 1);
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(445, 104, 206, 45);
		layeredPane.add(textField_2);
		
		textField_3 = new JTextField();
		layeredPane.setLayer(textField_3, 1);
		textField_3.setBackground(new Color(255, 255, 255));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(855, 104, 206, 45);
		layeredPane.add(textField_3);
		
		textField_4 = new JTextField();
		layeredPane.setLayer(textField_4, 1);
		textField_4.setBackground(new Color(255, 255, 255));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(445, 191, 206, 45);
		layeredPane.add(textField_4);
		
		textField_5 = new JTextField();
		layeredPane.setLayer(textField_5, 1);
		textField_5.setBackground(new Color(240, 248, 255));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(650, 104, 206, 45);
		layeredPane.add(textField_5);
		
		textField_6 = new JTextField();
		layeredPane.setLayer(textField_6, 1);
		textField_6.setBackground(new Color(240, 248, 255));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(650, 191, 206, 45);
		layeredPane.add(textField_6);
		
		textField_7 = new JTextField();
		layeredPane.setLayer(textField_7, 1);
		textField_7.setBackground(new Color(255, 255, 255));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(855, 191, 206, 45);
		layeredPane.add(textField_7);
		
		textField_8 = new JTextField();
		layeredPane.setLayer(textField_8, 1);
		textField_8.setBackground(new Color(240, 248, 255));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(240, 235, 206, 45);
		layeredPane.add(textField_8);
		
		textField_9 = new JTextField();
		layeredPane.setLayer(textField_9, 1);
		textField_9.setBackground(new Color(255, 255, 255));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(445, 235, 616, 45);
		layeredPane.add(textField_9);
		
		textField_12 = new JTextField();
		layeredPane.setLayer(textField_12, 1);
		textField_12.setBackground(new Color(240, 248, 255));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(240, 279, 206, 45);
		layeredPane.add(textField_12);
		
		textField_14 = new JTextField();
		layeredPane.setLayer(textField_14, 1);
		textField_14.setBackground(new Color(255, 255, 255));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(445, 279, 616, 45);
		layeredPane.add(textField_14);
		
		textField_16 = new JTextField();
		layeredPane.setLayer(textField_16, 1);
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBackground(new Color(240, 248, 255));
		textField_16.setBounds(240, 323, 206, 45);
		layeredPane.add(textField_16);
		
		textField_17 = new JTextField();
		layeredPane.setLayer(textField_17, 1);
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBackground(new Color(240, 248, 255));
		textField_17.setBounds(650, 323, 206, 45);
		layeredPane.add(textField_17);
		
		textField_18 = new JTextField();
		layeredPane.setLayer(textField_18, 1);
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBackground(Color.WHITE);
		textField_18.setBounds(855, 323, 206, 45);
		layeredPane.add(textField_18);
		
		textField_19 = new JTextField();
		layeredPane.setLayer(textField_19, 1);
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBackground(Color.WHITE);
		textField_19.setBounds(445, 323, 206, 45);
		layeredPane.add(textField_19);
		
		textField_28 = new JTextField();
		layeredPane.setLayer(textField_28, 1);
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		textField_28.setBackground(new Color(240, 248, 255));
		textField_28.setBounds(240, 148, 206, 45);
		layeredPane.add(textField_28);
		
		textField_29 = new JTextField();
		layeredPane.setLayer(textField_29, 1);
		textField_29.setEditable(false);
		textField_29.setColumns(10);
		textField_29.setBackground(Color.WHITE);
		textField_29.setBounds(445, 148, 206, 45);
		layeredPane.add(textField_29);
		
		textField_30 = new JTextField();
		layeredPane.setLayer(textField_30, 1);
		textField_30.setEditable(false);
		textField_30.setColumns(10);
		textField_30.setBackground(new Color(240, 248, 255));
		textField_30.setBounds(650, 148, 206, 45);
		layeredPane.add(textField_30);
		
		textField_31 = new JTextField();
		layeredPane.setLayer(textField_31, 1);
		textField_31.setEditable(false);
		textField_31.setColumns(10);
		textField_31.setBackground(Color.WHITE);
		textField_31.setBounds(855, 148, 206, 45);
		layeredPane.add(textField_31);
		
		textField_36 = new JTextField();
		layeredPane.setLayer(textField_36, 1);
		textField_36.setEditable(false);
		textField_36.setColumns(10);
		textField_36.setBackground(Color.WHITE);
		textField_36.setBounds(445, 367, 616, 132);
		layeredPane.add(textField_36);
		
		textField_37 = new JTextField();
		layeredPane.setLayer(textField_37, 1);
		textField_37.setEditable(false);
		textField_37.setColumns(10);
		textField_37.setBackground(new Color(240, 248, 255));
		textField_37.setBounds(240, 367, 206, 132);
		layeredPane.add(textField_37);
		
		textField_10 = new JTextField();
		textField_10.setText(name);
		textField_10.setFont(new Font("华文仿宋", Font.PLAIN, 18));
		textField_10.setBorder(null);
		textField_10.setBackground(Color.WHITE);
		textField_10.setEditable(false);
		layeredPane.setLayer(textField_10, 4);
		textField_10.setBounds(455, 110, 181, 33);
		layeredPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setText(sex);
		textField_11.setFont(new Font("华文仿宋", Font.PLAIN, 18));
		layeredPane.setLayer(textField_11, 4);
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBorder(null);
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(869, 110, 181, 33);
		layeredPane.add(textField_11);
		
		textField_13 = new JTextField();
		textField_13.setText(birthday);
		textField_13.setFont(new Font("华文仿宋", Font.PLAIN, 18));
		layeredPane.setLayer(textField_13, 4);
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBorder(null);
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(455, 154, 181, 33);
		layeredPane.add(textField_13);
		
		textField_15 = new JTextField();
		textField_15.setText(cardid);
		textField_15.setFont(new Font("华文仿宋", Font.PLAIN, 18));
		layeredPane.setLayer(textField_15, 4);
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBorder(null);
		textField_15.setBackground(Color.WHITE);
		textField_15.setBounds(866, 197, 181, 33);
		layeredPane.add(textField_15);
		
		textField_20 = new JTextField();
		textField_20.setText(id);
		textField_20.setFont(new Font("华文仿宋", Font.PLAIN, 18));
		layeredPane.setLayer(textField_20, 4);
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBorder(null);
		textField_20.setBackground(Color.WHITE);
		textField_20.setBounds(456, 197, 181, 33);
		layeredPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setText(shengyuandi);
		textField_21.setFont(new Font("华文仿宋", Font.PLAIN, 18));
		layeredPane.setLayer(textField_21, 4);
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBorder(null);
		textField_21.setBackground(Color.WHITE);
		textField_21.setBounds(865, 154, 181, 33);
		layeredPane.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setText(college);
		textField_22.setFont(new Font("华文仿宋", Font.PLAIN, 18));
		layeredPane.setLayer(textField_22, 4);
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBorder(null);
		textField_22.setBackground(Color.WHITE);
		textField_22.setBounds(455, 241, 595, 33);
		layeredPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setText(phone);
		textField_23.setFont(new Font("华文仿宋", Font.PLAIN, 18));
		layeredPane.setLayer(textField_23, 4);
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBorder(null);
		textField_23.setBackground(Color.WHITE);
		textField_23.setBounds(455, 284, 595, 33);
		layeredPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setText(cardtype);
		textField_24.setFont(new Font("华文仿宋", Font.PLAIN, 18));
		layeredPane.setLayer(textField_24, 4);
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBorder(null);
		textField_24.setBackground(Color.WHITE);
		textField_24.setBounds(455, 328, 181, 33);
		layeredPane.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setText(cardid);
		textField_25.setFont(new Font("华文仿宋", Font.PLAIN, 18));
		layeredPane.setLayer(textField_25, 4);
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBorder(null);
		textField_25.setBackground(Color.WHITE);
		textField_25.setBounds(869, 328, 181, 33);
		layeredPane.add(textField_25);
		
		btnNewButton = new JButton("\u4FEE\u6539");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OnBeClickedEdit();
			}
		});
		
		label = new JLabel("\u59D3\u540D\uFF1A");
		layeredPane.setLayer(label, 4);
		label.setFont(new Font("华文仿宋", Font.PLAIN, 19));
		label.setBounds(250, 107, 82, 33);
		layeredPane.add(label);
		
		label_1 = new JLabel("\u5B66\u53F7\uFF1A");
		layeredPane.setLayer(label_1, 4);
		label_1.setFont(new Font("华文仿宋", Font.PLAIN, 19));
		label_1.setBounds(250, 194, 82, 33);
		layeredPane.add(label_1);
		
		label_2 = new JLabel("\u6027\u522B\uFF1A");
		layeredPane.setLayer(label_2, 4);
		label_2.setFont(new Font("华文仿宋", Font.PLAIN, 19));
		label_2.setBounds(661, 107, 82, 33);
		layeredPane.add(label_2);
		
		label_3 = new JLabel("\u4E00\u5361\u901A\u53F7\uFF1A");
		layeredPane.setLayer(label_3, 4);
		label_3.setFont(new Font("华文仿宋", Font.PLAIN, 19));
		label_3.setBounds(660, 194, 103, 33);
		layeredPane.add(label_3);
		
		label_4 = new JLabel("\u6240\u5728\u9662\u7CFB\uFF1A");
		layeredPane.setLayer(label_4, 4);
		label_4.setFont(new Font("华文仿宋", Font.PLAIN, 19));
		label_4.setBounds(250, 238, 96, 33);
		layeredPane.add(label_4);
		
		label_6 = new JLabel("\u8054\u7CFB\u7535\u8BDD\uFF1A");
		layeredPane.setLayer(label_6, 4);
		label_6.setFont(new Font("华文仿宋", Font.PLAIN, 19));
		label_6.setBounds(250, 282, 115, 33);
		layeredPane.add(label_6);
		
		label_8 = new JLabel("\u8BC1\u4EF6\u7C7B\u578B\uFF1A");
		layeredPane.setLayer(label_8, 4);
		label_8.setFont(new Font("华文仿宋", Font.PLAIN, 19));
		label_8.setBounds(250, 326, 103, 33);
		layeredPane.add(label_8);
		
		label_9 = new JLabel("\u8BC1\u4EF6\u53F7\u7801\uFF1A");
		layeredPane.setLayer(label_9, 4);
		label_9.setFont(new Font("华文仿宋", Font.PLAIN, 19));
		label_9.setBounds(660, 326, 103, 33);
		layeredPane.add(label_9);
		
		label_14 = new JLabel("\u51FA\u751F\u65E5\u671F\uFF1A");
		layeredPane.setLayer(label_14, 4);
		label_14.setFont(new Font("华文仿宋", Font.PLAIN, 19));
		label_14.setBounds(250, 151, 96, 33);
		layeredPane.add(label_14);
		
		label_15 = new JLabel("\u751F\u6E90\u5730\uFF1A");
		layeredPane.setLayer(label_15, 4);
		label_15.setFont(new Font("华文仿宋", Font.PLAIN, 19));
		label_15.setBounds(660, 151, 96, 33);
		layeredPane.add(label_15);
		
		label_18 = new JLabel("\u4E2A\u4EBA\u7B80\u4ECB\uFF1A");
		layeredPane.setLayer(label_18, 4);
		label_18.setFont(new Font("华文仿宋", Font.PLAIN, 19));
		label_18.setBounds(250, 413, 103, 33);
		layeredPane.add(label_18);
		btnNewButton.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setFont(new Font("华文中宋", Font.PLAIN, 22));
		layeredPane.setLayer(btnNewButton, 2);
		btnNewButton.setBounds(392, 556, 108, 38);
		layeredPane.add(btnNewButton);
		
		button = new JButton("\u786E\u5B9A");
		button.setBackground(SystemColor.inactiveCaptionBorder);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OnBeClickedConfirm(cthread);
			}
		});
		button.setEnabled(false);
		layeredPane.setLayer(button, 2);
		button.setFont(new Font("华文中宋", Font.PLAIN, 22));
		button.setBounds(802, 556, 108, 38);
		layeredPane.add(button);
		
		button_1 = new JButton("\u8FD8\u539F");
		button_1.setBackground(SystemColor.inactiveCaptionBorder);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OnBeClickedRenew();
			}
		});
		button_1.setEnabled(false);
		layeredPane.setLayer(button_1, 2);
		button_1.setFont(new Font("华文中宋", Font.PLAIN, 22));
		button_1.setBounds(595, 556, 108, 38);
		layeredPane.add(button_1);
		
		textArea = new JTextArea(ins, 583, 110);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textArea.setFont(new Font("华文仿宋", Font.PLAIN, 18));
		layeredPane.setLayer(textArea, 4);
		textArea.setBounds(455, 378, 583, 110);
		layeredPane.add(textArea);	
	}
	
	
	private void OnBeClickedEdit() {
		textField_10.setEditable(true);
		textField_11.setEditable(true);
		textField_13.setEditable(true);
		textField_15.setEditable(true);
		textField_20.setEditable(true);
		textField_21.setEditable(true);
		textField_22.setEditable(true);
		textField_23.setEditable(true);
		textField_24.setEditable(true);
		textField_25.setEditable(true);
		textArea.setEditable(true);
	
		
		button.setEnabled(true);
		button_1.setEnabled(true);
	}
	
	
	private void OnBeClickedConfirm(ClientThread cthread) {
		name = textField_10.getText();
		sex = textField_11.getText();
		birthday = textField_13.getText();
		shengyuandi = textField_21.getText();
		id = textField_20.getText();
		onecardid = textField_15.getText();
		college = textField_22.getText();
		phone = textField_23.getText();
		cardtype = textField_24.getText();
		cardid = textField_25.getText();
		ins = textArea.getText();
//		System.out.print(name+'\n'+sex+'\n'+birthday+'\n'+shengyuandi+'\n'+id+'\n'+onecardid+'\n'+college+'\n'+phone+'\n'+cardtype+'\n'+cardid+'\n'+ins+'\n');
		
		if(isAdd)
			cthread.handleAddStudentMessage(id, name, college, onecardid, cardtype, cardid, sex, shengyuandi, phone, ins, birthday);
		else
			cthread.handleUpdateStudentMessage(id, name, college, onecardid, cardtype, cardid, sex, shengyuandi, phone, ins, birthday);
		
		if(cthread.getREMessage().getResponse())
		{
			JOptionPane.showMessageDialog(new JFrame().getContentPane(), "修改成功！","提示页面", JOptionPane.INFORMATION_MESSAGE);
			textField_10.setEditable(false);
			textField_11.setEditable(false);
			textField_13.setEditable(false);
			textField_15.setEditable(false);
			textField_20.setEditable(false);
			textField_21.setEditable(false);
			textField_22.setEditable(false);
			textField_23.setEditable(false);
			textField_24.setEditable(false);
			textField_25.setEditable(false);
			textArea.setEditable(false);
			
			button.setEnabled(false);
			button_1.setEnabled(false);
		}
		else
			JOptionPane.showMessageDialog(new JFrame().getContentPane(), "修改失败！","提示页面", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	private void OnBeClickedRenew() {
		textField_10.setText(name);
		textField_11.setText(sex);
		textField_13.setText(birthday);
		textField_21.setText(shengyuandi);
		textField_20.setText(id);
		textField_15.setText(onecardid);
		textField_22.setText(college);
		textField_23.setText(phone);
		textField_24.setText(cardtype);
		textField_25.setText(cardid);
		textArea.setText(ins);
	}
	
	
	private void InitializeText(ClientThread cthread) {
		cthread.handleShowStudentMessage();
		StudentMessage smessage = (StudentMessage)cthread.getREMessage().getData();
		ArrayList<Studentinfo> studentinfo = smessage.getStudent();
		
		if(studentinfo.isEmpty()) {
			JOptionPane.showMessageDialog(new JFrame().getContentPane(), "该用户没有学籍信息，请手动添加。","提示页面", JOptionPane.INFORMATION_MESSAGE);
			isAdd = true;
		}
		else {
			isAdd = false;
			
			Studentinfo sinfo = studentinfo.get(0);
			id =sinfo.getStudent_id();
			name = sinfo.getStudent_name();
			college = sinfo.getStudent_college();
			onecardid = sinfo.getStudent_onecardid();
			cardtype = sinfo.getStudent_card_type();
			cardid = sinfo.getStudent_card_id();
			sex = sinfo.getStudent_sex();
			shengyuandi = sinfo.getStudent_shengyuandi();
			phone = sinfo.getStudent_phone();
			ins = sinfo.getStudent_ins();
			birthday = sinfo.getStudent_birthday();
		}
	}
}
