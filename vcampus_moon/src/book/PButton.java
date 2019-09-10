package book;
/**
 * 类 {@code PButton} 按钮.
 *
 * <p> 按钮
 *
 * @since 2019/8/19
 */
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
