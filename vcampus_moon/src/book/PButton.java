package book;

import javax.swing.*;
import java.awt.*;

public class PButton extends JButton{


	public PButton(String text) {

		super(text);
		this.setLayout(new FlowLayout());
		this.setFont(new Font ("微软雅黑", Font.BOLD, 20));
		this.setForeground(new Color(254,254,254));
		this.setBackground(new Color(206,206,206));
		this.setFocusable(false);
		this.setBorder(null);

	}

}
