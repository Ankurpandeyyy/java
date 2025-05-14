package Swing_Practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuBar extends JFrame implements ActionListener
{
	JMenuBar mb ;
	JMenu m1,m2,m3,m4,m5;
	JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11;
	int p=0 ;
	 MenuBar()
	 {
		setTitle("Menu_Creation");
		setLocation(60,60);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		mb=new JMenuBar();
		
		m1= new JMenu("FILE");
		m2= new JMenu("EDIT");
		m3= new JMenu("FORMAT");
		m4= new JMenu("FontSize");
		m5= new JMenu("CoLor");
		
		i1 = new JMenuItem("New");
		i2 = new JMenuItem("Open");
		i3 = new JMenuItem("Save");
		i4 = new JMenuItem("SaveAs");
		i5 = new JMenuItem("Close");
		i6 = new JMenuItem("20");
		i7 = new JMenuItem("25");
		i8 = new JMenuItem("30");
		i9 = new JMenuItem("Red");
		i10 = new JMenuItem("Green");
		i11 = new JMenuItem("Blue");
		
		setJMenuBar(mb);
		mb.add(m1);mb.add(m2);mb.add(m3);
		m1.add(i1);m1.add(i2);m1.add(i3);m1.add(i4);m1.add(i5);
		m2.add(m4);m2.add(m5);
		m4.add(i6);m4.add(i7);m4.add(i8);
		m5.add(i9);m5.add(i10);m5.add(i11);
		
		i5.addActionListener(this);
		i9.addActionListener(this);
		i10.addActionListener(this);
		i11.addActionListener(this);
		i6.addActionListener(this);
		i7.addActionListener(this);
		i8.addActionListener(this);	
	 }
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==i5)
			System.exit(0);
		else if(e.getSource()==i9)
			getContentPane().setBackground(Color.red);
		else if(e.getSource()==i10)
			getContentPane().setBackground(Color.green);
		else if(e.getSource()==i11)
			getContentPane().setBackground(Color.blue);
		else if(e.getSource() == i6)
			p = 20;
		else if(e.getSource() == i7)
			p = 25;
		else if(e.getSource() == i8)
			p = 30;
		
		repaint();	
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Font f = null ;
		
		if(p==0)
			f = new Font("Calibri",Font.ITALIC,10);
		else if(p==20)
			f = new Font("Courier",Font.BOLD,20);
		else if(p==25)
			f = new Font("Courier",Font.BOLD,25);
		else if(p==30)
			f = new Font("Times New Roman",Font.BOLD,30);
		
		g.setColor(Color.red);
		g.setFont(f);
		g.drawString("Hello", 250, 250);
	}
	public static void main(String[] args)
	{
		 MenuBar m = new  MenuBar();

	}

}
