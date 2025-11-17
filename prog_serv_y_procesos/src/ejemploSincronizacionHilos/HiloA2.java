package ejemploSincronizacionHilos;
/**
 *
 * @author Mabel
 */
class HiloA2 extends Thread {
	private Contador2 contador;

	public HiloA2(String n, Contador2 c) {
		setName(n);
		contador = c;
	}

	public void run() {
		synchronized (contador) {//entre () la referencia al objeto compartido Contador
			for (int j = 0; j < 300; j++) {
				contador.incrementa();
				/*try {
					sleep(100);
				} catch (InterruptedException e) {		}
				*/
			}
			System.out.println(getName() + " contador vale "
					+ contador.getValor());
		}

	}
}// HILOA