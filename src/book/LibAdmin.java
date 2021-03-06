package book;

import client.ClientThread;
import message.BookInfo;
import message.BookMessage;
import message.Message;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class LibAdmin extends JPanel {

//	public static void main(String[] args) {
//		new LibAdmin();
//	}

	AddBook add_frame;
	//BookInf program_frame;

	private JLayeredPane layeredPane;
	ImageIcon bookmp,a;

	int id;
	String book_id;
	String book_name;
	String book_author;
	String book_press;
	String book_introduction;
	String book_total;
	String book_borrowed;

	JLabel Id = new JLabel("书籍号:");
	JLabel Book_name = new JLabel("书名:");
	JLabel Book_id = new JLabel("图书编号:");
	JLabel Book_total = new JLabel("总数量:");
	JLabel Book_author = new JLabel("作者:");
	JLabel Book_press = new JLabel("出版社:");
	JLabel Book_borrow = new JLabel("可借本数:");

	JFrame Order = new JFrame("确认预约");
	JFrame ReturnBook = new JFrame("确认归还");
	JFrame Delete = new JFrame("确认删除");
	JFrame Book = new JFrame("书籍");

	JLabel Message = new JLabel("请输入一卡通号");
	JLabel LibMessage = new JLabel("请输入密码");
	JLabel Tip = new JLabel("请输入书籍号查询!");
	JLabel bookInf,an;
	JButton add_Button=new JButton("添加书籍");

	JButton Program_Button=new JButton("更新");
	JButton Delete_button = new JButton("删除");
	JButton Returnbook = new JButton("归还");
	JButton Subscribe = new JButton("订阅");
	JButton Cance = new JButton("取消");
	JButton Confirm = new JButton("确认");
	JButton CancelOrder = new JButton("取消");
	JButton CancelReturn = new JButton("取消");
	JButton Confirmreturnbook = new JButton("确认");
	JButton ConfirmSubscribe = new JButton("确认");

	JTextField BOOKID = new JTextField();
	JTextField IDinput = new JTextField();

	int admin = 1;
	ClientThread cthread;


	public LibAdmin(ClientThread mcthread,int ad) {

		admin=ad;
		bookmp=new ImageIcon("./images/bk1.png");

		a=new ImageIcon("./images/abc.jpg");
		layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(224, 255, 255));
		layeredPane.setBounds(0, 0, 1110, 680);

		this.add(layeredPane);
		cthread = mcthread;
		cthread.handleShowBookMessage();
		Message message = cthread.getREMessage();
		BookMessage bookmessage = (BookMessage) message.getData();
		ArrayList<BookInfo> booklist = bookmessage.getbook();

		this.setBackground(new Color(240, 248, 255));
		this.setBounds(0, 0, 1110, 680);
		this.setLayout(null);
		add_Button.setBounds(520, 300, 150, 50);
		add_Button.setBorderPainted(false);
		add_Button.setBackground(new Color(240, 248, 255));
		Confirm.setBorderPainted(false);
		Confirm.setBackground(new Color(240, 248, 255));
		Program_Button.setBorderPainted(false);
		Program_Button.setBackground(new Color(240, 248, 255));
		Delete_button.setBorderPainted(false);
		Delete_button.setBackground(new Color(240, 248, 255));
		Returnbook.setBorderPainted(false);
		Returnbook.setBackground(new Color(240, 248, 255));
		Subscribe.setBorderPainted(false);
		Subscribe.setBackground(new Color(240, 248, 255));


		layeredPane.add(Id);
		layeredPane.add(BOOKID);
		layeredPane.add(Confirm);
		layeredPane.add(Tip);
		bookInf = new JLabel(bookmp);
		bookInf.setBounds(0, 0, 990, 550);
		an = new JLabel(a);
		an.setBounds(0, 0, 440, 625);
		layeredPane.add(an);
		if(admin==1) {
			//layeredPane.add(an);
			layeredPane.add(add_Button);
			//this.add(Program_Button)1
		}
		layeredPane.add(bookInf);
		Tip.setFont(new Font("微软雅黑", Font.ROMAN_BASELINE, 25));
		Tip.setBounds(500, 30, 250, 50);
		Confirm.setBounds(520, 210, 100, 30);
		Id.setBounds(460, 150, 100, 30);
		BOOKID.setBounds(540, 150, 150, 30);


		Book_id.setBounds(60,20,100,30);
		Book_name.setBounds(60, 60, 100, 30);
		Book_author.setBounds(60, 100, 100, 30);
		Book_press.setBounds(60, 140, 100, 30);
		Book_total.setBounds(60, 180, 100, 30);
		Book_borrow.setBounds(60, 220, 100, 30);

		Delete_button.setBounds(60, 350, 100, 30);

		//jsp.setBounds(60, 255, 263, 199);
		Subscribe.setBounds(60, 300, 100, 30);
		Returnbook.setBounds(190, 300, 100, 30);
		//Save.setBounds(60,514, 100, 30);
		Cance.setBounds(200, 500, 80, 20);
		Program_Button.setBounds(190, 350, 100, 30);

		add_Button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {

				add_frame=new AddBook(mcthread,true);

			}

		});

		Confirm.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {


				id = Integer.parseInt(BOOKID.getText());
				int num=bookmessage.getbook().size();


				if(id>=num)
				{
					JOptionPane.showMessageDialog(new JFrame().getContentPane(), "编号错误","提示页面", JOptionPane.INFORMATION_MESSAGE);
				}
				//booklist.get(book_id).getBook_borrowed();

				else
				{
					book_id=booklist.get(id).getBook_id();
					book_name = booklist.get(id).getBook_name();
					book_author = booklist.get(id).getBook_author();
					book_press = booklist.get(id).getBook_press();
					book_introduction = booklist.get(id).getBook_introduction();
					Integer total = booklist.get(id).getBook_total();
					book_total = total.toString();
					Integer borrowed = booklist.get(id).getBook_borrowed();
					book_borrowed = borrowed.toString();

					JLabel BOOKID = new JLabel(book_id);
					JLabel BOOKNAME = new JLabel(book_name);
					JLabel ABLETOBORROW = new JLabel(book_borrowed);
					JLabel TOTAL = new JLabel(book_total);
					JLabel Author_output = new JLabel(book_author);
					JLabel Press_output = new JLabel(book_press);

					BOOKID.setBounds(140, 20, 150, 30);
					BOOKNAME.setBounds(140, 60, 150, 30);
					Author_output.setBounds(140, 100, 150, 30);
					Press_output.setBounds(140, 140, 150, 30);
					TOTAL.setBounds(140, 180, 150, 30);
					ABLETOBORROW.setBounds(140, 220, 150, 30);

	//				testData[i][6] = borrowed.toString();
					Book.getContentPane().setLayout(null);
					Book.setVisible(false);
					Book.setVisible(true);
					Book.setLocationRelativeTo(null);
					Book.setBounds(0, 0, 350, 600);
					Book.getContentPane().add(Book_id);
					Book.getContentPane().add(BOOKID);
					Book.getContentPane().add(Book_name);
					Book.getContentPane().add(Book_total);
					Book.getContentPane().add(Book_borrow);
					Book.getContentPane().add(BOOKNAME);
					Book.getContentPane().add(ABLETOBORROW);
					Book.getContentPane().add(TOTAL);
					Book.getContentPane().add(Press_output);
					Book.getContentPane().add(Book_press);
					Book.getContentPane().add(Book_author);
					Book.getContentPane().add(Author_output);
					Book.getContentPane().add(Subscribe);
					//Book.getContentPane().add(Cance);
					Book.getContentPane().add(Returnbook);

					if (admin == 1) {
						Book.getContentPane().add(Delete_button);
						Book.getContentPane().add(Program_Button);
					}
				}

				Cance.addActionListener(new java.awt.event.ActionListener() {

					public void actionPerformed(java.awt.event.ActionEvent e) {

						close();
					}

				});

				Delete_button.addActionListener(new java.awt.event.ActionListener() {

					public void actionPerformed(java.awt.event.ActionEvent e) {

						//close();
						mcthread.handleDeleteBookMessage(book_id);
						if(mcthread.getREMessage().getResponse())
						{
							//JTextField IDinput= new JTextField();
							JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除成功！","提示页面", JOptionPane.INFORMATION_MESSAGE);

						}
						else
							JOptionPane.showMessageDialog(new JFrame().getContentPane(), "删除失败！","提示页面", JOptionPane.INFORMATION_MESSAGE);
					}


				});


				Program_Button.addActionListener(new java.awt.event.ActionListener() {

					public void actionPerformed(java.awt.event.ActionEvent e) {


						add_frame=new AddBook(mcthread,false);
					}

				});

				Subscribe.addActionListener(new java.awt.event.ActionListener() {

					public void actionPerformed(java.awt.event.ActionEvent e) {

						Order.getContentPane().setLayout(null);
						Order.setVisible(false);
						Order.setVisible(true);
						Order.setLocationRelativeTo(null);
						Order.setSize(350, 250);
						Order.getContentPane().add(Message);
						Order.getContentPane().add(ConfirmSubscribe);
						Order.getContentPane().add(IDinput);
						Order.getContentPane().add(CancelOrder);
						Message.setBounds(90, 20, 300, 60);
						IDinput.setBounds(80, 80, 127, 30);
						ConfirmSubscribe.setBounds(30, 140, 100, 40);
						CancelOrder.setBounds(160, 140, 100, 40);


						CancelOrder.addActionListener(new java.awt.event.ActionListener() {

							public void actionPerformed(java.awt.event.ActionEvent e) {

								Order.setVisible(false);

							}

						});

						ConfirmSubscribe.addActionListener(new java.awt.event.ActionListener() {

							public void actionPerformed(java.awt.event.ActionEvent e) {


								if(mcthread.handleBookBorrowMessage(book_id))
								{
									//JTextField IDinput= new JTextField();
									JOptionPane.showMessageDialog(new JFrame().getContentPane(), "订阅成功！","提示页面", JOptionPane.INFORMATION_MESSAGE);

								}
								else
									JOptionPane.showMessageDialog(new JFrame().getContentPane(), "订阅失败！","提示页面", JOptionPane.INFORMATION_MESSAGE);

								Order.setVisible(false);
							}



						});


					}
				});
				Returnbook.addActionListener(new java.awt.event.ActionListener() {

						public void actionPerformed(java.awt.event.ActionEvent e) {
							ReturnBook.setVisible(false);
							ReturnBook.getContentPane().setLayout(null);
							ReturnBook.setVisible(true);
							ReturnBook.setLocationRelativeTo(null);
							ReturnBook.setSize(350, 250);
							ReturnBook.getContentPane().add(Message);
							ReturnBook.getContentPane().add(Confirmreturnbook);
							ReturnBook.getContentPane().add(IDinput);
							ReturnBook.getContentPane().add(CancelReturn);
							Message.setBounds(90, 20, 300, 60);
							IDinput.setBounds(80, 80, 127, 30);
							Confirmreturnbook.setBounds(30, 140, 100, 40);
							CancelReturn.setBounds(160, 140, 100, 40);


							CancelReturn.addActionListener(new java.awt.event.ActionListener() {

								public void actionPerformed(java.awt.event.ActionEvent e) {

									ReturnBook.setVisible(false);

								}

							});

							Confirmreturnbook.addActionListener(new java.awt.event.ActionListener() {

								public void actionPerformed(java.awt.event.ActionEvent e) {


									if(mcthread.handleBookReturnMessage(book_id))
									{
										//JTextField IDinput= new JTextField();
										JOptionPane.showMessageDialog(new JFrame().getContentPane(), "归还成功！","提示页面", JOptionPane.INFORMATION_MESSAGE);

									}
									else
										JOptionPane.showMessageDialog(new JFrame().getContentPane(), "归还失败！","提示页面", JOptionPane.INFORMATION_MESSAGE);

									ReturnBook.setVisible(false);}


							});


						}

				});
			}

		});
	}


		public void close () {
			this.setVisible(false);
		}


}
