/**
 * 
 */
package ejercicio_3_2_evaluacion_2._3_5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 
 */
public class Servidor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje = null;
		int puertoDestino = 34567;
		try (DatagramSocket socket = new DatagramSocket(12345);) {

			InetAddress destino = InetAddress.getByName("localhost");
			byte[] bufer = new byte[1024];
			System.out.println("Esperando mensajes en el puerto 12345...");

			do {
				//Parte de RECIBO de datos 
				DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);
				socket.receive(recibo);

				int bytesRecibidos = recibo.getLength();
				// bytesRecibidos para no añadir caracteres de espacio innecesarios.
				mensaje = new String(recibo.getData(), 0, bytesRecibidos).trim();

				System.out.println("\nmensaje recibido: " + mensaje);
				System.out.println("IP de origen: " + recibo.getAddress().getHostAddress()+"\n");

				
				
				//Parte de ENVIO de datos
				System.out.println("Enviando mensaje en mayusculas");
				byte[] mensajeBytes = mensaje.toUpperCase().trim().getBytes();

				DatagramPacket envio = new DatagramPacket(mensajeBytes, mensajeBytes.length, destino, puertoDestino);

				System.out.println("Enviando mensaje desde el puerto 34567...");
				socket.send(envio);

			} while (!mensaje.equalsIgnoreCase("*"));
			System.out.println("\n" + "Cerrando servidor");
			socket.close();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
