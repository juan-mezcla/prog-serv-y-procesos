package repaso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner prompt=new Scanner(System.in);
		List <Alumno> alumnos=new ArrayList<>();
		
		double total = 0,nota=0;
		String nombre;
		
			do {
				try {
				System.out.println("Introduce el nombre del alumno:");
				nombre=prompt.nextLine().toLowerCase();
				
				if(isNanString(nombre)) {
					System.out.println("NOMBRE SIN CARACTERES NUMERICOS");
				}else {
					System.out.println("Nota de "+nombre+":");
					nota=prompt.nextDouble();
					prompt.nextLine();
					
					alumnos.add(new Alumno(nombre,nota));
					total+=nota;
				}
					
				}catch(java.util.InputMismatchException e){
					nombre="";
					nota=0.0;
					System.out.println("Solo se admiten caracteres numericos en ese campo");
					prompt.nextLine();
				}
			}while(alumnos.size()!=6);
			
			double media=total/alumnos.size();
			System.out.println("Alumnos analizados:");
			for(Alumno alumno: alumnos) {
				System.out.print(alumno.nombre+", ");
			}
			System.out.println("\nMedia de notas de los alumnos: "+String.format("%.1f", media));
			System.out.println("fin");
			
		
		
	
	}
	
	public static boolean isNanString(String texto) {
		return texto.matches(".*\\d.*");
	}

}
