package shop;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShopUser {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    ShopUser window = new ShopUser();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public ShopUser() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        frame = new JFrame();
        frame.setBackground(SystemColor.activeCaption);
        frame.getContentPane().setBackground(SystemColor.control);
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
        btnNewButton.setBackground(new Color(255, 170, 20));
        btnNewButton.setBounds(81, 153, 90, 27);
        frame.getContentPane().add(btnNewButton);

        JButton button = new JButton("\u53D6\u6D88");
        button.setBackground(SystemColor.scrollbar);
        button.setBounds(210, 153, 90, 27);
        frame.getContentPane().add(button);
    }
}

