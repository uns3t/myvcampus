package shop;
/**
 * 类 {@code ShopBuy} 购买商品界面.
 *
 * <p> 购买商品界面
 *
 * @since 2019/8/19
 */
import javax.swing.*;

import client.*;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.SystemColor;
import java.awt.Font;

@SuppressWarnings("unused")
public class ShopBuy extends JFrame{


    private final JLayeredPane layeredPane = new JLayeredPane();
    private JTextField textField;
    private JPasswordField passwordField;



    public ShopBuy(ClientThread cthread, String goodsname, int quantity, int price) {
        initialize(cthread, goodsname, quantity, price);
    }


    private void initialize(ClientThread cthread, String goodsname, int quantity, int price) {

        setBackground(new Color(192, 226, 244));
        getContentPane().setBackground(new Color(250, 240, 230));
        setTitle("\u5546\u54C1\u652F\u4ED8\u754C\u9762");
        setBounds(100, 100, 491, 344);
        getContentPane().setLayout(null);
        layeredPane.setBounds(0, 0, 477, 307);
        getContentPane().add(layeredPane);
        setVisible(true);

        ImageIcon image1 = new ImageIcon("images/shop_photo1.jpg");
        JLabel lblNewLabel = new JLabel(image1);
        lblNewLabel.setIcon(new ImageIcon("D:\\IDEA\\share\\myvcampus\\vcampus_moon\\images\\ShopUser.jpg"));
        lblNewLabel.setBounds(0, 0, 477, 307);
        layeredPane.add(lblNewLabel);

        JLabel lblNewLabel_2 = new JLabel("请输入密码：");
        lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 20));
        lblNewLabel_2.setBackground(UIManager.getColor("InternalFrame.inactiveTitleBackground"));
        layeredPane.setLayer(lblNewLabel_2, 1);
        lblNewLabel_2.setBounds(33, 124, 151, 33);
        layeredPane.add(lblNewLabel_2);

        JButton btnNewButton = new JButton("\u786E\u8BA4");
        btnNewButton.setFont(new Font("宋体", Font.BOLD, 20));
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int buyquant = Integer.valueOf(textField.getText());
            	String S_pwd = String.valueOf(passwordField.getPassword());
            	
            	cthread.handlePwdConfirm(S_pwd);
            	if(!cthread.getREMessage().getResponse())
            		JOptionPane.showMessageDialog(new JFrame().getContentPane(), "密码错误！","购买提示页面", JOptionPane.INFORMATION_MESSAGE);
            	else if(buyquant > quantity)
            		JOptionPane.showMessageDialog(new JFrame().getContentPane(), "购买数量超过上限" + quantity +"！","购买提示页面", JOptionPane.INFORMATION_MESSAGE);
            	else
            	{
            		cthread.handleBuyMessage(goodsname, buyquant);
            		if(cthread.getREMessage().getResponse())
            		{
            			JOptionPane.showMessageDialog(new JFrame().getContentPane(), "购买成功！共计花费" + price * buyquant + "元","购买提示页面", JOptionPane.INFORMATION_MESSAGE);
            			dispose();
            		}
            		else
            			JOptionPane.showMessageDialog(new JFrame().getContentPane(), "购买失败！","购买提示页面", JOptionPane.INFORMATION_MESSAGE);
            	}          		
            }
        });
        btnNewButton.setBackground(new Color(255, 165, 0));
        layeredPane.setLayer(btnNewButton, 2);
        btnNewButton.setBounds(92, 190, 107, 38);
        layeredPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");
        btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 20));
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnNewButton_1.setBackground(SystemColor.inactiveCaption);
        layeredPane.setLayer(btnNewButton_1, 1);
        btnNewButton_1.setBounds(245, 190, 107, 38);
        layeredPane.add(btnNewButton_1);
        
        JLabel label = new JLabel("请输入商品数量：");
        layeredPane.setLayer(label, 2);
        label.setFont(new Font("宋体", Font.BOLD, 20));
        label.setBackground(SystemColor.inactiveCaption);
        label.setBounds(33, 64, 166, 33);
        layeredPane.add(label);
        
        textField = new JTextField();
        layeredPane.setLayer(textField, 2);
        textField.setBounds(203, 64, 166, 38);
        layeredPane.add(textField);
        textField.setColumns(10);
        
        passwordField = new JPasswordField();
        layeredPane.setLayer(passwordField, 2);
        passwordField.setBounds(203, 124, 166, 38);
        layeredPane.add(passwordField);



    }
}
