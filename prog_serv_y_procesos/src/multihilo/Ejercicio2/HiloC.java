/**
 * 
 */
package multihilo.Ejercicio2;

/**
 * 
 */
public class HiloC extends Thread {
	private int c=0;
	
	
	
	/**
	 * @param c
	 */
	public HiloC(int c) {
		this.c = c;
		System.out.println("Creando hilo "+this.getC());
	}



	public int getC() {
		return c;
	}



	public void setC(int c) {
		this.c = c;
	}



	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Hilo "+this.getC()+" linea "+i);
		}
	}
}
