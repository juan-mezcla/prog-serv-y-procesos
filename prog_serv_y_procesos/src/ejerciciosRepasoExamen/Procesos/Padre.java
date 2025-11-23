/**
 * 
 */
package ejerciciosRepasoExamen.Procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */
public class Padre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Process hijo=new ProcessBuilder("java","ejerciciosRepasoExamen.Procesos.Hijo").start();
		
			BufferedReader leerHijo=new BufferedReader(new InputStreamReader(hijo.getInputStream()));
			
			String linea;
			System.out.println("Ficheros que acaban en .txt:");
			while((linea=leerHijo.readLine())!=null) {
				System.out.println(linea+"\n");
			}
			
			leerHijo.close();
			
			BufferedReader leerHijoError=new BufferedReader(new InputStreamReader(hijo.getErrorStream()));
			
			String lineaError;
			
			while((lineaError=leerHijoError.readLine())!=null) {
				System.out.println(lineaError+"\n");
			}
			
			leerHijoError.close();
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
