import java.awt.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;
public class Main
{
	static JFrame f=new JFrame("天天跑车");
	static Title titleMain=new Title("天天跑车");
	static Title titleChoose=new Title("选择车型");
	static Title titleHelp=new Title("游戏帮助");
	static Title titleEnd=new Title("游戏结束");
	static Text textName=new Text("潘友赫 杨伟锋");
	static JTextArea textareaHelp=new JTextArea("点击选择车型，选择一辆你喜欢的跑车，然后进入游戏。\n"
											   +"开始时你的跑车将会出现在中间跑道上。\n"
											   +"通过点击左右按钮，操纵你的跑车左右移动，躲避障碍物。\n"
											   +"你开始时有3条生命，生命值为0时游戏结束。\n"
											   +"若撞到其他车辆，你将失去1条生命。\n"
											   +"若撞到炸弹，生命值直接归0。\n"
											   +"最后依据游戏时间计算得分。\n"
											   +"加油，赛车手！");
	static Button1 button1choose,button1help,button1exit,button1return;
	static Button2 button2left,button2right;
	static ImageIcon[] imageCarButton=new ImageIcon[4];
	static ImageIcon[] imageCarObject=new ImageIcon[4];
	static ImageIcon imageBomb=new ImageIcon("D:\\game\\bomb.jpg");
	static ImageIcon imageBoom=new ImageIcon("D:\\game\\boom.jpg");
	static JLabel boom=new JLabel(imageBoom);
	static ButtonCar[] buttonCar=new ButtonCar[4];
	static MyCar myCar=null;
	static Vector<Obstacle> obstacle=null;
	static Random r=new Random();
	static int r1,r2,score,life;
	static Text textScore=null,textLife=null;
	static Timer timer=null;
	static JTextArea textareaScore=null;
	static ImageIcon imageBackground1=new ImageIcon("D:\\game\\background1.jpg");
	static JLabel background1=new JLabel(imageBackground1);
	static JLabel background2=new JLabel(new ImageIcon("D:\\game\\background2.png"));
	public static void main(String[] args)
	{
		Button1.button1choose();
		Button1.button1help();
		Button1.button1exit();
		Button1.button1return();
		Button2.button2left();
		Button2.button2right();
		textName.setBounds(500,120,200,50);
		textareaHelp.setBounds(250,200,700,220);
		textareaHelp.setFont(new Font("等线",Font.PLAIN,25));
		textareaHelp.setForeground(Color.blue);
		for(int i=1;i<=3;i++)
		{
			imageCarButton[i]=new ImageIcon("D:\\game\\car"+i+".jpg");
			imageCarButton[i].setImage(imageCarButton[i].getImage().getScaledInstance(300,300,Image.SCALE_SMOOTH));
			buttonCar[i]=new ButtonCar(i,350*i-250);
			imageCarObject[i]=new ImageIcon("D:\\game\\car"+i+".jpg");
			imageCarObject[i].setImage(imageCarObject[i].getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH));
		}
		imageBomb.setImage(imageBomb.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH));
		imageBoom.setImage(imageBoom.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH));
		imageBackground1.setImage(imageBackground1.getImage().getScaledInstance(1280,720,Image.SCALE_SMOOTH));
		background1.setBounds(0,0,1280,720);
		background2.setBounds(0,0,1280,720);
		f.setSize(1280,720);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.add(titleMain);
		f.add(textName);
		f.add(button1choose);
		f.add(button1help);
		f.add(button1exit);
		f.add(background1);
		f.setVisible(true);
	}
	static void clear()
	{
		f.remove(titleMain);
		f.remove(titleChoose);
		f.remove(titleHelp);
		f.remove(titleEnd);
		f.remove(textName);
		f.remove(textareaHelp);
		f.remove(button1choose);
		f.remove(button1help);
		f.remove(button1exit);
		f.remove(button1return);
		f.remove(button2left);
		f.remove(button2right);
		f.remove(boom);
		f.remove(buttonCar[1]);
		f.remove(buttonCar[2]);
		f.remove(buttonCar[3]);
		if(myCar!=null)
			f.remove(myCar);
		if(obstacle!=null)
			for(int i=0;i<obstacle.size();i++)
				f.remove(obstacle.get(i));
		if(textScore!=null)
			f.remove(textScore);
		if(textLife!=null)
			f.remove(textLife);
		if(textareaScore!=null)
			f.remove(textareaScore);
		f.remove(background1);
		f.remove(background2);
	}
}