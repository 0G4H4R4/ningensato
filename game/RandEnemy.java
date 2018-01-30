import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class RandEemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandEnemy extends Enemy
{
    /**
     * Act - do whatever the RandEemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int rand;
    public  boolean BreakFlag;
    public int last;
    public int count;
    public int tmp;
    public RandEnemy()
    {
        rand = 0;
        BreakFlag = false;
        last = -1;
        count = 0;
        tmp = 0;
    }
    
    
    public void act() 
    {
        
       int x = getX();
        int y = getY();
        
        Actor actorVar = getOneObjectAtOffset( 0, 0, var.class );   
        Actor actorSide = getOneObjectAtOffset( 0, 0, side.class );     
        Actor actorItem = getOneObjectAtOffset( 0, 0, itemwall.class );
        
        boolean HitFlag = actorVar != null || actorSide != null || actorItem != null;
        
        if(HitFlag){
            //kabe01 とぶつかった時の処理を書く
            if( last == 0 ){
                setLocation(x-3, y);
            }
            else if( last == 1 ){
                setLocation(x+3, y);
            }
            else if( last == 2 ){
                setLocation(x, y+3);
            }
            else if( last == 3 ){
                setLocation(x, y-3);
            }
            
            count = 0;
        }       
        else{
            if(count == 0)
            {
                tmp = Greenfoot.getRandomNumber(4);
                count = 100;
            }
            else
            {
                count--;
            }
        
            if( tmp == 0 ){
                setLocation(x+2, y);
                last = 0;
            }
            else if( tmp == 1 ){
                setLocation(x-2, y);
                last = 1;
            }
            else if( tmp == 2 ){
                setLocation(x, y-2);
                last = 2;
            }
            else if( tmp == 3 ){
                setLocation(x, y+2);
                last = 3;
            }
        }
            
        
           super.ChkHit();
    }    
    
    
   
}




