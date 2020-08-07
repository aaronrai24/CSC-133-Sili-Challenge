package com.mycompany.myapp;

import com.codename1.ui.geom.Point;
import com.codename1.ui.Graphics;

public interface ISelectable 
{
    public void setSelected(boolean yesNo);
	
	public boolean isSelected();
	
	public boolean contains(Point pPtrRelPrnt, Point pCmpRelPrnt);

	public void draw(Graphics g, Point pCmpRelPrnt);
	
}