package multihilo.waitNotify.pizzeria;

public class Repartidor extends Thread{
	Pedido order;

	/**
	 * @param order
	 */
	public Repartidor(Pedido order) {
		super();
		this.order = order;
	}
	
	@Override
	public void run() {
		while(true) {
			order.comprobacionPedido();
	
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}
}
