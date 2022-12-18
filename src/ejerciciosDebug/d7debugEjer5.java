package ejerciciosDebug;

import java.util.Scanner;
/*
 * Haz un programa que a partir de un numero n dibuje la siguiente figura donde la anchura es el doble de n. Ejemplo para n=10

         *                  *
         **                **
         ***              ***
         ****            ****
         *****          *****
         ******        ******
         *******      *******
         ********    ********
         *********  *********
         ********************
         *********  *********
         ********    ********
         *******      *******
         ******        ******
         *****          *****
         ****            ****
         ***              ***
         **                **
         *                  *
 */

public class d7debugEjer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		//solicito por pantalla numero a calcular la tabla
		System.out.print("Entra numero: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i=1; i<=num; i++)
			imprimirLinea(i,num);
		for (int i=num; i>=1; i--)
			imprimirLinea(i-1,num);
		
		//System.out.println("FIN");

	}
	
	public static void imprimirLinea(int i, int num) {
		for (int j=1; j<=i; j++) //usabas j<= num pero es el valor total que deseo llegar y la 'i' es contador que ayudará llegar al final.
			System.out.print("*");
		for (int j=1; j<=num-i; j++)
			System.out.print(" ");
		for (int j=1; j<=num-i; j++) 
			System.out.print(" ");
		for (int j=1; j<=i; j++)//usabas j<= num pero es el valor total que deseo llegar y la 'i' es contador que ayudará llegar al final. 
			System.out.print("*");	
		System.out.println();
	}

}
