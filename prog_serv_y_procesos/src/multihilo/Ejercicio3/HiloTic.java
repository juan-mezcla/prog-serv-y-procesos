/**
 * 
 */
package multihilo.Ejercicio3;

/**
 * 
 */
public class HiloTic extends Thread{

	/**
	 * 
	 */
	public HiloTic() {
		
	}
	@Override
	public void run() {
		while(true) {
			System.out.println("Tic");
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
