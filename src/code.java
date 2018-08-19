
public class code {
	
	String[] matrizMorse = new String [36];
	char[] matrizAbecedario = new char [36];
	
	public code() {
		
		
		matrizMorse[0] = ".-";/*a*/ matrizMorse[1] = "-...";/*b*/ matrizMorse[2] = "-.-.";/*c*/ matrizMorse[3] = "-..";/*d*/
		matrizMorse[4] = ".";/*e*/ matrizMorse[5] = "..-.";/*f*/ matrizMorse[6] = "--.";/*g*/ matrizMorse[7] = "....";/*h*/
		matrizMorse[8] = "..";/*i*/ matrizMorse[9] = ".---";/*j*/ matrizMorse[10] = "-.-";/*k*/ matrizMorse[11] = ".-..";/*l*/
		matrizMorse[12] = "--";/*m*/ matrizMorse[13] = "-.";/*n*/ matrizMorse[14] = "---";/*o*/ matrizMorse[15] = ".--.";/*p*/
		matrizMorse[16] = "--.-";/*q*/ matrizMorse[17] = ".-.";/*r*/ matrizMorse[18] = "...";/*s*/ matrizMorse[19] = "-";/*t*/
		matrizMorse[20] = "..-";/*u*/ matrizMorse[21] = "...-";/*v*/ matrizMorse[22] = ".--";/*w*/ matrizMorse[23] = "-..-";/*x*/
		matrizMorse[24] = "-.--";/*y*/ matrizMorse[25] = "--..";/*z*/ matrizMorse[26] = ".----";/*1*/ matrizMorse[27] = "..---";/*2*/
		matrizMorse[28] = "...--";/*3*/ matrizMorse[29] = "....-";/*4*/ matrizMorse[30] = ".....";/*5*/ matrizMorse[31] = "-....";/*6*/
		matrizMorse[32] = "--...";/*7*/ matrizMorse[33] = "---..";/*8*/ matrizMorse[34] = "----.";/*9*/ matrizMorse[35] = "-----";/*0*/
		
		
		matrizAbecedario[0] = 'a'; matrizAbecedario[1] = 'b'; matrizAbecedario[2] = 'c'; matrizAbecedario[3] = 'd';
		matrizAbecedario[4] = 'e'; matrizAbecedario[5] = 'f'; matrizAbecedario[6] = 'g'; matrizAbecedario[7] = 'h';
		matrizAbecedario[8] = 'i'; matrizAbecedario[9] = 'j'; matrizAbecedario[10] = 'k'; matrizAbecedario[11] = 'l';
		matrizAbecedario[12] = 'm'; matrizAbecedario[13] = 'n'; matrizAbecedario[14] = 'o'; matrizAbecedario[15] = 'p';
		matrizAbecedario[16] = 'q'; matrizAbecedario[17] = 'r'; matrizAbecedario[18] = 's'; matrizAbecedario[19] = 't';
		matrizAbecedario[20] = 'u'; matrizAbecedario[21] = 'v'; matrizAbecedario[22] = 'w'; matrizAbecedario[23] = 'x';
		matrizAbecedario[24] = 'y'; matrizAbecedario[25] = 'z'; matrizAbecedario[26] = '1'; matrizAbecedario[27] = '2';
		matrizAbecedario[28] = '3'; matrizAbecedario[29] = '4'; matrizAbecedario[30] = '5'; matrizAbecedario[31] = '6';
		matrizAbecedario[32] = '7'; matrizAbecedario[33] = '8'; matrizAbecedario[34] = '9'; matrizAbecedario[35] = '0';	
	}
	
	
	//pasa de español a clave morse
	public  String espAmorse(String palabra) {
	
	char letra;
	String palabraMorse = "";
	for(int i=0; i<palabra.length(); i++) {
		letra = palabra.charAt(i);
		for(int e=0; e<matrizAbecedario.length; e++) {
			if(letra == matrizAbecedario[e]) {
				palabraMorse += matrizMorse[e] + " ";
			}
		}
	}
	return palabraMorse;
	}
	//pasa de morse a español
	public String morseAesp(String palabra) {
		
		String letraM;
		String[] letraMorse = palabra.split(" ");
		String palabraEsp = "";
		//el primer for es para leer la longitu y comprobar el primer caracter con todo el abecedario
		for(int i=0; i<letraMorse.length; i++) {
			letraM = letraMorse[i];
			for(int e=0; e<matrizMorse.length; e++) {
				if(letraM.equals(matrizMorse[e])){
					palabraEsp += matrizAbecedario[e];
				}
			}
		}
		return palabraEsp;
	}
	//compara la respuesta y usa el metodo adecuado
	public String opciones(int respuesta, String palabra) {
		String reps = "";
		switch(respuesta) {
		case 1:
			reps = espAmorse(palabra);
			break;
		case 2:
			reps = morseAesp(palabra);
			break;
		default:
			
		}
		return reps;
		
	}
}