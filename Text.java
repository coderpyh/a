import java.awt.*;
import javax.swing.*;
public class Text extends JLabel
{
	Text(String s)
	{
		super(s);
		this.setFont(new Font("����",Font.PLAIN,30));
		this.setForeground(Color.yellow);
	}
}