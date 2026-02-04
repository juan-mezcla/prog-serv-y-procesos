/**
 * 
 */
package ejercicio_3_2_evaluacion_2.socketsRepaso.ejercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 */
public class Servidor {
    public static void main(String[] args) {
        System.out.println("Servidor esperando conexión en el puerto 5000...");
        try (ServerSocket server = new ServerSocket(5000);
             Socket cliente = server.accept(); // Aceptamos al cliente
             // Creamos los flujos UNA SOLA VEZ fuera del bucle
             PrintWriter escribir = new PrintWriter(cliente.getOutputStream(), true);
             BufferedReader leer = new BufferedReader(new InputStreamReader(cliente.getInputStream()))) {

            System.out.println("Cliente conectado desde: " + cliente.getInetAddress());
            String linea;

            // Leemos mientras el cliente no cierre la conexión
            while ((linea = leer.readLine()) != null) {
                System.out.println("Recibiendo: " + linea);
                
                // Enviamos el eco con println (añade el \n necesario para el cliente)
                escribir.println(linea);

                if (linea.equalsIgnoreCase("-1")) break;
            }

            System.out.println("Servidor finalizado.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}