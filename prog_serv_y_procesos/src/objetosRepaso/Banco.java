package objetosRepaso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
	String nombre,cif,direccion;
	List<CuentaBancaria> cuentas=new ArrayList<>();
	
	Scanner prompt=new Scanner(System.in);
	public Banco(String nombre, String cif, String direccion) {
		this.nombre = nombre;
		this.cif = cif;
		this.direccion = direccion;
	}
	
	
	public void anadir_cuenta() {
		System.out.println("Introduce el numero de cuenta");
		String numCuenta=prompt.next();
		
		
		System.out.println("Introduce el saldo");
		double saldo=prompt.nextDouble();
		
		cuentas.add(new CuentaBancaria(numCuenta,saldo));
		
	}
	
	
	public void borrar_cuenta() {
		
	}
	
	
	 
	
	
	
	
	
}
