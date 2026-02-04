/**
 * 
 */
package multihilo.waitNotify;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 */
public class Sensor extends Thread {
	private String tipo;
	private int medicion;
	private  Monitor moni;
	
	

	/**
	 * @param tipo
	 * @param moni
	 */
	public Sensor(String tipo, Monitor moni) {
		super();
		this.tipo = tipo;
		this.moni = moni;
	}



	@Override
	public void run() {
		try {
			while (true) {
				medicion=ThreadLocalRandom.current().nextInt(0, 50);
				if(tipo.equalsIgnoreCase("temp")) {
					moni.setTemperatura(medicion);
				}else {
					moni.setHumedad(medicion);
				}
			
				
				Thread.sleep(2000);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notifyAll();
	}

}
