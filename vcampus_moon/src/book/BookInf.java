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
		
		bookmp=new ImageIcon("vcampus_moon/images/bk1.png");

		layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(224, 255, 255));
		layeredPane.setBounds(0, 0, 1110, 680);

		this.add(layeredPane);
		this.setLayout(null);
		this.setSize(900, 700);
		BOOKINF.setEnabled(false);
		nullData[0][0]=null;
		String[][] testData=new String[30][8];


		cthread.handleShowBookMessage();
		Message message = cthread.getREMessage();
		BookMessage boobmessage = (BookMessage)message.getData();

		int num=boobmessage.getbook().size();
		int pages=num/30;
		maxpage=pages+1;
		ArrayList<BookInfo> booklist = boobmessage.getbook();
		while (pages-->=0) {
			for (Integer i = 0; num > 0 && i <= 29; num--, i++) {
				testData[i][0] =i.toString();
				testData[i][1] = booklist.get(i).getBook_id();
				testData[i][2] = booklist.get(i).getBook_name();
				testData[i][3] = booklist.get(i).getBook_author();
				testData[i][4] = booklist.get(i).getBook_press();
				testData[i][5] = booklist.get(i).getBook_introduction();
				Integer total = booklist.get(i).getBook_total();
				testData[i][6] = total.toString();
				Integer borrowed = booklist.get(i).getBook_borrowed();
				testData[i][7] = borrowed.toString();
			}
			
		}
		ALLData.add(testData);
	

		for(int i=0;i<=29;i++) for(int j=0;j<=7;j++) bookData[i][j]=ALLData.get(0)[i][j];
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
			BOOKINF.setVisible(false);BOOKINF.setVisible(true);
			ORDER.setVisible(false);ORDER.setVisible(true);
			currentpage.setText(pagenumber+1+"/"+maxpage+"页");




//			currentpage.setVisible(false);currentpage.setVisible(true);
		}
	}
	public	void pageminus(){
		if(pagenumber>0){
			pagenumber--;
			for(int i=0;i<=29;i++) for(int j=0;j<=7;j++) bookData[i][j]=ALLData.get(pagenumber)[i][j];
			BOOKINF.setVisible(false);BOOKINF.setVisible(true);
			currentpage.setText(pagenumber+1+"/"+maxpage+"页");

		}
	}
	
	public	void pageto(){
		pagenumber=Integer.parseInt(pageinput.getText())-1;
		if(pagenumber>=0&&pagenumber<maxpage)
		{
			for(int i=0;i<=29;i++) for(int j=0;j<=7;j++) bookData[i][j]=ALLData.get(pagenumber)[i][j];
			BOOKINF.setVisible(false);BOOKINF.setVisible(true);
			currentpage.setText(pagenumber+1+"/"+maxpage+"页");

		}

	}
}





