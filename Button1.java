import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Button1 extends JButton
{
	Button1(String s,int x)
	{
		super(s);
		this.setBounds(x,500,192,108);
		this.setFont(new Font("等线",Font.BOLD,35));
	}
	static void button1choose()
	{
		Main.button1choose=new Button1("选择车型",200);
		Main.button1choose.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				Main.clear();
				Main.f.setTitle("选择车型");
				Main.f.add(Main.titleChoose);
				Main.f.add(Main.buttonCar[1]);
				Main.f.add(Main.buttonCar[2]);
				Main.f.add(Main.buttonCar[3]);
				Main.f.add(Main.background1);
				Main.f.repaint();
			}
		});
	}
	static void button1help()
	{
		Main.button1help=new Button1("游戏帮助",500);
		Main.button1help.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				Main.clear();
				Main.f.setTitle("游戏帮助");
				Main.f.add(Main.titleHelp);
				Main.f.add(Main.textareaHelp);
				Main.f.add(Main.button1return);
				Main.f.add(Main.background1);
				Main.f.repaint();
			}
		});
	}
	static void button1exit()
	{
		Main.button1exit=new Button1("退出游戏",800);
		Main.button1exit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				System.exit(0);
			}
		});
	}
	static void button1return()
	{
		Main.button1return=new Button1("返回首页",500);
		Main.button1return.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				Main.clear();
				Main.f.setTitle("天天跑车");
				Main.f.add(Main.titleMain);
				Main.f.add(Main.textName);
				Main.f.add(Main.button1choose);
				Main.f.add(Main.button1help);
				Main.f.add(Main.button1exit);
				Main.f.add(Main.background1);
				Main.f.repaint();
			}
		});
	}
}