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
  int score =0;
  
  // Other In Game Variables
  int miss;
  

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
  background (255, 0, 0);
  strokeWeight(4);

  // Net
  line(120, 50, 280, 50);
  line(120, 50, 120, 90);
  line(280, 50, 280, 90);
  stroke(255, 255, 255);
  strokeWeight(8);
  line(0, 90, 400, 90);
  line(65, 90, 65, 140);
  line(65, 140, 333, 140);
  line(333, 140, 333, 90);
  line(0, 255, 600, 255);
  fill(255, 255, 255);

  fill(0);
  textAlign(CENTER);
  textSize(10);

  // Text
  textSize(20);
  text("Score: "+score, 50, 435);

  // Goal Keeper
  stroke(0, 21, 255);
  strokeWeight(6);


  line(goalieX, 90, goalieX+goalieS, 90);
  if (goalieX >= 280-goalieS)
  {
    xspeed *= -1;
    goalieX= 280-goalieS;
  }
  if (goalieX <= 120)
  {
    xspeed *= -1;
  }
  goalieX=goalieX+xspeed;
}
}

 


  
 





















                                                                                                  
    
  
    