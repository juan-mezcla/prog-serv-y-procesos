package multihilo.Ejercicio2_4;

/**Para suspender de forma segura el hilo se debe introducir en el hilo una vble, por ej, suspender
*y comprobar su valor dentro del método run(), es lo que se hace en la llamada al 
*método esperandoParaReanudar() de este código.
*El método Suspende del hilo da valor true a la variable para suspender el hilo.
*El método Reanuda da el valor false para que detenga la suspensión y continue
*ejecutándose el hilo.
**/

public class MyHilo extends Thread {
	private int cont=0;
	private SolicitaSuspender suspender = new SolicitaSuspender();
	private boolean fin;
	
	public void Suspende() {
		suspender.set(true);//petición de suspender hilo
	}
	public void Reanuda() {
		suspender.set(false);//petición de continuar
	}
	
	public void run (){
		try {
			while (!fin) {
				
				cont++;
				System.out.println("Contador: "+cont);
				suspender.esperandoParaReanudar();//comprobar
				this.sleep(500);
			}
			
			System.out.println("Fin bucle");
		}catch (InterruptedException exception) {}
	}
	
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	public SolicitaSuspender getSuspender() {
		return suspender;
	}
	public void setSuspender(SolicitaSuspender suspender) {
		this.suspender = suspender;
	}
	public boolean isFin() {
		return fin;
	}
	public void setFin(boolean fin) {
		this.fin = fin;
	}
	
	

}