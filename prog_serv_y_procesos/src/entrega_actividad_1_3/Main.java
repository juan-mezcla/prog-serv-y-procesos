package entrega_actividad_1_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			Process suma = new ProcessBuilder("java", "entrega_actividad_1_3.Suma").start();
			// Creamos la variable escribir para mandar los datos al hijo.
			BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(suma.getOutputStream()));

			// Comprobamos que haya metido en terminal al hacer el comando java dos
			// parametros.
			if (args.length >= 2) {

				escribir.write(args[0] + "\n");
				escribir.write(args[1]);

				escribir.flush();
				escribir.close();
			} else {// Throw en caso de no añadir los datos.
				throw new java.lang.ArrayIndexOutOfBoundsException();
			}

			// Leemos los datos que ha procesado suma.
			BufferedReader leer = new BufferedReader(new InputStreamReader(suma.getInputStream()));

			String linea;

			while ((linea = leer.readLine()) != null) {
				System.out.println(linea);
			}
			leer.close();

			// Leemos los datos en caso de error de suma.
			BufferedReader leerError = new BufferedReader(new InputStreamReader(suma.getErrorStream()));

			String lineaError;

			while ((lineaError = leerError.readLine()) != null) {
				System.out.println(lineaError);
			}
			leerError.close();
			suma.waitFor();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Tienes que poner 2 numeros para que funcione el programa.");
		}

	}

}
