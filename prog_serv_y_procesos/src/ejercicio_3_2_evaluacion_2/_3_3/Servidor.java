package ejercicio_3_2_evaluacion_2._3_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] arg) {
		int numeroPuerto = 6000;// Puerto
		try {
		    ServerSocket servidor = new ServerSocket(numeroPuerto);
		    System.out.println("Esperando al cliente.....");
		    Socket clienteConectado = servidor.accept();

		    
		    DataInputStream respuestaCliente = new DataInputStream(clienteConectado.getInputStream());
		    
		   
		    String mensajeRecibido = respuestaCliente.readUTF();
		    String mensajeMayusculas = mensajeRecibido.toUpperCase();
		    
		    System.out.println("Recibido del cliente: " + mensajeRecibido);
		    System.out.println("Transformado a: " + mensajeMayusculas);

		    
		    DataOutputStream salidaServidor = new DataOutputStream(clienteConectado.getOutputStream());
		    
		    
		    salidaServidor.writeUTF("datos en mayusc = " + mensajeMayusculas);

		    respuestaCliente.close();
		    salidaServidor.close();
		    clienteConectado.close();
		    servidor.close();

		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

}
