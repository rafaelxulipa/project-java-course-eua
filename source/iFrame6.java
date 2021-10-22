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


public class iFrame6 extends JInternalFrame
{
	URL url;
	Image image;	
	AudioClip audioClip=Applet.newAudioClip(getClass().getResource("/source/audios/cow.au"));
	String str = null;
	String clipsNames[] = { "cow", "duck", "goat", "horse", "lamb", "pig", "rooster", "cat"};
	String imageNames[] = { "cow", "duck", "goat", "horse", "lamb", "pig", "rooster", "cat"};
	static int ref=0;
	static int i, j, y;

	
	Container c = getContentPane();


	private Thread internalThread;

	private volatile boolean noStopRequested;

	public iFrame6() 
	{
	
		super("SlideShow",true,true,true,true);
		
		FlowLayout layout = new FlowLayout();
		c.setLayout(layout);
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
      try {
        Thread.sleep(2000);
		ref++;
		if (ref == 8)
		{
			ref = 0;
		}
		repaint();

      } catch (InterruptedException ix) {
        //stop running
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
			str = (String)clipsNames[0]+ ".au";
			audioClip = Applet.newAudioClip(getClass().getResource("/source/audios/"+str) );
			audioClip.play();
			url = getClass().getResource("/source/images/"+imageNames[0]+".gif");
			image = new ImageIcon(url).getImage();
			g.drawImage(image, 300,150, this);
			
		}
		else if (ref == 1){
			str = (String)clipsNames[1]+ ".au";
			audioClip = Applet.newAudioClip(getClass().getResource("/source/audios/"+str) );
			audioClip.play();			
			url = getClass().getResource("/source/images/"+imageNames[1]+".gif");
			image = new ImageIcon(url).getImage();
			g.drawImage(image, 300,150, this);
			
		}
		else if (ref == 2){
			str = (String)clipsNames[2]+ ".au";
			audioClip = Applet.newAudioClip(getClass().getResource("/source/audios/"+str) );
			audioClip.play();
			url = getClass().getResource("/source/images/"+imageNames[2]+".gif");
			image = new ImageIcon(url).getImage();
			g.drawImage(image, 300,150, this);
			
		}
		else if (ref == 3){
			str = (String)clipsNames[3]+ ".au";
			audioClip = Applet.newAudioClip(getClass().getResource("/source/audios/"+str) );
			audioClip.play();
			url = getClass().getResource("/source/images/"+imageNames[3]+".gif");
			image = new ImageIcon(url).getImage();
			g.drawImage(image, 300,150, this);
			
		}
		else if (ref == 4){
			str = (String)clipsNames[4]+ ".au";
			audioClip = Applet.newAudioClip(getClass().getResource("/source/audios/"+str) );
			audioClip.play();
			url = getClass().getResource("/source/images/"+imageNames[4]+".gif");
			image = new ImageIcon(url).getImage();
			g.drawImage(image, 300,150, this);
			
		}
		else if (ref == 5){
			str = (String)clipsNames[5]+ ".au";
			audioClip = Applet.newAudioClip(getClass().getResource("/source/audios/"+str) );
			audioClip.play();
			url = getClass().getResource("/source/images/"+imageNames[5]+".gif");
			image = new ImageIcon(url).getImage();
			g.drawImage(image, 300,150, this);
			
		}
		else if (ref == 6){
			str = (String)clipsNames[6]+ ".au";
			audioClip = Applet.newAudioClip(getClass().getResource("/source/audios/"+str) );
			audioClip.play();
			url = getClass().getResource("/source/images/"+imageNames[6]+".gif");
			image = new ImageIcon(url).getImage();
			g.drawImage(image, 300,150, this);
			
		}
		
		else if (ref == 7){
			str = (String)clipsNames[7]+ ".au";
			audioClip = Applet.newAudioClip(getClass().getResource("/source/audios/"+str) );
			audioClip.play();
			url = getClass().getResource("/source/images/"+imageNames[7]+".gif");
			image = new ImageIcon(url).getImage();
			g.drawImage(image, 300,150, this);
			
		}
	}
}