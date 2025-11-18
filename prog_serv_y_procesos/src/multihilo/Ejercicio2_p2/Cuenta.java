package multihilo.Ejercicio2_p2;

public class Cuenta {

    private int saldo;
    private int numero_reintegros;

    public Cuenta(int saldo) {
        this.saldo = saldo;
        this.numero_reintegros = 0;
    }

    // Método sincronizado que hace toda la operación
    public synchronized boolean retirar(int cantidad) {
        if (comprobarSaldo(cantidad)) {
            saldo -= cantidad;
            numero_reintegros++;
            return true;
        }
        return false;
    }
    
    public boolean comprobarSaldo(int cantidad) {
    	if (saldo >= cantidad) {
            return true;
        }
        return false;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getNumeroReintegros() {
        return numero_reintegros;
    }
}
