import greenfoot.*;

/**
 * Write a description of class title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class title extends World
{    
    /**
     * Constructor for objects of class title.
     * 
     */
    public title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 810, 1); 
        
    }
    
    public void act()
    {
            if( Greenfoot.isKeyDown( "space" ) ){
                MyWorld myworld = new MyWorld();
                Greenfoot.setWorld(myworld);
        }
    }
}
