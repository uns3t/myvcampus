package shop;

import client.ClientThread;
import message.*;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Icon;

/**
 * @author HP
 */
public class ShopUser extends JFrame{
    private JTextField textField_4;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_14;
    private JTextField textField_15;
    private JTextField textField_16;
    private JTextField textField_17;
    private JTextField textField_18;
    private JTextField textField_19;
    private JTextField textField_21;
    private JTextField textField_22;
    private JTextField textField_23;
    private JTextField textField_3;
    private JTextField textField_5;
    private JLabel label_1;
    private JLabel label_2;
    private JLabel label_3;
    private JTextField textField_12;
    private JLabel label_4;
    private JLabel label_5;
    private JLabel label_6;
    private JTextField textField_13;
    private JLabel label_7;
    private JButton button_4;
    private JButton button_5;
    private JTextField textField_20;
    private JTextField textField_24;
    private JTextField textField_25;
    private JTextField textField_26;
    private JTextField textField_27;
    private JTextField textField_28;
    private ArrayList<GoodsInfo> goodsinfo, tempinfo;
    private int number, pagenum, currentpage;

    /**
     * Launch the application.
     */


    /**
     * Create the application.
     */
    public ShopUser(ClientThread cthread) {
        initialize(cthread);
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize (ClientThread cthread) {
        cthread.handleShowGoodsMessage();
        ShopMessage smessage = (ShopMessage)cthread.getREMessage().getData();
        goodsinfo = smessage.getGoodsInfo();
        number = goodsinfo.size();
        pagenum = (number + 4) / 5;
        currentpage = 1;
        
        tempinfo.clear();
        for(int i = (currentpage - 1) * 5; i < (currentpage * 5 < number ? currentpage * 5 : number); i++)
        	tempinfo.add(goodsinfo.get(i));
        initText();

        getContentPane().setBackground(SystemColor.control);
        setBackground(new Color(210, 180, 140));
        setTitle("\u9009\u62E9\u5546\u54C1\u754C\u9762\uFF08\u7528\u6237\uFF09");
        setBounds(100, 100, 1046, 615);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setVisible(true);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(-1, 0, 1033, 578);
        getContentPane().add(layeredPane);
        layeredPane.setLayout(null);

        textField_4 = new JTextField();
        textField_4.setBounds(0, 85, 86, -61);
        layeredPane.setLayer(textField_4, 1);
        layeredPane.add(textField_4);
        textField_4.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("");
        layeredPane.setLayer(lblNewLabel_4, 0);
        lblNewLabel_4.setIcon(new ImageIcon("D:\\IDEA\\share\\myvcampus\\vcampus_moon\\images\\ShopBuy.jpg"));
        lblNewLabel_4.setBounds(0, 0, 1033, 578);
        layeredPane.add(lblNewLabel_4);
        
        textField = new JTextField();
        layeredPane.setLayer(textField, 2);
        textField.setText("\u5546\u54C1\u7F16\u53F7");
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setFont(new Font("宋体", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setColumns(10);
        textField.setBackground(new Color(224, 255, 255));
        textField.setBounds(71, 143, 116, 54);
        layeredPane.add(textField);
        
        textField_1 = new JTextField();
        layeredPane.setLayer(textField_1, 2);
        textField_1.setText("\u5546\u54C1\u540D\u79F0");
        textField_1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_1.setFont(new Font("宋体", Font.BOLD, 20));
        textField_1.setEditable(false);
        textField_1.setColumns(10);
        textField_1.setBackground(new Color(224, 255, 255));
        textField_1.setBounds(186, 143, 166, 54);
        layeredPane.add(textField_1);
        
        textField_2 = new JTextField();
        layeredPane.setLayer(textField_2, 2);
        textField_2.setText("\u53EF\u8D2D\u4E70\u6570\u91CF");
        textField_2.setHorizontalAlignment(SwingConstants.CENTER);
        textField_2.setFont(new Font("宋体", Font.BOLD, 20));
        textField_2.setEditable(false);
        textField_2.setColumns(10);
        textField_2.setBackground(new Color(224, 255, 255));
        textField_2.setBounds(351, 143, 147, 54);
        layeredPane.add(textField_2);
        
        textField_6 = new JTextField();
        layeredPane.setLayer(textField_6, 2);
        textField_6.setHorizontalAlignment(SwingConstants.CENTER);
        textField_6.setFont(new Font("宋体", Font.BOLD, 20));
        textField_6.setEditable(false);
        textField_6.setColumns(10);
        textField_6.setBackground(Color.WHITE);
        textField_6.setBounds(351, 196, 147, 54);
        layeredPane.add(textField_6);
        
        textField_7 = new JTextField();
        layeredPane.setLayer(textField_7, 2);
        textField_7.setHorizontalAlignment(SwingConstants.CENTER);
        textField_7.setFont(new Font("宋体", Font.BOLD, 20));
        textField_7.setEditable(false);
        textField_7.setColumns(10);
        textField_7.setBackground(Color.WHITE);
        textField_7.setBounds(186, 196, 166, 54);
        layeredPane.add(textField_7);
        
        textField_8 = new JTextField();
        layeredPane.setLayer(textField_8, 2);
        textField_8.setHorizontalAlignment(SwingConstants.CENTER);
        textField_8.setFont(new Font("宋体", Font.BOLD, 20));
        textField_8.setEditable(false);
        textField_8.setColumns(10);
        textField_8.setBackground(Color.WHITE);
        textField_8.setBounds(71, 196, 116, 54);
        layeredPane.add(textField_8);
        
        textField_9 = new JTextField();
        layeredPane.setLayer(textField_9, 2);
        textField_9.setHorizontalAlignment(SwingConstants.CENTER);
        textField_9.setFont(new Font("宋体", Font.BOLD, 20));
        textField_9.setEditable(false);
        textField_9.setColumns(10);
        textField_9.setBackground(Color.WHITE);
        textField_9.setBounds(71, 248, 116, 54);
        layeredPane.add(textField_9);
        
        textField_10 = new JTextField();
        layeredPane.setLayer(textField_10, 2);
        textField_10.setHorizontalAlignment(SwingConstants.CENTER);
        textField_10.setFont(new Font("宋体", Font.BOLD, 20));
        textField_10.setEditable(false);
        textField_10.setColumns(10);
        textField_10.setBackground(Color.WHITE);
        textField_10.setBounds(186, 248, 166, 54);
        layeredPane.add(textField_10);
        
        textField_11 = new JTextField();
        layeredPane.setLayer(textField_11, 2);
        textField_11.setHorizontalAlignment(SwingConstants.CENTER);
        textField_11.setFont(new Font("宋体", Font.BOLD, 20));
        textField_11.setEditable(false);
        textField_11.setColumns(10);
        textField_11.setBackground(Color.WHITE);
        textField_11.setBounds(351, 248, 147, 54);
        layeredPane.add(textField_11);
        
        textField_14 = new JTextField();
        layeredPane.setLayer(textField_14, 2);
        textField_14.setHorizontalAlignment(SwingConstants.CENTER);
        textField_14.setFont(new Font("宋体", Font.BOLD, 20));
        textField_14.setEditable(false);
        textField_14.setColumns(10);
        textField_14.setBackground(Color.WHITE);
        textField_14.setBounds(351, 301, 147, 54);
        layeredPane.add(textField_14);
        
        textField_15 = new JTextField();
        layeredPane.setLayer(textField_15, 2);
        textField_15.setHorizontalAlignment(SwingConstants.CENTER);
        textField_15.setFont(new Font("宋体", Font.BOLD, 20));
        textField_15.setEditable(false);
        textField_15.setColumns(10);
        textField_15.setBackground(Color.WHITE);
        textField_15.setBounds(186, 301, 166, 54);
        layeredPane.add(textField_15);
        
        textField_16 = new JTextField();
        layeredPane.setLayer(textField_16, 2);
        textField_16.setHorizontalAlignment(SwingConstants.CENTER);
        textField_16.setFont(new Font("宋体", Font.BOLD, 20));
        textField_16.setEditable(false);
        textField_16.setColumns(10);
        textField_16.setBackground(Color.WHITE);
        textField_16.setBounds(71, 301, 116, 54);
        layeredPane.add(textField_16);
        
        textField_17 = new JTextField();
        layeredPane.setLayer(textField_17, 2);
        textField_17.setHorizontalAlignment(SwingConstants.CENTER);
        textField_17.setFont(new Font("宋体", Font.BOLD, 20));
        textField_17.setEditable(false);
        textField_17.setColumns(10);
        textField_17.setBackground(Color.WHITE);
        textField_17.setBounds(71, 354, 116, 54);
        layeredPane.add(textField_17);
        
        textField_18 = new JTextField();
        layeredPane.setLayer(textField_18, 2);
        textField_18.setHorizontalAlignment(SwingConstants.CENTER);
        textField_18.setFont(new Font("宋体", Font.BOLD, 20));
        textField_18.setEditable(false);
        textField_18.setColumns(10);
        textField_18.setBackground(Color.WHITE);
        textField_18.setBounds(186, 354, 166, 54);
        layeredPane.add(textField_18);
        
        textField_19 = new JTextField();
        layeredPane.setLayer(textField_19, 2);
        textField_19.setHorizontalAlignment(SwingConstants.CENTER);
        textField_19.setFont(new Font("宋体", Font.BOLD, 20));
        textField_19.setEditable(false);
        textField_19.setColumns(10);
        textField_19.setBackground(Color.WHITE);
        textField_19.setBounds(351, 354, 147, 54);
        layeredPane.add(textField_19);
        
        textField_21 = new JTextField();
        layeredPane.setLayer(textField_21, 2);
        textField_21.setHorizontalAlignment(SwingConstants.CENTER);
        textField_21.setFont(new Font("宋体", Font.BOLD, 20));
        textField_21.setEditable(false);
        textField_21.setColumns(10);
        textField_21.setBackground(Color.WHITE);
        textField_21.setBounds(71, 407, 116, 54);
        layeredPane.add(textField_21);
        
        textField_22 = new JTextField();
        layeredPane.setLayer(textField_22, 2);
        textField_22.setHorizontalAlignment(SwingConstants.CENTER);
        textField_22.setFont(new Font("宋体", Font.BOLD, 20));
        textField_22.setEditable(false);
        textField_22.setColumns(10);
        textField_22.setBackground(Color.WHITE);
        textField_22.setBounds(186, 407, 166, 54);
        layeredPane.add(textField_22);
        
        textField_23 = new JTextField();
        layeredPane.setLayer(textField_23, 2);
        textField_23.setHorizontalAlignment(SwingConstants.CENTER);
        textField_23.setFont(new Font("宋体", Font.BOLD, 20));
        textField_23.setEditable(false);
        textField_23.setColumns(10);
        textField_23.setBackground(Color.WHITE);
        textField_23.setBounds(351, 407, 147, 54);
        layeredPane.add(textField_23);
        
        JButton btnNewButton = new JButton("\u8D2D\u4E70");
        btnNewButton.setEnabled(false);
        layeredPane.setLayer(btnNewButton, 2);
        btnNewButton.setFont(new Font("宋体", Font.BOLD, 19));
        btnNewButton.setBounds(687, 203, 97, 41);
        layeredPane.add(btnNewButton);
        
        JButton button = new JButton("\u8D2D\u4E70");
        button.setEnabled(false);
        layeredPane.setLayer(button, 2);
        button.setFont(new Font("宋体", Font.BOLD, 19));
        button.setBounds(687, 255, 97, 41);
        layeredPane.add(button);
        
        JButton button_1 = new JButton("\u8D2D\u4E70");
        button_1.setEnabled(false);
        layeredPane.setLayer(button_1, 2);
        button_1.setFont(new Font("宋体", Font.BOLD, 19));
        button_1.setBounds(687, 308, 97, 41);
        layeredPane.add(button_1);
        
        JButton button_2 = new JButton("\u8D2D\u4E70");
        button_2.setEnabled(false);
        layeredPane.setLayer(button_2, 2);
        button_2.setFont(new Font("宋体", Font.BOLD, 19));
        button_2.setBounds(687, 361, 97, 41);
        layeredPane.add(button_2);
        
        JButton button_3 = new JButton("\u8D2D\u4E70");
        button_3.setEnabled(false);
        layeredPane.setLayer(button_3, 2);
        button_3.setFont(new Font("宋体", Font.BOLD, 19));
        button_3.setBounds(687, 414, 97, 41);
        layeredPane.add(button_3);
        
        JLabel lblNewLabel = new JLabel("\u7F51\u4E0A\u5546\u5E97v1.0");
        lblNewLabel.setFont(new Font("宋体", Font.BOLD, 24));
        layeredPane.setLayer(lblNewLabel, 2);
        lblNewLabel.setBounds(458, 40, 220, 41);
        layeredPane.add(lblNewLabel);
        
        ImageIcon image = new ImageIcon("images/seu.jpg");
        JLabel label = new JLabel(image);
        layeredPane.setLayer(label, 2);
        label.setBounds(272, 10, 116, 112);
        layeredPane.add(label);
        
        textField_3 = new JTextField();
        layeredPane.setLayer(textField_3, 2);
        textField_3.setBorder(null);
        textField_3.setOpaque(true);
        textField_3.setHorizontalAlignment(SwingConstants.CENTER);
        textField_3.setFont(new Font("宋体", Font.BOLD, 20));
        textField_3.setEditable(false);
        textField_3.setColumns(10);
        textField_3.setBackground(Color.WHITE);
        textField_3.setBounds(834, 183, 166, 54);
        layeredPane.add(textField_3);
        
        textField_5 = new JTextField();
        layeredPane.setLayer(textField_5, 2);
        textField_5.setBorder(null);
        textField_5.setOpaque(true);
        textField_5.setHorizontalAlignment(SwingConstants.CENTER);
        textField_5.setFont(new Font("宋体", Font.BOLD, 20));
        textField_5.setEditable(false);
        textField_5.setColumns(10);
        textField_5.setBackground(Color.WHITE);
        textField_5.setBounds(834, 247, 166, 54);
        layeredPane.add(textField_5);
        
        label_1 = new JLabel("\u7528\u6237\u4FE1\u606F\uFF1A");
        layeredPane.setLayer(label_1, 2);
        label_1.setFont(new Font("宋体", Font.BOLD, 24));
        label_1.setBounds(856, 121, 177, 41);
        layeredPane.add(label_1);
        
        label_2 = new JLabel("\u7528\u6237\u72B6\u6001\uFF1A");
        layeredPane.setLayer(label_2, 2);
        label_2.setFont(new Font("宋体", Font.BOLD, 24));
        label_2.setBounds(856, 353, 177, 41);
        layeredPane.add(label_2);
        
        label_3 = new JLabel("\u6B63\u5E38");
        layeredPane.setLayer(label_3, 2);
        label_3.setFont(new Font("宋体", Font.BOLD, 24));
        label_3.setBounds(886, 406, 124, 41);
        layeredPane.add(label_3);
        
        textField_12 = new JTextField();
        layeredPane.setLayer(textField_12, 2);
        textField_12.setText("1");
        textField_12.setHorizontalAlignment(SwingConstants.CENTER);
        textField_12.setFont(new Font("宋体", Font.BOLD, 18));
        textField_12.setEditable(false);
        textField_12.setColumns(10);
        textField_12.setBackground(Color.WHITE);
        textField_12.setBounds(136, 487, 43, 45);
        layeredPane.add(textField_12);
        
        label_4 = new JLabel("第");
        layeredPane.setLayer(label_4, 2);
        label_4.setHorizontalAlignment(SwingConstants.CENTER);
        label_4.setFont(new Font("宋体", Font.BOLD, 20));
        label_4.setBounds(98, 487, 50, 45);
        layeredPane.add(label_4);
        
        label_5 = new JLabel("页");
        layeredPane.setLayer(label_5, 2);
        label_5.setHorizontalAlignment(SwingConstants.CENTER);
        label_5.setFont(new Font("宋体", Font.BOLD, 18));
        label_5.setBounds(164, 487, 50, 45);
        layeredPane.add(label_5);
        
        label_6 = new JLabel("/共");
        layeredPane.setLayer(label_6, 2);
        label_6.setHorizontalAlignment(SwingConstants.CENTER);
        label_6.setFont(new Font("宋体", Font.BOLD, 18));
        label_6.setBounds(200, 487, 50, 45);
        layeredPane.add(label_6);
        
        textField_13 = new JTextField();
        layeredPane.setLayer(textField_13, 2);
        textField_13.setText(String.valueOf(pagenum));
        textField_13.setHorizontalAlignment(SwingConstants.CENTER);
        textField_13.setFont(new Font("宋体", Font.BOLD, 18));
        textField_13.setEditable(false);
        textField_13.setColumns(10);
        textField_13.setBackground(Color.WHITE);
        textField_13.setBounds(242, 487, 43, 45);
        layeredPane.add(textField_13);
        
        label_7 = new JLabel("页");
        layeredPane.setLayer(label_7, 2);
        label_7.setHorizontalAlignment(SwingConstants.CENTER);
        label_7.setFont(new Font("宋体", Font.BOLD, 20));
        label_7.setBounds(276, 487, 50, 45);
        layeredPane.add(label_7);
        
        button_4 = new JButton("上一页");
        button_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(currentpage > 1)
        		{
        			currentpage--;
        		}
        	}
        });
        layeredPane.setLayer(button_4, 2);
        button_4.setFont(new Font("宋体", Font.BOLD, 20));
        button_4.setBounds(367, 487, 104, 45);
        layeredPane.add(button_4);
        
        button_5 = new JButton("下一页");
        layeredPane.setLayer(button_5, 2);
        button_5.setFont(new Font("宋体", Font.BOLD, 20));
        button_5.setBounds(485, 487, 104, 45);
        layeredPane.add(button_5);
        
        textField_20 = new JTextField();
        layeredPane.setLayer(textField_20, 2);
        textField_20.setText("\u5355\u4EF7");
        textField_20.setHorizontalAlignment(SwingConstants.CENTER);
        textField_20.setFont(new Font("宋体", Font.BOLD, 20));
        textField_20.setEditable(false);
        textField_20.setColumns(10);
        textField_20.setBackground(new Color(224, 255, 255));
        textField_20.setBounds(497, 143, 147, 54);
        layeredPane.add(textField_20);
        
        textField_24 = new JTextField();
        layeredPane.setLayer(textField_24, 2);
        textField_24.setHorizontalAlignment(SwingConstants.CENTER);
        textField_24.setFont(new Font("宋体", Font.BOLD, 20));
        textField_24.setEditable(false);
        textField_24.setColumns(10);
        textField_24.setBackground(Color.WHITE);
        textField_24.setBounds(497, 196, 147, 54);
        layeredPane.add(textField_24);
        
        textField_25 = new JTextField();
        layeredPane.setLayer(textField_25, 2);
        textField_25.setHorizontalAlignment(SwingConstants.CENTER);
        textField_25.setFont(new Font("宋体", Font.BOLD, 20));
        textField_25.setEditable(false);
        textField_25.setColumns(10);
        textField_25.setBackground(Color.WHITE);
        textField_25.setBounds(497, 248, 147, 54);
        layeredPane.add(textField_25);
        
        textField_26 = new JTextField();
        layeredPane.setLayer(textField_26, 2);
        textField_26.setHorizontalAlignment(SwingConstants.CENTER);
        textField_26.setFont(new Font("宋体", Font.BOLD, 20));
        textField_26.setEditable(false);
        textField_26.setColumns(10);
        textField_26.setBackground(Color.WHITE);
        textField_26.setBounds(497, 301, 147, 54);
        layeredPane.add(textField_26);
        
        textField_27 = new JTextField();
        layeredPane.setLayer(textField_27, 2);
        textField_27.setHorizontalAlignment(SwingConstants.CENTER);
        textField_27.setFont(new Font("宋体", Font.BOLD, 20));
        textField_27.setEditable(false);
        textField_27.setColumns(10);
        textField_27.setBackground(Color.WHITE);
        textField_27.setBounds(497, 354, 147, 54);
        layeredPane.add(textField_27);
        
        textField_28 = new JTextField();
        layeredPane.setLayer(textField_28, 2);
        textField_28.setHorizontalAlignment(SwingConstants.CENTER);
        textField_28.setFont(new Font("宋体", Font.BOLD, 20));
        textField_28.setEditable(false);
        textField_28.setColumns(10);
        textField_28.setBackground(Color.WHITE);
        textField_28.setBounds(497, 407, 147, 54);
        layeredPane.add(textField_28);
    }
    
    
    public void initText()
    {
    	int num = tempinfo.size();
    	
    	switch(num)
    	{
    	case 5:
    		textField_21.setText(tempinfo.get(4).getGoods_id());
    		textField_22.setText(tempinfo.get(4).getGoods_name());
    		textField_23.setText(String.valueOf(Integer.valueOf(tempinfo.get(4).getGoods_quantity()) - Integer.valueOf(tempinfo.get(4).getGoods_sales())));
    		textField_28.setText(tempinfo.get(4).getGoods_name());
    		
    	case 4:
    		textField_17.setText(tempinfo.get(3).getGoods_id());
    		textField_18.setText(tempinfo.get(3).getGoods_name());
    		textField_19.setText(String.valueOf(Integer.valueOf(tempinfo.get(3).getGoods_quantity()) - Integer.valueOf(tempinfo.get(3).getGoods_sales())));
    		textField_27.setText(tempinfo.get(3).getGoods_name());
    		
    	case 3:
    		textField_16.setText(tempinfo.get(2).getGoods_id());
    		textField_15.setText(tempinfo.get(2).getGoods_name());
    		textField_14.setText(String.valueOf(Integer.valueOf(tempinfo.get(2).getGoods_quantity()) - Integer.valueOf(tempinfo.get(2).getGoods_sales())));
    		textField_26.setText(tempinfo.get(2).getGoods_name());
    		
    	case 2:
    		textField_9.setText(tempinfo.get(1).getGoods_id());
    		textField_10.setText(tempinfo.get(1).getGoods_name());
    		textField_11.setText(String.valueOf(Integer.valueOf(tempinfo.get(1).getGoods_quantity()) - Integer.valueOf(tempinfo.get(1).getGoods_sales())));
    		textField_25.setText(tempinfo.get(1).getGoods_name());
    		
    	case 1:
    		textField_8.setText(tempinfo.get(0).getGoods_id());
    		textField_7.setText(tempinfo.get(0).getGoods_name());
    		textField_6.setText(String.valueOf(Integer.valueOf(tempinfo.get(0).getGoods_quantity()) - Integer.valueOf(tempinfo.get(0).getGoods_sales())));
    		textField_24.setText(tempinfo.get(0).getGoods_name());
    		break;
    		
    	default:
    		break;
    	}
    }
}


