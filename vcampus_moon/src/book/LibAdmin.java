package book;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LibAdmin extends JFrame {

	JLabel Book_id=new JLabel("图书编号:");
	JLabel Book_name=new JLabel("书名:");
	JLabel Book_total =new JLabel("总数量:");
	JLabel Book_author =new JLabel("作者:");
	//JLabel Book_press =new JLabel("出版社:");
	JLabel  Book_introduction=new JLabel("简介:");
	JLabel Book_borrow =new JLabel("可借本数:");

	JFrame Order=new JFrame("确认预约");
	JFrame ReturnBook=new JFrame("还书");

	JLabel Message=new JLabel("请输入一卡通号");

	//JButton Delete_button=new JButton("删除图书");
	JButton Returnbook =new JButton("归还");
	JButton Subscribe =new JButton("订阅");
	JButton Save=new JButton("保存");
	JButton Cance=new JButton("取消");
	JButton CancelOrder=new JButton("取消");
	JButton CancelReturn=new JButton("取消");
	JButton Confirmreturnbook=new JButton("确认");
	JButton ConfirmSubscribe=new JButton("确认");


	JTextField BOOKID =new JTextField();
	JTextField BOOKNAME =new JTextField();
	JTextField ABLETOBORROW =new JTextField();
	JTextField TOTAL =new JTextField();
	JTextField Author_input= new JTextField();
	//JTextField Press_input= new JTextField();
	//JTextField Introduct_input= new JTextField();
	JTextField IDinput= new JTextField();
	//SearchPanel mPanel_searchPanel=new SearchPanel();
	//SearchPanel mPanel_searchPanel=new SearchPanel();
	int tablenumber;
	String[] colname={"一卡通号","状态"};
	String[][] borrowData=new String[100][2];
	JTable borrow =new JTable(borrowData,colname);
	//JScrollPane jsp=new JScrollPane(borrow);


	public LibAdmin() {
		getContentPane().add(Book_name);	getContentPane().add(Book_id);getContentPane().add(Book_total);getContentPane().add(Book_borrow);
		getContentPane().add(BOOKID);getContentPane().add(BOOKNAME);getContentPane().add(ABLETOBORROW);getContentPane().add(TOTAL);
		getContentPane().add(Subscribe);getContentPane().add(Save);getContentPane().add(Cance);getContentPane().add(Returnbook);
		getContentPane().add(Book_author);getContentPane().add(Author_input);/*getContentPane().add(Book_press);getContentPane().add(Press_input);
		/*this.add(location);*/getContentPane().add(Book_introduction);getContentPane().add(Book_introduction);
		//	getContentPane().add(jsp);getContentPane().add(Delete_button);
		getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		//for(int i=0;i<=5;i++)for(int j=0;j<=1;j++)borrowData[i][j]=mPanel_searchPanel.ALLData.get(0)[0][0];
		borrow.setEnabled(false);
		this.setBounds(0, 0, 415, 679);
		Book_id.setBounds(60, 30, 100, 30);
		Book_name.setBounds(60, 70, 100, 30);
		Book_author.setBounds(60, 110, 100, 30);
		//Book_press.setBounds(60, 150, 100, 30);
		Book_total.setBounds(60, 150, 100, 30);
		Book_borrow.setBounds(60, 190, 100, 30);
		//Book_introduction.setBounds(60, 270, 100, 30);
		//location.setBounds(60, 310, 100, 30);
		BOOKID.setBounds(140, 32, 150, 30);
		BOOKNAME.setBounds(140, 72, 150, 30);
		Author_input.setBounds(140, 112, 150, 30);
		//Press_input.setBounds(140, 152, 150, 30);
		TOTAL.setBounds(140, 152, 150, 30);
		ABLETOBORROW.setBounds(140, 192, 150, 30);
		//Introduct_input.setBounds(140, 272, 150, 30);
		//location_input.setBounds(140, 312, 150, 30);
		//Delete_button.setBounds(121, 559, 119, 20);

		//jsp.setBounds(60, 255, 263, 199);
		Subscribe.setBounds(60, 469, 100, 30);
		Returnbook.setBounds(190, 469, 100, 30);
		Save.setBounds(60,514, 100, 30);
		Cance.setBounds(190, 514, 100, 30);
		this.setVisible(true);
		Cance.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {

				close();

			}

		});


		Save.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {

				//save();

			}

		});
		/*Delete_button.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {
			
				delete();
	
		}

		});*/

		Subscribe.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {


				Order.getContentPane().setLayout(null);
				Order.setVisible(true);
				Order.setLocationRelativeTo(null);
				Order.setSize(300, 250);
				Order.getContentPane().add(Message);
				Order.getContentPane().add(ConfirmSubscribe);
				Order.getContentPane().add(IDinput);
				Order.getContentPane().add(CancelOrder);
				Message.setBounds(90, 20, 300, 60);
				IDinput.setBounds(80, 80, 127, 30);
				ConfirmSubscribe.setBounds(30, 140, 100, 40);
				CancelOrder.setBounds(160, 140, 100, 40);;



				CancelOrder.addActionListener(new java.awt.event.ActionListener() {

					public void actionPerformed(java.awt.event.ActionEvent e) {

						Order.setVisible(false);

					}

				});


			}

		});
		Returnbook.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {


				ReturnBook.getContentPane().setLayout(null);
				ReturnBook.setVisible(true);
				ReturnBook.setLocationRelativeTo(null);
				ReturnBook.setSize(300, 250);
				ReturnBook.getContentPane().add(Message);
				ReturnBook.getContentPane().add(Confirmreturnbook);
				ReturnBook.getContentPane().add(IDinput);
				ReturnBook.getContentPane().add(CancelReturn);
				Message.setBounds(90, 20, 300, 60);
				IDinput.setBounds(80, 80, 127, 30);
				Confirmreturnbook.setBounds(30, 140, 100, 40);
				CancelReturn.setBounds(160, 140, 100, 40);
				Confirmreturnbook.addActionListener(new java.awt.event.ActionListener() {

					public void actionPerformed(java.awt.event.ActionEvent e) {
						String temp;
						temp=IDinput.getText();

						for (int i=0;i<=99;i++)if(temp.equals(borrowData[i][0])){
							borrowData[i][0]="";borrowData[i][1]="";
							borrow.setVisible(false);borrow.setVisible(true);
						}



					}

				});
				CancelReturn.addActionListener(new java.awt.event.ActionListener() {

					public void actionPerformed(java.awt.event.ActionEvent e) {

						ReturnBook.setVisible(false);

					}

				});




			}

		});






	}
	
	/*protected void save(){
			close();
			mPanel_searchPanel.table.setTextTableCell(tablenumber, 5,ABLETOBORROW.getText());
			mPanel_searchPanel.table.setTextTableCell(tablenumber, 1,BOOKNAME.getText());
			mPanel_searchPanel.table.setTextTableCell(tablenumber, 0,BOOKID.getText());
			mPanel_searchPanel.table.setTextTableCell(tablenumber, 4,TOTAL.getText());
			mPanel_searchPanel.table.setTextTableCell(tablenumber, 2,Author_input.getText());
			//mPanel_searchPanel.table.setTextTableCell(tablenumber, 3,Press_input.getText());
		//	mPanel_searchPanel.table.setTextTableCell(tablenumber, 6,Introduct_input.getText());
			//mPanel_searchPanel.table.setTextTableCell(tablenumber, 7,location_input.getText());
			
			mPanel_searchPanel.jsp.setVisible(false);
			mPanel_searchPanel.jsp.setVisible(true);
		
		
	}
	protected void delete(){
		close();
		mPanel_searchPanel.table.setTextTableCell(tablenumber, 5,"");
		mPanel_searchPanel.table.setTextTableCell(tablenumber, 1,"");
		mPanel_searchPanel.table.setTextTableCell(tablenumber, 0,"");
		mPanel_searchPanel.table.setTextTableCell(tablenumber, 4,"");
		mPanel_searchPanel.table.setTextTableCell(tablenumber, 2,"");
		mPanel_searchPanel.table.setTextTableCell(tablenumber, 3,"");
		mPanel_searchPanel.table.setTextTableCell(tablenumber, 6,"");
		mPanel_searchPanel.table.setTextTableCell(tablenumber, 7,"");
		
		mPanel_searchPanel.jsp.setVisible(false);
		mPanel_searchPanel.jsp.setVisible(true);
	
	
}*/

	public  void setbooknumber(String Booknumber){
		BOOKNAME.setText(Booknumber);
	}
	public void setbookname(String Bookname){
		BOOKNAME.setText(Bookname);
	}
	public void settotal(String Total){
		TOTAL.setText(Total);
	}
	public void setabletoborrow(String Abletoborrow){
		Book_borrow.setText(Abletoborrow);
	}

	/*public void setsearchpanel(SearchPanel m) {
		mPanel_searchPanel = m;
	}*/
	public void close()
	{
		this.setVisible(false);
	}

}
