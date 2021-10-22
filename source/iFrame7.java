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
import java.awt.Image;
import java.net.*;
import javax.swing.event.*;
import java.applet.*;


public class iFrame7 extends JInternalFrame
{
		URL url;
		Image image;	
		String str = null;
		String imageNames[] = { "1", "2", "3", "4", "5", "6", "7", "8"};
		static int ref=0;
		static int i, j, x=900;

		
		Container c = getContentPane();


		private Thread internalThread;

		private volatile boolean noStopRequested;

		public iFrame7() 
		{
		
			super("SlideShow",true,true,true,true);
			
			FlowLayout layout = new FlowLayout();
			c.setLayout(layout);
			//createButtonsAndClips();
			setOpaque(false);
			setSize(1000,600);
			setVisible(true);	

			noStopRequested = true;
			Runnable r = new Runnable() {
			  public void run() {
				try {
				  runWork();
				} catch (Exception x) {
				  x.printStackTrace();
				}
			  }
			};

			internalThread = new Thread(r, "IFrame7");
			internalThread.start();
	  }

	  private void runWork() 
	  {
		Runnable updateText = new Runnable() 
		{
		  public void run() {
			repaint();
		  }
		};

		while (noStopRequested) {
		  try 
		  {
			Thread.sleep(200);

			x = x - 10;
			
			if (x == -480)
			{
				ref++;
				if (ref == 8)
				{
					ref = 0;
				}
				i = 0;
				x = 900;
			}
			repaint();

		  } catch (InterruptedException ix) {
			//if we wanna stop running
			//return;
		  }
		}
	  }

	  public void stopRequest() {
		noStopRequested = false;
		internalThread.interrupt();
	  }

	  public boolean isAlive() {
		return internalThread.isAlive();
	  }

 	public void paint(Graphics g)
	{
		super.paint(g);
		
		
		if (ref == 0){
			url = getClass().getResource("/source/images/"+imageNames[0]+".jpg");
			image = new ImageIcon(url).getImage();
			g.drawImage(image, x,50, this);
			
		}
		else if (ref == 1){
			url = getClass().getResource("/source/images/"+imageNames[1]+".jpg");
			image = new ImageIcon(url).getImage();
			g.drawImage(image, x,50, this);
			
		}
		else if (ref == 2){
			url = getClass().getResource("/source/images/"+imageNames[2]+".jpg");
			image = new ImageIcon(url).getImage();
			g.drawImage(image, x,50, this);
			
		}
		else if (ref == 3){
			url = getClass().getResource("/source/images/"+imageNames[3]+".jpg");
			image = new ImageIcon(url).getImage();
			g.drawImage(image, x,50, this);
			
		}
		else if (ref == 4){
			url = getClass().getResource("/source/images/"+imageNames[4]+".jpg");
			image = new ImageIcon(url).getImage();
			g.drawImage(image, x,50, this);
			
		}
		else if (ref == 5){
			url = getClass().getResource("/source/images/"+imageNames[5]+".jpg");
			image = new ImageIcon(url).getImage();
			g.drawImage(image, x,50, this);
			
		}
		else if (ref == 6){
			url = getClass().getResource("/source/images/"+imageNames[6]+".jpg");
			image = new ImageIcon(url).getImage();
			g.drawImage(image, x,50, this);
			
		}
		
		else if (ref == 7){
			url = getClass().getResource("/source/images/"+imageNames[7]+".jpg");
			image = new ImageIcon(url).getImage();
			g.drawImage(image, x,50, this);
			
		}
	}
}