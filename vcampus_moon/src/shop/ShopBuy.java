package shop;
/*
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShopBuy {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;


    /**
     * Launch the application.
     */
/*
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    ShopBuy window = new ShopBuy();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     *//*
    public ShopBuy() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     *//*
    private void initialize() {
        frame = new JFrame();
        frame.setBackground(new Color(244, 164, 96));
        frame.getContentPane().setBackground(new Color(250, 240, 230));
        frame.setTitle("\u5546\u54C1\u652F\u4ED8\u754C\u9762");
        frame.setBounds(100, 100, 429, 294);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);

        JLabel lblNewLabel = new JLabel("\u8D26\u53F7");
        lblNewLabel.setBounds(81, 64, 48, 18);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801");
        lblNewLabel_1.setBounds(81, 95, 48, 18);
        frame.getContentPane().add(lblNewLabel_1);

        textField = new JTextField();
        textField.setText("\u8BF7\u8F93\u5165\u4F60\u7684\u8D26\u53F7");
        textField.setBounds(161, 61, 139, 24);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setText("\u8BF7\u8F93\u5165\u4F60\u7684\u5BC6\u7801");
        textField_1.setColumns(10);
        textField_1.setBounds(161, 92, 139, 24);
        frame.getContentPane().add(textField_1);

        JButton btnNewButton = new JButton("\u786E\u8BA4");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton.setBackground(new Color(255, 140, 0));
        btnNewButton.setBounds(81, 153, 90, 27);
        frame.getContentPane().add(btnNewButton);

        JButton button = new JButton("\u53D6\u6D88");
        button.setBackground(new Color(220, 220, 220));
        button.setBounds(210, 153, 90, 27);
        frame.getContentPane().add(button);
    }

}*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.SystemColor;

@SuppressWarnings("unused")
public class ShopBuy extends JFrame{


    private final JLayeredPane layeredPane = new JLayeredPane();
    private JTextField textField;
    private JTextField textField_1;



    public ShopBuy() {
        initialize();
    }


    private void initialize() {

        setBackground(new Color(192, 226, 244));
        getContentPane().setBackground(new Color(250, 240, 230));
        setTitle("\u5546\u54C1\u652F\u4ED8\u754C\u9762");
        setBounds(100, 100, 438, 298);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        layeredPane.setBounds(0, 0, 420, 264);
        getContentPane().add(layeredPane);
        setVisible(true);

        JLabel lblNewLabel = new JLabel("\u80CC\u666F\u56FE\u7247");
        lblNewLabel.setIcon(new ImageIcon("D:\\IDEA\\share\\myvcampus\\vcampus_moon\\images\\ShopUser.jpg"));
        lblNewLabel.setBounds(0, -72, 436, 373);
        layeredPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("\u8D26\u53F7");
        lblNewLabel_1.setBackground(UIManager.getColor("InternalFrame.inactiveTitleBackground"));
        layeredPane.setLayer(lblNewLabel_1, 1);
        lblNewLabel_1.setBounds(69, 54, 53, 18);
        layeredPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("\u5BC6\u7801");
        lblNewLabel_2.setBackground(UIManager.getColor("InternalFrame.inactiveTitleBackground"));
        layeredPane.setLayer(lblNewLabel_2, 1);
        lblNewLabel_2.setBounds(69, 105, 53, 18);
        layeredPane.add(lblNewLabel_2);

        textField = new JTextField();
        textField.setBackground(UIManager.getColor("InternalFrame.inactiveBorderColor"));
        textField.setText("\u8BF7\u8F93\u5165\u4F60\u7684\u8D26\u53F7");
        layeredPane.setLayer(textField, 1);
        textField.setBounds(136, 51, 184, 24);
        layeredPane.add(textField);
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

        textField_1 = new JTextField();
        textField_1.setBackground(UIManager.getColor("InternalFrame.inactiveBorderColor"));
        layeredPane.setLayer(textField_1, 1);
        textField_1.setText("\u8BF7\u8F93\u5165\u4F60\u7684\u5BC6\u7801");
        textField_1.setColumns(10);
        textField_1.setBounds(136, 102, 184, 24);
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
        btnNewButton.setBackground(new Color(255, 165, 0));
        layeredPane.setLayer(btnNewButton, 1);
        btnNewButton.setBounds(83, 159, 79, 27);
        layeredPane.add(btnNewButton);


        JButton button = new JButton("\u53D6\u6D88");
        button.setBackground(SystemColor.inactiveCaption);
        layeredPane.setLayer(button, 1);
        button.setBounds(205, 159, 79, 27);
        layeredPane.add(button);

        JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");
        btnNewButton_1.setBackground(SystemColor.inactiveCaption);
        layeredPane.setLayer(btnNewButton_1, 1);
        btnNewButton_1.setBounds(328, 209, 65, 27);
        layeredPane.add(btnNewButton_1);
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });



    }
}



