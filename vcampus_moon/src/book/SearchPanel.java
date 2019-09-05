package book;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;



public class SearchPanel extends JPanel {
	JButton back=new JButton("��������"); 

	JTextField input= new JTextField(); 

	JButton search =new JButton("����"); 


	String[][] searchData;
	JPanel background_panel=new JPanel();
	JPanel white_panel=new JPanel();
	ArrayList<JButton> subscribe=new ArrayList();
	ArrayList<JButton> guanli=new ArrayList();
	//ArrayList<BookMessage> bookmessage=new ArrayList();
	ArrayList<SelectButton> select_button=new ArrayList();
	int admin=1;
	String[] columnNames = {"ͼ����","ͼ������","����","������","�ܱ���","�ɽ豾��","���","ԤԼ"};
	SuperTable table;
	JScrollPane jsp;


	JLabel currentpage=new JLabel(); 
	ArrayList<String[][]> ALLData=new ArrayList();
	LibAdmin libadm;
	//Client mClient;
	
	public SearchPanel(/*Client client*/){
		//mClient = client;
		this.setLayout(null);
		this.setSize(900, 700);
		
		for (int i = 0; i <14; i++) {
			select_button.add(new SelectButton(null));
			select_button.get(i).setBounds(150+170*((i+2)%4), 180+70*((i+2)/4), 100, 30);
			this.add(select_button.get(i));
		}
		select_button.get(0).setContent("����"); 
		select_button.get(1).setContent("����"); 
		/*select_button.get(2).setContent("ȫ������"); 
		select_button.get(3).setContent("С˵"); 
		select_button.get(4).setContent("ɢ��"); 
		select_button.get(5).setContent("ʫ��"); 
		select_button.get(6).setContent("����"); 
		select_button.get(7).setContent("�����"); 
		select_button.get(8).setContent("������"); 
		select_button.get(9).setContent("����"); 
		select_button.get(10).setContent("��ѧ"); 
		select_button.get(11).setContent("��ѧ"); 
		select_button.get(12).setContent("����"); 
		select_button.get(13).setContent("����"); */

		select_button.get(0).setSelected(true);
		select_button.get(0).setBounds(525, 155, 100, 30);
		select_button.get(1).setBounds(635, 155, 100, 30);
		select_button.get(0).addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {
				if(!(select_button.get(0).getIsSelected())&&select_button.get(1).getIsSelected()){
					select_button.get(1).setSelected(false);
				}
	
	
			}
		});
		select_button.get(1).addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {
				if(select_button.get(0).getIsSelected()&&!(select_button.get(1).getIsSelected())){
					select_button.get(0).setSelected(false);
				}
	
	
			}
		});

		/*select_button.get(2).addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {
				if(select_button.get(2).getIsSelected()&&
						select_button.get(3).getIsSelected()&&
						select_button.get(4).getIsSelected()&&
						select_button.get(5).getIsSelected()&&
						select_button.get(6).getIsSelected()&&
						select_button.get(7).getIsSelected()&&
						select_button.get(8).getIsSelected()&&
						select_button.get(9).getIsSelected()&&
						select_button.get(10).getIsSelected()&&
						select_button.get(11).getIsSelected()&&
						select_button.get(12).getIsSelected()&&
						select_button.get(13).getIsSelected())
				{for(int i=2;i<=13;i++)select_button.get(i).setSelected(false);
				select_button.get(2).setSelected(true);}
				else 
					for(int i=3;i<=13;i++){select_button.get(i).setSelected(true);
				select_button.get(2).setSelected(false);}
	
			}
		});*/


		background_panel.add(search);
		
		back.setBounds(400,570,100,30);
		background_panel.add(input);
		background_panel.setLayout(null);
		input.setBorder(null);
		background_panel.setBackground(new Color(35,164,231));
		this.add(background_panel);
		background_panel.setBounds(160, 150, 320, 37);
		input.setBounds(1, 1, 230, 35);
		search.setBounds(231, 1, 90, 35);
		search.setContentAreaFilled(false);
		search.setOpaque(false);
		search.setBorderPainted(false);
		search.setFont(new Font("΢���ź�", Font.BOLD,15));
		
		input.setFont(new Font("Dialog",Font.BOLD,16));

		

		
		search.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {
				
				//mClient.sendBookQuery(new BookQueryMessage(input.getText(), select_button.get(1).getIsSelected(), select_button.get(3).getIsSelected(), select_button.get(4).getIsSelected(), select_button.get(5).getIsSelected(), select_button.get(6).getIsSelected(), select_button.get(7).getIsSelected(), select_button.get(8).getIsSelected(), select_button.get(9).getIsSelected(), select_button.get(10).getIsSelected(), select_button.get(11).getIsSelected(), select_button.get(12).getIsSelected(), select_button.get(13).getIsSelected()));
				
	
		}

		});
	
		
	}

	/*void showSearchresult(ArrayList<BookMessage> bookmessages){
		table =new SuperTable(bookmessage, 9+admin);
		table.setCellSize(100-10*admin, 45);
		if(admin==1){table.setTextTableHead(9, "����");}
		jsp =new JScrollPane(table);
		
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jsp.setBackground(Color.white);
		table.setTextTableHead(columnNames);
		table.setButtonColumn(8, "ԤԼ");
		table.setButtonColumn(9, "����");
	//	table.ButtonArray.get(0).get(8).setBackground(Color.black);
	
	//	table.ButtonArray.get(8).get(0).setBackground(Color.black);

		 searchData=new String[bookmessages.size()][8];

			for (int i = 0; i < bookmessages.size(); i++) {
				searchData[i][0] = bookmessages.get(i).getCode();
				searchData[i][1] = bookmessages.get(i).getBookname();
				searchData[i][2] = bookmessages.get(i).getAuthor();
				searchData[i][3] = bookmessages.get(i).getPress();
				searchData[i][4] = bookmessages.get(i).getTotal() + "";
				searchData[i][5] = bookmessages.get(i).getAvailable() + "";
				searchData[i][6] = bookmessages.get(i).getComment();
				searchData[i][7] = bookmessages.get(i).getAddress();

			}
		table.setTextTableAll(searchData);
		for(int i=0;i<bookmessages.size();i++)
		{	if(Integer.valueOf(table.getTextTableCell(i,5))==0)
			{table.ButtonArray.get(i).get(8).setText("���ɽ�");
		table.ButtonArray.get(i).get(8).setEnabled(false);}
				}
		
		table.setTableHeadHeight(23);
		table.setPreferredSize(new Dimension(900, table.getHeight()+45));
		
	
		for(int i=0;i<bookmessages.size();i++)
		{	final int j=i;
			table.ButtonArray.get(i).get(8).addActionListener(new java.awt.event.ActionListener() {
				
			
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(Integer.valueOf(table.getTextTableCell(j, 5))>0){

					JOptionPane.showMessageDialog(null,"ԤԼ�ɹ�", "��ʾ��Ϣ",JOptionPane.CLOSED_OPTION);
					jsp.setVisible(false); jsp.setVisible(true);
					int temp=Integer.parseInt(table.getTextTableCell(j, 5));
					temp=temp-1;
					if( temp<=0) {table.ButtonArray.get(j).get(8).setText("���ɽ�");	table.ButtonArray.get(j).get(8).setEnabled(false);}
					table.setTextTableCell(j, 5,String.valueOf(temp));
					SearchPanel.this.setVisible(false);
					SearchPanel.this.setVisible(true);
					
		
			}
				}
			});
			table.ButtonArray.get(i).get(9).addActionListener(new java.awt.event.ActionListener() {
				
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if (!(searchData[j][0].isEmpty())) {
						
					
					
					guanli(j);
					}
						
					
		
				}
	
			});
		}

		
		jsp.setVisible(false); jsp.setVisible(true);
		this.removeAll();
		this.add(jsp);
		back.setBounds(400,555,100,30);
		this.add(back);
		back.setVisible(false);back.setVisible(true);
		table.setVisible(false);table.setVisible(true);
		jsp.setBounds(0,0,1000,550);
		final ArrayList<BookMessage> temp=new ArrayList<BookMessage>();
		back.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {

				back(temp);
	
		}

		});

	}*/
	
	/*void back(ArrayList<BookMessage> bookmessages){
		this.removeAll();
		this.setVisible(false);
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(900, 700);
		
		table.setEnabled(false);
		for (int i = 0; i <14; i++) {
			select_button.get(i).setBounds(150+170*((i+2)%4), 180+70*((i+2)/4), 100, 30);
			this.add(select_button.get(i));
		}
		select_button.get(0).setBounds(525, 155, 100, 30);
		select_button.get(1).setBounds(635, 155, 100, 30);
		background_panel.add(search);
		background_panel.add(input);
		background_panel.setLayout(null);
		input.setBorder(null);
		background_panel.setBackground(new Color(35,164,231));
		this.add(background_panel);
		background_panel.setBounds(160, 150, 320, 37);
		input.setBounds(1, 1, 230, 35);
		search.setBounds(231, 1, 90, 35);
		search.setContentAreaFilled(false);
		search.setOpaque(false);
		search.setBorderPainted(false);
		search.setFont(new Font("΢���ź�", Font.BOLD,15));	
		input.setFont(new Font("Dialog",Font.BOLD,16));
		for(int i=0;i<bookmessages.size();i++)for(int j=0;j<=7;j++)searchData[i][j]="";


		
	}*/

	void sousuo() {

	}

	public void guanli(int x) {

		libadm = new LibAdmin();
		libadm.setsearchpanel(this);
		libadm.setVisible(true);
		libadm.tablenumber = x;
		libadm.ABLETOBORROW.setText(table.getTextTableCell(x, 5));
		libadm.BOOKNAME.setText(table.getTextTableCell(x, 1));
		libadm.BOOKID.setText(table.getTextTableCell(x, 0));
		libadm.TOTAL.setText(table.getTextTableCell(x, 4));
		libadm.Author_input.setText(table.getTextTableCell(x, 2));
		//libadm.Press_input.setText(table.getTextTableCell(x, 3));
		// libadm.class_input.setText(table.getTextTableCell(x, 6));
		// libadm.location_input.setText(table.getTextTableCell(x, 7));

	}

	int returnNumber(int i) {
		return i;

	}

}