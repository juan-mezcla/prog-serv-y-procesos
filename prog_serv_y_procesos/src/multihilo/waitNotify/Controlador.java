package multihilo.waitNotify;

public class Controlador extends Thread{
	Monitor moni;

	/**
	 * @param moni
	 */
	public Controlador(Monitor moni) {
		super();
		this.moni = moni;
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			moni.comprobarDatos();
			
		}
		
		
	}
	
}
