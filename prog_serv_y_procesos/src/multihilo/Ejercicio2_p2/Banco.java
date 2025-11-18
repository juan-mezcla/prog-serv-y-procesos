package multihilo.Ejercicio2_p2;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta account=new Cuenta(1000);
		
		Cliente cliente_1=new Cliente(account, "Pepe", 55);
		Cliente cliente_2=new Cliente(account, "Ezekiel", 25);
		
		cliente_1.start();
		cliente_2.start();
		
		try {
			cliente_1.join();
			cliente_2.join();
			
			 System.out.println("\nPepe: " + cliente_1.getTotal() + "€\n");
		     System.out.println("Ezekiel: " + cliente_2.getTotal() + "€\n");
		
		     System.out.println("Saldo restante en la cuenta: " + account.getSaldo() + "€");
		     System.out.println("Numero de reintegros realizados: " + account.getNumeroReintegros());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
