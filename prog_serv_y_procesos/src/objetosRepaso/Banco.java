package objetosRepaso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
	String nombre, cif, direccion;
	List<CuentaBancaria> cuentas = new ArrayList<>();

	Scanner prompt = new Scanner(System.in);

	public Banco(String nombre, String cif, String direccion) {
		this.nombre = nombre;
		this.cif = cif;
		this.direccion = direccion;
	}

	public void anadir_cuenta() {
		System.out.println("Introduce el numero de cuenta");
		String numCuenta = prompt.next();

		System.out.println("Introduce el saldo");
		double saldo = prompt.nextDouble();

		cuentas.add(new CuentaBancaria(numCuenta, saldo));

	}

	public void borrar_cuenta() {
		int opcion = 0;
		do {
			try {
				int acumulador = 1;
				for (CuentaBancaria cuenta : this.cuentas) {

					System.out.println(acumulador + "-" + cuenta.getNumeroCuenta() + "\n");
					acumulador++;

				}
				System.out.println("Elige la cuenta que quieras borrar:");
				opcion = prompt.nextInt();

				this.cuentas.remove(opcion);

				System.out.println("Quieres eliminar otra cuenta? 1-Si 2-No");
				opcion = prompt.nextInt();
				if (opcion != 2 || opcion != 1) {
					System.out.println("Introduce un numero dentro de los rangos que se te indican.");
					opcion = 2;
					prompt.nextLine();
				}
			} catch (java.util.InputMismatchException e) {

				System.err.println("No se admiten datos NO numericos en ese campo");
				prompt.nextLine();

			} catch (java.lang.IndexOutOfBoundsException e) {

				System.err.println("Tienes que poner un numero dentro del rango");

			}

		} while (opcion != 2);

	}

	public void transferencia() {
		int opcion = 0;
		do {
			int acumulador=1;
			for (CuentaBancaria cuenta : this.cuentas) {
				
				System.out.println(acumulador+"-"+cuenta.getNumeroCuenta() + "\n");
				acumulador++;
				
			}
			System.out.println("Elige la cuenta con la que quieras hacer la transferencia:");
			opcion=prompt.nextInt();
			
			CuentaBancaria cuentaIngresa=this.cuentas.get(opcion);
			
			System.out.println("Elige la cuenta a la que quieras hacer la transferencia:");
			opcion=prompt.nextInt();
			
			CuentaBancaria cuentaRecibe=this.cuentas.get(opcion);
			
			System.out.println("Cuanto dinero deseas transferir a la cuenta con CIF: "+cuentaRecibe.getNumeroCuenta()+"?(Saldo actual: "+cuentaIngresa.getSaldo()+" €)");
			double ingreso=prompt.nextDouble();
			
			//cuentaIngresa.setSaldo(cuentaIngresa.getSaldo()-ingreso);
			
			cuentaRecibe.setSaldo(cuentaRecibe.getSaldo()+ingreso);
			System.out.println("Transferencia realizada!!\n");
			
			System.out.println("Quieres hacer otra transferencia? 1-Si 2-No");
			opcion = prompt.nextInt();
			if (opcion != 2 || opcion != 1) {
				System.out.println("Introduce un numero dentro de los rangos que se te indican.");
				opcion = 2;
				prompt.nextLine();
			}
			
			
		}while(opcion!=2);
	}

}
