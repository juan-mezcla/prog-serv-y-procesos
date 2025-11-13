package multihilo.Ejercicio9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader archNumeros=new FileReader("numeros.dat");
			
			try(BufferedReader leer=new BufferedReader(archNumeros)){
				
				for(int i=0; i<10; i++) {
					Thread hilo=new HiloSuma(i,leer);
					hilo.start();
					
					hilo.join();
				}
				
				leer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
