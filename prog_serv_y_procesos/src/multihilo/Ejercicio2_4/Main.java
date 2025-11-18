package multihilo.Ejercicio2_4;

import java.util.Scanner;

public class Main {
	private static Scanner prompt=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean fin=false;
		MyHilo hilo=new MyHilo();
		
		hilo.start();
		
		while(!fin) {
			System.out.println("Escribe si quieres Reanudar o parar (R o P), F para fin.");
			String datos=prompt.nextLine();
			
			if(datos.equalsIgnoreCase("R")) {
				hilo.Reanuda();
			}else if (datos.equalsIgnoreCase("P")) {
				hilo.Suspende();
			}else if(datos.equalsIgnoreCase("F")) {
				hilo.setFin(true);
			}
			
		}
	}

}
