package com.ieslazarocardenas.practica1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lanzador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			int numero = Integer.parseInt(leer.readLine());
			
			if (numero >= 1 && numero <= 9) {
				System.out.println("---Tabla de Multiplicar del "+numero+"---");
				for (int i = 0; i <= 10; i++) {
					int resultado = numero * i;
					System.out.println(numero + " x " + i + " = " + resultado + "\n");
				}
			}else {
				System.out.println("Tiene que tener un rango del 1 al 9.");
				System.exit(1);
			}

			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}catch(java.lang.NumberFormatException e) {
			System.out.println("dato no valido para la multiplicacion");
			System.exit(1);
		}

	}

}
