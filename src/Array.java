/*Josue David Garcia Mendez
carnet: 26375
fecha: 23/07/2026
*/

package Tarea01.src;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Arreglo generado:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int mayor = encontrarMayor(array);
        int menor = encontrarMenor(array);

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;

                }
            }
        }

        System.out.println("Orden Ascendente");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Orden Descendente");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        scanner.close();
}
public static int encontrarMayor(int[] array) {
        int mayor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }

    public static int encontrarMenor(int[] array) {
        int menor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

}
