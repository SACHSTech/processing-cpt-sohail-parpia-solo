import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  // Global Variables

  // Game Variables
  int r;
  int d;
  int e;
  int e1;

  // Keyboard Variables
  int keyPressed;

  // Screens
  int stage;

  // Image
  PImage img;

  
 



  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
    }
  

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  public void setup() {

    img = loadImage("City Area.jpg");
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
    //Home Screen
    img = loadImage("City Area.jpg");
    img.resize(width, height);


	//Name of Game
	fill(255,0,0);
	textSize(60); 
	text("DANGER FALL", 400, 150);
	
	//START
	fill(255, 250, 0);
	textSize(40); 
	text("r To Start", 400, 400);

}

  private void game() {
    img = loadImage("SUNSET.jpeg");
    img.resize(width, height);
    
  
  
  //Moving purple circles 

 //Main circle To Control
  fill(209,32,138);
  ellipse(e,e1,70,70);
{
 //Moving purple circles 
  fill(114,23,175);
  rect(420,r,40,40,40);
  fill(114,23,175);
  rect(265,r,40,40,40);
  fill(114,23,175);
  rect(580,r,40,40,40);
 
}
}


public void keyPressed(){

  if(keyCode==UP)
  {e1=e1-5;}

   if(keyCode==DOWN)
  {e1=e1+5;} 

  if(keyCode==RIGHT)
  {e=e+5;} 

  if(keyCode==LEFT)
  {e=e-5;}

  if (keyCode == 'r');
    stage = 1;
}
}



  
 





















                                                                                                  
    
  
    