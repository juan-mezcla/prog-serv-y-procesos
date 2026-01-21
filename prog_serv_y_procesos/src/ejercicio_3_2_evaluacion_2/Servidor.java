package ejercicio_3_2_evaluacion_2;

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
			Socket clienteConectado = null;
			
			System.out.println("Esperando al cliente.....");
			clienteConectado = servidor.accept();
			
			InputStream streamCliente=null;
			streamCliente=clienteConectado.getInputStream();
			
			DataInputStream respuestaCliente=new DataInputStream(streamCliente);
			
			System.out.println("Respuesta: "+ respuestaCliente.readUTF().toUpperCase());
			
			//darle al cliente una respuesta
			OutputStream streamSalida=null;
			streamSalida=clienteConectado.getOutputStream();
			
			DataOutputStream salidaServidor=new DataOutputStream(streamSalida);
			
			salidaServidor.writeUTF("datos en mayusc="+respuestaCliente.readUTF().toUpperCase());
			
			streamCliente.close();
			respuestaCliente.close();
			
			streamSalida.close();
			salidaServidor.close();
			
			clienteConectado.close();
			servidor.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
