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
    
   private int rtime = 5000;
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

        int width[]={0, 0, 600, 230, 230, 590, 230};
        int height[]={150, 0, 150, 150, 300, 150, 150, 580};


        for(int i=0; i<12; i++){
            addObject( new side(), width[0], 10 );
            addObject( new side(), width[0], 800 );
            addObject( new side(), width[1], 127 );
            addObject( new side(), width[2], 127 );
            addObject( new side(), width[3], 412 );
            addObject( new side(), width[4], 550 );
            addObject( new side(), width[5], 412 );
            addObject( new side(), width[6], 662 );
            width[0] = width[0] + 95;   
            width[1] = width[1] + 30;
            width[2] = width[2] + 50;
            width[3] = width[3] + 9;
            width[4] = width[4] + 58;
            width[5] = width[5] + 40;
            width[6] = width[6] + 75;
        }
        for(int i=0; i<13; i++){
            addObject( new var(), 10, height[0] );
            addObject( new var(), 1070, height[1] );
            addObject( new var(), 368, height[2] );
            addObject( new var(), 550, height[3] );
            addObject( new var(), 193, height[4] );
            addObject( new var(), 750, height[5] );
            addObject( new var(), 900, height[6] );
            addObject( new var(), 193, height[7] );
            height[0] = height[0] + 66;
            height[1] = height[1] + 55;
            height[2] = height[2] + 20;
            height[3] = height[3] + 10;
            height[4] = height[4] + 7;
            height[5] = height[5] + 10;
            height[6] = height[6] + 10;
            height[7] = height[7] + 5;
        }


        addObject( new player01(), 30, 70 );

        addObject( new itemwall(), 100, 550 );
        addObject( new itemwall(), 460, 413 );
        addObject( new itemwall2(), 960, 730 );


        addObject( new item01(), 280, 350);
        addObject( new item02(), 830, 200);
        addObject( new item03(), 230, 605);
        addObject( new goal(), 1020, 722);


    }
}
