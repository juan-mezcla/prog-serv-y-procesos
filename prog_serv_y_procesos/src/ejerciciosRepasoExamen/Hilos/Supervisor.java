/**
 * 
 */
package ejerciciosRepasoExamen.Hilos;

/**
 * 
 */
public class Supervisor extends Thread {
	private SensorHumedad humedad;
	private SensorTemperatura temperatura;
	private SensorViento viento;

	/**
	 * @param humedad
	 * @param temperatura
	 * @param viento
	 */
	public Supervisor(SensorHumedad humedad, SensorTemperatura temperatura, SensorViento viento) {
		super();
		this.humedad = humedad;
		this.temperatura = temperatura;
		this.viento = viento;
	}

	@Override
	public void run() {

		temperatura.setPriority(Thread.MAX_PRIORITY);
		humedad.setPriority(Thread.NORM_PRIORITY);
		viento.setPriority(Thread.MIN_PRIORITY);

		temperatura.start();
		humedad.start();
		viento.start();

		try {
			Thread.sleep(5000);

			System.out.println("\nEstado de Hilo TEMPERATURA: " + temperatura.getState());
			System.out.println("Estado de Hilo HUMEDAD: " + humedad.getState());
			System.out.println("Estado de Hilo VIENTO: " + viento.getState()+"\n");

			Thread.sleep(3000);
			
			viento.interrupt();
			System.out.println("Estado de hilo viento despues de interrumpirlo: "+viento.getState());
			
			
			temperatura.join();
			humedad.join();
			viento.join();
			
			System.out.println("\n Estación meteorológica ha sido apagada");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
