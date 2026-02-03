/**
 * 
 */
package ejercicio_3_2_evaluacion_2._3_5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 
 */
public class Cliente {
	private static Scanner prompt = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje = null;
		try {
			InetAddress destino = InetAddress.getByName("localhost");
			int puertoDestino = 12345;

			DatagramSocket socket = new DatagramSocket(34567);
			byte[] bufer = new byte[1024];
			do {
				System.out.println("\nIntroduce el mensaje que quieres que mandar:");
				mensaje = prompt.nextLine();
				byte[] mensajeBytes = mensaje.trim().getBytes();
				
				//Parte de ENVIO de datos
				DatagramPacket envio = new DatagramPacket(mensajeBytes, mensajeBytes.length, destino, puertoDestino);

				System.out.println("Enviando mensaje desde el puerto 34567...\n");
				socket.send(envio);
				
				//Parte de RECIBO de datos 
				DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);
				socket.receive(recibo);

				int bytesRecibidos = recibo.getLength();
				// bytesRecibidos para no añadir caracteres de espacio innecesarios.
				mensaje = new String(recibo.getData(), 0, bytesRecibidos).trim();

				System.out.println("mensaje recibido del servidor: " + mensaje);
				System.out.println("IP de origen: " + recibo.getAddress().getHostAddress());

			} while (!mensaje.equalsIgnoreCase("*"));
			System.out.println("\n" + "Cerrando cliente");
			socket.close();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
