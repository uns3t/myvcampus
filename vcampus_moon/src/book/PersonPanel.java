package Book;

import javax.swing.JPanel; 
import javax.swing.*; 
//import Message.BorrowMessage;  
import java.awt.*; 
import java.util.*; 
import java.lang.*; 

public class PersonPanel extends JPanel{ 
 	JButton nextpage=new JButton("��һҳ"); 
 	JButton previouspage=new JButton("��һҳ"); 
 //	JButton back=new JButton("������ѡ��"); 
 	JLabel changeto=new JLabel("��ת��"); 
 	JLabel page=new JLabel("ҳ"); 
 	JButton confirm=new JButton("ȷ��"); 
 	JTextField pageinput= new JTextField(); 
 	String[][] personalData; 
 	String[] columnnames={"ͼ����","ͼ������","����","������","����ʱ��","��������","����ʱ��"}; 
 	public SuperTable table; 
 	public JScrollPane jsp; 
	 
 	JLabel currentpage=new JLabel();  
 	ArrayList<String[][]> ALLData=new ArrayList(); 
 	
 	public PersonPanel(){ 
 		this.setLayout(null); 
		this.setSize(900, 700); 
 	 
	 
	 // 
 	} 
 	
 	void showPersonalBorrowPanle(/*ArrayList<BorrowMessage>*/String []borrowmessages){ 
 		table =new SuperTable(7,borrowmessages); 
 		table.setTableHeadHeight(23); 
		table.setCellSize(129, 45); 
 		 
 		table.setTextTableHead(columnnames); 
 		personalData=new String[borrowmessages.length][8]; 
 		for(int i=0;i<borrowmessages.length;i++)for(int j=0;j<7;j++)personalData[i][j]="1"; 
 		 
 		table.setPreferredSize(new Dimension(900, table.getHeight()+45)); 
 		jsp=new JScrollPane(table); 
 		//jsp��ʼ�� 
 		jsp.setBounds(0,0,1000,600); 
 		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
		jsp.setBackground(Color.white); 
 		this.add(jsp); 
 		this.setVisible(false); 
 		this.setVisible(true); 
 		 
 	} 
 
	 
 } 

