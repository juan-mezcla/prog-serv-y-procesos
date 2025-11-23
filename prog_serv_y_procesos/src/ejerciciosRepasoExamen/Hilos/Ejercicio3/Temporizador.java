package ejerciciosRepasoExamen.Hilos.Ejercicio3;

public class Temporizador extends Thread {

    private int segundos = 0;

    private volatile boolean enPausa = false;

    public void pausar() {
        enPausa = true;
    }

    public void reanudar() {
        enPausa = false;
    }

    @Override
    public void run() {

        while (segundos <= 10) {

            try {
                // Si está en pausa, el hilo duerme pero sin avanzar
                while (enPausa) {
                    Thread.sleep(200);  // Simula suspensión sin usar métodos prohibidos
                }

                System.out.println("Segundos: " + segundos);
                segundos++;

                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("El temporizador ha llegado a 10 y termina.");
    }
}
