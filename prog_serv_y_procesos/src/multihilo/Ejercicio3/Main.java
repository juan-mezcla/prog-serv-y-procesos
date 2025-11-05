/**
 * 
 */
package multihilo.Ejercicio3;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HiloTic h1=new HiloTic();
		HiloTac h2=new HiloTac();
		h1.start();
		try {
			new Thread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		h2.start();
	}

}
