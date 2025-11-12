package multihilo.Ejercicio9;

import java.io.BufferedReader;
import java.io.IOException;

public class HiloSuma extends Thread {
	private int cont;
	private int vuelta=0;
	private BufferedReader leer;
	/**
	 * @param cont
	 */
	public HiloSuma(int cont,BufferedReader leer) {
		super();
		this.cont = cont;
		this.vuelta=cont*100;
		this.leer=leer;
	}


	@Override
	public void run() {
		int suma=0;
		for(int posicion=this.getCont(); posicion<this.getVuelta(); posicion++) {
			try {
				if(this.leer.readLine()!=null) {
					
					suma+=Integer.parseInt(this.leer.readLine());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("hilo"+ this.getCont()+":"+suma);
	}


	public int getCont() {
		return cont;
	}


	public void setCont(int cont) {
		this.cont = cont;
	}


	public int getVuelta() {
		return vuelta;
	}


	public void setVuelta(int vuelta) {
		this.vuelta = vuelta;
	}


	public BufferedReader getLeer() {
		return leer;
	}


	public void setLeer(BufferedReader leer) {
		this.leer = leer;
	}
	
	
}
