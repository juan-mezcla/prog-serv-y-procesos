package ejercicio_3_2_evaluacion_2._3_4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	static int contClientes=1;// Puerto
	static int numeroPuerto = 6000;
	public static void main(String[] arg) {
		try {
			 ServerSocket servidor = new ServerSocket(numeroPuerto);
			for (int i = 0; i < 5; i++) {
				System.out.println("Esperando al cliente.....");
				Socket clienteConectado = servidor.accept();
				que_cliente_es(clienteConectado);
				clienteConectado.close();
			}
		    servidor.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	
	public static void que_cliente_es(Socket clienteConectado) {
		try {
		    

		    System.out.println("Cliente: "+contClientes);

		    
		    DataOutputStream salidaServidor = new DataOutputStream(clienteConectado.getOutputStream());
		    
		    
		    salidaServidor.writeUTF("Este es el cliente = " + contClientes);
		    salidaServidor.flush();
		    
		    
		    contClientes++;
		   
		    salidaServidor.close();
		    
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

}
