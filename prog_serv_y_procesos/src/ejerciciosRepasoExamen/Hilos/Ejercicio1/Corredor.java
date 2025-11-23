/**
 * 
 */
package ejerciciosRepasoExamen.Hilos.Ejercicio1;

/**
 * 
 */
public class Corredor extends Thread {
	private int cont = 1;
	private boolean corre = true;

	/**
	 * 
	 */
	public Corredor(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public void pararCorredor() throws InterruptedException {
		System.out.println(this.getName() + " ha parado un momento... \n");
		System.out.println("Estado del hilo: "+this.getState());
		Thread.sleep(1000);
	}

	@Override
	public void run() {
		while (cont <= 6) {

			try {
				int metrosRecorridos = 10 * cont;
				if (cont == 3 && this.getName().equalsIgnoreCase("ana")) {
					this.pararCorredor();
					
				} 
					System.out.println("Corredor " + this.getName() + " avanzo " + metrosRecorridos + " metros \n");
					cont++;
					//System.out.println("Estado del hilo: "+this.getState());
					Thread.sleep(500);
					
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Corredor " + this.getName() + " ha terminado la carrera\n");

	}

}
