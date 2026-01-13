package ejercicio_2_6_evaluacion2;

public class Consumidor extends Thread{
	private Fichero arch;
	public Consumidor() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		arch.leer();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
	}

}
