package book;

import client.*;
import message.*;
import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel{
	public static void main(String[] args) {
		new HomePanel();
	}

	private JLayeredPane layeredPane;
	JLabel welcome=new JLabel("欢迎进入图书馆系统！");
	JLabel select= new JLabel("请选择上方功能。");
	JButton add_Button=new JButton("添加书籍");
	JButton show_Button=new JButton("展示书籍");
	JButton Program_Button=new JButton("书籍管理");

	JLabel home;
	int admin=1;
	ImageIcon imp;
	AddBook add_frame;
	BookInf show_frame;
	LibAdmin Program_frame;
	ClientThread mcthread;

	public HomePanel(/*ClientThread cthread*/){
		//mcthread = cthread;


		this.setBackground(new Color(240, 248, 255));
		setBounds(100, 100, 1124, 717);
		this.setLayout(null);

		imp=new ImageIcon("images/bk1.png");

		welcome.setBounds(300,0,600,300);
		welcome.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,40));
		select.setBounds(250,318,750,300);
		select.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,40));

		add_Button.setBorderPainted(false);
		add_Button.setBackground(new Color(240, 248, 255));
		welcome.setBackground(new Color(240, 248, 255));
		select.setBackground(new Color(240, 248, 255));
		show_Button.setBorderPainted(false);
		show_Button.setBackground(new Color(240, 248, 255));
		Program_Button.setBorderPainted(false);
		Program_Button.setBackground(new Color(240, 248, 255));


		home = new JLabel(imp);
		home.setBounds(0, 0, 1110, 680);

		welcome.setEnabled(true);
		select.setEnabled(true);

	//	getContentPane().
		this.add(home);
		this.add(welcome);
		this.add(select);


		this.setVisible(false);
		this.setVisible(true);

	}

}


