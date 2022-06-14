import processing.core.PApplet;
import processing.core.PImage;


public class Sketch extends PApplet {
  // Global Variables

  // Goal Keeper Variables
  float goalieX;
  float xspeed = 4;
  float goalieS = 20;


  // Soccer Ball Variables
  float ballX= 200;
  float ballY= 200;

  // Soccer Ball Speed Variables
  float ballYspeed=0;

  // Game Score Variable
  int score=0;
  
  // Other In Game Variables
  

 // Screens
 int stage;

 // Image
 PImage img;



  
 


  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 500);
    }
  

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  public void setup() {
    img = loadImage("TROPHY.jpg");
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
    }//close 0
    
    if(stage == 1){ 
      game(); 
    }//close 1
    }


private void splash() {
  img.resize(width, height);

  //START
  fill(225, 255, 0);
  textSize(40); 
  text("FOOTBALL CLICKER", 400, 200);
  text("Press Arrow To Begin", 400, 400);


}


private void game() {
  background (35, 193, 34);
  strokeWeight(2);
  line(120, 50, 280, 50);
  line(120, 50, 120, 90);
  line(280, 50, 280, 90);
}
}

 


  
 





















                                                                                                  
    
  
    