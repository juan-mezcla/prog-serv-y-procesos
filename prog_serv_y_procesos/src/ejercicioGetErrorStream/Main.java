package ejercicioGetErrorStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Process pro = null;
		try {
			pro = new ProcessBuilder("java", "ejercicioGetErrorStream.Ejemplo","4t").start();
			BufferedReader leer = new BufferedReader(new InputStreamReader(pro.getInputStream()));

			String ln;
			while ((ln = leer.readLine()) != null) {
				System.out.println(ln);

			}
			leer.close();

			BufferedReader leerError = new BufferedReader(new InputStreamReader(pro.getErrorStream()));
			String linea;

			while ((linea = leerError.readLine()) != null) {
				System.out.println(linea);

			}
			System.out.println("hola");
			leerError.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
