package multihilo.waitNotify.pizzeria;

public class Pedido {
	private String pizza,bebida;
	private boolean cocineroTerminado = false, bebidaTerminado = false;

	public synchronized void setPizza(String pizza) {
		while(cocineroTerminado) {
			
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		this.cocineroTerminado=true;
		this.pizza=pizza;
		
		notifyAll();

	}

	public synchronized void setBebida(String bebida) {
		while(bebidaTerminado) {
			
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		this.bebidaTerminado=true;
		this.bebida=bebida;
		
		notifyAll();

	}

	public synchronized void comprobacionPedido() {
		while(!bebidaTerminado || !cocineroTerminado) {
			
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Pedido preparado de "+pizza+" con bebida "+bebida+"\n");
		
		this.bebidaTerminado=false;
		this.bebida="";
		
		this.cocineroTerminado=false;
		this.pizza="";
		
		notifyAll();
		

	}

}
