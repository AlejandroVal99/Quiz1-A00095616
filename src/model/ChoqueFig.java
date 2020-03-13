package model;

import processing.core.PApplet;

public class ChoqueFig {
	private PApplet app;
	private String[] txt;
	//private String[] datosFig;
	private Figuras[] figuras;
	
	public ChoqueFig(PApplet app) {
		this.app = app;
		txt = app.loadStrings("../data/figuras.txt");
		
		System.out.println(txt.length);
		
		figuras = new Figuras[txt.length];
		crearFiguras();
		
	}
	
	public void crearFiguras() {
	for(int i = 0; i < txt.length ; i++) {
			
			String [] datosFig = txt[i].split(" ");
			
			int tam = Integer.parseInt(datosFig[1]);
			int pY = Integer.parseInt(datosFig[2]);
			int pX = Integer.parseInt(datosFig[3]);
			int direc = Integer.parseInt(datosFig[4]);
			
			//System.out.println(datosFig[1]);
			if(datosFig[0].equals("Circulo")) {
				
				
				figuras[i] = new CirculoModel(tam,pY,pX,direc,app);
				System.out.println(figuras[i].getTamanno());
				
			}else if(datosFig[0].equals("Cuadrado")) {
				
				figuras[i] = new CuadradoModel(tam,pY,pX,direc,app);
				
			}else if(datosFig[0].equals("Triangulo")) {
				
				figuras[i]= new TrianguloModel(tam,pY,pX,direc,app);
			}
			
		}
	}
	
	public void pintar() {
		
		for (int i = 0; i < txt.length; i++) {
			figuras[i].pintar();
			figuras[i].mover();
		}
	}
	
	public void detener() {
		
		for(int i = 0; i < txt.length; i++) {
			
			if(app.dist(app.mouseX,app.mouseY,figuras[i].getPosX(),figuras[i].getPosY())<40) {
				
				figuras[i].setDetenido(true);
				
			}
			
		}
	}
	
	public void reboteFig() {
		
		for(int i = 0; i<txt.length; i++) {
			for(int j = 0; j < txt.length; j++){
				
				if(figuras[i] != figuras[j]) {
					if(app.dist(figuras[i].getPosX(),figuras[i].getPosY(),figuras[j].getPosX(),figuras[j].getPosY())<15) {
						System.out.println("entre");
						figuras[i].setDireccion(-1);
						figuras[j].setDireccion(-1);
					}
				}
				
			}
		}
	}
}
