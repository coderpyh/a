import java.awt.*;
import java.util.*;
import javax.swing.*;
public class TaskObstacleMove extends TimerTask
{
	public void run()
	{
		Main.f.remove(Main.background2);
		for(int i=0;i<Main.obstacle.size();i++)
		{
			if(Main.obstacle.get(i).getY()<=360)
				Main.obstacle.get(i).setLocation(Main.obstacle.get(i).getX(),Main.obstacle.get(i).getY()+20);
			else
			{
				if(Main.obstacle.get(i).getX()!=Main.carMy.getX())
				{
					Main.f.remove(Main.obstacle.get(i));
					Main.obstacle.remove(i);
					i--;
				}
				else
				{
					Main.boom.setBounds(Main.carMy.getX(),450,150,150);
					Main.f.remove(Main.carMy);
					Main.f.remove(Main.obstacle.get(i));
					Main.f.add(Main.boom);
					Main.f.add(Main.carMy);
					Main.f.add(Main.obstacle.get(i));
					Main.f.add(Main.background2);
					Main.f.repaint();
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						;
					}
					if(Main.obstacle.get(i).i!=0)
						Main.life--;
					else
						Main.life-=3;
					if(Main.life>0)
					{
						Main.f.remove(Main.boom);
						Main.f.remove(Main.background2);
						Main.f.remove(Main.textLife);
						Main.textLife=new Text("ʣ������ "+Main.life);
						Main.textLife.setBounds(0,40,200,50);
						Main.f.add(Main.textLife);
						Main.f.remove(Main.obstacle.get(i));
						Main.obstacle.remove(i);
						i--;
					}
					else
					{
						Main.timer.cancel();
						Main.clear();
						Main.textareaScore=new JTextArea("��Ϸ�÷�\n"+Main.score);
						Main.textareaScore.setBounds(350,150,500,250);
						Main.textareaScore.setFont(new Font("����",Font.PLAIN,120));
						Main.textareaScore.setForeground(Color.red);
						Main.f.setTitle("��Ϸ����");
						Main.f.add(Main.titleEnd);
						Main.f.add(Main.textareaScore);
						Main.f.add(Main.button1return);
						Main.f.add(Main.background1);
						Main.f.repaint();
					}
				}
			}
		}
		Main.f.add(Main.background2);
		Main.f.repaint();
	}
}