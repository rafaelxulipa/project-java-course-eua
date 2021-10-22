package code;

/**
* @author "Otavio Melo & Bruno Alves""
* @version "Java version 8"
*
* @param None
* @return None
*/

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.net.*;

public class ControlPanel extends JPanel
{
	DisplayPanel displayPanel;
	JCheckBox uniformScaleCheckBox;
	boolean checked;
	String title;
	Font font = new Font("Helvetica",Font.BOLD,9);
	JSlider sliderXScale, sliderYScale;
	JButton resetButton;
	JList imagesList;
	String imageNames[]={"Friends1", "Friends2", "Friends3", "Friends4", "Friends5"};
	double maxFactor=1, xScaleFactor, yScaleFactor;
	Image image;
	Border border = new LineBorder(Color.CYAN,2);
	TitledBorder xsBorder,ysBorder;

	public ControlPanel(DisplayPanel display)
	{
		//setLayout(new GridLayout(2,3));
		displayPanel = display;
		displayPanel.setBackground(Color.BLUE);
		
		
		// ImageList, loading images
		imagesList=new JList(imageNames);
		imagesList.addListSelectionListener(new ListSelectionListener() 
		{
			public void valueChanged(ListSelectionEvent event)
			{
				if(!imagesList.isSelectionEmpty())
				{
					image=new ImageIcon(getClass().getResource("/source/images/" + imagesList.getSelectedValue() + ".jpg")).getImage();
					displayPanel.display(image,xScaleFactor,yScaleFactor);
				}
			}
		});

		imagesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		imagesList.setVisibleRowCount(4);


		//Slider
		sliderXScale=new JSlider(SwingConstants.HORIZONTAL,0,100,0);
		sliderXScale.addChangeListener(
			new ChangeListener(){
				public void stateChanged(ChangeEvent e)
				{
					xsBorder.setTitle("X Scale: CurrentValue = " +
								String.valueOf(sliderXScale.getValue()));
					repaint();
					xScaleFactor=sliderXScale.getValue()*maxFactor/sliderXScale.getMaximum();
					if(checked)
					{
						sliderYScale.setValue(sliderXScale.getValue());
						ysBorder.setTitle("Y Scale: CurrentValue = " +
									String.valueOf(sliderYScale.getValue()));
						yScaleFactor=sliderYScale.getValue()*maxFactor/sliderYScale.getMaximum();
					}
				
					if(image!=null)
						displayPanel.display(image,xScaleFactor,yScaleFactor);
				}
			}
		);

		sliderXScale.setMinorTickSpacing(10);
		sliderXScale.setPaintTicks(true);
		sliderXScale.setPaintLabels(true);
		title = " X Scale ";
		xsBorder= new TitledBorder(border, title, TitledBorder.CENTER, 
								TitledBorder.TOP,font,Color.BLUE);
		sliderXScale.setBorder(xsBorder);
		sliderXScale.setToolTipText("Move for modify Scale to X");

		//ySlider
		sliderYScale=new JSlider(SwingConstants.HORIZONTAL,0,100,0);
		sliderYScale.addChangeListener(
			new ChangeListener(){
				public void stateChanged(ChangeEvent e)
				{ if(checked)
					{ysBorder.setTitle("Scale: CurrentValue = " +
								String.valueOf(sliderYScale.getValue()));}
				  else
					{ysBorder.setTitle("Y Scale: CurrentValue = " +
								String.valueOf(sliderYScale.getValue()));}
					repaint();
					yScaleFactor=sliderYScale.getValue()*maxFactor/sliderXScale.getMaximum();
					if(checked)
					{
						sliderXScale.setValue(sliderYScale.getValue());
						xsBorder.setTitle("X Scale: CurrentValue = " +
									String.valueOf(sliderXScale.getValue()));
						xScaleFactor=sliderXScale.getValue()*maxFactor/sliderXScale.getMaximum();
					}
				
					if(image!=null)
						displayPanel.display(image,xScaleFactor,yScaleFactor);
				}
			}
		);
		sliderYScale.setMajorTickSpacing(25);
		sliderYScale.setPaintTicks(true);
		sliderYScale.setPaintLabels(true);
		title = " Y Scale";
		ysBorder= new TitledBorder(border, title, TitledBorder.CENTER, 
								TitledBorder.TOP,font,Color.BLUE);
		sliderYScale.setBorder(ysBorder);
		sliderYScale.setToolTipText("Move for modify Scale to Y");

		//checkbox
		uniformScaleCheckBox = new JCheckBox("UniformScale");
		uniformScaleCheckBox.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(uniformScaleCheckBox.isSelected())
				{
					checked=true;
					sliderXScale.setVisible(false);
					ysBorder.setTitle("Scale");
				}
				else
				{
					checked=false;
					sliderXScale.setVisible(true);
					ysBorder.setTitle("Y Scale");
				}
			}
		});
		//checked=false;		
		// Button
		resetButton=new JButton("RESET");
		resetButton.addActionListener(new ActionListener()
		{ 	public void actionPerformed(ActionEvent event)
			{
				if("RESET"==(event.getActionCommand()))
				{
					displayPanel.clear();
					imagesList.clearSelection();
				}
			}
		});


		add(new JScrollPane(imagesList));
		add(sliderXScale);
		add(sliderYScale);
		add(uniformScaleCheckBox);
		add(resetButton);
	}
}
