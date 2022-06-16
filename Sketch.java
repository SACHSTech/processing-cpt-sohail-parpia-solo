import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  // Global Variables

  // Lava Variable
  int lrx=0;

  // Blocks Variable
  int dir=10;

  // Location Variables
  int eL1x=200;
  int eL1y=200;

  // Movement
  int keyPressed;

  // Image
  PImage img;

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
  
  
   private void game() {
  //Player 
  fill(251, 255, 0);
  ellipse(eL1x,eL1y,50,50);
  {
   //Lava Balls
  fill(255, 0, 0);
  rect(420,lrx,40,40,40);
  fill(255, 0, 0);
  rect(265,lrx,40,40,40);
  fill(255, 0, 0);
  rect(580,lrx,40,40,40);
  fill(255, 0, 0);
  rect(350,lrx, 40, 40, 40);
   lrx = lrx + dir;
   if(lrx<0||lrx>600)
   {
    dir=-dir;
   }
   {
  
  if(get(eL1x,eL1y)==color(255, 0, 0))
  {
    
    eL1x=100; //restart position if player touch blocks
  }
  //Blocks
   fill(195, 0, 255);
   rect(320,0,80,550);
   fill(195, 0, 255);
   rect(240,600,80,490);
   fill(195, 0, 255);
   rect(480,0,80,420);
   fill(195, 0, 255);
   rect(400,520,80,420);
   fill(195, 0, 255);
   rect(640,0,80,520);
   fill(195, 0, 255);
   rect(560,600,80,620);
   fill(0);
   rect(720,0,80,450);
  {
  if(get(eL1x,eL1y)==color(195, 0, 255))
  {
    
    eL1x=100; //restart position if player touch blocks
  }

  //Finish
  fill(random (0,255), random(0,30), random(0,240));
  rect(720,0,80,80);
  fill(220,250,0);
  rect(720,0,80,80);
  fill(69,28,234); 
}
}
}
}
  {
  {
    
    eL1x=100; 
  }
  }

  private void splash() {
  //START GAME
  fill(225, 255, 0);
  textSize(40); 
  text("To BEGIN, Press r", 400, 500);
  textSize(40);
  text("WELCOME TO LAVA CITY OBSTACLE", 400, 200);

  textAlign(CENTER);

  }

 public void keyPressed(){
  // Movement of Player
  if(keyCode == UP)
  {eL1y=eL1y-5;}

   if(keyCode == DOWN)
  {eL1y=eL1y+5;} 

  if(keyCode == RIGHT)
  {eL1x=eL1x+5;} 

  if(keyCode == LEFT)
  {eL1x=eL1x-5;}
  
  // To begin game
  if (keyCode == 'r');
  stage=1;
}

}




    




  
 





















                                                                                                  
    
  
    