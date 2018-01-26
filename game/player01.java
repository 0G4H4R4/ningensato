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
    int items01;
    int items02;
    int items03;

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
            Actor actor1 = getOneObjectAtOffset( 0, 0, item01.class );
            if( actor1 != null ){
                items01++;
                getWorld().showText( "item01 = "+ items01, 100, 50 );
                getWorld().removeObject( actor1 );
            }       
            Actor actor2 = getOneObjectAtOffset( 0, 0, item02.class );
            if( actor2 != null ){
                items02++;
                getWorld().showText( "item02 = "+ items02, 300, 50 );
                getWorld().removeObject( actor2);
            }       
            Actor actor3 = getOneObjectAtOffset( 0, 0, item03.class );
            if( actor3 != null ){
                items03++;
                getWorld().showText( "item03 = "+ items03, 500, 50 );
                getWorld().removeObject( actor3);
            } 
    }    
    
}
