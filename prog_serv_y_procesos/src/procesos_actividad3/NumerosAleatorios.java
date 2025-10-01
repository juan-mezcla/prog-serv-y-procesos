package procesos_actividad3;

public class NumerosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(!args[0].equalsIgnoreCase("fin")) {
			int numRandom=(int) (Math.random()*10)+1;
			
			System.out.println("Numero aleatorio:"+numRandom);
			System.exit(0);
		}
	}

}
