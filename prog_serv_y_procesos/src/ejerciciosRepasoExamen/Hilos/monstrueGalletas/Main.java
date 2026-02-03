/**
 * 
 */
package ejerciciosRepasoExamen.Hilos.monstrueGalletas;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxGalletasAlmacen = 10;

		Almacen objAlmacen = new Almacen(maxGalletasAlmacen);
		Almacenero trabajador = new Almacenero(maxGalletasAlmacen, objAlmacen);

		MonstruoGalletas monstruo1 = new MonstruoGalletas("monster 1", maxGalletasAlmacen, objAlmacen);
		MonstruoGalletas monstruo2 = new MonstruoGalletas("monster 2", maxGalletasAlmacen, objAlmacen);
		MonstruoGalletas monstruo3 = new MonstruoGalletas("monster 3", maxGalletasAlmacen, objAlmacen);

		trabajador.start();
		monstruo1.start();
		monstruo2.start();
		monstruo3.start();

		try {
			trabajador.join();
			monstruo1.join();
			monstruo2.join();
			monstruo3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
