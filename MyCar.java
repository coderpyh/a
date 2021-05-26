import javax.swing.*;
public class MyCar extends JLabel
{
	MyCar(int x)
	{
		super(Main.imageCarObject[x]);
		this.setBounds(550,540,150,150);
	}
}