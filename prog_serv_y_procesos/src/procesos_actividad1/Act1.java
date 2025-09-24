//package procesos_actividad1;

import java.io.IOException;
import java.io.InputStream;

public class Act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessBuilder mainComp=new ProcessBuilder("javac","Main.java");
		try {
			Process comp=mainComp.start();
		
			
			ProcessBuilder main=new ProcessBuilder("java","Main");//con valor para que funcione.
			Process main1=main.start();
			main1.waitFor();
			System.out.println("dato waitfor: "+main1.waitFor());
			
			InputStream is = main1.getInputStream();
			int c;
			while ((c = is.read())!=-1){
				System.out.print((char) c);
			}
			is.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
