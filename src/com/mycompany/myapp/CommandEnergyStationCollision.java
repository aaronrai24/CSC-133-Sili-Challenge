package com.mycompany.myapp;
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;


public class CommandEnergyStationCollision extends Command // energystationcollision command 
{
	private GameWorld gw;
	
	public CommandEnergyStationCollision(GameWorld gw)
	{
		super ("Collide With Energy Station");
		this.gw = gw;
	}
	
	public void actionPerformed( ActionEvent e )// actionPerformed() would call energystationcollision() method in GameWorld
	{
		//gw.energyStationsCollision();
	}
}
