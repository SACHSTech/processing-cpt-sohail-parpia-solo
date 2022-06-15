import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  // Global Variables

  // Lava Variable
  int lrx=0;

  // Blocks Variable
  int dir=10;

  // Location Variables
  int e1x=200;
  int e1y=200;

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
  fill(3, 255, 28);
  ellipse(e1x,e1y,70,70);
  {
   //Lava
  fill(255, 0, 0);
  rect(420,lrx,40,40,40);
  fill(255, 0, 0);
  rect(265,lrx,40,40,40);
  fill(255, 0, 0);
  rect(580,lrx,40,40,40);
   lrx = lrx + dir;
   if(lrx<0||lrx>600)
   {
    dir=-dir;
   }
   {
  
  if(get(e1x,e1y)==color(114,23,175))
  {
    
    e1x=100; //restart position if touch blocks
  }
  //Blocks
   fill(195, 0, 255);
   rect(320,0,80,430);
   fill(195, 0, 2552);
   rect(240,600,80,430);
   fill(195, 0, 255);
   rect(480,0,80,300);
   fill(195, 0, 255);
   rect(400,520,80,430);
   fill(195, 0, 255);
   rect(640,0,80,500);
   fill(195, 0, 255);
   rect(560,600,80,300);
   fill(0);
   rect(720,0,80,80);
  {
  if(get(e1x,e1y)==color(195, 0, 255))
  {
    
    e1x=100; //restart position if touch blocks
  }
  //Finish
  fill(random (0,255), random(0,30), random(0,240));
  rect(720,0,80,80);
  fill(220,250,0);
  rect(720,0,80,80);
  fill(69,28,234);
  textSize(25);
  text("Finish",720,25);
  textSize(20);
  
}
}
}
}
  {
  {
    
    e1x=100; 
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
  {e1y=e1y-5;}

   if(keyCode == DOWN)
  {e1y=e1y+5;} 

  if(keyCode == RIGHT)
  {e1x=e1x+5;} 

  if(keyCode == LEFT)
  {e1x=e1x-5;}
  
  // To begin game
  if (keyCode == 'r');
  stage=1;
}

}




    




  
 





















                                                                                                  
    
  
    