import greenfoot.*;

/**
 * Write a description of class ChaseEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChaseEnemy extends Enemy
{
    /**
     * Act - do whatever the ChaseEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int lastX = 0;
    public int lastY = 0;
    
    
    public ChaseEnemy()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/4, image.getHeight()/4);
        setImage(image);      
    }
    
    
    public void act() 
    {
 
        
        Actor actorVar = getOneObjectAtOffset( 0, 0, var.class );   
        Actor actorSide = getOneObjectAtOffset( 0, 0, side.class );     
        Actor actorItem = getOneObjectAtOffset( 0, 0, itemwall.class );
        
        
        boolean HitFlag = actorVar != null || actorSide != null || actorItem != null;
        
        if(HitFlag){
            //kabe01 とぶつかった時の処理を書く
            
            
            turnTowards(lastX, lastY);  
            move(30);
        }       
        else{
            player01 player = (player01)getWorld().getObjects(player01.class).get(0);
            turnTowards(player.getX(), player.getY());  
            lastX = getX();
            lastY = getY();
            move(1);
         }
         
         
         super.ChkHit();
         
    }    
}
