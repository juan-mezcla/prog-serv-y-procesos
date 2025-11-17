package multihilo.Ejercicio1_p2;

public class HiloEscritor extends Thread {

    private Numeros numeros;

    public HiloEscritor(Numeros numeros) {
        this.numeros = numeros;
    }

    @Override
    public void run() {

    	numeros.escribir(1);

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {}
        }
    }

