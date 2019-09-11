package book;

import client.ClientThread;
import message.BookInfo;
import message.BookMessage;
import message.Message;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BookInf extends JPanel {


	private JLayeredPane layeredPane;
	JButton nextpage=new JButton("下一页");
	JButton previouspage=new JButton("上一页");
	JLabel changeto=new JLabel("跳转至");
	JLabel page=new JLabel("页");
	JLabel bookInf  ;
	ImageIcon bookmp;
	JButton confirm=new JButton("确认");
	JTextField pageinput= new JTextField();

	String[][] bookData = new String[30][8];
	String[] columnNames = {"书籍号","图书编号","图书名称","作者","出版社","简介","总数量","可借本数"};



	JTable BOOKINF = new JTable(bookData, columnNames);

	JScrollPane INFBOOK=new JScrollPane(BOOKINF);

	ArrayList<JButton> subscribe=new ArrayList();
	int pagenumber=0;
	int maxpage=0;
	JLabel currentpage=new JLabel();
	ArrayList<String[][]> ALLData=new ArrayList();

	public BookInf(ClientThread cthread){

		bookmp=new ImageIcon("./images/bk1.png");

		layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(224, 255, 255));
		layeredPane.setBounds(0, 0, 1110, 680);

		this.add(layeredPane);
		this.setLayout(null);
		this.setSize(900, 700);
		BOOKINF.setEnabled(false);

		String[][] testData1=new String[30][8];
		String[][] testData2=new String[30][8];


		cthread.handleShowBookMessage();
		Message message = cthread.getREMessage();
		BookMessage boobmessage = (BookMessage)message.getData();

		int num=boobmessage.getbook().size();
		 System.out.println(num);
		int pages=num/30;
		System.out.println(pages);
		maxpage=pages+1;

		ArrayList<BookInfo> booklist = boobmessage.getbook();
		int j=0;
//		while (pages>=0) {
//			pages--;
//			j=0;
			for (int i = 0;  i <= 29; num--, i++) {

					Integer a=i+j*30;
					testData1[i][0] =a.toString();
					testData1[i][1] = booklist.get(i+j*30).getBook_id();
					testData1[i][2] = booklist.get(i+j*30).getBook_name();
					testData1[i][3] = booklist.get(i+j*30).getBook_author();
					testData1[i][4] = booklist.get(i+j*30).getBook_press();
					testData1[i][5] = booklist.get(i+j*30).getBook_introduction();
					Integer total = booklist.get(i+j*30).getBook_total();
					testData1[i][6] = total.toString();
					Integer borrowed = booklist.get(i+j*30).getBook_borrowed();
					testData1[i][7] = borrowed.toString();

			}
			j++;
			for (int i = 0;  i <= 29; num--, i++) {
				if(num<=0)
				{
					Integer a=i+j*30;
					testData2[i][0] =a.toString();
					testData2[i][1] = "0";
					testData2[i][2] = "0";
					testData2[i][3] ="0";
					testData2[i][4] = "0";
					testData2[i][5] = "0";
					//Integer total = "0";
					testData2[i][6] = "0";
					//Integer borrowed = booklist.get(i+j*30).getBook_borrowed();
					testData2[i][7] ="0";;
				}
				else
				{
					Integer a=i+j*30;
					testData2[i][0] =a.toString();
					testData2[i][1] = booklist.get(i+j*30).getBook_id();
					testData2[i][2] = booklist.get(i+j*30).getBook_name();
					testData2[i][3] = booklist.get(i+j*30).getBook_author();
					testData2[i][4] = booklist.get(i+j*30).getBook_press();
					testData2[i][5] = booklist.get(i+j*30).getBook_introduction();
					Integer total = booklist.get(i+j*30).getBook_total();
					testData2[i][6] = total.toString();
					Integer borrowed = booklist.get(i+j*30).getBook_borrowed();
					testData2[i][7] = borrowed.toString();
				}

			ALLData.add(testData1);
			ALLData.add(testData2);
		}



		for(int i=0;i<=29;i++) for(j=0;j<=7;j++) bookData[i][j]=ALLData.get(0)[i][j];

		currentpage.setText(pagenumber+1+"/"+maxpage+"页");


		INFBOOK.setBounds(26,47,827,218);
		//order.setBounds(797,0,106,22);
		previouspage.setBounds(279,280,80,20);
		nextpage.setBounds(369,280,80,20);
		page.setBounds(534,280,80,20);
		pageinput.setBounds(499,280,32,20);
		changeto.setBounds(459,280,80,20);
		confirm.setBounds(554,280,60,20);
		currentpage.setBounds(799,280,60,20);
		layeredPane.add(currentpage);
		layeredPane.add(INFBOOK);

		layeredPane.add(nextpage);
		layeredPane.add(previouspage);
		layeredPane.add(page);
		layeredPane.add(pageinput);
		layeredPane.add(changeto);
		layeredPane.add(confirm);
		bookInf = new JLabel(bookmp);
		bookInf.setBounds(0, 0, 990, 550);

		layeredPane.add(bookInf);
		this.setVisible(false);
		this.setVisible(true);




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



	public	void pageplus(){
		if(pagenumber<maxpage-1)
		{
			pagenumber++;


			for(int i=0;i<=29;i++) for(int j=0;j<=7;j++) bookData[i][j]=ALLData.get(pagenumber)[i][j];
			BOOKINF.setVisible(false);
			BOOKINF.setVisible(true);
			//ORDER.setVisible(false);ORDER.setVisible(true);
			currentpage.setText(pagenumber+1+"/"+maxpage+"页");




//			currentpage.setVisible(false);currentpage.setVisible(true);
		}
	}
	public	void pageminus(){
		if(pagenumber>0){
			pagenumber--;
			for(int i=0;i<=29;i++) for(int j=0;j<=7;j++) bookData[i][j]=ALLData.get(pagenumber)[i][j];
			BOOKINF.setVisible(false);
			BOOKINF.setVisible(true);
			currentpage.setText(pagenumber+1+"/"+maxpage+"页");

		}
	}

	public	void pageto(){
		pagenumber=Integer.parseInt(pageinput.getText())-1;
		if(pagenumber>=0&&pagenumber<maxpage)
		{
			for(int i=0;i<=29;i++) for(int j=0;j<=7;j++) bookData[i][j]=ALLData.get(pagenumber)[i][j];
			BOOKINF.setVisible(false);
			BOOKINF.setVisible(true);
			currentpage.setText(pagenumber+1+"/"+maxpage+"页");

		}

	}
}





