package book;

import javax.swing.JPanel;
import javax.swing.*;
//import Message.BorrowMessage;  
import java.awt.*;
import java.util.*;
import java.lang.*;

public class PersonPanel extends JPanel{
	JButton nextpage=new JButton("下一页");
	JButton previouspage=new JButton("上一页");
	//	JButton back=new JButton("返回主选单");
	JLabel changeto=new JLabel("跳转至");
	JLabel page=new JLabel("页");
	JButton confirm=new JButton("确定");
	JTextField pageinput= new JTextField();
	String[][] personalData;
	String[] columnnames={"图书编号","图书名称","作者","出版社","借书时间","还书期限","还书时间"};
	public SuperTable table;
	public JScrollPane jsp;

	JLabel currentpage=new JLabel();
	ArrayList<String[][]> ALLData=new ArrayList();

	public PersonPanel(){
		this.setLayout(null);
		this.setSize(900, 700);


		//
	}

	void showPersonalBorrowPanle(/*ArrayList<BorrowMessage>*/String[] temp){
		table =new SuperTable(7,temp);
		table.setTableHeadHeight(23);
		table.setCellSize(129, 45);

		table.setTextTableHead(columnnames);
		personalData=new String[temp.length][8];
		for(int i=0;i<temp.length;i++)for(int j=0;j<7;j++)personalData[i][j]="1";

		table.setPreferredSize(new Dimension(900, table.getHeight()+45));
		jsp=new JScrollPane(table);
		//jsp初始化
		jsp.setBounds(0,0,1000,600);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jsp.setBackground(Color.white);
		this.add(jsp);
		this.setVisible(false);
		this.setVisible(true);

	}


}

