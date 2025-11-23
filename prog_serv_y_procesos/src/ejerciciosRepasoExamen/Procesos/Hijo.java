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
public class Hijo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Process buscarTXTs=new ProcessBuilder("cmd.exe", "/c", "dir | findstr .txt").start();
			
			BufferedReader leer=new BufferedReader(new InputStreamReader(buscarTXTs.getInputStream()));
			System.out.println("HOLAAA");
			String linea;
			while ((linea=leer.readLine())!=null) {
				System.out.println(linea+"\n");
				
			}
			
			leer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
