import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int respuesta;
		String palabra;
		String traduccion;
		String continuar;
		boolean bandera = true;
		code codigo = new code();
		while(bandera) {
			System.out.println("que traduccion desea hacer: 1: español a morse\n"
					+ " 2:morse a español");
			respuesta = entrada.nextInt();
			System.out.println("ingrese la palabra: ");
			palabra = entrada.next();
			traduccion = codigo.opciones(respuesta, palabra);
			System.out.println("la palabra: " + palabra + " se tradujo: " + traduccion);
			System.out.println("desea hacer otra traduccion? s/n" );
			continuar = entrada.next();
			if(continuar != "s") {
				bandera = false;
			}
			
		}
		
	}
		
}
