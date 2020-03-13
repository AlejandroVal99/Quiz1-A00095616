package view;

import controller.MainController;
import processing.core.PApplet;

public class Screen {
	
	private PApplet app;
	private MainController mainController;

	public Screen (PApplet app) {
	
		this.app =app;
		mainController = new MainController(app);
		
	}

	public void drawScreen() {
		app.background(0);
		mainController.pintarFig();
		choqFig();
	}
	public void deterFig() {
		mainController.detener();
	}
	public void choqFig() {
		mainController.reboteFig();
	}

}
