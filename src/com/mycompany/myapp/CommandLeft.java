package com.mycompany.myapp;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;


public class CommandLeft extends Command // left command 
{
	private GameWorld gw;
	
	public CommandLeft(GameWorld gw)
	{
		super ("Left");
		this.gw = gw;
	}
	
	public void actionPerformed( ActionEvent e )// actionPerformed() would call left() method in GameWorld
	{
		gw.left();
	}
}