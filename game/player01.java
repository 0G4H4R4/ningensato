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
    

    public void act() 
    {
        int x = getX();
        int y = getY();
        //Actor actor = getOneObjectAtOffset( 0, 0, kabe01.class );
        //if( actor != null ){
            // kabe01 とぶつかった時の処理を書く
        //}       
        //else{
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
        //}

    }    
    
}
