package ejercicio_3_2_evaluacion_2.socketsRepaso.ejercicio3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Servidor {
    public static void main(String[] args) {
        // Usamos el puerto 5000
        try (DatagramSocket socket = new DatagramSocket(5000)) {
            byte[] bufer = new byte[1200];
            System.out.println("Servidor UDP iniciado en el puerto 5000...");

            while (true) {
                DatagramPacket paqueteRecibido = new DatagramPacket(bufer, bufer.length);
                socket.receive(paqueteRecibido); // Espera al cliente

                // USAR getLength() para leer solo los bytes recibidos
                String mensaje = new String(paqueteRecibido.getData(), 0, paqueteRecibido.getLength());
                System.out.println("Cliente dice: " + mensaje);

                String respuesta = "ECO>> " + mensaje;
                byte[] bRespuesta = respuesta.getBytes();

                // Respondemos a la IP y puerto exactos desde donde vino el paquete
                DatagramPacket paqueteEnvio = new DatagramPacket(
                    bRespuesta, bRespuesta.length, 
                    paqueteRecibido.getAddress(), paqueteRecibido.getPort()
                );
                
                socket.send(paqueteEnvio);

                if (mensaje.equals("-1")) break; // Opcional: cerrar si llega -1
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
