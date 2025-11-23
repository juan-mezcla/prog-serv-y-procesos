package ejerciciosRepasoExamen.Hilos.Ejercicio3;

public class Main {

    public static void main(String[] args) {

        Temporizador t = new Temporizador();

        System.out.println("Estado inicial: " + t.getState());

        t.start();

        try {
            // Esperar a que llegue a 5 segundos
            Thread.sleep(5200);

            System.out.println("\nEl main va a pausar el temporizador...");
            t.pausar();

            System.out.println("Estado del hilo después de llamar a pausar(): " + t.getState());

            Thread.sleep(3000);

            System.out.println("\nReanudando temporizador...");
            t.reanudar();

            System.out.println("Estado del hilo tras reanudar(): " + t.getState());

            t.join(); // Esperamos a que termine

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nTemporizador finalizado.");
    }
}
