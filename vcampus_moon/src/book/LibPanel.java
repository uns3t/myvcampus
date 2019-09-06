//package book;
//
//import javax.swing.*;
//
//import java.awt.*;
//import java.util.*;
//import java.util.List;
//import client.*;
//import message.*;
//
//public class LibPanel extends JPanel {
//
//	final HomePanel homePanel;
//	final PersonPanel personalPanel = new PersonPanel();
//	//final SearchPanel searchPanel;
//	final ButtonPanel btp = new ButtonPanel(3);
//	public int admin = 1;
//	JPanel topPanel = new JPanel();
//	Client mClient;
//	final JPanel centerPanel = new JPanel();
//
//	public LibPanel(Client client) {
//		mClient = client;
//		homePanel = new HomePanel(client);
//		//searchPanel = new SearchPanel(client);
//		btp.setBounds(0, 0, 900, 40);
//		this.add(btp, new Integer(1));
//		this.setLayout(null);
//		this.setBackground(Color.white);
//		//searchPanel.admin = this.admin;
//		topPanel.setLayout(null);
//
//		topPanel.setBackground(Color.white);
//		topPanel.setBounds(0, 0, 900, 45);
//
//		centerPanel.setBackground(Color.WHITE);
//		centerPanel.setLayout(null);
//		centerPanel.setBounds(0, 45, 900, 700);
//
//		homePanel.setBackground(Color.white);
//		homePanel.setBounds(0, 50, 900, 650);
//		homePanel.setLayout(null);
//		this.add(homePanel);
//
//		//searchPanel.setBackground(Color.white);
//
//		final PButton jb1 = new PButton("首    页");
//		final PButton jb2 = new PButton("图书信息");
//		final PButton jb3 = new PButton("搜索图书");
//		if (admin == 1)
//			jb3.setText("管理图书");
//		final PButton jb4 = new PButton("个人记录");
//		jb1.setFocusPainted(false);
//		jb1.setBounds(0, 5, 300, 40);
//		jb1.setForeground(new Color(35, 164, 231));
//		jb1.setBackground(Color.white);
//
//		jb1.addActionListener(new java.awt.event.ActionListener() {
//
//			public void actionPerformed(java.awt.event.ActionEvent e) {
//				resultPanel(homePanel);
//
//				jb1.setForeground(new Color(35, 164, 231));
//				jb1.setBackground(Color.white);
//				jb2.setForeground(new Color(254, 254, 254));
//				jb2.setBackground(new Color(206, 206, 206));
//				jb3.setForeground(new Color(254, 254, 254));
//				jb3.setBackground(new Color(206, 206, 206));
//				jb4.setForeground(new Color(254, 254, 254));
//				jb4.setBackground(new Color(206, 206, 206));
//				removeThePanelExcept(homePanel);
//				addtop();
//				btp.DoSlide(0);
//
//			}
//
//		});
//
//		// jb2.setBounds(225, 5,225 , 40);
//
//
//		jb3.setBounds(300, 5, 300, 40);
//		jb3.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(java.awt.event.ActionEvent e) {
//				//resultPanel(searchPanel);
//				jb3.setForeground(new Color(35, 164, 231));
//				jb3.setBackground(Color.white);
//				jb1.setForeground(new Color(254, 254, 254));
//				jb1.setBackground(new Color(206, 206, 206));
//				jb2.setForeground(new Color(254, 254, 254));
//				jb2.setBackground(new Color(206, 206, 206));
//				jb4.setForeground(new Color(254, 254, 254));
//				jb4.setBackground(new Color(206, 206, 206));
//				//removeThePanelExcept(searchPanel);
//				addtop();
//				btp.DoSlide(1);
////				searchPanel.jsp.setVisible(false);
////				searchPanel.jsp.setVisible(true);
//
//			}
//		});
//
//		jb4.setBounds(600, 5, 300, 40);
//		jb4.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(java.awt.event.ActionEvent e) {
//				resultPanel(personalPanel);
//				jb4.setForeground(new Color(35, 164, 231));
//				jb4.setBackground(Color.white);
//				jb1.setForeground(new Color(254, 254, 254));
//				jb1.setBackground(new Color(206, 206, 206));
//				jb3.setForeground(new Color(254, 254, 254));
//				jb3.setBackground(new Color(206, 206, 206));
//				jb2.setForeground(new Color(254, 254, 254));
//				jb2.setBackground(new Color(206, 206, 206));
//				removeThePanelExcept(personalPanel);
//				addtop();
//				ArrayList<BookBorrowMessage> temp = new ArrayList();
//				temp.add(new BookBorrowMessage());
//				temp.add(new BookBorrowMessage());
//
//				personalPanel.showPersonalBorrowPanle(temp);
//				btp.DoSlide(2);
//
//			}
//		});
//
//		topPanel.add(jb1);
//		topPanel.add(jb2);
//		topPanel.add(jb3);
//		topPanel.add(jb4);
//
//		this.add(topPanel);
//
//		this.add(topPanel);
//
//		this.add(centerPanel);
//		btp.DoSlide(0);
//
//	/*	mClient.messageThread.setlibaraylistener(new Libarycallback() {
//
//			@Override
//			public void getbooklist(ArrayList<BookMessage> mArrayList) {
//				System.out.println("zhazha");
//				if(mArrayList.size()==0){
//					JOptionPane.showMessageDialog(null, "没有结果", "不好意思TAT",JOptionPane.CLOSED_OPTION);
//				}
//				{
//
//	//
////					searchPanel.sousuo();
//					searchPanel.showSearchresult(mArrayList);
//				}
//
//
//			}
//		});*/
//		String[] temp ;
//		//searchPanel.showSearchresult(temp);
//
//	}
//
//	// 滑动效果方法
//	public void resultPanel(final JPanel panel) {
//		panel.setBounds(0, 0, centerPanel.getWidth(), centerPanel.getHeight());// 设置滑动初始位置
//		int count = centerPanel.getComponentCount();// 获取centerPanel中控件数
//		List list = new ArrayList();//
//		for (Component comp : centerPanel.getComponents()) {
//			list.add(comp);// 给list赋值
//		}
//		if (count > 0) {// 如果centerPanel中控件数大于0就执行效果
//			for (int i = 0; i < count; i++) {
//				Component comp = centerPanel.getComponent(i);// 获得该位置的控件
//				if (comp instanceof JPanel) {// 判断控件类型
//					final JPanel currentPanel = (JPanel) comp;// 获得当前panel
//					if (currentPanel != panel) {
//						new Thread() {
//							public void run() {
//								Rectangle rec = currentPanel.getBounds();// 获得当前面板的位置信息
//								int y = -centerPanel.getWidth();
//
//								for (int i = 0; i <= centerPanel.getWidth(); i += 10) {
//									// 设置面板位置
//									currentPanel.setBounds(i, 0, centerPanel.getWidth(), centerPanel.getHeight());
//									panel.setBounds(y, 0, centerPanel.getWidth(), centerPanel.getHeight());
//									try {
//										Thread.sleep(3);
//									} catch (InterruptedException e) {
//										// TODO Auto-generated catch block
//										e.printStackTrace();
//									}
//									y += 10;
//								}
//								centerPanel.remove(currentPanel);// 移除當前面板
//								panel.setBounds(0, 0, centerPanel.getWidth(), centerPanel.getHeight());
//							}
//						}.start();
//						break;
//					}
//				}
//			}
//		}
//		if (!list.contains(panel)) {
//			centerPanel.add(panel, new Integer(3));// 添加要切换的面板
//		}
//		centerPanel.validate();// 重构内容面板
//		centerPanel.repaint();// 重绘内容面板
//	}
//
//	void removeThePanelExcept(JPanel a) {
//		if (homePanel != a) {
//			this.remove(homePanel);
//		}
//
//		if (personalPanel != a) {
//			this.remove(personalPanel);
//		}
//
////		if (searchPanel != a) {
//	//		this.remove(searchPanel);
//	//	}
//
//
//		this.remove(topPanel);
//
//	}
//
//	void addtop() {
//		this.add(topPanel);
//
//	}
//
//}
//
