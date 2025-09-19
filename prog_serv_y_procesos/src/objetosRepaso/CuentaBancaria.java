package objetosRepaso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CuentaBancaria {
	private String numeroCuenta;
	private double saldo;
	List<Titular> titulares=new ArrayList<>();
	
	Scanner prompt=new Scanner(System.in);
	int numMaxTitulares=3;
	int numTitulares=(this.titulares.size()>0)?titulares.size():0;
	static boolean error=false; 
	
	public CuentaBancaria(String numeroCuenta, double saldo) {

		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.anadir_titular();
	}
	
	
	static double saldoEjemplo=2000;
	static int acumulador=1;
	public CuentaBancaria() {
		this.numeroCuenta = "arerearse"+acumulador;
		this.saldo = saldoEjemplo*acumulador;
		this.titulares.add(new Titular());
		this.titulares.add(new Titular());
		
		acumulador++;
	}



	public void ingresar_dinero(double ingreso) throws ExcepcionIngreso {
		 
		if(ingreso<0) {
			throw new ExcepcionIngreso("No es valido un ingreso negativo");
		}
		 
		double suma=this.getSaldo()+ingreso;
		this.setSaldo(suma);
	}
	
	public void retirar_dinero (double retirada) throws ExcepcionRetirada {
		double resta=this.getSaldo()-retirada;
		 
		if(resta<0) {
			throw new ExcepcionRetirada("No puedes retirar mas saldo del que tienes");
		} 
		
		this.setSaldo(resta);
	}
	
	public void anadir_titular() {
		
		do {
			this.error=false;
			System.out.println("introduce los datos del nuevo titular");
								
			String dni=validacionPrompt("Dni",prompt,"^\\d{8}[a-zA-Z]$","Error al introducir tu dni (ejemplo: 12345678D)",error);
			
			String nombre=(error)?"":validacionPrompt("Nombre",prompt,"^[a-zA-Z ]+$","Error al introducir tu nombre. No se admiten datos numericos",error);
			
			String apellidos=(error)?"":validacionPrompt("Apellidos",prompt,"^[a-zA-Z ]+$","Error al introducir tu nombre. No se admiten datos numericos",error);
			
			String telf=(error)?"":validacionPrompt("Telefono",prompt,"^\\d{9}$","Error al introducir tu numero de telefono. (ejemplo: 123456789)",error);
			
			
			if(!error) {
				this.titulares.add(new Titular(dni.toUpperCase(),nombre,apellidos,telf));
				numTitulares=this.titulares.size();
			}
			
			if(numTitulares<numMaxTitulares && !error) {				
				System.out.println("Deseas añadir algun titular mas? 1-Si. 2-No.");
				int eleccion=prompt.nextInt();
				if(eleccion!=2) {
					error=true;
				}
			}
			
		}while(error);
		
		
		System.out.println("Titular añadido");
	}
	
	public void borrarTitular() {
		
		int opcion=0;
		System.out.println("Elige uno de los titulares:");
		
		this.mostrarTitulares();
		
		opcion=prompt.nextInt();
		
		titulares.remove(opcion-1);
		System.out.println("-Titular eliminado.");
	}
	
	public void mostrarTitulares() {
		int acumulador=0;
		for (Titular titular : this.titulares) {
			
			System.out.println((acumulador+1)+"-"+titular.toString());
			acumulador++;	
		}
	}
	
	public String validacionPrompt(String nombreDato,Scanner prompt,String regExp,String mensajeError,boolean error) {
		System.out.println("Introduce "+nombreDato+":");
		String dato=prompt.next();
		if(dato.matches(regExp)) {
			
			return dato;
			
		}else {
			System.out.println(mensajeError);
			this.error=true;
			prompt.nextLine();
			return "";
		}
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public List<Titular> getTitulares() {
		return titulares;
	}

	public void setTitulares(List<Titular> titulares) {
		this.titulares = titulares;
	}
	
}
