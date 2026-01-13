package ejercicio_2_6_evaluacion2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Fichero {
	private File arch;
	/**
	 * @param arch
	 */
	public Fichero(File arch) {
		super();
		this.arch = arch;
	}
	
	public synchronized void escribir() {
		try (BufferedWriter escribir=new BufferedWriter(new FileWriter(arch));){
			escribir.write(LocalDateTime.now().toString());
			escribir.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public synchronized void leer() {
		try (BufferedReader leer=new BufferedReader(new FileReader(arch));){
			
			System.out.println("contenido dentro de archivo:"+leer.readLine()+"\n");
			
			leer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the arch
	 */
	public File getArch() {
		return arch;
	}

	/**
	 * @param arch the arch to set
	 */
	public void setArch(File arch) {
		this.arch = arch;
	}


	

}
