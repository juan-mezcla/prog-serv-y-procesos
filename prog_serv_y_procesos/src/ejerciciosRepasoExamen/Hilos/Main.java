/**
 * 
 */
package ejerciciosRepasoExamen.Hilos;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SensorHumedad h1=new SensorHumedad();
		SensorTemperatura h2=new SensorTemperatura();
		SensorViento h3=new SensorViento();
		
		
		Supervisor hPadre=new Supervisor(h1, h2, h3);
		
		hPadre.start();
		
		
	}

}
