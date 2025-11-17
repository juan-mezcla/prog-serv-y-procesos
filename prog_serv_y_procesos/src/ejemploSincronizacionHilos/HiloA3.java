package ejemploSincronizacionHilos;
/**
 *
 * @author Mabel
 */
class HiloA3 extends Thread {
    private Contador3 contador;
	
    public HiloA3(String n, Contador3 c) {
        setName(n);
        contador = c;
    }
	
    public void run() {
        for (int j = 0; j < 300; j++) {
            contador.incrementa();
            //try { sleep(100);} catch (InterruptedException e) {		}
	}
	System.out.println(getName() + " contador vale " + contador.getValor());
    }
}// FIN HILOA