package ejercicio_2_6_evaluacion2;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File arch=new File("ejercicio_2_6.txt");
		
		if(!arch.exists()) {
			try {
				arch.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Fichero ficherillo=new Fichero(arch);
		
		Productor hiloEscribir=new Productor(ficherillo);
		Consumidor hiloLector=new Consumidor(ficherillo);
		
		
		hiloEscribir.start();
		hiloLector.start();
		
	}

}
