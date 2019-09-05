package shop;

import client.Client;
import client.ClientThread;
import message.GoodsInfo;
import message.ShopMessage;
import message.StudentMessage;
import message.Studentinfo;

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
import java.io.IOException;
import java.util.ArrayList;

public class ShopUser extends JFrame{


    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JButton btnNewButton_1;
    private String name, id;
    private int price,quantity,sales;


   public ShopUser() {

        //ClientThread cthread  = new ClientThread(client);
       // ShopMessage list = (ShopMessage)cthread.getREMessage().getData();
        initialize(/*ClientThread cthread*/);
    }


    /**
     * Initialize the contents of the frame.
     */
    private void initialize(/*ClientThread cthread*/) {
        //cthread.handleShowGoodsMessage();
        //ShopMessage message = (ShopMessage)cthread.getREMessage().getData();
        //ArrayList<GoodsInfo> GoodsInfo = message.getGoodsInfo();

        //GoodsInfo ginfo= GoodsInfo.get(0);
        //name = ginfo.getGoods_name();
        //id = ginfo.getGoods_id();
       // price = ginfo.getGoods_price();
       // quantity = ginfo.getGoods_quantity();
        //sales = ginfo.getGoods_sales();

        //name = textField_1.getText();
        //id = textField_5.getText();
       // price = Integer.parseInt(textField_2.getText());
        //quantity = Integer.parseInt(textField_6.getText());
        //sales = Integer.parseInt(textField_4.getText());


        getContentPane().setBackground(SystemColor.control);
        setBackground(SystemColor.activeCaption);
       setTitle("\u9009\u62E9\u5546\u54C1\u754C\u9762\uFF08\u7528\u6237\uFF09");
        setBounds(100, 100, 492, 324);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setVisible(true);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(-1, 0, 475, 277);
        getContentPane().add(layeredPane);
        layeredPane.setLayout(null);

        JButton btnNewButton = new JButton("\u8D2D\u4E70");
        btnNewButton.setBounds(302, 142, 113, 27);
        layeredPane.setLayer(btnNewButton, 1);
        layeredPane.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ShopBuy();
            }
        });
        btnNewButton.setBackground(new Color(210, 180, 140));

        JButton button = new JButton("\u8D2D\u4E70");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ShopBuy();
            }
        });
        button.setBounds(302, 95, 113, 27);
        layeredPane.setLayer(button, 1);
        layeredPane.add(button);
        button.setBackground(new Color(210, 180, 140));

        JButton button_1 = new JButton("\u8D2D\u4E70");
        button_1.setBounds(302, 118, 113, 27);
        layeredPane.setLayer(button_1, 1);
        layeredPane.add(button_1);
        button_1.setBackground(new Color(210, 180, 140));

        textField_7 = new JTextField();
        textField_7.setBounds(52, 143, 86, 24);
        layeredPane.add(textField_7);
        textField_7.setColumns(10);

        textField_8 = new JTextField();
        textField_8.setBounds(137, 119, 86, 24);
        layeredPane.setLayer(textField_8, 1);
        layeredPane.add(textField_8);
        textField_8.setColumns(10);

        textField_6 = new JTextField();
        textField_6.setBounds(221, 96, 86, 24);
        layeredPane.setLayer(textField_6, 1);
        layeredPane.add(textField_6);
        textField_6.setColumns(10);

        textField_5 = new JTextField();
        textField_5.setBounds(137, 96, 86, 24);
        layeredPane.setLayer(textField_5, 1);
        layeredPane.add(textField_5);
        textField_5.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(52, 119, 86, 24);
        layeredPane.setLayer(textField_3, 1);
        layeredPane.add(textField_3);
        textField_3.setColumns(10);

        JLabel lblNewLabel = new JLabel("\u5546\u54C1\u7F16\u53F7");
        lblNewLabel.setBounds(62, 65, 72, 18);
        layeredPane.setLayer(lblNewLabel, 1);
        layeredPane.add(lblNewLabel);
        lblNewLabel.setBackground(new Color(210, 180, 140));

        JLabel lblNewLabel_1 = new JLabel("\u5546\u54C1\u540D\u79F0");
        lblNewLabel_1.setBounds(137, 65, 72, 18);
        layeredPane.setLayer(lblNewLabel_1, 1);
        layeredPane.add(lblNewLabel_1);
        lblNewLabel_1.setBackground(new Color(210, 180, 140));

        JLabel lblNewLabel_2 = new JLabel("\u5546\u54C1\u6570\u91CF");
        lblNewLabel_2.setBounds(221, 65, 72, 18);
        layeredPane.setLayer(lblNewLabel_2, 1);
        layeredPane.add(lblNewLabel_2);
        lblNewLabel_2.setBackground(new Color(210, 180, 140));

        JLabel lblNewLabel_3 = new JLabel("\u64CD\u4F5C\u7C7B\u578B");
        lblNewLabel_3.setBounds(320, 64, 72, 18);
        layeredPane.setLayer(lblNewLabel_3, 1);
        layeredPane.add(lblNewLabel_3);
        lblNewLabel_3.setBackground(new Color(210, 180, 140));

        textField = new JTextField();
        textField.setBounds(221, 143, 86, 24);
        layeredPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(52, 96, 86, 24);
        layeredPane.setLayer(textField_1, 1);
        layeredPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(137, 143, 86, 24);
        layeredPane.setLayer(textField_2, 1);
        layeredPane.add(textField_2);
        textField_2.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(0, 85, 86, -61);
        layeredPane.setLayer(textField_4, 1);
        layeredPane.add(textField_4);
        textField_4.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("\u80CC\u666F\u56FE\u7247");
        lblNewLabel_4.setIcon(new ImageIcon("D:\\IDEA\\share\\myvcampus\\vcampus_moon\\images\\ShopBuy.jpg"));
        lblNewLabel_4.setBounds(0, 0, 485, 277);
        layeredPane.add(lblNewLabel_4);

        textField_9 = new JTextField();
        layeredPane.setLayer(textField_9, 1);
        textField_9.setBounds(221, 119, 86, 24);
        layeredPane.add(textField_9);
        textField_9.setColumns(10);
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ShopBuy();
            }
        });

        btnNewButton_1 = new JButton("\u8FD4\u56DE");
        btnNewButton_1.setBackground(new Color(95, 158, 160));
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        layeredPane.setLayer(btnNewButton_1, 1);
        btnNewButton_1.setBounds(378, 223, 72, 27);
        layeredPane.add(btnNewButton_1);


    }
}