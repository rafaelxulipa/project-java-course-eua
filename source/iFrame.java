package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class iFrame extends JInternalFrame
{
	
	
	public void paintComponent( Graphics g ){
	    
		super.paintComponent( g );		
		
		g.setFont(new Font("Times", Font.BOLD, 20));
		g.setColor(Color.RED);
		g.drawString("AUTHORS:", 60, 180);
		g.setFont(new Font("SansSerif", Font.PLAIN, 16));
		g.drawString("Otavio Rafael de Arruda Melo - (718) 747-9267", 60, 220);
		g.drawString("Bruno Cesar Sales Alves - (646) 513-0160", 60, 240);
		g.drawString("Missouri S&T - Java GUI", 60, 260);
		
		

	   }
		
    
}