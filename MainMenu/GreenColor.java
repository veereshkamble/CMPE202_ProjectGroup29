import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenColor extends Actor
{
    /**
     * Act - do whatever the GreenColor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     DrawCircle dc;
    DrawOval dov;
    DrawRectangle dr;
    GreenfootImage image = new GreenfootImage(110,100);
    public GreenColor(DrawCircle dc,DrawRectangle dr,DrawOval dov)
    {
    this.dc = dc;
        this.dov=dov;
        this.dr=dr;
      image.drawRect(0,0,50,50);
      image.setColor(java.awt.Color.GREEN);
      image.fillRect(0,0,50,50);
      setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
        dc.fillColor("GREEN");
        dr.fillColor("GREEN");
        dov.fillColor("GREEN");
        
        }
    }    
}