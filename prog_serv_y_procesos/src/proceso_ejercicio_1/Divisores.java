//package proceso_ejercicio_1;

public class Divisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hola:"+args.length);
		if(args.length>=1){
			int num=Integer.parseInt(args[0]);
			int divisor=1;
			
			
			System.out.println("divisores del numero: "+num);
			while(divisor<=num) {
				
				if(num%divisor==0) {
					System.out.println(divisor);
				}
				divisor++;
			}
			System.exit(0);
		}else {
			System.exit(-1);
		}
	}

}
