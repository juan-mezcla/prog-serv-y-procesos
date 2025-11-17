package ejemploSincronizacionHilos;
/**
 *
 * @author Mabel
 */
class Contador3 {
	private int c = 0;

	Contador3(int c) {
		this.c = c;
	}

	public synchronized void incrementa() {
		c = c + 1;
	}

	public synchronized void decrementa() {
		c = c - 1;
	}

	public synchronized int getValor() {
		return c;
	}

}// CONTADOR

