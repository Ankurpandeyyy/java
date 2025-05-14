package Swing_Practice;
import javax.swing.*;
import java.awt.event.*;
public class RadioButton extends JFrame implements ActionListener
{
	JRadioButton r1,r2,r3 ;
	JLabel l1 , l2 ;
	ButtonGroup bg ;
     RadioButton()
     {
    	 setTitle("RadioButton");
    	 setSize(500,500);
    	 setLocation(60,60);
    	 setVisible(true);
    	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 setLayout(null);
    	 
    	 l1 = new JLabel("Course Opted : ");
    	 l1.setBounds(50 , 50 , 100 , 20 );
    	 add(l1);
    	 
    	 l2 = new JLabel();
    	 l2.setBounds(170,50,150,20);
    	 add(l2);
    	 
    	 r1 = new JRadioButton("MCA");
    	 r1.setBounds(170 ,100 ,100 , 20);
    	 r1.addActionListener(this);
    	 add(r1);
    	 
    	 r2 = new JRadioButton("BCA");
    	 r2.setBounds(170 ,140 ,100 , 20);
    	 r2.addActionListener(this);
    	 add(r2);
    	 
    	 r3 = new JRadioButton("BBA");
    	 r3.setBounds(170 ,180 ,100 , 20);
    	 r3.addActionListener(this);
    	 add(r3);
    	 
    	 bg = new ButtonGroup();
    	 bg.add(r1);
    	 bg.add(r2);
    	 bg.add(r3);
    	 
     }
     public void actionPerformed(ActionEvent e)
     {
    	 if(e.getSource() == r1)
    		 l2.setText(r1.getText());
    	 else if(e.getSource()==r2)
    		 l2.setText(r2.getText());
    	 else
    		 l2.setText(r3.getText());
     }
	public static void main(String[] args) 
	{
		RadioButton r = new RadioButton();

	}

}
