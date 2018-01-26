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

    public  int last;
    
    public player01()
    {
        last = 0;
        
    }
    
    public void act() 
    {
        int x = getX();
        int y = getY();
        
        Actor actorVar = getOneObjectAtOffset( 0, 0, var.class );   
        Actor actorSide = getOneObjectAtOffset( 0, 0, side.class );     
        
        boolean HitFlag = actorVar != null || actorSide != null ;
        
        if(HitFlag){
            //kabe01 とぶつかった時の処理を書く
            if( last == 0 ){
                setLocation(x-2, y);
            }
            else if( last == 1 ){
                setLocation(x+2, y);
            }
            else if( last == 2 ){
                setLocation(x, y+2);
            }
            else if( last == 3 ){
                setLocation(x, y-2);
            }
        }       
        else{
            if( Greenfoot.isKeyDown( "right" ) ){
                setLocation(x+2, y);
                last = 0;
            }
            else if( Greenfoot.isKeyDown( "left" ) ){
                setLocation(x-2, y);
                last = 1;
            }
            else if( Greenfoot.isKeyDown( "up" ) ){
                setLocation(x, y-2);
                last = 2;
            }
            else if( Greenfoot.isKeyDown( "down" ) ){
                setLocation(x, y+2);
                last = 3;
            }
        }
      

    }    

}
