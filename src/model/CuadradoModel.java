package model;

import processing.core.PApplet;

public class CuadradoModel extends Figuras {

	public CuadradoModel(int tammano, int posX, int posY, int direccion, PApplet app) {
		super(tammano, posX, posY, direccion, app);
		// TODO Auto-generated constructor stub
	}

	public void pintar() {
		
		app.fill(255,0,0);
		app.rect(posX, posY, tamanno, tamanno);

	}
}
