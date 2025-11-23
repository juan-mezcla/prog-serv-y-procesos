/**
 * 
 */
package ejerciciosRepasoExamen.Hilos.Ejercicio1;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Corredor corredor1 = new Corredor("Pepe");
		Corredor corredor2 = new Corredor("Ana");
		Corredor corredor3 = new Corredor("Ernesto");
		
		// Prioridades
        corredor1.setPriority(Thread.MAX_PRIORITY);
        corredor2.setPriority(Thread.NORM_PRIORITY);
        corredor3.setPriority(Thread.MIN_PRIORITY);
        
        System.out.println("\nEstados antes de empezar:");
        System.out.println(corredor1.getName() + ": " + corredor1.getState());
        System.out.println(corredor2.getName() + ": " + corredor2.getState());
        System.out.println(corredor3.getName() + ": " + corredor3.getState());


		corredor1.start();

		corredor2.start();

		corredor3.start();

		try {
			corredor1.join();
			corredor2.join();
			corredor3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
