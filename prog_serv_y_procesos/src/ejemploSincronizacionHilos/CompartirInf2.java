package ejemploSincronizacionHilos;


/**
 *
 * @author Mabel
 */
public class CompartirInf2 {
	public static void main(String[] args) {
		Contador2 cont = new Contador2(100);
		HiloA2 a = new HiloA2("HiloA", cont);
		HiloB2 b = new HiloB2("HiloB", cont);
		a.start();		
		b.start();
		
	}
}