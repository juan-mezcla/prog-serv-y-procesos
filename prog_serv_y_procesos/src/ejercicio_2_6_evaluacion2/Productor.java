package ejercicio_2_6_evaluacion2;

public class Productor extends Thread{
	private Fichero arch;
	
	
	/**
	 * @param arch
	 */
	public Productor(Fichero arch) {
		super();
		this.arch = arch;
	}

	public Productor() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		arch.escribir();
		System.out.println("\nEscribiendo en "+arch.getArch().getName() +"...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
