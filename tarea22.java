import java.util.Scanner;

public class tarea22 {
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        int i, j, x, x1, y, y1, cont = 0;

        System.out.println("Introduzca la cantidad de filas del primer arreglo: ");
        x = a.nextInt();
        System.out.println("Introduzca la cantidad de columnas del primer arreglo: ");
        y = a.nextInt();
        System.out.println("Introduzca la cantidad de filas del segundo arreglo: ");
        x1 = a.nextInt();
        System.out.println("Introduzca la cantidad de columnas del segundo arreglo: ");
        y1 = a.nextInt();
        if (y != x1) {
            System.out.println(
                    "Valores inválidos. Las columnas del primer arreglo deben ser iguales en cantidad a las filas del segundo arreglo.");
        } else {
            int[][] arr = new int[x][y], arr1 = new int[x1][y1], arr2 = new int[x][y1];
            do {
                if (cont == 0) {
                    for (i = 0; i < x; i++) {
                        for (j = 0; j < y; j++) {
                            System.out.println("Introduzca el valor de la posición [" + i + "][" + j + "] del arreglo "
                                    + (cont + 1) + ".");
                            arr[i][j] = a.nextInt();
                        }
                    }
                } else {
                    for (i = 0; i < x1; i++) {
                        for (j = 0; j < y1; j++) {
                            System.out.println("Introduzca el valor de la posición [" + i + "][" + j + "] del arreglo "
                                    + (cont + 1) + ".");
                            arr1[i][j] = a.nextInt();
                        }
                    }
                }
                cont++;
            } while (cont < 2);
            int k;
            for (i = 0; i < x; i++) {
                for (j = 0; j < y1; j++) {
                    for (k = 0; k < x1; k++) {
                        arr2[i][j] = arr2[i][j] + (arr[i][k] * arr1[k][j]);
                    }
                }
            }
            for (i = 0; i < x; i++) {
                for (j = 0; j < y1; j++) {
                    System.out.print(arr2[i][j] + " ");
                }
                System.out.println("");
            }
        }
        a.close();
    }
}
