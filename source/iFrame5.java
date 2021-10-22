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


class iFrame5 extends JInternalFrame implements ActionListener, 
ListSelectionListener
{
	
	URL url;
	Image image;	
	AudioClip audioClip=Applet.newAudioClip(getClass().getResource("/source/audios/cow.au"));
	JButton button, button2, button3;
	String str = null;
	String clipsNames[] = { "cow", "duck", "goat", "horse", "lamb", "pig", "rooster", "cat"};
	String imageNames[] = { "cow", "duck", "goat", "horse", "lamb", "pig", "rooster", "cat"};
	JList clipsList;
	static int ref=0;
	GridLayout layout;
	GridLayout layout2;

 	Container c = getContentPane();

 	public iFrame5 ()
  	{
		
		super("Interactive Audios",true,true,true,true);
		
		FlowLayout layout = new FlowLayout();
		c.setLayout(layout);
		createButtonsAndClips();
		setOpaque(false);
		setSize(1000,600);
		setVisible(true);

  
 	 }

	public void createButtonsAndClips()
	{
		button = new JButton("PLAY");
		button.setBounds(80,40,120,40);
		c.add(button);	
		button.addActionListener(this);
		
		button2 = new JButton("STOP");
		button2.setBounds(80,40,120,40);
		c.add(button2); 
		button2.addActionListener(this);
		
		button3 = new JButton("LOOP");
		button3.setBounds(80,40,120,40);
		c.add(button3); 
		button3.addActionListener(this);

		
		clipsList = new JList(clipsNames);
		//clipsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
		clipsList.setVisibleRowCount(4);

		c.add(new JScrollPane(clipsList));
		clipsList.addListSelectionListener(this);
	}

	public void valueChanged(ListSelectionEvent  event)
	{
		//audioClip.stop();
		str = (String)clipsList.getSelectedValue()+ ".au";
		audioClip = Applet.newAudioClip(getClass().getResource("/source/audios/"+str) );

		if (str.equals("cow.au")){
			ref = 1;
			url = getClass().getResource("/source/images/"+imageNames[0]+".gif");
			image = new ImageIcon(url).getImage();
		}
		else if (str.equals("duck.au")){
			ref = 2;
			url = getClass().getResource("/source/images/"+imageNames[1]+".gif");
			image = new ImageIcon(url).getImage();
		}
		else if (str.equals("goat.au")){
			ref = 3;
			url = getClass().getResource("/source/images/"+imageNames[2]+".gif");
			image = new ImageIcon(url).getImage();
		}
		else if (str.equals("horse.au")){
			ref = 4;
			url = getClass().getResource("/source/images/"+imageNames[3]+".gif");
			image = new ImageIcon(url).getImage();
		}
		else if (str.equals("lamb.au")){
			ref = 5;
			url = getClass().getResource("/source/images/"+imageNames[4]+".gif");
			image = new ImageIcon(url).getImage();
		}
		else if (str.equals("pig.au")){
			ref = 6;
			url = getClass().getResource("/source/images/"+imageNames[5]+".gif");
			image = new ImageIcon(url).getImage();
		}
		else if (str.equals("rooster.au")){
			ref = 7;
			url = getClass().getResource("/source/images/"+imageNames[6]+".gif");
			image = new ImageIcon(url).getImage();
		}
		else if (str.equals("cat.au")){
			ref = 8;
			url = getClass().getResource("/source/images/"+imageNames[7]+".gif");
			image = new ImageIcon(url).getImage();
		}
		
		
		audioClip.play();
		repaint();
	}

    public void actionPerformed(ActionEvent e)
    {
		if(button.equals(e.getSource()))
			{
				repaint();
				audioClip.play();				
			}
		else if(button2.equals(e.getSource()))
			{
				repaint();
				audioClip.stop();				
			}
			
		else if(button3.equals(e.getSource()))
			{
				repaint();
				audioClip.loop();				
			}
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		if (ref == 1){
			g.drawImage(image, 100,150, this);
		}
		else if (ref == 2){
			g.drawImage(image, 100,150, this);
			
		}
		else if (ref == 3){
			g.drawImage(image, 100,150, this);
			
		}
		else if (ref == 4){
			g.drawImage(image, 100,150, this);
			
		}
		else if (ref == 5){
			g.drawImage(image, 100,150, this);
			
		}
		else if (ref == 6){
			g.drawImage(image, 100,150, this);
			
		}
		else if (ref == 7){
			g.drawImage(image, 100,150, this);
			
		}
		
		else if (ref == 8){
			g.drawImage(image, 100,150, this);
			
		}
	}

}