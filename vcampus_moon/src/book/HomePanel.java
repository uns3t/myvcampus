package book;

import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.lang.*;

public class HomePanel extends JPanel{
	JLabel welcome=new JLabel("欢迎进入图书馆系统！");
	JLabel select= new JLabel("请选择上方功能。");
	JButton add_Button=new JButton();
	int admin=1;
	ImageIcon imp=new ImageIcon("images/add_book_bt.png");
	AddBook add_frame;
	Client mClient

	public HomePanel(){
		mClient = client;

		this.setLayout(null);
		//this.setTitle("首页");
		this.setSize(900, 667);
		add_Button.setBounds(275, 331, 300, 50);
		welcome.setBounds(244,0,600,300);
		welcome.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,40));
		select.setBounds(295,318,750,300);
		select.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,40));
		add_Button.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,20));
		add_Button.setBorderPainted(false);
		add_Button.setBackground(Color.white);
		add_Button.setIcon(imp);
		welcome.setEnabled(true);


		this.add(welcome);
		this.add(select);

		if(admin==1)
			this.add(add_Button);

		add_Button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {

				add_frame=new AddBook();
				add_frame.confirm.addActionListener(new java.awt.event.ActionListener() {


					public void actionPerformed(java.awt.event.ActionEvent e) {

						mClient.sendBookupdate(new Message("Bookupdate",0,new BookMessage(add_frame.BOOKNUMBER.getText(), "", add_frame.BOOKNAME.getText(), add_frame.location_input.getText(), add_frame.author_input.getText(), add_frame.press_input.getText(), 0, 0, 0, 0, 0, "")));

					}
				});

			}

		});

	}

}


