package shop;

import javax.swing.*;
import java.awt.*;


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

public class Shoppage {

    private JFrame frame;
    private JTextField textField_1;
    private JTextField textField;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Shoppage window = new Shoppage();
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
    public Shoppage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("\u5546\u54C1\u7BA1\u7406\u754C\u9762(\u7BA1\u7406\u5458)");
        frame.setBounds(100, 100, 527, 463);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);


        JLabel lblNewLabel = new JLabel("\u5546\u54C1\u540D\u79F0");
        lblNewLabel.setBounds(80, 37, 72, 18);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("\u5546\u54C1\u7F16\u53F7");
        lblNewLabel_1.setBounds(80, 85, 72, 18);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("\u5546\u54C1\u6807\u4EF7");
        lblNewLabel_2.setBounds(80, 134, 72, 18);
        frame.getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("\u9500\u91CF");
        lblNewLabel_3.setBounds(80, 186, 72, 18);
        frame.getContentPane().add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("\u5E93\u5B58");
        lblNewLabel_4.setBounds(80, 237, 72, 18);
        frame.getContentPane().add(lblNewLabel_4);

        textField_1 = new JTextField();
        textField_1.setText("\u8BF7\u8F93\u5165\u5546\u54C1\u540D\u79F0");
        textField_1.setBounds(210, 34, 177, 24);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        textField = new JTextField();
        textField.setText("\u8BF7\u8F93\u5165\u5546\u54C1\u7F16\u53F7");
        textField.setBounds(210, 82, 177, 24);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setText("\u8BF7\u8F93\u5165\u5546\u54C1\u6807\u4EF7");
        textField_2.setBounds(210, 131, 177, 24);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(210, 183, 177, 24);
        frame.getContentPane().add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(210, 234, 177, 24);
        frame.getContentPane().add(textField_4);
        textField_4.setColumns(10);

        JLabel lblNewLabel_5 = new JLabel("\u64CD\u4F5C\u7C7B\u578B");
        lblNewLabel_5.setBounds(80, 294, 72, 18);
        frame.getContentPane().add(lblNewLabel_5);

        JRadioButton radioButton = new JRadioButton("\u4E0A\u67B6");
        radioButton.setBounds(213, 290, 77, 27);
        frame.getContentPane().add(radioButton);

        JRadioButton radioButton_1 = new JRadioButton("\u4E0B\u67B6");
        radioButton_1.addActionListener(new  ActionListener(){

                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                new
                                            }
                                        }

        );
        radioButton_1.setBounds(310, 290, 77, 27);
        frame.getContentPane().add(radioButton_1);

        JButton btnNewButton = new JButton("\u786E\u8BA4");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton.setBounds(80, 336, 122, 27);
        frame.getContentPane().add(btnNewButton);

        JButton button = new JButton("\u53D6\u6D88");
        button.setBounds(265, 336, 122, 27);
        frame.getContentPane().add(button);
    }
}
