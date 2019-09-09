package book;

import client.ClientThread;
import message.BookInfo;
import message.BookMessage;
import message.Message;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BookInf extends JPanel {

//	public static void main(String[] args) {
//		new BookInf();
//	}

	JButton nextpage=new JButton("下一页");
	JButton previouspage=new JButton("上一页");
	JLabel changeto=new JLabel("跳转至");
	JLabel page=new JLabel("页");
	JButton confirm=new JButton("确认");
	JTextField pageinput= new JTextField();

	String[][] bookData = new String[30][7];
	String[] columnNames = {"图书编号","图书名称","作者","出版社","简介","总数量","可借本数"};
	String[] columnnames={"预约借阅"};
	String[][] nullData = new String[1][1];
	
	JTable BOOKINF = new JTable(bookData, columnNames);
	JTable ORDER = new JTable(nullData, columnnames);
	JScrollPane INFBOOK=new JScrollPane(BOOKINF);
	JScrollPane order=new JScrollPane(ORDER);

	ArrayList<JButton> subscribe=new ArrayList();
	int pagenumber=0;
	int maxpage=0;
	JLabel currentpage=new JLabel(); 
	ArrayList<String[][]> ALLData=new ArrayList();
	
	public BookInf(ClientThread cthread){
		this.setLayout(null);
		this.setSize(900, 700);
		BOOKINF.setEnabled(false);
		nullData[0][0]=null;
		String[][] testData=new String[30][7];
//		String[][] testData2=new String[30][7];
//		for(int i=0;i<=29;i++) {for(int j=0;j<=4;j++) testData1[i][j]="1";for(int j=4;j<=6;j++) testData1[i][j]="5";}
//		ALLData.add(testData1);
//		maxpage++;
//		for(int i=0;i<=29;i++) for(int j=0;j<=6;j++) testData2[i][j]="0";
//		ALLData.add(testData2);
//		maxpage++;

		cthread.handleShowBookMessage();
		Message message = cthread.getREMessage();
		BookMessage boobmessage = (BookMessage)message.getData();

		int num=boobmessage.getbook().size();
		int pages=num/30;
		ArrayList<BookInfo> booklist = boobmessage.getbook();
		while (pages-->=0) {
			for (int i = 0; num >= 0 && i <= 29; num--, i++) {
				testData[i][0] = booklist.get(i).getBook_id();
				testData[i][1] = booklist.get(i).getBook_name();
				testData[i][2] = booklist.get(i).getBook_author();
				testData[i][3] = booklist.get(i).getBook_press();
				testData[i][4] = booklist.get(i).getBook_introduction();
				Integer total = booklist.get(i).getBook_total();
				testData[i][5] = total.toString();
				Integer borrowed = booklist.get(i).getBook_borrowed();
				testData[i][6] = borrowed.toString();
			}
		}
		ALLData.add(testData);
		//ALLData.add(testData2);

		for(int i=0;i<=29;i++) for(int j=0;j<=6;j++) bookData[i][j]=ALLData.get(0)[i][j];
		currentpage.setText(pagenumber+1+"/"+maxpage+"页");


		INFBOOK.setBounds(0,0,800,503);
		order.setBounds(797,0,106,22);
		previouspage.setBounds(279,510,80,20);
		nextpage.setBounds(369,510,80,20);
		page.setBounds(534,510,80,20);
		pageinput.setBounds(499,511,32,20);
		changeto.setBounds(459,510,80,20);
		confirm.setBounds(554,510,60,20);
		currentpage.setBounds(799,510,60,20);
		this.add(currentpage);
		this.add(INFBOOK);
		//this.add(order);
		this.add(nextpage);
		this.add(previouspage);
		this.add(page);
		this.add(pageinput);
		this.add(changeto);
		this.add(confirm);
		this.setVisible(false);
		this.setVisible(true);
//
//		for( int i=0;i<=29;i++)
//		{
//			if(bookData[i][6]!="0"){
//				JButton temp = new JButton("预约借阅");
//				subscribe.add(temp);
//				subscribe.get(i).setBounds(800, 22+16*i, 100,15);
//				this.add(subscribe.get(i));
//				subscribe.get(i).setVisible(false);
//				subscribe.get(i).setVisible(true);
//				subscribe.get(i).setBorderPainted(false);
//				returnNumber(i);
//				final int j=returnNumber(i);
//				subscribe.get(i).addActionListener(new java.awt.event.ActionListener() {
//
//					public void actionPerformed(java.awt.event.ActionEvent e) {
//						if(bookData[j][6]!="0"){
//
//							JOptionPane.showMessageDialog(null, "预约成功", "提示信息",JOptionPane.CLOSED_OPTION);
//							INFBOOK.setVisible(false); INFBOOK.setVisible(true);
//							int temp=Integer.parseInt(bookData[j][6]);
//							temp=temp-1;
//							if( temp==0) {subscribe.get(j).setText("不可借");	subscribe.get(j).setEnabled(false);}
//							bookData[j][6]=String.valueOf(temp);
//							ALLData.get(pagenumber)[j][6]=bookData[j][6];
//
//						}
//
//					}
//
//				});
//
//			}
//
//
//
//			else{
//				JButton temp = new JButton("不可借");
//				subscribe.add(temp);
//				subscribe.get(i).setBounds(800, 22+16*i, 90,15);
//				this.add(subscribe.get(i));
//				subscribe.get(i).setVisible(false);
//				subscribe.get(i).setVisible(true);
//				subscribe.get(i).setBorder(null);
//				subscribe.get(i).setEnabled(false);
//			}
//
//
//		}



		nextpage.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
				pageplus();

			}
		});
		previouspage.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				pageminus();

	
			}
		});
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pageto();

	
			}
		});


	}

	int returnNumber(int i){
		return i;
		
	}
	
	public	void pageplus(){
		if(pagenumber<maxpage-1)
		{
			pagenumber++;
		

			for(int i=0;i<=29;i++) for(int j=0;j<7;j++) bookData[i][j]=ALLData.get(pagenumber)[i][j];
			BOOKINF.setVisible(false);BOOKINF.setVisible(true);
			ORDER.setVisible(false);ORDER.setVisible(true);
			currentpage.setText(pagenumber+1+"/"+maxpage+"页");
			subscribeto();



//			currentpage.setVisible(false);currentpage.setVisible(true);
		}
	}
	public	void pageminus(){
		if(pagenumber>0){
			pagenumber--;
			for(int i=0;i<=29;i++) for(int j=0;j<7;j++) bookData[i][j]=ALLData.get(pagenumber)[i][j];
			BOOKINF.setVisible(false);BOOKINF.setVisible(true);
			currentpage.setText(pagenumber+1+"/"+maxpage+"页");
			subscribeto();
		}
	}
	
	public	void pageto(){
		pagenumber=Integer.parseInt(pageinput.getText())-1;
		if(pagenumber>=0&&pagenumber<maxpage)
		{
			for(int i=0;i<=29;i++) for(int j=0;j<7;j++) bookData[i][j]=ALLData.get(pagenumber)[i][j];
			BOOKINF.setVisible(false);BOOKINF.setVisible(true);
			currentpage.setText(pagenumber+1+"/"+maxpage+"页");
			subscribeto();
		}

	}

	public void subscribeto(){
	return;}
}
//		for( int i=0;i<=29;i++)
//		{
//			if(bookData[i][6]!="0"){
//				JButton temp = new JButton("预约借阅");
//				subscribe.add(temp);
//				subscribe.get(i+pagenumber*30-30).setBounds(800, 22+16*i, 100,15);
//				this.add(subscribe.get(i));
//				subscribe.get(i+pagenumber*30-30).setVisible(false);
//				subscribe.get(i+pagenumber*30-30).setVisible(true);
//				subscribe.get(i+pagenumber*30-30).setBorderPainted(false);
//				returnNumber(i);
//				final int j=returnNumber(i);
//				subscribe.get(i+pagenumber*30-30).addActionListener(new java.awt.event.ActionListener() {
//
//					public void actionPerformed(java.awt.event.ActionEvent e) {
//						if(bookData[j][6]!="0"){
//
//							JOptionPane.showMessageDialog(null, "预约成功", "提示信息",JOptionPane.CLOSED_OPTION);
//							INFBOOK.setVisible(false); INFBOOK.setVisible(true);
//							int temp=Integer.parseInt(bookData[j][6]);
//							temp=temp-1;
//							if( temp==0) {subscribe.get(j).setText("不可借");	subscribe.get(j).setEnabled(false);}
//							bookData[j][6]=String.valueOf(temp);
//							ALLData.get(pagenumber)[j][6]=bookData[j][6];
//
//						}
//
//					}
//
//				});
//
//			}
//
//
//
//			else{
//				JButton temp = new JButton("不可借");
//				subscribe.add(temp);
//				subscribe.get(i+pagenumber*30-30).setBounds(800, 22+16*i, 90,15);
//				this.add(subscribe.get(i));
//				subscribe.get(i+pagenumber*30-30).setVisible(false);
//				subscribe.get(i+pagenumber*30-30).setVisible(true);
//				subscribe.get(i+pagenumber*30-30).setBorder(null);
//				subscribe.get(i+pagenumber*30-30).setEnabled(false);
//			}
//
//
//		}
//
//



