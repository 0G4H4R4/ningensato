import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
   private int rtime = 500;
   private int score = 0;
   
   public void act()
    {
        rtime--;
        showText("制限時間："+rtime, 965, 30);
        
        if( rtime == 0 )
        {
                showText( "里から抜け出すことができなかった・・・", 560, 405 );
                showText( "スコア： "+score, 560, 445);
                Greenfoot.stop();
        }
    }
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 810, 1); 
        addObject( new player01(), 30, 50 );
    }
}
