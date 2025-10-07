package procesos_actividad_6;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner prompt=new Scanner(System.in);
		
		int n1=prompt.nextInt();
		int n2=prompt.nextInt();
		
		try {
			Process suma=new ProcessBuilder("java","procesos_actividad_6.Suma",args.toString()).start();
		
		if(n1 > n2) {
			
		}else {
			
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
