package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentPage {

	private JFrame frame;

	public StudentPage() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u5B66\u751F\u767B\u9646\u754C\u9762");
		frame.setBounds(100, 100, 791, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnNewButton = new JButton("\u9000\u51FA\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {//ÍË³öµÇÂ¼
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton.setFont(new Font("ËÎÌå", Font.PLAIN, 14));
		btnNewButton.setBounds(316, 389, 135, 66);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		
		
		
		
	}

}
