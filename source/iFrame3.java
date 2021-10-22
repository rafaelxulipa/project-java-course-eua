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


public class iFrame3 extends JInternalFrame
{
	
	
	public void paintComponent( Graphics g ){
	    
		super.paintComponent( g );		
		
		g.setFont(new Font("Times", Font.BOLD, 20));
		g.setColor(Color.RED);
		g.drawString("HELP:", 60, 180);
		g.drawString("The software basically contains 2 menus on the top, to access one of them, just left click on it.", 60, 220);
		g.drawString("1. In the menu About, we have some information about the authors of the software,", 60, 240);
		g.drawString("   problem description and some references based on what we have learned to develop this software.", 60, 260);
		g.drawString("2. In the menu Demos, we can have access to our multimedia menu, that divides into Audio and Images", 60, 280);
		g.drawString("   To use one of these items, just left click on the name of the multimedia you want to use.", 60, 300);
		g.drawString("3. In the Audio menu, we can choose an interactive and sequential submenus.", 60, 320);
		g.drawString("   In the Images menu, we can choose a SlideShow and ZoomShow submenus.", 60, 340);
		g.drawString("For more information and help, let us know: bs522@mst.edu or odzt2@mst.edu", 60, 380);


	   }
		
    
}