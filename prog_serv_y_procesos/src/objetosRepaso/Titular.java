package objetosRepaso;

public class Titular {
	String dni,nombre,apellidos,telefono;
	static int acumulador=0;
	@Override
	public String toString() {
		return "Dni=" + dni + "\nNombre=" + nombre + "\nApellidos=" + apellidos + "\nTelefono=" + telefono+"\n\n";
	}
	
	public Titular() {
		this.dni=this.acumulador+"2345678h";
		this.nombre="ejemplo"+this.acumulador;
		this.apellidos="apellidoEjemplo"+this.acumulador;
		this.telefono="123456789";
		
		this.acumulador++;
	}

	public Titular(String dni,String nombre,String apellidos,String telefono) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.telefono=telefono;
	}
	
	
	
}
