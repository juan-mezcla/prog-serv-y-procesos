//package procesos_actividad1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		if(args.length<1) {
			
			System.exit(-1);
		}else {
			System.out.println("nombre: "+args[0]);
			System.exit(0);
		}
		
	}

}
