package hilos;

public class Tic extends Thread {
	public Tic() {
		super();
	}
	@Override
	public void run() {
		int cont=0;
		while(cont<100) {
			
			System.out.println("Tic\n");
			try {
				this.sleep(1000);
				this.setPriority(1);
				cont++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
