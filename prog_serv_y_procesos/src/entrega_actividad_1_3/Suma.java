package entrega_actividad_1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Clase {@code Suma} que recibe dos números enteros desde la entrada estándar,
 * los suma y muestra el resultado por pantalla.
 * 
 * <p>Esta clase está diseñada para ser ejecutada por otro proceso (por ejemplo, {@link Main}),
 * que le envía los datos mediante un flujo de salida.</p>
 * 
 * <p><b>Ejemplo de ejecución directa:</b></p>
 * <pre>
 * java entrega_actividad_1_3.Suma
 * </pre>
 * (Después introducir dos números separados por línea)
 * 
 * <p>Salida esperada:</p>
 * <pre>
 * El total de la suma entre 3 y 4 es : 7
 * </pre>
 * 
 * @author Juan Mezcua
 * @version 1.0
 */
public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// leemos los datos que nos han pasado.
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			int n1 = 0;
			int n2 = 0;
			// System.out.println("Valores de n1 y n2:"+n1+", "+n2);
			n1 = Integer.parseInt(leer.readLine().trim());

			n2 = Integer.parseInt(leer.readLine().trim());

			// System.out.println("Valores de n1 y n2:"+n1+", "+n2);
			int total = n1 + n2;

			System.out.println("El total de la suma entre " + n1 + " y " + n2 + " es : " + total);

			System.exit(0);// programa acabado con exito.
		} catch (java.lang.NumberFormatException e) {
			System.out.println("No es un numero lo que has introducido.");
			System.exit(1);// error.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);// error.
		}

	}

}
