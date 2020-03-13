package model;

import processing.core.PApplet;

public class TrianguloModel extends Figuras {

	public TrianguloModel(int tammano, int posX, int posY, int direccion, PApplet app) {
		super(tammano, posX, posY, direccion, app);
		// TODO Auto-generated constructor stub
	}

	public void pintar() {

		app.fill(0, 0, 255);
		app.triangle(posX, posY,posX, posY, tamanno, tamanno);

	}

}
