package view;

import processing.core.PApplet;

public class MainView extends PApplet {

	public static void main(String[] args) {
		PApplet.main("view.MainView");
		// TODO Auto-generated method stub
	}
	
	private Screen screen;
	
	public void settings() {
		
		size(500,500);
		
	}
	
	public void setup() {
		screen = new Screen (this);
		
	}
	
	
	public void draw() {
		
		screen.drawScreen();
		
	}
	
	public void mousePressed() {
		screen.deterFig();
	}
	
}
