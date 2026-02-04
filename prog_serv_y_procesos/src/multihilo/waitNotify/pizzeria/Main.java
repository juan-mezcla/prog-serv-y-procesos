/**
 * 
 */
package multihilo.waitNotify.pizzeria;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pedido order=new Pedido();
		
		
		HiloCocina cocinero=new HiloCocina("cocina", order);
		HiloCocina bebida=new HiloCocina("bebida", order);
		Repartidor repartida=new Repartidor(order);
		
		
		cocinero.start();
		bebida.start();
		
		repartida.start();
	}

}
