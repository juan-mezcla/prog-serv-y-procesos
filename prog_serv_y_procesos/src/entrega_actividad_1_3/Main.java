package entrega_actividad_1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			Process suma=new ProcessBuilder("java","entrega_actividad_1_3.Suma",args[0],args[1]).start();
			BufferedReader leer=new BufferedReader(new InputStreamReader(suma.getInputStream()));
			
			String linea;
			
			while((linea=leer.readLine())!=null) {
				System.out.println(linea);
			}
			leer.close();
			
			
			BufferedReader leerError=new BufferedReader(new InputStreamReader(suma.getErrorStream()));
			
			String lineaError;
			
			while((lineaError=leerError.readLine())!=null) {
				System.out.println(lineaError);
			}
			leerError.close();
			suma.waitFor();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
