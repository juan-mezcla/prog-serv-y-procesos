/**
 * 
 */
package multihilo.waitNotify;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor moni=new Monitor();
		
		Sensor hum=new Sensor("hum",moni);
		Sensor tem=new Sensor("temp",moni);
		
		Controlador controlar=new Controlador(moni);
		
		
		hum.start();
		tem.start();
		
		controlar.start();

	}

}
