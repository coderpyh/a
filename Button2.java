import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Button2 extends JButton
{
	Button2(String s,int x)
	{
		super(s);
		this.setBounds(x,580,100,100);
		this.setFont(new Font("����",Font.BOLD,35));
	}
	static void button2left()
	{
		Main.button2left=new Button2("<",440);
		Main.button2left.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				if(Main.myCar.getX()-450>=0)
					Main.myCar.setBounds(Main.myCar.getX()-450,540,150,150);
				Main.f.repaint();
			}
		});
	}
	static void button2right()
	{
		Main.button2right=new Button2(">",710);
		Main.button2right.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				if(Main.myCar.getX()+450<=1280)
					Main.myCar.setBounds(Main.myCar.getX()+450,540,150,150);
				Main.f.repaint();
			}
		});
	}
}