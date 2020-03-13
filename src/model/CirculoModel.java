package model;

import processing.core.PApplet;

public class CirculoModel extends Figuras {

	public CirculoModel(int tammano, int posX, int posY, int direccion, PApplet app) {
		super(tammano, posX, posY, direccion, app);
		// TODO Auto-generated constructor stub
	}

	public void pintar() {

		app.fill(0, 255, 0);
		app.ellipse(posX, posY, tamanno, tamanno);

	}

}
