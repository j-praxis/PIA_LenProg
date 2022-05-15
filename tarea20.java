import java.util.Scanner;
import java.util.Random;

public class tarea20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random num = new Random();
        int i, j, x, y, z, limSup = 10;

        System.out.println("Introduzca la cantidad de filas del arreglo: ");
        x = sc.nextInt();
        System.out.println("Introduzca la cantidad de columnas: ");
        y = sc.nextInt();

        int[][] arr = new int[x][y];

        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                arr[i][j] = num.nextInt(limSup);
            }
        }

        System.out.println("Introduzca el numero a buscar: ");
        z = sc.nextInt();

        int cont = 0;

        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                if (z == arr[i][j]) {
                    cont++;
                }
            }
        }
        System.out.println("El numero " + z + " se encontró " + cont + " veces.");
        System.out.println("Arreglo: ");
        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
