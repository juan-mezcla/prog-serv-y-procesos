/**
 * 
 */
package multihilo.Ejercicio6;

/**
 * 
 */
public class HiloPar extends Thread{
	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			if(i%2==0) {
				System.out.println(i);
				try {
					this.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
