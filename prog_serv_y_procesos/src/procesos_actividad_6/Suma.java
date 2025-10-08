package procesos_actividad_6;

public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=Integer.parseInt(args[0]);
		
		int n2=Integer.parseInt(args[1]);
		int total=0;
		if(n1 >= n2) {
			for(int i=n2; i<n1; i++) {
				total+=i;
			}
		}else {
			for(int i=n1; i<=n2; i++) {
				total+=i;
			}
		}
		
		System.out.println("El total de la suma entre lo numero comprendidos entre "+n1+" y "+n2+" es : "+total);
		
		System.exit(0);
		
	}

}
