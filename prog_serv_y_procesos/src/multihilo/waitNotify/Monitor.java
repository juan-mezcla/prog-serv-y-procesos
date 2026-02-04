/**
 * 
 */
package multihilo.waitNotify;

/**
 * 
 */
public class Monitor {
	private int temp,wet;
	private boolean humedad = false, temperatura = false;

	/**
	 * 
	 */
	public Monitor() {
		super();
	}

	/**
	 * @param humedad the humedad to set
	 */
	public synchronized void setHumedad(int medicion) {
		while (humedad) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		this.wet=medicion;
		this.humedad = true;
		
		System.out.println("Humedad: "+medicion+" C");
		
		notifyAll();
	}

	/**
	 * @param temperatura the temperatura to set
	 */
	public synchronized void setTemperatura(int temp) {

		while (temperatura) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		this.temp=temp;
		this.temperatura = true;
		
		System.out.println("temperatura: "+temp+" C");
		
		notifyAll();
	}
	
	
	public synchronized void comprobarDatos() {
		while(!temperatura || !humedad) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		if(temp>25 && wet>40) {
			System.out.println("HACE CALOR");
		}else {
			System.out.println("HACE FRIO");
		}
		
		
		this.temperatura = false; // Liberamos el hueco para el sensor de temp
	    this.humedad = false;
		notifyAll();
	}

}
