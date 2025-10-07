package procesos_actividad_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner prompt=new Scanner(System.in);
		Process hijo;
		
			System.out.println("dame la cadena que quieres que pase a mayuscula:");
			String cadena=prompt.nextLine();
			
			try {
				hijo=new ProcessBuilder("java","procesos_actividad_5.hijo",cadena).start();
			BufferedReader leer=new BufferedReader(new InputStreamReader(hijo.getInputStream()));
			String linea;
			
			while((linea=leer.readLine())!=null) {
				System.out.println(linea);
			}
			
			
			hijo.waitFor();
		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}

}
