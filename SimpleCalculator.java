package Swing_Practice;
import javax.swing.*;
import java.awt.event.*;
public class SimpleCalculator extends JFrame
{
	JLabel l1 , l2 , l3,l4 ;
	JTextField t1,t2 ;
	JButton  b1 , b2,b3,b4 , b5;
	
	SimpleCalculator(String s)
	{
		super(s);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void setCalculator()
	{
		l1 = new JLabel("SIMPLE CALCULATOR");
		l2 = new JLabel("Enter first number");
		l3 = new JLabel("Enter Second number");
		l4 = new JLabel();
		t1 = new JTextField();
		t2 = new JTextField();
		b1 = new JButton("ADD");
		b2 = new JButton("SUBTRACT");
		b3 = new JButton("MULTIPLY");
		b4 = new JButton("DIVIDE");
		b5 = new JButton("RESET");
		
		setLayout(null);
		l1.setBounds(170 , 20 , 180 , 60 );
		
		l2.setBounds(80 , 120 , 150 , 20 );
		l3.setBounds(80 , 150 , 150 , 20 );
		
		t1.setBounds(250 , 120 , 40 , 20 );
		t2.setBounds(250 , 150 , 40 , 20 );
		
		l4.setBounds(120 , 330 , 250 , 40 );
		
		b1.setBounds(30 , 240 , 70 , 30 );
		b2.setBounds(130 , 240 , 100 , 30 );
		b3.setBounds(250 , 240 , 100 , 30 );
		b4.setBounds(370 , 240 , 100 , 30 );
		b5.setBounds(180 , 420 , 100 , 30 );
		
		b1.addActionListener(new Add());
		b2.addActionListener(new Sub());
		b3.addActionListener(new Mul());
		b4.addActionListener(new Div());
		b5.addActionListener(new Reset());
		
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
	}
	
	class Add implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			int c = a+b ;
			l4.setText("ADDITION = "+c);
			}catch(Exception e1) {
				l4.setText("Enter a valid number");
			}	
		}
	}
	
	class Sub implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int c = a-b ;
				l4.setText("SUBTRACTION = "+c);
				}catch(Exception e1) {
					l4.setText("Enter a valid number");
				}
			
		}
	}
	
	class Mul implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int c = a*b ;
				l4.setText("MULTIPLICATION = "+c);
				}catch(Exception e1) {
					l4.setText("Enter a valid number");
				}
			
		}
	}
	
	class Div implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int c = a/b ;
				l4.setText("DIVISION = "+c);
				}catch(Exception e1) {
					l4.setText("Enter a valid number");
				}
			
		}
	}
	
	class Reset implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			t1.setText("");
			t2.setText("");
			l4.setText("");
		}
	}
	
	public static void main(String[] args)
	{
		SimpleCalculator c = new SimpleCalculator("Mini Calculator");
		c.setCalculator();

	}

}
