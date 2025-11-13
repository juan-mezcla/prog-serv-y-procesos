package multihilo.Ejercicio9;

import java.io.BufferedReader;
import java.io.IOException;

public class HiloSuma extends Thread {
	private int cont,inicio,fin;
	private static int suma=0;
	private BufferedReader leer;
	
	/**
	 * @param cont
	 */
	public HiloSuma(int cont,BufferedReader leer) {
		super();
		this.cont=cont;
		this.inicio=cont*100;
		this.fin=(cont*100)+99;
		this.leer=leer;
	}


	@Override
	public void run() {
		
		for(int posicion=this.getInicio(); posicion<this.getFin(); posicion++) {
			try {
				String linea;
				if((linea=this.leer.readLine())!=null) {
					
					this.setSuma(this.getSuma()+Integer.parseInt(linea));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("hilo "+ this.getCont()+" : "+this.getSuma());
	}

	

	public static int getSuma() {
		return suma;
	}


	public static void setSuma(int suma) {
		HiloSuma.suma = suma;
	}


	public int getCont() {
		return cont;
	}


	public void setCont(int cont) {
		this.cont = cont;
	}



	public int getInicio() {
		return inicio;
	}


	public void setInicio(int inicio) {
		this.inicio = inicio;
	}


	public int getFin() {
		return fin;
	}


	public void setFin(int fin) {
		this.fin = fin;
	}


	public BufferedReader getLeer() {
		return leer;
	}


	public void setLeer(BufferedReader leer) {
		this.leer = leer;
	}
	
	
}
