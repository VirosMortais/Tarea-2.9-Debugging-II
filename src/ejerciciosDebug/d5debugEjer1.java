package ejerciciosDebug;

import java.util.Scanner;

/*
 * Codifica una funcion esEntero que reciba un String y devuelva true 
 * si contiene un numero entero valido (solo cifras y opcionalmente el signo delante) 
 * y false en caso contrario.
 *  Su signatura sera:
 *  public static boolean esEntero(String str)
 */

public class d5debugEjer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Entra un numero entero: ");
		String texto = sc.next();
		boolean entero = esEntero(texto);
		System.out.println("es el texto introducido un entero? "+entero);
		
		
		
		

	}
	
	public static boolean esEntero(String str) {
		boolean respuesta = true;
		System.out.println("texto recibido en funcion: "+str);
		for (int i=0; i<str.length(); i++ ) {
			if (str.charAt(i)<'0' || str.charAt(i)>'9' ) {//la expresion estaba mal i > '0' || i < '9'
				respuesta = false;
				return respuesta;
			}
		}
		
		return respuesta;
		
	}

}
