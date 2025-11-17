package ejemploSincronizacionHilos;
/**
 *
 * @author Mabel
 */
class Cuenta {
	private int saldo ;
	
        Cuenta (int s) {
            saldo = s;
        }
	
	public int getSaldo() {
            return saldo;}
        
	public void restar(int cantidad){
            saldo=saldo-cantidad;
        }
	
        public synchronized void RetirarDinero(int cant, String nom) {
	//public void RetirarDinero(int cant, String nom) {	
		if (getSaldo() >= cant) {
			System.out.println(nom+": SE VA A RETIRAR SALDO (ACTUAL ES: "+getSaldo()+ ")" );
			try {
				Thread.sleep(500);//para que el hilo se duerma mientras el otro hace operaciones.
			} catch (InterruptedException ex) {	}
			
			restar(cant);	
			
			System.out.println("\t"+nom+ " retira =>"+cant + " ACTUAL("+getSaldo()+")" );	
		} else {
			System.out.println(nom+ " No puede retirar dinero, NO HAY SALDO("+getSaldo()+")" );
		}
		if (getSaldo() < 0) {
			System.out.println("SALDO NEGATIVO => "+getSaldo());
		}		
	}//retirar
}
