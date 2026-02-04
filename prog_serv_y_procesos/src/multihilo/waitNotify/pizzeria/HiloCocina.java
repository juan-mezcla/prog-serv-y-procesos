package multihilo.waitNotify.pizzeria;

public class HiloCocina extends Thread{
 private String tipo;
 private Pedido order;
 /**
 * @param tipo
 * @param order
 */
 public HiloCocina(String tipo, Pedido order) {
	super();
	this.tipo = tipo;
	this.order = order;
 }
 
 @Override
 public void run() {
	 	int cont=0;
	 while(true) {
		 
		 if(tipo.equalsIgnoreCase("cocina")) {
			 System.out.println("Preparando pizza de Peperoni");
			 order.setPizza("Peperoni"+cont);
		 }else {
			 System.out.println("Preparando bebida de fantita");
			 order.setBebida("fantita"+cont);
		 }
		 cont++;
		 
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	 
	 
	 
 }
	
	
}
