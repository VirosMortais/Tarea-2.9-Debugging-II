package ejerciciosDebug;

/*
 * Mediante puntos de interrupcion, inspeccion y modificacion de variables durante la ejecucion 
 * y uso de puntos de interrupcion condicional debes encontrar el error del programa.
 * 
 * El programa devuelve un factorial de 20 incorrecto, descubre donde esta el error.
 * 
 * Ademas de indicar el error debes subir un par de capturas de pantalla 
 * en las que se vea que estas empleando el debugger para inspeccionar las variables
 * y como has creado el punto de interrupcion condicional.
 * 
 */
public class d6debugFact {
   // Imprime factorial de n
   public static void main(String[] args) {
      int n = 20;
      double factorial = 1;
 
      // n! = 1*2*3...*n
      //Añade puntos de interrupcion condicionales para que el bucle se pare...
      //...cuando la variable i vale 15
      for (int i = 1; i <= n; i++) {
         factorial *= i;
      }
      System.out.println("Factorial de " + n + " es " + factorial);
   }
}