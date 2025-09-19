package defaultt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner prompt=new Scanner(System.in);
		int[] numeros=new int[10];
	System.out.println("repaso 1:");
	for(int i=0; i<10; i++) {
		numeros[i]=i+1;
	}
	
	for(int numero:numeros) {
		System.out.println(numero);
	}
	
	System.out.println("repaso 2:");
	int[] numeros2=new int[10];
	for(int i=0; i<10; i++) {
		numeros2[i]=(int)(Math.random()*(10-1)+1);
	}
	
	for(int numeroA: numeros) {
		System.out.println(numeroA);
		for(int numeroB: numeros2) {
			System.out.println(numeroB);
		}
	}
	
	System.out.println("repaso 3:");
	int[] numerosC=new int[10];
	
	for(int i=0; i<5; i++) {
		numerosC[i]=i+1;
	}
	System.out.println("donde quieres introducir el numero");
	int posicion=prompt.nextInt();
	
	numerosC[posicion]=6;
	
	System.out.println("array c con nuevo elemento");
	for(int numero:numerosC) {
		System.out.println(numero+"\n");
	}
}

	
	public static void ejercicio_repaso() {
		Scanner prompt=new Scanner(System.in);
		int[] numeros=new int[10];
		System.out.println("repaso 1:");
		for(int i=0; i<10; i++) {
			numeros[i]=i+1;
		}
		
		for(int numero:numeros) {
			System.out.println(numero);
		}
		
		System.out.println("repaso 2:");
		int[] numeros2=new int[10];
		for(int i=0; i<10; i++) {
			numeros2[i]=(int)(Math.random()*(10-1)+1);
		}
		
		
		for(int numeroA: numeros) {
			System.out.println(numeroA);
			for(int numeroB: numeros2) {
				System.out.println(numeroB);
			}
		}
		
		System.out.println("repaso 3:");
		int[] numerosC=new int[10];
		
		for(int i=0; i<5; i++) {
			numerosC[i]=i+1;
		}
		System.out.println("donde quieres introducir el numero");
		int posicion=prompt.nextInt();
		
		numerosC[posicion]=6;
		
		System.out.println("array c con nuevo elemento");
		for(int numero:numerosC) {
			System.out.println(numero+"\n");
		}
		
		prompt.close();
	}

}