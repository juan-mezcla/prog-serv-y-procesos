package multihilo.Ejercicio8;

public class Pitufo extends Thread{
	private String nombrePitufo;

	/**
	 * @param nombrePitufo
	 */
	public Pitufo(String nombrePitufo) {
		super();
		this.nombrePitufo = nombrePitufo;
	
	}
	
	@Override
	public void run() {
		for(int i=1; i<=3; i++) {
			System.out.println(this.getNombrePitufo()+" come un "+i+"º pan con queso");
		}
		System.out.println(this.getNombrePitufo()+" termino de comer");
	}
	

	public String getNombrePitufo() {
		return nombrePitufo;
	}

	public void setNombrePitufo(String nombrePitufo) {
		this.nombrePitufo = nombrePitufo;
	}
	
	
	
}
