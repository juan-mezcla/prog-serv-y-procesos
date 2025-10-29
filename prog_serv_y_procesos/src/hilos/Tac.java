package hilos;

public class Tac extends Thread {
	
	public Tac() {
		super();
	}

	@Override
	public void run() {
		int cont=0;
		while(cont<100) {
			
			System.out.println("Tac\n");
			try {
				this.sleep(1000);
				this.setPriority(2);
				cont++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
