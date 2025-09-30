package procesos_actividad3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner prompt=new Scanner(System.in);
		
		int opcion=0;
		int codigoRespuesta=0;
		do {
			Process hijo;
			try {
				
				System.out.println("Quieres un numero aleatorio? 1-Si. 2-No");
				opcion=prompt.nextInt();
				
				String fin=(opcion!=2)?"":"fin";
				
				
				hijo=new ProcessBuilder("java","NumerosAleatorios",fin).start();
				InputStream input=hijo.getInputStream();
				if(opcion==1) {
					int datos;
					while ((datos = input.read())!=-1){
						System.out.print((char) datos);
					}
				}else {
					input.close();
				}
				codigoRespuesta=hijo.waitFor();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (java.util.InputMismatchException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
				System.out.println("Codigo de respuesta: "+codigoRespuesta);
			}
			
		}while(opcion!=2);

	}

}
