package book;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.io.Closeable;
import java.lang.*;
import java.net.BindException;
import java.util.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import client.*;
import message.*;


public class AddBook extends JFrame {

	String book_id;
	String book_name;
	String book_author;
	String book_press;
	//String book_total;
	String book_introduction;
	int total;
	int borrowed;
	private boolean isAdd = false;

	JLabel Book_id=new JLabel("图书编号:");
	JLabel Book_name=new JLabel("书名:");
	JLabel Book_total =new JLabel("总数量:");
	JLabel Book_author =new JLabel("作者:");
	JLabel Book_press =new JLabel("出版社:");
	JLabel  Book_introduction=new JLabel("简介:");
	JLabel Book_borrow =new JLabel("已借本数:");

	JButton confirm=new JButton("确认");
	JButton cancel=new JButton("取消");

	JTextField BOOKID =new JTextField();
	JTextField BOOKNAME =new JTextField();
	JTextField TOTAL =new JTextField();
	JTextField Author_input= new JTextField();
	JTextField Press_input= new JTextField();
	JTextField Introduct_input= new JTextField();
	JTextField ABLETOBORROW =new JTextField();
	//JTextField IDinput= new JTextField();
	//SearchPanel mPanel_searchPanel=new SearchPanel();
	//HomePanel home_panle=new HomePanel();


	public AddBook(ClientThread cthread) {
		getContentPane().add(Book_name);	getContentPane().add(Book_id);getContentPane().add(Book_total);getContentPane().add(Book_borrow);
		getContentPane().add(BOOKID);getContentPane().add(BOOKNAME);getContentPane().add(ABLETOBORROW);getContentPane().add(TOTAL);
		;getContentPane().add(confirm);getContentPane().add(cancel);
		getContentPane().add(Book_author);getContentPane().add(Author_input);getContentPane().add(Book_press);getContentPane().add(Press_input);getContentPane().add(Book_introduction);getContentPane().add(Introduct_input);
		getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);


		this.setTitle("添加书籍");
		this.setBounds(0, 0, 350, 450);
		Book_id.setBounds(60, 30, 100, 30);
		Book_name.setBounds(60, 70, 100, 30);
		Book_author.setBounds(60, 110, 100, 30);
		Book_press.setBounds(60, 150, 100, 30);
		Book_total.setBounds(60, 190, 100, 30);
		Book_borrow.setBounds(60, 230, 100, 30);
		Book_introduction.setBounds(60, 270, 100, 30);
		BOOKID.setBounds(140, 32, 150, 30);
		BOOKNAME.setBounds(140, 72, 150, 30);
		Author_input.setBounds(140, 112, 150, 30);
		Press_input.setBounds(140, 152, 150, 30);
		TOTAL.setBounds(140, 192, 150, 30);
		ABLETOBORROW.setBounds(140, 232, 150, 30);
		Introduct_input.setBounds(140, 272, 150, 30);


		confirm.setBounds(60,355, 100, 30);
		cancel.setBounds(190, 355, 100, 30);
		this.setVisible(true);

		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//添加书籍响应
				book_id=BOOKID.getText();
				book_name=BOOKNAME.getText();
				book_author=Author_input.getText();
				book_press=Press_input.getText();
				//book_total=TOTAL.getText();
				book_introduction=Introduct_input.getText();
				total=TOTAL.getColumns();
				borrowed=ABLETOBORROW.getColumns();
				if(isAdd)
				{
					cthread.handleAddBookMessage(book_id,book_name,book_author,total,borrowed,book_introduction);
				}
				else
				{
					cthread.handleUpdateBookMessage(book_id,book_name,book_author,total,borrowed,book_introduction);
				}


			}
		});
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});



	}


	public  void setbookid(String Booknumber){
		BOOKNAME.setText(Booknumber);
	}
	public void setbookname(String Bookname){
		BOOKNAME.setText(Bookname);
	}
	public void settotal(String Total){
		TOTAL.setText(Total);
	}

	public void setauthor(String Author){
		Book_author.setText(Author);
	}
	public void setpress(String Press){
		Book_press.setText(Press);
	}
	public void setintroduction(String Introduction){
		Book_introduction.setText(Introduction);
	}
	public void setabletoborrow(String Abletoborrow){
		Book_borrow.setText(Abletoborrow);
	}



//	private void OnBeClickedConfirm() {
//		book_id=BOOKID.getText();
//		book_name=BOOKNAME.getText();
//		book_author=Author_input.getText();
//		book_press=Press_input.getText();
//		//book_total=TOTAL.getText();
//		book_introduction=Introduct_input.getText();
//		total=TOTAL.getColumns();
//		borrowed=ABLETOBORROW.getColumns();
//		if(isAdd)
//		{
//			cthread.handleAddBookMessage(book_id,book_name,book_author,total,borrowed,book_introduction);
//		}
//		else
//		{
//			cthread.handleUpdateBookMessage(book_id,book_name,book_author,total,borrowed,book_introduction);
//		}
//	}
	public void close()
	{
		this.setVisible(false);
	}
}

