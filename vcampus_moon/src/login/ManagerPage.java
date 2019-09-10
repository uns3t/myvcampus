package login;
/**
 * 类 {@code ManagerPage} 管理员界面.
 *
 * <p> 管理员界面
 *
 * @since 2019/8/19
 */
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLayeredPane;

import client.ClientThread;
import course.ManagerCoursePage;
import shop.ShopAdmin;
import student.AdminStudentsPage;

import javax.swing.JLabel;

public class ManagerPage extends JFrame{

	private ImageIcon image1;

	public ManagerPage(ClientThread cthread) {
		initialize(cthread);
	}

	private void initialize(ClientThread cthread) {
		getContentPane().setBackground(new Color(248, 248, 255));
		setBackground(new Color(248, 248, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/windows.jpg"));
		setFont(new Font("宋体", Font.PLAIN, 14));
		setTitle("\u7BA1\u7406\u5458\u767B\u9646\u754C\u9762");
		setBounds(100, 100, 733, 613);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 719, 576);
		getContentPane().add(layeredPane);

				JButton button = new JButton("\u9000\u51FA\u767B\u5F55");
				layeredPane.setLayer(button, 1);
				button.setBounds(276, 293, 141, 75);
				layeredPane.add(button);
				button.setBackground(new Color(255, 248, 220));
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {//退出登录
						try {
							new LoginPage(cthread);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						dispose();
					}
				});
				button.setFont(new Font("宋体", Font.BOLD, 22));


				JButton button_1 = new JButton("课程系统");
				button_1.setOpaque(false);
				layeredPane.setLayer(button_1, 1);
				button_1.setBounds(356, 31, 180, 88);
				layeredPane.add(button_1);
				button_1.setBackground(new Color(240, 248, 255));
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {//选课系统
						new ManagerCoursePage(cthread);

					}
				});
				button_1.setFont(new Font("宋体", Font.BOLD, 28));


				JButton button_2 = new JButton("\u56FE\u4E66\u9986");
				button_2.setOpaque(false);
				layeredPane.setLayer(button_2, 1);
				button_2.setBounds(166, 143, 180, 88);
				layeredPane.add(button_2);
				button_2.setBackground(new Color(240, 248, 255));
				button_2.setFont(new Font("宋体", Font.BOLD, 28));
				button_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {//图书馆


					}
				});


				JButton button_3 = new JButton("\u6821\u56ED\u5546\u5E97");
				button_3.setOpaque(false);
				layeredPane.setLayer(button_3, 1);
				button_3.setBounds(356, 143, 180, 88);
				layeredPane.add(button_3);
				button_3.setBackground(new Color(240, 248, 255));
				button_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {//校园商店
						new ShopAdmin(cthread);
					}
				});
				button_3.setFont(new Font("宋体", Font.BOLD, 28));


				JButton button_4 = new JButton("\u5B66\u7C4D\u7BA1\u7406");
				button_4.setOpaque(false);
				layeredPane.setLayer(button_4, 1);
				button_4.setBounds(166, 31, 180, 88);
				layeredPane.add(button_4);
				button_4.setBackground(new Color(240, 248, 255));
				button_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {//学籍管理
						try {
							new AdminStudentsPage(cthread);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				button_4.setFont(new Font("宋体", Font.BOLD, 28));

				image1 = new ImageIcon("images/change_photo1.jpg");
				JLabel lblNewLabel = new JLabel(image1);
				lblNewLabel.setBounds(0, 0, 719, 576);
				layeredPane.add(lblNewLabel);


	}
}
