package com.mycompany.myapp;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;


public class CommandRight extends Command // Right command 
{
	private GameWorld gw;
	
	public CommandRight(GameWorld gw)
	{
		super ("Right");
		this.gw = gw;
	}
	
	public void actionPerformed( ActionEvent e )// actionPerformed() would call Right() method in GameWorld
	{
		gw.right();
	}
}