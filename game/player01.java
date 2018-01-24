import greenfoot.*;

/**
 * Write a description of class player01 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player01 extends Actor
{
    /**
     * Act - do whatever the player01 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int items01;
    private int items02;

    public void act() 
    {
        int x = getX();
        int y = getY();
        

            if( Greenfoot.isKeyDown( "right" ) ){
            setLocation(x+2, y);
            }
            else if( Greenfoot.isKeyDown( "left" ) ){
            setLocation(x-2, y);
            }
            else if( Greenfoot.isKeyDown( "up" ) ){
            setLocation(x, y-2);
            }
            else if( Greenfoot.isKeyDown( "down" ) ){
            setLocation(x, y+2);
        }
        
        Actor actor1 = getOneObjectAtOffset( 0, 0, item01.class );
        if( actor1 != null ){
            getWorld().showText( "あたった "+ items01, 200, 50 );
            getWorld().removeObject( actor1 ); 
        }   
        
        Actor actor2 = getOneObjectAtOffset( 0, 0, item02.class );
        if( actor2 != null ){
            getWorld().showText( "あたった "+ items02, 300, 50 );
            getWorld().removeObject( actor2 ); 
        }   
    }
    

    
}
