package com.fpd.decoder;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Decoder implements Runnable
{
	
	public static void main(String[] ap) 
	{
	    // schedule this for the event dispatch thread (edt)  //testing  testingtestingtestingtestingtesting
	    SwingUtilities.invokeLater(new Decoder());
	}

	public void run()
	{
		try
		{
			// Set the L&F for the Decoder to the system L&F.
			try
			{
				UIManager.setLookAndFeel(
				    UIManager.getSystemLookAndFeelClassName());
			} 
			catch (Exception e) 
			{
				// Strange if we can't set the L&F but the Decoder
				// will run anyway.
				e.printStackTrace();
			}
			
			new Manager();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
