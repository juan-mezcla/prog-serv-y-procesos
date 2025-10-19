package entrega_actividad_1_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * Clase principal del programa que ejecuta el proceso {@code Suma}.
 * 
 * <p>Esta clase crea un proceso hijo que ejecuta la clase {@link Suma},
 * le envía dos números a través del flujo de salida estándar y
 * recibe el resultado de la suma desde el flujo de entrada estándar.</p>
 * 
 * <p>Si no se proporcionan dos argumentos al ejecutar el programa,
 * se lanza una excepción y se muestra un mensaje de error.</p>
 * 
 * <p><b>Ejemplo de ejecución:</b></p>
 * <pre>
 * java entrega_actividad_1_3.Main 5 8
 * </pre>
 * 
 * <p>Salida esperada:</p>
 * <pre>
 * El total de la suma entre 5 y 8 es : 13
 * </pre>
 * 
 * @author Juan Mezcua
 * @version 1.0
 */
public class Main {
	/**
     * Método principal que inicia el proceso {@code Suma}, envía los parámetros,
     * y muestra la respuesta por consola.
     *
     * @param args los dos números a sumar. Deben pasarse como argumentos en la línea de comandos.
     */
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
