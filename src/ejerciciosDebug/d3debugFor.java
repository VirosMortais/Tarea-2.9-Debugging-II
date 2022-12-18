package ejerciciosDebug;

import java.util.Scanner;

/* Entra un numero por teclado N y escribe N veces Numero 1 hasta Numero N, ejemplo para N = 3:
 * Numero 1
 * Numero 2
 * Numero 3 
 */


public class d3debugFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0;
	
		//solicito por pantalla numero a calcular la tabla
		System.out.print("Entra numero: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		System.out.println("Imprimo los numeros");
		
		for (int i = 1; i<=num; i++) {
			System.out.println("Numero "+i);
			i++;
		}


	}

}
