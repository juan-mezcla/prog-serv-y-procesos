package ejemploSincronizacionHilos;
/**
 *
 * @author Mabel
 */
public class CompartirInf3 {
	public static void main(String[] args) {
		Contador3 cont = new Contador3(100);
		HiloA3 a = new HiloA3("HiloA", cont);
		HiloB3 b = new HiloB3("HiloB", cont);
		a.start();		
		b.start();
		
	}
}