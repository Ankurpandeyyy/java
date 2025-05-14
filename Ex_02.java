package Swing_Practice;
import javax.swing.*;
public class Ex_02 extends JFrame
{
	Ex_02()
	{
		setTitle("Neww Windoww");
		setVisible(true);
		setSize(500,500);
		
		JLabel l1 = new JLabel("welcomee");
		JLabel l2 = new JLabel("Buddy");
		add(l1);
		add(l2);
		setLayout(null);
		l1.setBounds(200,200,70,70);
		l2.setBounds(290,200,70,70);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		Ex_02  e = new Ex_02() ;
		

	}

}
