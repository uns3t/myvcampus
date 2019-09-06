package shop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

import javax.swing.*;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;

public class Shoppage extends JFrame{


    private JTextField textField_1;
    private JTextField textField;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private final JLayeredPane layeredPane = new JLayeredPane();


    public Shoppage(/*Client client_shop*/) {

        initialize(/*client_shop*/);
    }

    private void initialize(/*Client client_shop*/) {
        //ClientThread cthread = new ClientThread(/*client_shop*/);
        setTitle("\u5546\u54C1\u7BA1\u7406\u754C\u9762(\u7BA1\u7406\u5458)");
        setBounds(100, 100, 414, 487);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setVisible(true);
        layeredPane.setBounds(-41, 0, 514, 440);
        getContentPane().add(layeredPane);
        setVisible(true);

        JLabel lblNewLabel_6 = new JLabel("\u80CC\u666F\u56FE\u7247");
        lblNewLabel_6.setIcon(new ImageIcon("D:\\IDEA\\share\\myvcampus\\vcampus_moon\\images\\Shoppage.jpg"));
        lblNewLabel_6.setBounds(40, -9, 1055, 578);
        layeredPane.add(lblNewLabel_6);


        JLabel lblNewLabel = new JLabel("\u5546\u54C1\u540D\u79F0");
        layeredPane.setLayer(lblNewLabel, 1);
        lblNewLabel.setBounds(71, 40, 72, 18);
        layeredPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("\u5546\u54C1\u7F16\u53F7");
        layeredPane.setLayer(lblNewLabel_1, 1);
        lblNewLabel_1.setBounds(71, 80, 72, 18);
        layeredPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("\u5546\u54C1\u6807\u4EF7");
        layeredPane.setLayer(lblNewLabel_2, 1);
        lblNewLabel_2.setBounds(72, 122, 72, 18);
        layeredPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("\u9500\u91CF");
        layeredPane.setLayer(lblNewLabel_3, 1);
        lblNewLabel_3.setBounds(71, 166, 72, 18);
        layeredPane.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("\u5E93\u5B58");
        layeredPane.setLayer(lblNewLabel_4, 1);
        lblNewLabel_4.setBounds(73, 210, 72, 18);
        layeredPane.add(lblNewLabel_4);

        textField_1 = new JTextField();//名称
        textField_1.setBackground(new Color(255, 255, 255));
        layeredPane.setLayer(textField_1, 1);
        textField_1.setBounds(175, 35, 163, 24);
        layeredPane.add(textField_1);
        textField_1.setText("\u8BF7\u8F93\u5165\u5546\u54C1\u540D\u79F0");
        textField_1.setColumns(10);
        textField_1.addMouseListener(new MouseListener() {


                                         @Override
                                         public void mouseClicked(MouseEvent e) {
                                             textField_1.setText("");
                                         }

                                         @Override
                                         public void mousePressed(MouseEvent e) {

                                         }

                                         @Override
                                         public void mouseReleased(MouseEvent e) {

                                         }

                                         @Override
                                         public void mouseEntered(MouseEvent e) {

                                         }

                                         @Override
                                         public void mouseExited(MouseEvent e) {

                                         }
                                     }
        );

        textField = new JTextField();//编号
        layeredPane.setLayer(textField, 1);
        textField.setBounds(176, 75, 162, 24);
        layeredPane.add(textField);
        textField.setText("\u8BF7\u8F93\u5165\u5546\u54C1\u7F16\u53F7");
        textField.setColumns(10);
        textField.addMouseListener(new MouseListener() {


                                       @Override
                                       public void mouseClicked(MouseEvent e) {
                                           textField.setText("");
                                       }

                                       @Override
                                       public void mousePressed(MouseEvent e) {

                                       }

                                       @Override
                                       public void mouseReleased(MouseEvent e) {

                                       }

                                       @Override
                                       public void mouseEntered(MouseEvent e) {

                                       }

                                       @Override
                                       public void mouseExited(MouseEvent e) {

                                       }
                                   }
        );

        textField_2 = new JTextField();//标价
        layeredPane.setLayer(textField_2, 1);
        textField_2.setBounds(176, 119, 162, 24);
        layeredPane.add(textField_2);
        textField_2.setText("\u8BF7\u8F93\u5165\u5546\u54C1\u6807\u4EF7");
        textField_2.setColumns(10);
        textField_2.addMouseListener(new MouseListener() {


                                         @Override
                                         public void mouseClicked(MouseEvent e) {
                                             textField_2.setText("");
                                         }

                                         @Override
                                         public void mousePressed(MouseEvent e) {

                                         }

                                         @Override
                                         public void mouseReleased(MouseEvent e) {

                                         }

                                         @Override
                                         public void mouseEntered(MouseEvent e) {

                                         }

                                         @Override
                                         public void mouseExited(MouseEvent e) {

                                         }
                                     }
        );

        textField_3 = new JTextField();//销量
        layeredPane.setLayer(textField_3, 1);
        textField_3.setBounds(176, 161, 163, 24);
        layeredPane.add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();//库存
        layeredPane.setLayer(textField_4, 1);
        textField_4.setBounds(176, 207, 163, 24);
        layeredPane.add(textField_4);
        textField_4.setColumns(10);

        JLabel lblNewLabel_5 = new JLabel("\u64CD\u4F5C\u7C7B\u578B");
        layeredPane.setLayer(lblNewLabel_5, 1);
        lblNewLabel_5.setBounds(72, 271, 72, 18);
        layeredPane.add(lblNewLabel_5);

        JButton btnNewButton = new JButton("\u4E0A\u67B6");//上架
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //cthread.handleAddGood(textField_1.getText(),textField.getText(),Integer.parseInt(textField_2.getText()),Integer.parseInt(textField_3.getText()),Integer.parseInt(textField_4.getText()));
                // Message message = cthread.getREMessage();
                //if(message.getResponse())
                //   JOptionPane.showMessageDialog(new JFrame().getContentPane(), "上架成功","上架提示页面", JOptionPane.INFORMATION_MESSAGE);
                //else
                JOptionPane.showMessageDialog(new JFrame().getContentPane(), "上架不成功!","上架提示页面", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnNewButton.setBackground(new Color(255, 165, 0));
        layeredPane.setLayer(btnNewButton, 1);
        btnNewButton.setBounds(177, 267, 78, 27);
        layeredPane.add(btnNewButton);



        JButton btnNewButton_1 = new JButton("\u4E0B\u67B6");//下架
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //cthread.handleDeleteGoodMessage(textField.getText());
                //Message message2 = cthread.getREMessage();
                //if(message2.getResponse())
                //   JOptionPane.showMessageDialog(new JFrame().getContentPane(), "下架成功","下架提示页面", JOptionPane.INFORMATION_MESSAGE);
                // else
                JOptionPane.showMessageDialog(new JFrame().getContentPane(), "下架不成功!","下架提示页面", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnNewButton_1.setBackground(new Color(255, 165, 0));
        layeredPane.setLayer(btnNewButton_1, 1);
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });;
        btnNewButton_1.setBounds(284, 267, 78, 27);
        layeredPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("\u8FD4\u56DE");
        btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnNewButton_2.setBackground(new Color(144, 238, 144));
        layeredPane.setLayer(btnNewButton_2, 1);
        btnNewButton_2.setBounds(331, 338, 72, 27);
        layeredPane.add(btnNewButton_2);


    }
}


