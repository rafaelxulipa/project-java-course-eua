package code;

/**
* @author "Otavio Melo & Bruno Alves""
* @version "Java version 8"
*
* @param None
* @return None
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class iFrame4 extends JInternalFrame
{
	
	
	public void paintComponent( Graphics g ){
	    
		super.paintComponent( g );		
		
		g.setFont(new Font("Times", Font.BOLD, 20));
		g.setColor(Color.RED);
		g.drawString("REFERENCES:", 60, 180);
		g.setFont(new Font("SansSerif", Font.PLAIN, 16));
		g.drawString("1. The main reference was the content provided by the professor Dr. Chaman.", 60, 220);
		g.drawString("   You can find more at: http://web.mst.edu/~chaman/courses/CS342/", 60, 240);
		g.drawString("2. The second reference was the Wikipedia website, that we could understand how to use threads, audio, and images in java.", 60, 260);
		g.drawString("   You can find more at: http://en.wikipedia.org/wiki/Java_concurrency, and this link takes us to java threads.", 60, 280);
		g.drawString("3. Another good website is Stackoverflow, because people can help you in some programming issues.", 60, 300);
		g.drawString("   You can find more at: http://stackoverflow.com/questions/2865315/threads-in-java", 60, 320);
		
	   }
		
}