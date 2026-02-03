/**
 * 
 */
package ejerciciosRepasoExamen.Hilos.monstrueGalletas;

/**
 * 
 */
public class Almacenero extends Thread {
	private int numGalletasRepuestas=0;
	private Almacen almacen;
	/**
	 * @param numGalletasRepuestas
	 */
	public Almacenero(int numGalletasRepuestas,Almacen almacen) {
		super();
		this.numGalletasRepuestas = numGalletasRepuestas;
		this.almacen=almacen;
	}



	@Override
	public void run() {
		int cont=0;
		while (!almacen.isAlmacenCerrado()) {
			if(almacen.getGalletas()==0) {
				almacen.reponerGalletas(numGalletasRepuestas);
				System.out.println("\n"+"alguien se ha comido todas las galletas!!!"+"\n");
				cont++;
			}else {
				System.out.println("\n"+"siguen quedando galletas.");
			}
			
			if(cont==10) {
				almacen.setAlmacenCerrado(true);
				System.out.println("\n"+"SE CIERRA EL ALMACEN");
			}
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
