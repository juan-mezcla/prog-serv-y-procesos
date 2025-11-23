/**
 * 
 */
package ejerciciosRepasoExamen.Hilos.Ejercicio2;

/**
 * 
 */
public class HiloRapido extends Thread{
	private HiloLento lento;
	/**
	 * 
	 */
	public HiloRapido(HiloLento lento) {
		this.lento=lento;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			try {
				if(i==4) {
					
					this.lento.join();
					 System.out.println("El lento ha terminado, continuo...");
				}
				
				System.out.println("Hilo rapido: "+i);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
