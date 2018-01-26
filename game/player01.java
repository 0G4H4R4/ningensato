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
    private int items03;
    private int count=0;

    public void act() 
    {
        int x = getX();
        int y = getY();        
        
        //Player 動き
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
        
        //アイテム取得処理
        Actor actor1 = getOneObjectAtOffset( 0, 0, item01.class );
        if( actor1 != null ){
            items01++;
            getWorld().showText( "アイテム２取得 ", 300, 50 );
            getWorld().removeObject( actor1 ); 
        }    
        Actor actor2 = getOneObjectAtOffset( 0, 0, item02.class );
        if( actor2 != null ){
            items02++;
            getWorld().showText( "アイテム１取得 ", 100, 50 );
            getWorld().removeObject( actor2 ); 
        }   
        Actor actor3 = getOneObjectAtOffset( 0, 0, item03.class );
        if( actor3 != null ){
            items03++;
            getWorld().showText( "アイテム３取得 ", 500, 50 );
            getWorld().removeObject( actor3 ); 
        }
        
        //アイテムウォール処理
        Actor actor4 = getOneObjectAtOffset( 0, 0, itemwall.class );
        if( actor4 != null){
            if( items01==1 || items02==1){
                items01 = 0;
                items02 = 0;
                if( count == 0){
                    getWorld().showText( "アイテムウォール１破壊 ", 145, 100 );
                    getWorld().removeObject( actor4 );
                    count++;
                }
                else if( count == 1){
                    getWorld().showText( "アイテムウォール２破壊 ", 145, 150 );
                    getWorld().removeObject( actor4 );
                    count++;
                }
            }
            else{
                //アイテムウォール, 識別処理で突破させない
            }
        }
        
        Actor actor5 = getOneObjectAtOffset( 0, 0, itemwall2.class );
        if( actor5 != null){
            if( items03==1 ){
                items03 = 0;
                if( count == 2){
                    getWorld().showText( "アイテムウォール３破壊 ", 145, 200 );
                    getWorld().removeObject( actor5 );
                    count++;
                }
            }
            else{
                //アイテムウォール, 識別処理で突破させない
            }
        }
    }
}
