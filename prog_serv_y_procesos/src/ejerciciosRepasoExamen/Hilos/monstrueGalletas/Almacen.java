/**
 * 
 */
package ejerciciosRepasoExamen.Hilos.monstrueGalletas;

/**
 * 
 */
public class Almacen {
	private int galletas=0;
	private static boolean almacenCerrado=false;
	/**
	 * @param galletas
	 */
	public Almacen(int galletas) {
		super();
		this.galletas = galletas;
	}
	
	synchronized public void cogerGalletas(int numGalletas) {
		if((this.getGalletas()-numGalletas)<0) {
			System.out.println("no ha podido coger todas la galletas que le habria gustado, Quedaban: "+galletas);
			this.setGalletas(0);
		}else {
			this.setGalletas(this.getGalletas()-numGalletas);
		}
	}
	
	synchronized public void reponerGalletas(int nuevoNumGalletas) {
		this.setGalletas(nuevoNumGalletas);
	}

	public int getGalletas() {
		return galletas;
	}

	public void setGalletas(int galletas) {
		this.galletas = galletas;
	}

	public boolean isAlmacenCerrado() {
		return almacenCerrado;
	}

	public void setAlmacenCerrado(boolean almacenCerrado) {
		this.almacenCerrado = almacenCerrado;
	}
	
	
	
}
