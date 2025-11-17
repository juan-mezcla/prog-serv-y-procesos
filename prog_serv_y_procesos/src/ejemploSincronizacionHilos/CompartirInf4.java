package ejemploSincronizacionHilos;
/**
 *
 * @author Mabel
 */
public class CompartirInf4 {
	public static void main(String[] args) {
		Cuenta c = new Cuenta(40);//saldo inicial de la cuenta 40€
		SacarDinero h1 = new SacarDinero("Ana", c);//se crean dos objetos q son dos hilos, dos personas a sacar dinero
		SacarDinero h2 = new SacarDinero("Juan", c);

		h1.start();
		h2.start();
	}//para evitar Juan retira =>10 ACTUAL(0) que se obtiene en la ejecución, el método retirarDinero() debería 
	//atómico e indivisible, si una persona retira dinero la otra no debería poder hasta que la primera no acabe.
	//Sincronizar métodos permite prevenir incosistencias cuando un objeto es accesible desde distintos hilos.
}