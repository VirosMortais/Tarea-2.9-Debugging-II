package ejerciciosDebug;

import java.util.Scanner;

/* Entra un numero por teclado N y escribe N veces Numero 1 hasta Numero N, ejemplo para N = 3:
 * Numero 1
 * Numero 2
 * Numero 3 
 */

public class d2debugWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0;
		int i = 1;
		
		//solicito por pantalla numero a calcular la tabla
		System.out.print("Entra numero: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		System.out.print("Imprimo los numeros");
		
		while (i<=num) {
			System.out.println("Numero "+i);
                        i++;//no tenias i++ entoces cuando entrase la primera vez en lo bucle nunca iria salir
		}

	}

}
