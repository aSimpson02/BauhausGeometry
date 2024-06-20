
PImage img;
PImage img2;

void setup() {
  size(640, 360);
 
  img = loadImage("MM2.png");
  img2 = loadImage("MM1.png");
}

void draw() {
  color circle = color(#6D7D5D);
  color rectangles = color(#CCD9B8);
  color line = color(#733E1F);
  color circle2 = color(#8C3211);
  color main = color(#585928);
//defining the colours used in this sketch as variables.
//have the same colour as the inspired artwork

  background(main);
 
  stroke(0);
  strokeWeight(1); 
  fill(circle);
  ellipse(160, 250, 100, 100);
  //adding in a smaller circle to the sketch
  
  pushMatrix();
  //by using pushMatrix, we are saving teh current position of the sketch...
  //...before transforming certain parts of it. 
  
  
  translate(width/2, height/2);
  rotate(radians(45));
  // transforming the sketch by roatating and translating the following shapes in...
  //...the pushMatrix function
  
  
  fill(line);
  stroke(0);
  strokeWeight(2);
  rect(-10, -300, 20, 700);
  
  fill(rectangles);
  rect(0, -300, 5, 700);
  rect(-20, -300, 5, 700);
  //hadd in the three rectangles going across tha sketch
  
 
  scale(2);
  fill(circle2);
  strokeWeight(1);
  stroke(0);
  ellipse(0, 0, 100, 100);
  //adding the main red circle behind my image.
  
  popMatrix();
  //using pop matrix we are moving the sketch to its origional format/position.
  
  noStroke();
  pushMatrix();
  fill(200, 200, 200);
  //creating a new pushMatrix function for a different set of shapes.

  scale(0.5);
  translate(320, 200);
  // adjusting the scale of the sketch and a translation.
  
  scale(2);
  translate(-80, -60);
  //decided to adjusted the translation and scale again.
 //pushing the following shapes out to the left side of sketch.
  
  //drawing polylines to create a series of trapeziums across the sketch.
  beginShape();
  vertex(-100, -30);
  vertex(10, -30);
  vertex(30, -10);
  vertex(-140, -10);
  endShape(CLOSE);
  

  beginShape();
  vertex(-140, 0);
  vertex(50, 0);
  vertex(70, 20);
  vertex(-100, 20);
  endShape(CLOSE);
  
  popMatrix();
  //closing down the function using popMatrix
  
  image(img, 140, -50);
  //adding part of my image to look like a reflection.
  
  stroke(255);
  strokeWeight(20);
  noFill();
  ellipse(320, 180, 250, 250);
  //adding a circle border above my image to make it look like she's in a mirror.
  
  image(img2, 100, 0);
  //adding my image ontop of the sketch.
  
}