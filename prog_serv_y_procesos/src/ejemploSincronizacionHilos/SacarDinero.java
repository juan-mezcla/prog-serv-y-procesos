package ejemploSincronizacionHilos;
/**
 *
 * @author Mabel
 */
class SacarDinero extends Thread {
	private Cuenta c;	
	//constructor recibe una cadena para dar nombre al hilo y cuenta compartida por varias personas.
        public SacarDinero(String n, Cuenta c) {		
		super(n);
		this.c = c;
	}
	
        public  void run() {		
		for (int x = 1; x<= 4; x++) {		
			c.RetirarDinero(10, getName());	//se saca siempre la cantidad de 10
		}		
	}// run	
}