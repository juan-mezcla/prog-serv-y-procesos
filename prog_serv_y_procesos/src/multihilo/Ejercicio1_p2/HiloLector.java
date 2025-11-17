package multihilo.Ejercicio1_p2;

public class HiloLector extends Thread {

    private Numeros numeros;

    public HiloLector(Numeros numeros) {
        this.numeros = numeros;     
        
    }

    @Override
    public void run() {
    	if(numeros.comprobar()){
    		System.out.println("Correcto");
    	}else {
    		System.out.println("algun numero distinto");
    	}
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {}

        }
    }

