/**
 * 
 */
package ejerciciosRepasoExamen.Hilos.Ejercicio2;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HiloLento h1 = new HiloLento();
		HiloRapido h2 = new HiloRapido(h1);
		h2.setPriority(Thread.MIN_PRIORITY);
		h1.setPriority(Thread.MAX_PRIORITY);

		

        System.out.println("Estado inicial h1: " + h1.getState());
        System.out.println("Estado inicial h2: " + h2.getState());
		
		h2.start();

		h1.start();

		try {
			h1.join();
			h2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
