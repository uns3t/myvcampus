package book;
/**
 * 类 {@code HomePanel} 图书馆首页.
 *
 * <p> 图书馆首页
 *
 * @since 2019/8/19
 */
import client.*;
import message.*;
import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel{


	private JLayeredPane layeredPane;
	JLabel welcome=new JLabel("欢迎进入图书馆系统！");
	JLabel select= new JLabel("请选择上方功能。");
	JButton add_Button=new JButton("添加书籍");
	JButton show_Button=new JButton("展示书籍");
	JButton Program_Button=new JButton("书籍管理");

	JLabel home;
	JLabel lblNewLabel_1;
	int admin=1;
	ImageIcon imp;
	AddBook add_frame;
	BookInf show_frame;
	LibAdmin Program_frame;
	ClientThread mcthread;

	public HomePanel(/*ClientThread cthread*/){
		//mcthread = cthread;


		//this.setBackground();
		setBounds(100, 100, 1124, 717);
		this.setLayout(null);

		imp=new ImageIcon("vcampus_moon/images/timg.jpg");


		add_Button.setBorderPainted(false);
		add_Button.setBackground(new Color(240, 248, 255));
//		welcome.setBackground(new Color(240, 248, 255));
//		select.setBackground(new Color(240, 248, 255));
		show_Button.setBorderPainted(false);
		show_Button.setBackground(new Color(240, 248, 255));
		Program_Button.setBorderPainted(false);
		Program_Button.setBackground(new Color(240, 248, 255));


		home = new JLabel(imp);
		home.setFont(new Font("宋体", Font.BOLD, 40));
		home.setForeground(new Color(100, 149, 237));
		home.setBounds( 0,0,1124, 717);

		layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(224, 255, 255));
		layeredPane.setBounds(0, 0, 1110, 680);
				welcome.setForeground(new Color(100, 149, 237));
		
		
		//		layeredPane = new JLayeredPane();
		//		layeredPane.setBackground(new Color(224, 255, 255));
		//		layeredPane.setBounds(0, 0, 1110, 680);
		//		layeredPane.add(home, JLayeredPane.DEFAULT_LAYER);
		//		layeredPane.add(welcome, JLayeredPane.DEFAULT_LAYER);
		//		layeredPane.add(select, JLayeredPane.DEFAULT_LAYER);
		//		this.add(layeredPane);
				welcome.setBounds(305,15,474,182);
				welcome.setBackground(new Color(224, 255, 255));
				welcome.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,40));
				layeredPane.add(welcome, JLayeredPane.DEFAULT_LAYER);
		select.setForeground(new Color(100, 149, 237));
		select.setBounds(105,41,750,300);
		select.setFont(new Font("微软雅黑",Font.ROMAN_BASELINE,40));
		layeredPane.add(select, JLayeredPane.DEFAULT_LAYER);
		select.setEnabled(true);
		layeredPane.add(home, JLayeredPane.DEFAULT_LAYER);
		this.add(layeredPane);

	//	getContentPane().
	//	this.add(home);
	//	this.add(welcome);
	//	this.add(select);


		this.setVisible(false);
		this.setVisible(true);

	}

}


