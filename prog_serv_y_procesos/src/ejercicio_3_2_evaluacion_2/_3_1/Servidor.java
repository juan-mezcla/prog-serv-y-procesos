package ejercicio_3_2_evaluacion_2._3_1;

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
		    
		    System.out.println("Recibido del cliente: ");
		    System.out.println(mensajeRecibido);

		    
		    DataOutputStream salidaServidor = new DataOutputStream(clienteConectado.getOutputStream());
		    
		    
		    salidaServidor.writeUTF("IP y puertos del cliente recibidos");
		    
		    Socket clienteConectado2 = servidor.accept();

		    
		    DataInputStream respuestaCliente2 = new DataInputStream(clienteConectado2.getInputStream());
		    
		   
		    String mensajeRecibido2 = respuestaCliente2.readUTF();
		    
		    System.out.println("Recibido del cliente: ");
		    System.out.println(mensajeRecibido2);

		    
		    DataOutputStream salidaServidor2 = new DataOutputStream(clienteConectado2.getOutputStream());
		    
		    
		    salidaServidor2.writeUTF("IP y puertos del cliente recibidos");

		    respuestaCliente.close();
		    salidaServidor.close();
		    clienteConectado.close();
		    
		    
		    respuestaCliente2.close();
		    salidaServidor2.close();
		    clienteConectado2.close();
		    
		    servidor.close();

		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

}
