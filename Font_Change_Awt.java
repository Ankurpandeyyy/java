package termwork;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Font_Change_Awt extends JFrame
{
	Font_Change_Awt()
	{
		setTitle("Font change");
		setSize(500,500);
		setVisible(true);
		setLayout(null);
	}
	
	public void paint(Graphics g)
	{
		Font f = new Font("Serif",Font.BOLD | Font.ITALIC , 28);
		g.setFont(f);
		g.setColor(Color.GREEN);
		
		g.drawString("hell0", 250, 250);
		
	}
	public static void main(String[] args) 
	{
		new Font_Change_Awt();
      
	}

}
