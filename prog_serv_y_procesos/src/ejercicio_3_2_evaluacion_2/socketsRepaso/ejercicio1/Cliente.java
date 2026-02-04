package ejercicio_3_2_evaluacion_2.socketsRepaso.ejercicio1;

import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        String host = "localhost";
        int puerto = 5000;

        try (Socket socket = new Socket(host, puerto);
             Scanner teclado = new Scanner(System.in);
             // Flujos fuera del bucle
             PrintWriter escribir = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader leer = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            String mensaje;
            do {
                System.out.print("Introduce cadena: ");
                mensaje = teclado.nextLine();

                // Enviamos al servidor (println envía el \n que espera el readLine del server)
                escribir.println(mensaje);

                if (!mensaje.equals("-1")) {
                    // Leemos la respuesta (una sola línea)
                    String respuesta = leer.readLine();
                    System.out.println(">> ECO: " + respuesta);
                }

            } while (!mensaje.equals("-1"));

            System.out.println("Comunicación finalizada. Hasta luego.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}