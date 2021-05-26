import java.util.*;
public class TaskScore extends TimerTask
{
	public void run()
	{
		Main.f.remove(Main.background2);
		Main.f.remove(Main.textScore);
		Main.score++;
		Main.textScore=new Text("”Œœ∑µ√∑÷ "+Main.score);
		Main.textScore.setBounds(0,0,200,50);
		Main.f.add(Main.textScore);
		Main.f.add(Main.background2);
		Main.f.repaint();
	}
}