import greenfoot.*;

/**
 * Write a description of class fuckinDTB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fuckinDTB extends Actor
{
    /**
     * Act - do whatever the fuckinDTB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Writed by B 
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(5);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            setRotation(270);
           move(5);
        }
        if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(180);
        move(5);
        }
    }    
}
