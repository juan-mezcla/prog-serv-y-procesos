/**
 * 
 */
package multihilo.Ejercicio3;

/**
 * 
 */
public class HiloTac extends Thread{
	/**
	 * 
	 */
	public HiloTac() {
		
	}
	@Override
	public void run() {
		while(true) {
			
			System.out.println("Tac");
			try {
				this.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
