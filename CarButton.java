import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;
public class CarButton extends JButton
{
	CarButton(int x,int y)
	{
		super(Main.imageCarButton[x]);
		this.setBounds(y,200,300,300);
		this.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				Main.clear();
				Main.score=0;
				Main.textScore=new Text("游戏得分 "+Main.score);
				Main.textScore.setBounds(0,0,200,50);
				Main.life=3;
				Main.textLife=new Text("剩余生命 "+Main.life);
				Main.textLife.setBounds(0,40,200,50);
				Main.carMy=new CarMy(x);
				Main.obstacle=new Vector<Obstacle>();
				Main.f.setTitle("开始游戏");
				Main.f.add(Main.carMy);
				Main.f.add(Main.button2left);
				Main.f.add(Main.button2right);
				Main.f.add(Main.textScore);
				Main.f.add(Main.textLife);
				Main.f.add(Main.background2);
				Main.f.repaint();
				Main.timer=new Timer();
				Main.timer.schedule(new TaskScore(),0,1000);
				Main.timer.schedule(new TaskObstacleAdd(),0,4000);
				Main.timer.schedule(new TaskObstacleMove(),0,500);
			}
		});
	}
}