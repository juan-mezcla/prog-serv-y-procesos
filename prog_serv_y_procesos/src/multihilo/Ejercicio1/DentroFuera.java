/**
 * 
 */
package multihilo.Ejercicio1;

/**
 * 
 */
public class DentroFuera {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HiloFor().start();
		for (int i = 0; i < 10; i++) {
			System.out.println("estoy fuera");
		}
	}

}
