import javax.swing.*;
public class CarMy extends JLabel
{
	CarMy(int x)
	{
		super(Main.imageCarObject[x]);
		this.setBounds(550,550,150,150);
	}
}