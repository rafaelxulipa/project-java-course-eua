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
import java.net.*;
import java.applet.*;


public class Demo extends JApplet implements ActionListener
 {
	JFrame frame;
	JTextArea ta;
	JScrollPane scrollPane;
	JDesktopPane  desktopPane;
	String str = "";
	iFrame iframe;
	iFrame3 iframe3;
	iFrame4 iframe4;
	iFrame5 iframe5;
	iFrame6 iframe6;
	iFrame7 iframe7;
	iFrame8 iframe8;


	JInternalFrame iFrame2, iFrame3, iFrame4, iFrame5, iFrame6, iFrame7, iFrame8;
	JDesktopPane deskScreen;
    JMenuBar bar;
	Container c;	
    JMenu menu, menu2, submenu, submenu2;  
    JMenuItem menuOpen, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12, item13;
	Graphics g;

	
	public void init(){

		desktopPane = new JDesktopPane();
		//desktopPane.add(new ImageScaleIF ());
		//getContentPane().add(desktopPane);
		
		//TextArea
			str += " \tDisplay the functionality of images and audioclips for animation as below: \n\n  Write a program using new threads (Do not use old threads to get credit for the project)"
				+"\n   as discussed in the class for Algorithm Visualization.\n Your program should be menu driven as seen in the demos and previous assignments.\n"
				+"\n   Your program should be menu driven as seen in the demos and previous assignments.\n"
				+"\n   Your program uses JInternalFrames (full functionality) and JPanels for proper display of the program components to do all the work.\n"
				+"\n   The JInternalFrames and JPanels may be placed in JApplet and/or JFrame.\n   The program should be executable as an applet or an application.\n"
				+"\n   Use package command for packaging the appropriate files. Jar the whole package.\n   Document the code using java style code.\n"
				+"\n   Every class, function and variable has javadoc descriptive comments. Make your program as fancy as you can.\n"
				+"\n   Select your favorite 10 images and 10 audioclips whose sound matched the image.\n"
				+"\n   Project: Combine functionality images and audios:\n\n"
				+"   About:\n\tAuthor\n\tProblem Description\n\tReferences\n\tHelp\n"
				+"   Demos:\n\tAudio\n\tInteractive: allow user to select a clip. Use buttons to control play, stop, loop.\n\tSequential: Create an internal frame for automatically selecting clips\n"
				+"\n\tsequentially from the audio directory and playing them in that order in an infinite loop.\n\tWhile the clip is playing, display an image related to the clip.\n"
				+"   Images:\n\tSlideShow: Display images all scaled to same dimensions and one after the other from right to left."
				+"\n\tZoomShow: Display images all scaled from min (say 10x10) to maximum (windowsize) dimension,\n"
				+"\n\tthen back to min before starting the next image.\n";
				
				ta = new JTextArea(str, 20, 60);

				scrollPane = new JScrollPane();
				c = getContentPane();
				deskScreen = new JDesktopPane();
				
		
		// BAR
		setJMenuBar(bar = new JMenuBar());
		deskScreen.add(bar);
		bar.setVisible(true);
		// Menu 1
		menu = new JMenu("About"); 
		bar.add(menu);
		
		menu2 = new JMenu("Demos"); 
		bar.add(menu2);

		menu.setVisible(true);		
		// Item - Menu 1
		item1 = new JMenuItem("Authors");
		menu.add(item1);
		item2 = new JMenuItem("Problem description");
		menu.add(item2);

		item3 = new JMenuItem("Reference");
		menu.add(item3);

		item4 = new JMenuItem("Help");
		menu.add(item4);
		
		//Item - Menu 2
		submenu = new JMenu("Audio");
		menu2.add(submenu);
			//submenu2 = new JMenu("Shapes 2D");
				//submenu.add(submenu2);
				
				item5 = new JMenuItem("Interactive");
				submenu.add(item5);
				
				item6 = new JMenuItem("Sequential");
				submenu.add(item6);

		submenu2 = new JMenu("Images");
		menu2.add(submenu2);

				item7 = new JMenuItem("SlideShow");
				submenu2.add(item7);
				
				item8 = new JMenuItem("ZoomShow");
				submenu2.add(item8);

		
		
		//iFrames
		c.setBackground( Color.CYAN );
		c.setSize(1000, 600);
		c.add(deskScreen);
		iframe = new iFrame(); 
		iframe.setSize(1000, 600);
		deskScreen.add(iframe);


				
		//actionListener dor items
		item1.addActionListener(this);
		item2.addActionListener(this);
        item3.addActionListener(this);
		item4.addActionListener(this);
		item5.addActionListener(this);
		item6.addActionListener(this);
		item7.addActionListener(this);
		item8.addActionListener(this);


		
		paintComponents(getGraphics());
    }
	
	
	
	public void actionPerformed(ActionEvent e) 
	{  
		if(item1.equals(e.getSource()))
			{
					repaint();
					c.add(deskScreen);
					iframe = new iFrame(); 
					iframe.setSize(1000,600);
					iframe.setVisible(true);
					
				//Settings generals 
					iframe.setTitle("Author Identification");
					iframe.setClosable(true);
					iframe.setIconifiable(false);  
					iframe.setResizable(false);
					//iFrame.setOpaque(true);
					
					iframe.setLayout(new FlowLayout());  //set the layout manager	
					((JComponent)iframe.getContentPane()).setOpaque(false);
					deskScreen.add(iframe);
					
					
				
				
			}
	
	else if(item2.equals(e.getSource()))
			{
					repaint();
					

					c.add(deskScreen);
					iFrame2 = new JInternalFrame(); 
					iFrame2.setSize(1000,600);
					iFrame2.setVisible(true);

					
				//Settings generals 
					iFrame2.setTitle("Problem description");
					iFrame2.setClosable(true);
					iFrame2.setIconifiable(false);  
					iFrame2.setResizable(false);
					//iFrame2.setOpaque(true);
					

					iFrame2.setLayout(new FlowLayout());  //set the layout manager	
					//((JComponent)iFrame2.getContentPane()).setOpaque(false);

					Font font = new Font("Times", Font.BOLD, 14);
					ta.setFont(font);
					ta.setForeground(Color.BLUE);
					ta.setBackground(Color.WHITE);
					ta.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
					//ta.setBorder(BorderFactory.createTitledBorder("Homework #4 - Java GUI Class"));
					ta.setEditable(false);
					ta.setVisible(true);
					
					iFrame2.add(ta);
					iFrame2.add(scrollPane);
					scrollPane.setViewportView(ta);
					
					deskScreen.add(iFrame2);


			}

	else if(item4.equals(e.getSource()))
			{
					repaint();
					c.add(deskScreen);
					iframe3 = new iFrame3(); 
					iframe3.setSize(1000,600);
					iframe3.setVisible(true);
					
				//Settings generals 
					iframe3.setTitle("Help");
					iframe3.setClosable(true);
					iframe3.setIconifiable(false);  
					iframe3.setResizable(false);
					//iFrame3.setOpaque(true);
					
					iframe3.setLayout(new FlowLayout());  //set the layout manager	
					((JComponent)iframe3.getContentPane()).setOpaque(false);
					deskScreen.add(iframe3);		
					
			}

	else if(item3.equals(e.getSource()))
			{
					repaint();
					c.add(deskScreen);
					iframe4 = new iFrame4(); 
					iframe4.setSize(1000,600);
					iframe4.setVisible(true);
					
				//Settings generals 
					iframe4.setTitle("References");
					iframe4.setClosable(true);
					iframe4.setIconifiable(false);  
					iframe4.setResizable(false);
					//iFrame4.setOpaque(true);
					
					iframe4.setLayout(new FlowLayout());  //set the layout manager	
					((JComponent)iframe4.getContentPane()).setOpaque(false);
					deskScreen.add(iframe4);		
				
			}

			else if(item5.equals(e.getSource()))
			{
				repaint();
				c.add(deskScreen);
				deskScreen.add(new iFrame5());			
				
			}

			else if(item6.equals(e.getSource()))
			{
					repaint();
					c.add(deskScreen);
					iframe6 = new iFrame6(); 
					iframe6.setSize(1000,600);
					iframe6.setVisible(true);
					
				//Settings generals 
					iframe6.setTitle("Sequential");
					iframe6.setClosable(true);
					iframe6.setIconifiable(false);  
					iframe6.setResizable(false);
					//iFrame4.setOpaque(true);
					
					iframe6.setLayout(new FlowLayout());  //set the layout manager	
					((JComponent)iframe6.getContentPane()).setOpaque(false);
					deskScreen.add(iframe6);		
				
			}

			else if(item7.equals(e.getSource()))
			{
				repaint();
				c.add(deskScreen);
				deskScreen.add(new iFrame7());		
				
			}
			
			else if(item8.equals(e.getSource()))
			{
				repaint();
				c.add(deskScreen);
				deskScreen.add(new iFrame8());
					
			}
	} 

	
    public static void main(String[] args) 
	{
	
		//Demo app = new Demo();
		//if (app instanceof JApplet) app.init();
		
		// JFrame mainFrame = new JFrame();
		// JApplet applet = new Demo();
		// mainFrame.getContentPane().add(applet);
		// mainFrame.setTitle("Demo");
		// mainFrame.setSize(1000,600);
		// mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// mainFrame.setVisible(true);
		// applet.init();
		
		MainFrame mainFrame = new MainFrame(new Demo(), "Demo");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	
}