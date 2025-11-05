/**
 * 
 */
package multihilo.Ejercicio6;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread h=new HiloPar();
		Thread h1 =new Thread(new HiloImpar());
		h.start();
		try {
		
			h.join(); 
			h1.start();
			h1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
