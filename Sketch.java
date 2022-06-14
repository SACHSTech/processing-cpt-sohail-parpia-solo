import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  // Global Variables

  // In Game Variables
  int r1X=0;
  int d1=10;
  int e1=200;
  int e2=200;

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
    size(800, 600);
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
  
   
private void game() {
  img = loadImage("SUNSET.jpeg");
  img.resize(width, height);


  //Main Player
  fill(132, 0, 255);
  ellipse(e1,e2,50,50);
 {
  //Falling Lava 
    fill(255, 0, 0);
    rect(420,r1X,40,40,40);
    fill(255, 0, 0);
    rect(265,r1X,40,40,40);
    fill(255, 0, 0);
    rect(580,r1X,40,40,40);
    r1X = r1X + d1;
    if(r1X<0||r1X>600)
   {
    d1=-d1;
   }
   {
 
   if(get(e1,e2)==color(114,23,175))
 {
   
   e1=100; 
 }
 //Blocks
   fill(225, 255, 0);
   rect(320,0,80,430);
   fill(225, 255, 0);
   rect(240,600,80,430);
   fill(225, 255, 0);
   rect(480,0,80,300);
   fill(225, 255, 0);
   rect(400,520,80,430);
   fill(225, 255, 0);
   rect(640,0,80,500);
   fill(225, 255, 0);
   rect(560,600,80,300);
   fill(225, 255, 0);
   rect(720,0,80,80);
 {
 if(get(e1,e2)==color(92,240,228))
 {
   
   e1=100; 
 }
 //Finish
 fill(random (0,255), random(0,30), random(0,240));
 rect(720,0,80,80);
 fill(220,250,0);

 e1=100; 
 }
 }
 }
}


private void splash() {
  //START
  fill(225, 255, 0);
  textSize(40); 
  text("Press r To Begin", 400, 500);
  textSize(40);
  text("WELCOME TO CITY LAVA FREEDOM", 400, 200);

  textAlign(CENTER);

}


public void keyPressed(){
  // To move Up
  if(keyCode==UP)
  {e2=e2-5;}

  // To move Down
   if(keyCode==DOWN)
  {e2=e2+5;} 

  // To move Right
  if(keyCode==RIGHT)
  {e1=e1+5;} 

  // To move Left
  if(keyCode==LEFT)
  {e1=e1-5;}

  // To begin game
  if (keyCode == 'r');
  stage=1;
}
}


  
 





















                                                                                                  
    
  
    