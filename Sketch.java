import processing.core.PApplet;

public class Sketch extends PApplet {
  // Global Variables
  int Height = 300;
  int Width = 300;
  int initScreen;
  int gameScreen = 0;
  int gameOverScreen;
  

	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    if (gameScreen == 0);
  }

  public void initScreen() {
  }

  public void gameScreen() {
  }

  public void gameOverScreen() {
  }

  public void startGame() {
    gameScreen=1;
  }

  public void mousePressed() {
  }
}  

  