import java.awt.*;
import javax.swing.*;
public class Title extends JLabel
{
	Title(String s)
	{
		super(s);
		this.setBounds(400,20,400,100);
		this.setFont(new Font("����",Font.PLAIN,100));
		this.setForeground(Color.orange);
	}
}