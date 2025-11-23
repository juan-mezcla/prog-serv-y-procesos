package ejerciciosRepasoExamen.Hilos;

public class SensorViento extends Thread {
	private boolean stop = false;

	public SensorViento() {
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
		int contFin = 0;

		while (contFin < 10) {

			try {

				int tiempoEntreLectura = (int) Math.round((300 + Math.random() * (500 - 300)));
				int kmViento = (int) Math.round((5 + Math.random() * (25 - 5)));

				System.out.println("Lectura de viento recibida: " + kmViento + "Km/h \n");

				if (kmViento > 22) {
					System.out.println("\n VIENTO FUERTE CUIDADO!! \n");

					Thread.sleep(2000);

				}

				Thread.sleep(tiempoEntreLectura);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			contFin++;
		}

	}

}
