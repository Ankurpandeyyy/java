package termwork;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Cursor_movement extends JFrame implements MouseMotionListener
{
	JLabel l1 , l2 ;
	JTextArea t1 , t2 ;
	Cursor_movement()
	{
		setSize(600,600);
		setTitle("Cursor Position");
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("X");
		l2 = new JLabel("Y");
		
		t1 = new JTextArea();
		t2 = new JTextArea();
		
		l1.setBounds(150,50,20,20);
		t1.setBounds(200,50,30,20);
		
		l2.setBounds(300,50,20,20);
		t2.setBounds(350,50,30,20);
		
		add(l1);add(l2);add(t1);add(t2);
		
		addMouseMotionListener(this);
				
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
		int x = e.getX();
		int y = e.getY();
		t1.setText(Integer.toString(x));
		t2.setText(Integer.toString(y));
		
	}
	
	public static void main(String[] args)
	{
		new Cursor_movement();

	}

}
