package procesos_actividad_4;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner prompt=new Scanner(System.in);
		
		int nota=0,total=0,cont=0;
		
		do {
			System.out.println("Introduce una nota:");
			nota=prompt.nextInt();
			if(nota!=0) {
				total+=nota;
				cont++;
			}
		}while(nota!=0);
		
		try {
			
			int media=total/cont;
			Process procesoMedia=new ProcessBuilder("java","procesos_actividad_4.Main",Integer.toString(media)).start();
			
			procesoMedia.waitFor();
			
			InputStream leerMedia=procesoMedia.getInputStream();
			
			int datos;
			
			while ((datos = leerMedia.read())!=-1){
				System.out.print((char) datos);
			}
			
			leerMedia.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
