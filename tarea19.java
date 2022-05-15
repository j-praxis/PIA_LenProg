import java.util.Scanner;

public class tarea19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int len, num, cant = 0;

        System.out.println("Ingrese el tamaño del vector: ");
        len = sc.nextInt();

        int[] nums = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.println("Ingrese un valor para la posicion " + i + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.println("Ingrese el valor a buscar: ");
        num = sc.nextInt();

        for (int i = 0; i < len; i++) {
            if (nums[i] == num) {
                cant++;
            }
        }

        System.out.println("El valor " + num + " se repitio " + cant + " veces.");

        sc.close();
    }
}
