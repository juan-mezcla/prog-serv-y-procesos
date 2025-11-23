/**
 * 
 */
package ejerciciosRepasoExamen.Hilos.Ejercicio2;

/**
 * 
 */
public class HiloLento extends Thread {

	/**
	 * 
	 */
	public HiloLento() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Hilo Lento: " + i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
