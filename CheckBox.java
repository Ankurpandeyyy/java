package Swing_Practice;
import javax.swing.*;
import java.awt.event.*;
public class CheckBox extends JFrame implements ActionListener
{
	JCheckBox c1,c2,c3,c4 ;
	JLabel l1,l2 ;
	CheckBox()
	{
		setLocation(50,50);
		setTitle("CheckBoxes");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		l1 = new JLabel("Languages : ");
		l1.setBounds(50,50,80 ,20);
		add(l1);
		
		l2 = new JLabel();
		l2.setBounds(140,50,200,20);
		add(l2);
		
		c1 = new JCheckBox("Hindi");
		c1.setBounds(140,100,80,20);
		add(c1);
		c1.addActionListener(this);
		
		c2 = new JCheckBox("English");
		c2.setBounds(140,140,100,20);
		add(c2);
		c2.addActionListener(this);
		
		c3 = new JCheckBox("German");
		c3.setBounds(140,180,100,20);
		add(c3);
		c3.addActionListener(this);
		
		c4 = new JCheckBox("French");
		c4.setBounds(140,220,100,20);
		add(c4);	
		c4.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == c1)
			l2.setText(l2.getText() + " , " +c1.getText());
		else if(e.getSource() == c2)
			l2.setText(l2.getText() + " , " +c2.getText());
		else if(e.getSource() == c3)
			l2.setText(l2.getText() + " , " +c3.getText());
		else
			l2.setText(l2.getText() + " , " +c4.getText());	
	}
	
	public static void main(String[] args)
	{
		CheckBox c = new CheckBox();
	}

}
