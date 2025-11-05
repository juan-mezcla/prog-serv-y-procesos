package multihilo.Ejercicio5;

import multihilo.Ejercicio4.VariosHilos;

public class HiloJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new VariosHilos()).start();
	}

}
