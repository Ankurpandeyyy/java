package Swing_Practice;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class SwingEx1 extends JFrame
{
	JLabel l1 , l2 , l3 ,l4 , l5;
	JTextField t1;
	JPasswordField t2 ;
	JButton b1,b2 ;
	SwingEx1(String s)
	{
		super(s); // this will pass the string of object to parent and wil set the title .
	}
	void setshow()
	{
		Cursor c1 = new Cursor(Cursor.HAND_CURSOR);  //Ex--CROSSHAIR_CURSOR , WAIT_CURSOR
		Font f1 = new Font("Times New Roman" , Font.BOLD,30);
		
		Font f2 = new Font("Times New roman",Font.ITALIC,22);
				
		l1 = new JLabel("Welcome To");
		l1.setFont(f1);
		l1.setForeground(Color.red);
		
		l2 = new JLabel("My First Form");
		l2.setFont(f1);
		l3 = new JLabel("Username");
		l3.setFont(f2);
		l3.setForeground(Color.blue);
		l4 = new JLabel("Password");
		l4.setFont(f2);
		l4.setForeground(Color.blue);
		
		l5 = new JLabel();
		t1 = new JTextField();
		t2 = new JPasswordField();
		
		b1 = new JButton("Login");
		b1.setCursor(c1);
		b1.setBackground(Color.RED);
		b1.setForeground(Color.white);
		
		b2 = new JButton("Clear");
		b2.setBackground(Color.RED);
		b2.setForeground(Color.white);
		b2.setCursor(c1);
		
		 setLayout(null);
		l1.setBounds(250,30,200,30);
		l2.setBounds(250,60,200,30);
		l3.setBounds(150,150,100,30);
		l4.setBounds(150,200,100,30);
		l5.setBounds(300 , 370 , 200 , 50);
		t1.setBounds(270, 150, 200, 30);
		t2.setBounds(270, 200, 200, 30);
	    b1.setBounds(200, 270, 100, 30);
	    b2.setBounds(320, 270, 100, 30);
	      
	      b1.addActionListener(new Log());
	      b2.addActionListener(new Clear());
	     
	 add(l1);
	 add(l2);
	 add(l3);
	 add(l4);
	 add(l5);
	 add(t1);
	 add(t2);
	 add(b1);
	 add(b2);
	}
	
	class Log implements ActionListener
	{ 
		public void actionPerformed(ActionEvent e)
		{
			 String s1 = t1.getText();
			 String s2 = t2.getText();
			 
			 if(s1.equals("ankur") && s2.equals("9128"))
				 l5.setText("Login Successful");		 
			 else
				 l5.setText("Login Unsuccessful"); 
		}
	}
	
	class Clear implements ActionListener
	{ 
		public void actionPerformed(ActionEvent e)
		{
			 t1.setText("");
			 t2.setText("");
			 l5.setText(""); 
		}
	}
	
	public static void main(String[] args) {
		SwingEx1 j1=new SwingEx1(" Welcome to java "); // It is for setting Title ,,we can do it by using setTitle() also .
		 j1.setVisible(true);
		 j1.setSize(700,500);
		 j1.setshow();
		 j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
