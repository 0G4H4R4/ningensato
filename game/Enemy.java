import greenfoot.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    
    public Enemy()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/8, image.getHeight()/8);
        setImage(image);      
    }

    public void act() 
    {
        // Add your action code here.
       Actor actor = getOneObjectAtOffset( 0, 0, player01.class );
        if( actor != null ){
            // player01とぶつかった時の処理を書く
            Greenfoot.stop();
            Enemy enemy = (Enemy) getWorld().getObjects(Enemy.class).get(0);
            getWorld().showText( "捕まった", enemy.getX(), enemy.getY());
        }      
    }    
}
