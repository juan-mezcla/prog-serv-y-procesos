package objetosRepaso;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//CuentaBancaria cuenta=new CuentaBancaria("342354j",1200);
		Banco banco=new Banco("ING","123434235g","becerril");
		
		for(int i=0; i<10; i++) {
			banco.cuentas.add(new CuentaBancaria());
		}
		int acumulador=1;
		
		System.out.println("Cuentas que estan en "+banco.nombre);
		for(CuentaBancaria cuenta: banco.cuentas) {
			System.out.println("Cuenta "+acumulador);
			cuenta.mostrarTitulares();
			
			System.out.println("---------------------");
			acumulador++;
		}
		
		//menu(cuenta);
		
	}
	
	public static void menuBanco(Banco banco) {
		Scanner prompt=new Scanner(System.in);
		int opcion=0;
		do {
			
			System.out.println("Elige una de las opciones");
			System.out.println("1-Crear cuenta. 2-Realizar transferencia a otra cuenta. 3-Salir");
			opcion=prompt.nextInt();
			try {
				
				switch(opcion) {
				case 1:
					banco.anadir_cuenta();
					break;
					
				case 2:
					
					break;
					
				case 3:
					
					break;
					
				case 4:
					
					break;
				
				}
			}catch(Exception e) {
				
				System.out.println(e.getMessage());
			}
			
			
			
		}while(opcion!=5);
		
	}
	
	
	public static void menu(CuentaBancaria cuenta) {
		Scanner prompt=new Scanner(System.in);
		int opcion=0;
		do {
			
			System.out.println("Elige una de las opciones");
			System.out.println("1-Añadir titular. 2-Borrar titular. 3-Añadir dinero. 4-Retirar dinero. 5-Salir");
			opcion=prompt.nextInt();
			try {
				
				switch(opcion) {
				case 1:
					cuenta.anadir_titular();
					break;
					
				case 2:
					if(cuenta.titulares.size()==1) {
						System.out.println("Solo tienes un titular");
					}else {
						
						cuenta.borrarTitular();
					}
					break;
					
				case 3:
					System.out.println("Introduce la cantidad a ingresar:(Saldo actual: "+cuenta.getSaldo()+")");
					double ingreso=prompt.nextDouble();
					cuenta.ingresar_dinero(ingreso);
					break;
					
				case 4:
					System.out.println("Introduce la cantidad a retirar:(Saldo actual: "+cuenta.getSaldo()+")");
					double retirar=prompt.nextDouble();
					cuenta.retirar_dinero(retirar);
					break;
				
				}
			}catch(ExcepcionIngreso d) {
				
				System.out.println(d.smg);
				
			}catch(ExcepcionRetirada e) {
				
				System.out.println(e.smg);
			}
			
			
			
		}while(opcion!=5);
		
	}

}
