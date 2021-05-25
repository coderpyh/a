import javax.swing.*;
public class Obstacle extends JLabel
{
	int i;
	Obstacle(int x)
	{
		super();
		if(x==0)
			this.setIcon(Main.imageBomb);
		else
			this.setIcon(Main.imageCarObject[x]);
		i=x;
	}
}