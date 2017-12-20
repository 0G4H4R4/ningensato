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
    public void act() 
    {
        // Add your action code here.
        RandEnemy enemy = (RandEnemy)getWorld().getObjects(RandEnemy.class).get(0);
        Color color = getWorld().getColorAt(enemy.getX(), enemy.getY());
        getWorld().showText( color.toString(), enemy.getX(), enemy.getY());
    }    
}
