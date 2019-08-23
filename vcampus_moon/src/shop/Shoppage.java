package shop;

import javax.swing.*;
import java.awt.*;

public class Shoppage extends JFrame {
    private JPanel c1, c2, c3, c4, c5, c6;
    private JLabel j1, j2, j3, j4, j5, j6;
    private JTextField tf1, tf2, tf3, tf4, tf5;
    private JButton b1, b2, b3;

    public Shoppage() {
        super();
        this.setLayout(new GridLayout(8, 3));

        this.setTitle("商品详情界面");
        c1 = new JPanel();
        c2 = new JPanel();
        c3 = new JPanel();
        c4 = new JPanel();
        c5 = new JPanel();
        c6 = new JPanel();
        //c7 = new JPanel();
        //c8 = new JPanel();

        this.add(c1);
        this.add(c2);
        this.add(c3);
        this.add(c4);
        this.add(c5);
        this.add(c6);
        //this.add(c7);
        //this.add(c8);


        j1 = new JLabel("商品名   :");
        j1.setHorizontalAlignment(JLabel.LEFT);
        j2 = new JLabel("商品编号 :",JLabel.LEFT);
        j3 = new JLabel("标价     :",JLabel.LEFT);
        j4 = new JLabel("库存     :",JLabel.LEFT);
        j5 = new JLabel("销量     :",JLabel.LEFT);
        j6 = new JLabel("操作类型: ",JLabel.LEFT);

        tf1 = new JTextField( 20);
        tf1.setHorizontalAlignment(JLabel.LEFT);
        tf2 = new JTextField( 20);
        tf3 = new JTextField(20);
        tf4 = new JTextField( 20);
        tf5 = new JTextField( 20);

        b1 = new JButton("上架");
        b2 = new JButton("下架");
        b3 = new JButton("打折");

        c1.add(j1);
        c1.add(tf1);
        c2.add(j2);
        c2.add(tf2);
        c3.add(j3);
        c3.add(tf3);
        c4.add(j4);
        c4.add(tf4);
        c5.add(j5);
        c5.add(tf5);
        c6.add(j6);
        c6.add(b1);
        c6.add(b2);
        c6.add(b3);


        setSize(500,400);
        setVisible(true);

        setLocationRelativeTo(null);
    }
}
