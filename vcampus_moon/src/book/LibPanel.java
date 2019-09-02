package Book;

import javax.swing.JPanel;
import javax.swing.*;

/*import CallBack.Libarycallback;
import Connect.*;
import PowfulPanel.*;*/

import java.awt.*;
import java.util.*;
import java.util.List;

//import Message.*;

public class LibPanel extends JPanel {



		final HomePanel homePanel ;
		final PersonPanel personalPanel = new PersonPanel();
//		final BookinfPanel bookinfPanel = new BookinfPanel();
		final SearchPanel searchPanel;
		final Button btp = new Button();
		public int admin = 1;
		JPanel topPanel = new JPanel();
		//Client mClient;
		final JPanel centerPanel = new JPanel();

		public LibPanel(/*Client client*/) {
			//mClient = client;
			//homePanel = new HomePanel(client);
			//searchPanel = new SearchPanel(client);
			btp.setBounds(0, 5, 900, 40);
			this.add(btp, new Integer(1));
			this.setLayout(null);
			this.setBackground(Color.white);
			searchPanel.admin = this.admin;
			topPanel.setLayout(null);

			topPanel.setBackground(Color.white);
			topPanel.setBounds(0, 0, 900, 45);

			centerPanel.setBackground(Color.WHITE);
			centerPanel.setLayout(null);
			centerPanel.setBounds(0, 45, 900, 700);

			homePanel.setBackground(Color.white);
			homePanel.setBounds(0, 50, 900, 650);
			homePanel.setLayout(null);
			this.add(homePanel);

		//	bookinfPanel.setBackground(Color.white);
			searchPanel.setBackground(Color.white);

			final SelectButton jb1 = new SelectButton("��    ҳ");
			final SelectButton jb2 = new SelectButton("ͼ����Ϣ");
			final SelectButton jb3 = new SelectButton("����ͼ��");
			if (admin == 1)
				jb3.setText("����ͼ��");
			final SelectButton jb4 = new SelectButton("���˼�¼");
			jb1.setFocusable(false);
			jb1.setBounds(0, 5, 300, 40);
			jb1.setForeground(new Color(35, 164, 231));
			jb1.setBackground(Color.white);
			jb1.addActionListener(new java.awt.event.ActionListener() {

				public void actionPerformed(java.awt.event.ActionEvent e) {
					resultPanel(homePanel);

					jb1.setForeground(new Color(35, 164, 231));
					jb1.setBackground(Color.white);
					jb2.setForeground(new Color(254, 254, 254));
					jb2.setBackground(new Color(206, 206, 206));
					jb3.setForeground(new Color(254, 254, 254));
					jb3.setBackground(new Color(206, 206, 206));
					jb4.setForeground(new Color(254, 254, 254));
					jb4.setBackground(new Color(206, 206, 206));
					removeThePanelExcept(homePanel);
					addtop();
					btp.DoSlide(0);

				}

			});

			// jb2.setBounds(225, 5,225 , 40);


			jb3.setBounds(300, 5, 300, 40);
			jb3.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					resultPanel(searchPanel);
					jb3.setForeground(new Color(35, 164, 231));
					jb3.setBackground(Color.white);
					jb1.setForeground(new Color(254, 254, 254));
					jb1.setBackground(new Color(206, 206, 206));
					jb2.setForeground(new Color(254, 254, 254));
					jb2.setBackground(new Color(206, 206, 206));
					jb4.setForeground(new Color(254, 254, 254));
					jb4.setBackground(new Color(206, 206, 206));
					removeThePanelExcept(searchPanel);
					addtop();
					btp.DoSlide(1);
//					searchPanel.jsp.setVisible(false);
//					searchPanel.jsp.setVisible(true);

				}
			});

			jb4.setBounds(600, 5, 300, 40);
			jb4.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					resultPanel(personalPanel);
					jb4.setForeground(new Color(35, 164, 231));
					jb4.setBackground(Color.white);
					jb1.setForeground(new Color(254, 254, 254));
					jb1.setBackground(new Color(206, 206, 206));
					jb3.setForeground(new Color(254, 254, 254));
					jb3.setBackground(new Color(206, 206, 206));
					jb2.setForeground(new Color(254, 254, 254));
					jb2.setBackground(new Color(206, 206, 206));
					removeThePanelExcept(personalPanel);
					addtop();
					ArrayList<BorrowMessage> temp = new ArrayList();
					temp.add(new BorrowMessage());
					temp.add(new BorrowMessage());
					personalPanel.showPersonalBorrowPanle(temp);
					btp.DoSlide(2);

				}
			});

			topPanel.add(jb1);
			topPanel.add(jb2);
			topPanel.add(jb3);
			topPanel.add(jb4);

			this.add(topPanel);

			this.add(topPanel);

			this.add(centerPanel);
			btp.DoSlide(0);

			mClient.messageThread.setlibaraylistener(new Libarycallback() {

				@Override
				public void getbooklist(ArrayList<BookMessage> mArrayList) {
					System.out.println("zhazha");
					if(mArrayList.size()==0){
						JOptionPane.showMessageDialog(null, "û�н��", "������˼TAT",JOptionPane.CLOSED_OPTION);
					}
					{
					
		//
//						searchPanel.sousuo();
						searchPanel.showSearchresult(mArrayList);
					}
					

				}
			});

		}

		// ����Ч������
		public void resultPanel(final JPanel panel) {
			panel.setBounds(0, 0, centerPanel.getWidth(), centerPanel.getHeight());// ���û�����ʼλ��
			int count = centerPanel.getComponentCount();// ��ȡcenterPanel�пؼ���
			List list = new ArrayList();//
			for (Component comp : centerPanel.getComponents()) {
				list.add(comp);// ��list��ֵ
			}
			if (count > 0) {// ���centerPanel�пؼ�������0��ִ��Ч��
				for (int i = 0; i < count; i++) {
					Component comp = centerPanel.getComponent(i);// ��ø�λ�õĿؼ�
					if (comp instanceof JPanel) {// �жϿؼ�����
						final JPanel currentPanel = (JPanel) comp;// ��õ�ǰpanel
						if (currentPanel != panel) {
							new Thread() {
								public void run() {
									Rectangle rec = currentPanel.getBounds();// ��õ�ǰ����λ����Ϣ
									int y = -centerPanel.getWidth();

									for (int i = 0; i <= centerPanel.getWidth(); i += 10) {
										// �������λ��
										currentPanel.setBounds(i, 0, centerPanel.getWidth(), centerPanel.getHeight());
										panel.setBounds(y, 0, centerPanel.getWidth(), centerPanel.getHeight());
										try {
											Thread.sleep(3);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										y += 10;
									}
									centerPanel.remove(currentPanel);// �Ƴ���ǰ���
									panel.setBounds(0, 0, centerPanel.getWidth(), centerPanel.getHeight());
								}
							}.start();
							break;
						}
					}
				}
			}
			if (!list.contains(panel)) {
				centerPanel.add(panel, new Integer(3));// ���Ҫ�л������
			}
			centerPanel.validate();// �ع��������
			centerPanel.repaint();// �ػ��������
		}

		void removeThePanelExcept(JPanel a) {
			if (homePanel != a) {
				this.remove(homePanel);
			}

			if (personalPanel != a) {
				this.remove(personalPanel);
			}

			if (searchPanel != a) {
				this.remove(searchPanel);
			}


			this.remove(topPanel);

		}

		void addtop() {
			this.add(topPanel);

		}
		
	}

