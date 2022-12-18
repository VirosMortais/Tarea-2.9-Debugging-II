package ejerciciosDebug;

/*
 * Mediante el uso de puntos de interrupcion e inspeccion de variables descubre que 
 * hace el siguiente programa y explica como lo hace.
 * 
 * 
 */
/*El programa ordena los elementos de un array 'numeros' en ordem crescente
*
*Primero declaramos un array con una serie de numeros inteiros
*Despues declaramos una variable del tipo int 'n' que es el tamaño de nuestro array
*
*Tenemos dos bucles 
*El primer bucle va de i hasta n-1
*Ya el otro bucle va de j hasta n-i-1, lo que hace este bucle es cambiar la posicion actual del array
*y dentro del segundo bucle tenemos un if que pergunta si la possicion atual del array es mayor que la siguinte posicion
*
*Ejemplo del if: numero[1] > numero [1 + 1] , siento que la posicion 1 es 52 y la posicion 2 es 11, el programa entraria en este if
*
*Dentro del if hacemos unas serie de cosas siendo ellas las siguinte:
*1º declaramos una variable 'temp' del tipo inteiro que es igual a la posicion actual
*2º Ahora la posicion actual tiene el mismo valor que la seguiente posicion. 
*3º Por ultimo le damos a la seguinte posicion el valor que habiamos guardado en 'temp'
*
*
*Por fin, el metodo 'muestraPorPantalla' es llamado para mostrar los elementos del array ordenado en la pantalla.
*utilizando un bucle mediante el array y imprimiendo cada uno de los elementos del mismo separado por un espacio en blanco
*/
public class d8Bonus {
 
    public static void main(String args[])
    {

        int numeros[] = { 52, 11, 41, 5, 33, 27, 9 };
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                   
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
       
        muestraPorPantalla(numeros);
    }
    
    public static void muestraPorPantalla(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
