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
        Actor actorItem = getOneObjectAtOffset( 0, 0, itemwall.class );
        
        boolean HitFlag = actorVar != null || actorSide != null || actorItem != null;
        
        if(HitFlag){
            //kabe01 とぶつかった時の処理を書く
            if( last == 0 ){
                setLocation(x-4, y);
            }
            else if( last == 1 ){
                setLocation(x+4, y);
            }
            else if( last == 2 ){
                setLocation(x, y+4);
            }
            else if( last == 3 ){
                setLocation(x, y-4);
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
        //}
            if( actor1 != null ){
                items01++;
                getWorld().showText( "item01 = "+ items01, 100, 50 );
                getWorld().removeObject( actor1 );
            }       
            if( actor2 != null ){
                items02++;
                getWorld().showText( "item02 = "+ items02, 300, 50 );
                getWorld().removeObject( actor2);
            }       
            if( actor3 != null ){
                items03++;
                getWorld().showText( "item03 = "+ items03, 500, 50 );
                getWorld().removeObject( actor3);
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
        }
    }

}
