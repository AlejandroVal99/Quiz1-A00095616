package controller;

import model.ChoqueFig;
import processing.core.PApplet;

public class MainController {
	private PApplet app;
	private ChoqueFig choqueFig;
	
	public MainController(PApplet app) {
		
		this.app = app; 
		choqueFig = new ChoqueFig(app);
		
	}

	public void pintarFig() {
		// TODO Auto-generated method stub
		choqueFig.pintar();
	}
	public void detener() {
		choqueFig.detener();
		
	}
	public void reboteFig() {
		choqueFig.reboteFig();
	}

}
