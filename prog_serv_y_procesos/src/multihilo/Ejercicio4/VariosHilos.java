/**
 * 
 */
package multihilo.Ejercicio4;

/**
 * 
 */
public class VariosHilos implements Runnable{
	
	public void run() {
		// TODO Auto-generated method stub
				for(int i=0; i<5; i++) {
					try {
						Thread h=new Thread(new HiloC(i));
						
						h.start();
						h.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
				System.out.println("todos los hilos creados");
	}

}
