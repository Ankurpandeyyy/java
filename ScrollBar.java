package Swing_Practice;
import javax.swing.*;
import java.awt.event.*;

public class ScrollBar extends JFrame implements ActionListener
{
	
	JScrollBar s1 ;

   ScrollBar()
   {
	   setTitle("ScrollBar");
	   setLocation(50,50);
	   setSize(500,500);
	   setVisible(true);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setLayout(null);
	   
	 s1 = new JScrollBar(JScrollBar.HORIZONTAL);
	 s1.setBounds(150,300,200,20);
	 add(s1);
	   
   }
	
	public void actionPerformed(ActionEvent e)
	{
		
	}
	public static void main(String[] args)
	{
		ScrollBar s = new ScrollBar();

	}

}
