package multihilo.Ejercicio2_p2;

public class Cliente extends Thread {

    private Cuenta cuenta;
    private String nombre;
    private int cantidad;
    private int total;

    public Cliente(Cuenta acc, String nombre, int cantidad) {
        this.cuenta = acc;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.total = 0;
    }

    @Override
    public void run() {
        while (cuenta.retirar(cantidad)) {
            total += cantidad;
            System.out.println(nombre + " retira " + cantidad + "€\n");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) { }
        }

        System.out.println(nombre + " ha terminado. Total retirado: " + total + "€\n");
    }

    public int getTotal() {
        return total;
    }
}
