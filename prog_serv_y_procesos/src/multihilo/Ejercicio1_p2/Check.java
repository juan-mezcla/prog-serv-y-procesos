package multihilo.Ejercicio1_p2;

public class Check {

	public static void main(String[] args) {

		Numeros numeros = new Numeros(new int[100]);
		System.out.println("Usando monitor (sincronización)");

		HiloEscritor escritor = new HiloEscritor(numeros);
		HiloLector lector = new HiloLector(numeros);

		escritor.start();
		lector.start();

		try {
			escritor.join();
			lector.join();
		} catch (InterruptedException e) {
		}

		System.out.println("Fin del programa.");
	}
}
