/**
 * 
 */
package ejerciciosRepasoExamen.Hilos;

/**
 * 
 */
public class SensorTemperatura extends Thread {
	private boolean stop = false;

	/**
	 * 
	 */
	public SensorTemperatura() {
		// TODO Auto-generated constructor stub

	}

	public void parar() {
		this.stop = true;
	}

	public void reanudar() {
		this.stop = false;
	}

	@Override
	public void run() {
		int contLecturasMayorQue30 = 0;
		int contFin = 0;

		while (contFin < 10) {

			int tiempoEntreLectura = (int) Math.round((400 + Math.random() * (600 - 400)));
			int temperatura = (int) Math.round((10 + Math.random() * (35 - 10)));

			if (temperatura > 30) {
				contLecturasMayorQue30++;
			}

			if (contLecturasMayorQue30 == 3) {
				this.parar();
			}

			try {
				while (stop) {
					System.out.println("\nSensor Temperatura parado...\n");
					Thread.sleep(5000);
					this.reanudar();
					System.out.println("\nSensor Temperatura VUELVE a funcionar...\n");
				}

				System.out.println("Lectura de temperatura recibida: " + temperatura + " ºC");

				Thread.sleep(tiempoEntreLectura);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			contFin++;
		}

	}

}
