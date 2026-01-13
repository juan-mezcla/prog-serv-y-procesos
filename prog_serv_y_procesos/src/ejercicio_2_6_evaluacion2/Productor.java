package ejercicio_2_6_evaluacion2;

public class Productor extends Thread{
	private Fichero arch;
	public Productor() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		arch.escribir();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
	}

}
