import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400); // Original - 400,400
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255); // White
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
     // Q1 - Line grid
    for (int oneLinex = 0; oneLinex <= width/2; oneLinex += width/20) // Start at 0, Limit at 200, count in 20 intervals in the x axis
    {
      fill(0, 0, 0); // Black
      line(oneLinex, 0, oneLinex, width/2); // Lines for the x axis
    }

    for (int oneLiney = 0; oneLiney <= height/2; oneLiney += height/20) // Start at 0, Limit at 200, count up in 20 intervals in the y axis
    {
      fill(0, 0, 0); // Black
      line(0, oneLiney, height/2, oneLiney); // Lines for the y axis
    }

    
    
     // Q2 - Circles grid
    for (int twoCircx = (width/2)+(width/5)-(width/8)+(width/80); twoCircx <= width-(width/16); twoCircx += (width/5)-(width/8)+(width/80)) 
    {
      for (int twoCircy = (height/5)-(height/8)+(height/80); twoCircy <= (height/2)-(height/16); twoCircy += (height/5)-(height/8)+(height/80))
        {
          fill(255, 0, 0); // Red
          ellipse(twoCircx, twoCircy, width/20, height/20); // Circles
        }
    }


    
     // Q3 - Gradient
    for (int threeGradx = width/2; threeGradx >= 0; threeGradx --) // Start at 200, Limit at 0, count down
    {
      stroke(threeGradx); // From white to black
      line(threeGradx, height/2, threeGradx, height); // Lines for the y axis
    }


     // Q4 - Flower
     // Pedals
    for(int fourPed = 0; fourPed < width-(width/10); fourPed += (width/10)+(width/80)) 
    {
      fill(255, 140, 0); // Orange
      pushMatrix();
      translate((width/2)+width/4, (height/2)+ height/4); // Translates the object
      rotate(radians(fourPed));
      ellipse(0, 0, height/20, height/3);
      popMatrix();
    }

     // Center of flower
    fill(255,255,0); // Yellow
    ellipse((width/2 + width/4), (height/2 + height/4), width/10, height/10); // Circles

     // Dividing lines
    //line(200, 0, 200, 400);
    //line(0, 200, 400, 200);
  }
  
}