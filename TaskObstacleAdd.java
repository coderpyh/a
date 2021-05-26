import java.util.*;
public class TaskObstacleAdd extends TimerTask
{
	public void run()
	{
		Main.f.remove(Main.background2);
		Main.r1=Main.r.nextInt(4);
		Main.r2=Main.r.nextInt(3);
		Main.obstacle.add(new Obstacle(Main.r1));
		Main.obstacle.get(Main.obstacle.size()-1).setBounds(450*Main.r2+100,-150,150,150);
		Main.f.add(Main.obstacle.get(Main.obstacle.size()-1));
		Main.f.add(Main.background2);
		Main.f.repaint();
	}
}