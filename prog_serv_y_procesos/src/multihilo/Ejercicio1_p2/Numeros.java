package multihilo.Ejercicio1_p2;

public class Numeros {
    
    private int[] datos;
    
    public Numeros(int[] datos) {
        this.datos = datos;
    }

    public int[] getDatos() {
        return datos;
    }

    
    public synchronized void escribir(int num) {
        for (int i = 0; i < datos.length; i++) {
        	System.out.println("posicion: "+i+" num: "+num);
            datos[i] = num+i;
        }
    }

    // Comprueba que todos los valores del buffer son iguales
    public synchronized boolean comprobar() {
        int ref = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] != ref) {
                return false;
            }
        }
        return true;
    }
}
