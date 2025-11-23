/**
 * 
 */
package ejerciciosRepasoExamen.Hilos;

/**
 * 
 */
public class SensorHumedad extends Thread {

	/**
	 * 
	 */
	public SensorHumedad() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {

		int contFin = 0;

		while (contFin < 10) {

			int tiempoEntreLectura = (int) Math.round((300 + Math.random() * (500 - 300)));
			int humedad = (int) Math.round((30 + Math.random() * (80 - 30)));

			System.out.println("Lectura de humedad recibida: " + humedad + "%");

			try {
				Thread.sleep(tiempoEntreLectura);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			contFin++;
		}

	}

}
