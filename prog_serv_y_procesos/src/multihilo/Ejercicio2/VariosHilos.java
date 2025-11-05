/**
 * 
 */
package multihilo.Ejercicio2;

/**
 * 
 */
public class VariosHilos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			new HiloC(i).start();
			
		}
		
		System.out.println("todos los hilos creados");
	}

}
