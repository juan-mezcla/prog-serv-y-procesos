package proceso_ejercicio_1;

import java.io.IOException;
import java.io.InputStream;

public class ejerci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {	
		Process divisores=new ProcessBuilder("java","Divisores","20").start();
		
		InputStream input=divisores.getInputStream();
		int datos;
		while ((datos = input.read())!=-1){
			System.out.print((char) datos);
		}
		input.close();
		
		divisores.waitFor();
		 
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
