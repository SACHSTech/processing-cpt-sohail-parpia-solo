import processing.core.PApplet;
import processing.core.PImage;




public class Sketch extends PApplet {
  // Global Variables

  // Lava Variable
  int lvx = 0;

  // Blocks Variable
  int brz =10;

  // Location Variables
  int ex = 200;
  int ey = 200;

  // Image
  PImage img;

  // Movement
  int keyPressed;

  // Screens
  int stage;

  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 600);
    }
  

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  public void setup() {
    img = loadImage("Dark City.jpg");
    img.resize(width, height);

    rectMode(CENTER);
    textAlign(CENTER);
  }

/**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    image(img, 0, 0);
  
    if(stage == 0){
      splash();
    }
    
    if(stage == 1){ 
      game(); 
    }
    }

    private void splash() {
      // Home Screen

  //START GAME
  fill(225, 255, 0);
  textSize(40); 
  text("To BEGIN, Press r", 400, 500);
  textSize(40);
  text("WELCOME TO LAVA CITY OBSTACLE", 400, 200);

  textAlign(CENTER);
}


    private void game() {
     img = loadImage("SUNSET.jpeg");
     img.resize(width, height);
    
 
      //Player 
      fill(209,32,138);
      ellipse(ex,ey,50,50);
      {
      
      //Lava Falling
      fill(255, 8, 0);
      rect(420,lvx,40,40,40);
      fill(255, 8, 0);
      rect(265,lvx,40,40,40);
      fill(255, 8, 0);
      rect(580,lvx,40,40,40);
      lvx = lvx + brz;
       if(lvx<0||lvx>600)
        {
      brz=-brz;
        }
      {
        
      if(get(ex,ey)==color(114,23,175))
        {
        
      // Position of player after touching falling lava
          ex=100; 
        }

        //Blocks
         fill(0, 255, 255);
         rect(320,0,80,430);
         fill(0, 255, 255);
         rect(240,600,80,430);
         fill(0, 255, 255);
         rect(480,0,80,300);
         fill(0, 255, 255);
         rect(400,520,80,430);
         fill(0, 255, 255);
         rect(640,0,80,500);
         fill(0, 255, 255);
         rect(560,600,80,300);
         fill(0, 255, 255);
         rect(720,0,80,80);
        {
        if(get(ex,ey)==color(92,240,228))
        {
      
          ex=100; 
        }

        //Finish Area
        fill(random (0,255), random(0,30), random(0,240));
        rect(720,0,80,80);
        fill(220,250,0);
        rect(720,0,80,80);
        fill(69,28,234);
        textSize(25);
        text("HERE",720,35);
        {
          
          ex=100; 
        }
        }
        }
      }
        }
  


   

public void keyPressed(){
  // Movement of Player
  if(keyCode == UP)
  {ey=ey-5;}

   if(keyCode == DOWN)
  {ey=ey+5;} 

  if(keyCode == RIGHT)
  {ex=ex+5;} 

  if(keyCode == LEFT)
  {ex=ex-5;}

  // To begin game
  if (keyCode == 'r');
  stage=1;
  


}
}



    




  
 





















                                                                                                  
    
  
    