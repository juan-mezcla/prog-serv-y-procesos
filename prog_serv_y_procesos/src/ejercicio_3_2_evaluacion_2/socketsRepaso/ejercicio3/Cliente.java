package ejercicio_3_2_evaluacion_2.socketsRepaso.ejercicio3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
    private static Scanner prompt = new Scanner(System.in);

    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket()) { // Socket en puerto aleatorio
            InetAddress ip = InetAddress.getByName("localhost");
            byte[] bufer = new byte[1200];
            String mensaje;

            do {
                System.out.print("Dame un numero (o -1 para salir): ");
                mensaje = prompt.nextLine();
                
                // ENVIAR al puerto 5000 (donde escucha el server)
                byte[] bMensaje = mensaje.getBytes();
                DatagramPacket paqueteEnvio = new DatagramPacket(bMensaje, bMensaje.length, ip, 5000);
                socket.send(paqueteEnvio);

                // RECIBIR respuesta
                DatagramPacket paqueteRecibido = new DatagramPacket(bufer, bufer.length);
                socket.receive(paqueteRecibido);
                
                String respuesta = new String(paqueteRecibido.getData(), 0, paqueteRecibido.getLength());
                System.out.println("Server dice: " + respuesta);
            
            } while (!mensaje.equals("-1"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
