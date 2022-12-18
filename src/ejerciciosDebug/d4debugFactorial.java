package ejerciciosDebug;

import java.util.Scanner;

/*Programa que calcula el factorial de un numero introducido por el usuario:
 * Recuerda, factorial de 5, 5! = 5*4*3*2*1 * 
 */

public class d4debugFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, num2, fact;
		Scanner sc = new Scanner(System.in);
		System.out.print("Entra numero a calcular factorial: ");
		num = sc.nextInt();
		fact = num;
		num2 = num;
		while (num2>1) {//la expresion estaba mal ya que el nunca entraria ya que los valores eran iguales.
			num2--;
			fact *= num2;//no calculavas el fact, ya que fact es un acumulador, y simplemente estabas guardando la informacion de num * num2.		
		}
		System.out.println("El factorial de "+num+" es "+fact);

	}

}
