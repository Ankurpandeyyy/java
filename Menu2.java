package Swing_Practice;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Menu2 extends JFrame implements ActionListener  // NOT WORKING CORRECTLY!!!??
{
	JMenuBar mb;
	JMenu m1,m2,m3;
	JMenuItem i1,i2,i3,i4,i5,i6,i7;
	int x1,y1,x2,y2;
	
	Menu2()
	{
		setSize(800,600);
		setLocation(50,50);
		setTitle("Menu Example");
		x1=y1=x2=y2=0;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mb=new JMenuBar();
		m1=new JMenu("Shape");
		m2=new JMenu("Edit");
		m3=new JMenu("Color");
		
		i1=new JMenuItem("Line");	
		i2=new JMenuItem("Circle");
		i3=new JMenuItem("Rectangle");
		i4=new JMenuItem("Arc");
		
		
		i5=new JMenuItem("Red");
		i6=new JMenuItem("Green");
		i7=new JMenuItem("Blue");
		
		
		m1.add(i1);m1.add(i2);m1.add(i3);m1.add(i4);
		m2.add(m3);
		m3.add(i5);m3.add(i6);m3.add(i7);
		mb.add(m1);mb.add(m2);
		setJMenuBar(mb);
		
		i1.addActionListener(this);
		i5.addActionListener(this);
		i6.addActionListener(this);
		i7.addActionListener(this);
		
		setVisible(true);
	}
	
    
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == i1)
			new line1(this);
//		else if(e.getSource() == i2)
//			new JCombo();
//		else if(e.getSource() == i6)
//			new Dial1();
//		else
//			new Sw02();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawLine(x1, y1, x2, y2);
	}
	public static void main(String[] args)
	{	 
       new Menu2();
	}

}

class line1 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4 ;
	JTextField t1,t2,t3,t4 ;
	JButton b ;
	Menu2 m1 ;
	line1(Menu2 m2)
	{
		setSize(400,400);
		setLocation(80,80);
		setTitle("Line");
		setVisible(true);
		m1 = m2 ;
		
		l1 = new JLabel("X1");
		l2 = new JLabel("Y1"); 
		l3 = new JLabel("X2");
		l4 = new JLabel("Y2");
		
		t1 = new JTextField();
		t2 = new JTextField(); 
		t3 = new JTextField();
		t4 = new JTextField();
		
		b = new JButton("CLICK!!");
		
		setLayout(null);
		l1.setBounds(50 , 50 , 20 , 20);
		l2.setBounds(50 , 90 , 20 , 20);
		l3.setBounds(50 , 130, 20 , 20);
		l4.setBounds(50 ,170 , 20 , 20);
		
		t1.setBounds(100,50 , 30 , 20);
		t2.setBounds(100,90 , 30 , 20);
		t3.setBounds(100,130 , 30 , 20);
		t4.setBounds(100,170 , 30 , 20);
		
		b.setBounds(80 , 210 , 100 , 30);
		b.addActionListener(this);
		
		add(l1);add(l2);add(l3);add(l4);
		add(t1);add(t2);add(t3);add(t4);
		add(b);
		
	}
	public void actionPerformed(ActionEvent e1)
	{
		m1.x1 = Integer.parseInt(t1.getText());
		m1.y1 = Integer.parseInt(t2.getText());
		m1.x2 = Integer.parseInt(t3.getText());
		m1.y2 = Integer.parseInt(t4.getText());
		m1.repaint();
	}
}
