package shop;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.SystemColor;

@SuppressWarnings("unused")
public class ShopBuy extends JFrame{


    private final JLayeredPane layeredPane = new JLayeredPane();
    private JTextField textField_1;



    public ShopBuy() {
        initialize();
    }


    private void initialize() {

        setBackground(new Color(192, 226, 244));
        getContentPane().setBackground(new Color(250, 240, 230));
        setTitle("\u5546\u54C1\u652F\u4ED8\u754C\u9762");
        setBounds(100, 100, 438, 281);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        layeredPane.setBounds(0, 0, 420, 264);
        getContentPane().add(layeredPane);
        setVisible(true);

        JLabel lblNewLabel = new JLabel("\u80CC\u666F\u56FE\u7247");
        lblNewLabel.setIcon(new ImageIcon("D:\\IDEA\\share\\myvcampus\\vcampus_moon\\images\\ShopUser.jpg"));
        lblNewLabel.setBounds(0, -78, 436, 373);
        layeredPane.add(lblNewLabel);

        JLabel lblNewLabel_2 = new JLabel("\u5BC6\u7801");
        lblNewLabel_2.setBackground(UIManager.getColor("InternalFrame.inactiveTitleBackground"));
        layeredPane.setLayer(lblNewLabel_2, 1);
        lblNewLabel_2.setBounds(50, 54, 49, 33);
        layeredPane.add(lblNewLabel_2);

        textField_1 = new JTextField();
        textField_1.setBackground(SystemColor.inactiveCaption);
        layeredPane.setLayer(textField_1, 1);
        textField_1.setText("\u8BF7\u8F93\u5165\u4F60\u7684\u5BC6\u7801");
        textField_1.setColumns(10);
        textField_1.setBounds(134, 54, 196, 33);
        layeredPane.add(textField_1);
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

        JButton btnNewButton = new JButton("\u786E\u8BA4");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //cthread.handlePwdConfirm(textField_1.getText());
                // Message message = cthread.getREMessage();
                //if(message.getResponse())
                  JOptionPane.showMessageDialog(new JFrame().getContentPane(), "购买成功","购买提示页面", JOptionPane.INFORMATION_MESSAGE);
                //else
                //JOptionPane.showMessageDialog(new JFrame().getContentPane(), "购买不成功!","购买提示页面", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnNewButton.setBackground(new Color(255, 165, 0));
        layeredPane.setLayer(btnNewButton, 1);
        btnNewButton.setBounds(91, 127, 79, 27);
        layeredPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnNewButton_1.setBackground(SystemColor.inactiveCaption);
        layeredPane.setLayer(btnNewButton_1, 1);
        btnNewButton_1.setBounds(251, 127, 79, 27);
        layeredPane.add(btnNewButton_1);



    }
}
