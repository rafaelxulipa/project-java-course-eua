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
import java.net.*;
import java.applet.*;

public class iFrame8 extends JInternalFrame
{


	ControlPanel controlPanel;
	DisplayPanel displayPanel;

	public iFrame8 ()
	{
		super("ZoomShow",true,true,true,true);
		displayPanel=new DisplayPanel();
		controlPanel=new ControlPanel(displayPanel);

		Container c=getContentPane();
		c.add(controlPanel,BorderLayout.NORTH);
		c.add(displayPanel,BorderLayout.CENTER);
		setOpaque(true);
		setSize(1000,600);
		setVisible(true);

	}
		
    
}