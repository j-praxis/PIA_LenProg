import java.util.Scanner;

public class tarea21 {
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        int i, j, x, x1, y, y1, cont = 0;

        System.out.println("Introduzca la cantidad de filas del primer arreglo: ");
        x = a.nextInt();
        System.out.println("Introduzca la cantidad de filas del segundo arreglo: ");
        x1 = a.nextInt();
        if (x1 != x) {
            System.out.println("Introduzca valores compatibles.");
        } else {
            System.out.println("Introduzca la cantidad de columnas del primer arreglo: ");
            y = a.nextInt();
            System.out.println("Introduzca la cantidad de columnas del segundo arreglo: ");
            y1 = a.nextInt();
            if (y1 != y) {
                System.out.println("Introduzca valores compatibles.");
            } else {
                int[][] arr = new int[x][y], arr1 = new int[x][y], arr2 = new int[x][y];
                do {
                    for (i = 0; i < x; i++) {
                        for (j = 0; j < y; j++) {
                            System.out.println("Introduzca el valor de la posición [" + i + "][" + j + "] del arreglo "
                                    + (cont + 1) + ".");
                            if (cont == 0) {
                                arr[i][j] = a.nextInt();
                            } else {
                                arr1[i][j] = a.nextInt();
                            }
                        }
                    }
                    cont++;
                } while (cont < 2);
                for (i = 0; i < x; i++) {
                    for (j = 0; j < y; j++) {
                        arr2[i][j] = arr[i][j] + arr1[i][j];
                    }
                }
                System.out.println("La suma de matrices resultó: ");
                for (i = 0; i < x; i++) {
                    for (j = 0; j < y; j++) {
                        System.out.print(arr2[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }

        a.close();
    }
}
