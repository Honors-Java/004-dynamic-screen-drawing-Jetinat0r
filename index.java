void setup() {
	size(300, 300);
  background(10, 230, 230);
  ellipseMode(CENTER);

  drawGrass();
  drawTree();
  drawSun(220, 70);
}

void draw(){
  //Rip the draw function
  //But my way saves processing power
  //Huzzah
}

//Press the mouse button to move the sun and reset trees
//Press any key to plant a new tree!

//dont forget to add mouse and keypressed interaction functions
void mousePressed(){
  background(10, 230, 230);
  drawSun(mouseX, mouseY);
  drawGrass();
}

void keyPressed(){
  drawTree();
}

void drawTree(){
  double _xR = Math.random();
  double _yR = Math.random();

  double _x = (_xR * 300);
  double _y = (_yR * 100) + 200;

  //Draws trunk of tree
  setStrokeFill(120, 75, 50);
  rect(_x, _y - 50, 25, 100);

  //Draws leaves
  setStrokeFill(66, 143, 21);
  ellipse(_x, _y - 100, 75, 25);
}

void drawSun(int _baseX, int _baseY){
  setStrokeFill(255, 255, 0);
  ellipse(_baseX, _baseY, 40, 40);
}

void drawGrass(){
  setStrokeFill(10, 240, 10);
  rectMode(CENTER);

  rect(150, 250, 300, 100);
}

void setStrokeFill(int _r, int _g, int _b){
  stroke(_r, _g, _b);
  fill(_r, _g, _b);
}