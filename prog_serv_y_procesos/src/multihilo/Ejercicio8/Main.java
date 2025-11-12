package multihilo.Ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String>pitufos=List.of("Papá pitufo", "Pitufina", "Filósofo", "Pintor",
				"Gruñón", "Bromista", "Dormilón", "Tímido", "Tontín", "Bonachón", "Romántico");
		
		pitufos.forEach((pitufo) ->{
			Thread hilo=new Pitufo(pitufo);
			hilo.start();
//			try {
//				hilo.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		});

	}

}
