package com.ieslazarocardenas.practica1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Lanzado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Process lanzador=new ProcessBuilder("java","com.ieslazarocardenas.practica1.Lanzador").start();
	
			BufferedWriter escribir=new BufferedWriter(new OutputStreamWriter(lanzador.getOutputStream()));
			
			escribir.write(args[0]);
			escribir.flush();
			escribir.close();
			
			BufferedReader leer=new BufferedReader(new InputStreamReader(lanzador.getInputStream()));
			String linea;
			while((linea=leer.readLine())!=null) {
				System.out.println(linea);
			}
			
			leer.close();
			
			BufferedReader leerErrores=new BufferedReader(new InputStreamReader(lanzador.getErrorStream()));
			linea="";
			
			while((linea=leerErrores.readLine())!=null) {
				System.out.println(linea);
			}
			
			leer.close();
			
			
			System.out.println("Codigo de respuesta: "+lanzador.waitFor());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
