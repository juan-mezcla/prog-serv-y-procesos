package entrega_actividad_1_3;

public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		int n1=Integer.parseInt(args[0]);
		
		int n2=Integer.parseInt(args[1]);
		int total=n1+n2;
		
		
		System.out.println("El total de la suma entre "+n1+" y "+n2+" es : "+total);
		
		System.exit(0);
		}catch(java.lang.NumberFormatException e) {
			System.out.println("No es un numero lo que has introducido.");
			System.exit(1);
		}
		
		
	}

}
