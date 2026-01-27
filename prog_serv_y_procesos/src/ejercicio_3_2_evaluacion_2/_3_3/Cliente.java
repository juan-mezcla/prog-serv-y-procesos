package ejercicio_3_2_evaluacion_2._3_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	private static Scanner prompt=new Scanner(System.in);
	
	public static void main(String[] args) {
		String Host = "localhost";
		int Puerto = 6000;// puerto remoto

		System.out.println("PROGRAMA CLIENTE INICIADO....");
		try {
			
			Socket Cliente = new Socket(Host, Puerto);
			DataOutputStream salidaCliente=new DataOutputStream(Cliente.getOutputStream());
			
			System.out.println("Pon un texto:");
			String palabra=prompt.nextLine().toLowerCase();
			salidaCliente.writeUTF(palabra);
			
			DataInputStream datosServidor=new DataInputStream(Cliente.getInputStream());
			
			System.out.println("Datos server: "+datosServidor.readUTF());
			
			
			datosServidor.close();
			salidaCliente.close();
			Cliente.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
