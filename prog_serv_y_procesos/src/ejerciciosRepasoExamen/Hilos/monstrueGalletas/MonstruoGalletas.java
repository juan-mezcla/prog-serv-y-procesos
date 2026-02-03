package ejerciciosRepasoExamen.Hilos.monstrueGalletas;

import java.util.concurrent.ThreadLocalRandom;

public class MonstruoGalletas extends Thread{
	private int galletasRecogidas;
	private String nombreMonstruo;
	private Almacen almacen;
	/**
	 * @param galletasRecogidas
	 */
	public MonstruoGalletas(String nombreMonstruo,int maxGalletas,Almacen almacen) {
		super();
		this.galletasRecogidas = ThreadLocalRandom.current().nextInt(1, maxGalletas);
		this.nombreMonstruo=nombreMonstruo;
		this.almacen=almacen;
	}


	@Override
	public void run() {
		while (!almacen.isAlmacenCerrado()) {
			System.out.println("\n"+nombreMonstruo+" se dispone a coger "+galletasRecogidas+" galletas.");
			almacen.cogerGalletas(galletasRecogidas);
			System.out.println(nombreMonstruo+" se va.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
