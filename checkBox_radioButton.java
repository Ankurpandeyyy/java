package termwork;
import javax.swing.*;
import java.awt.event.*;

public class checkBox_radioButton extends JFrame implements ItemListener
{
	JLabel l1 , l2 ;
	JTextArea t1 , t2 ;
	JCheckBox c1, c2 , c3 ;
	JRadioButton b1 , b2 , b3 ;
	checkBox_radioButton()
	{
		setTitle("checkbox and radiobutton");
		setVisible(true);
		setSize(600,400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("Coding");
		l2 = new JLabel("Languages");
		
		t1 = new JTextArea();
		t2 = new JTextArea();
		
		c1 = new JCheckBox("JAVA");
		c2 = new JCheckBox("python");
		c3 = new JCheckBox("C");
		
		b1 = new JRadioButton("hindi");
		b2 = new JRadioButton("English");
		b3 = new JRadioButton("Tamil");
		
		l1.setBounds(80, 100 , 50, 15);
		l2.setBounds(320 , 100, 80 , 15);
		
		t1.setBounds(150, 100 , 150 , 15);
		t2.setBounds(420 , 100 , 150, 15);
		
		c1.setBounds(90,140,60,20);
		c2.setBounds(90,170,100,20);
		c3.setBounds(90,200,100,20);
		
		b1.setBounds(400,140,100,15);
		b2.setBounds(400,170,100,15);
		b3.setBounds(400,200,100,15);
		
		add(l1);add(l2);
		add(t1);add(t2);
		add(c1);add(c2);add(c3);
		add(b1);add(b2);add(b3);
		
		ButtonGroup group = new ButtonGroup();
		group.add(b1);
		group.add(b2);
		group.add(b3);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		b1.addItemListener(this);
		b2.addItemListener(this);
		b3.addItemListener(this);	
	}
	public void itemStateChanged(ItemEvent e)
	{
	  	if(e.getSource() == c1)
	  	{
	  		t1.setText(t1.getText()+" "+c1.getText());
	  	}else if(e.getSource() == c2)
	  	{
	  		t1.setText(t1.getText()+" "+c2.getText());
	  	}else if(e.getSource() == c3)
	  	{
	  		t1.setText(t1.getText()+" "+c3.getText());
	  	}else if(e.getSource() == b1)
	  	{
	  		t2.setText(b1.getText());
	  	}else if(e.getSource() == b2)
	  	{
	  		t2.setText(b2.getText());
	  	}else if(e.getSource() == b3)
	  	{
	  		t2.setText(b3.getText());
	  	}
	}
	public static void main(String[] args) {
		new checkBox_radioButton();

	}

}
