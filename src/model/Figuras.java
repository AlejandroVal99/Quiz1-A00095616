package model;

import processing.core.PApplet;

public abstract class Figuras {

	protected int tamanno;
	protected int posX;
	protected int posY;
	protected int direccion;
	protected PApplet app;
	protected boolean detenido;

	public Figuras(int tammano, int posX, int posY, int direccion, PApplet app) {
		this.tamanno = tammano;
		this.posX = posX;
		detenido = false;
		this.posY = posY;
		this.direccion = direccion;
		this.app = app;

	}

	public void pintar() {

	}

	public void mover() {

		if (detenido != true) {

			posX += direccion;
			posY += direccion;

			if (posX <= 0 || posX >= app.width) {
				direccion *= -1;
			}
			if (posY <= 0 || posY >= app.height) {
				direccion *= -1;
			}
		}
	}

	public int getTamanno() {
		return tamanno;
	}

	public void setTamanno(int tamanno) {
		this.tamanno = tamanno;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getDireccion() {
		return direccion;
	}

	public void setDireccion(int direccion) {
		this.direccion *= direccion;
	}

	public boolean isDetenido() {
		return detenido;
	}

	public void setDetenido(boolean detenido) {
		this.detenido = detenido;
	}

}
