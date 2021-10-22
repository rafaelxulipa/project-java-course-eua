package code;/*** @author "Otavio Melo & Bruno Alves""* @version "Java version 8"** @param None* @return None*/import java.awt.*;import javax.swing.*;import java.net.*;public class DisplayPanel extends JPanel{	Image image;	int xCenter,yCenter;	int width,height;	double xScale, yScale;		public DisplayPanel()	{		width=0;height=0;		setBackground(Color.BLUE);	}	public void paintComponent(Graphics g)	{		super.paintComponent(g);		if(image!=null)		{			xCenter=getWidth()/2;			yCenter=getHeight()/2;			width=(int)(xScale*2*xCenter);			height=(int)(yScale*2*yCenter);			g.drawImage(image,xCenter-width/2,yCenter-height/2,width,height,this);		}	}	public void display(Image selectedImage,double xRatio, double yRatio)	{		image=selectedImage;		xScale = xRatio;		yScale = yRatio;		repaint();	}	public void clear()	{		image=null;		repaint();	}}