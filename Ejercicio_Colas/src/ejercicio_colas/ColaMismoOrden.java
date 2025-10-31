package ejercicio_colas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColaMismoOrden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> colaA = new LinkedList<>();
        Queue<Integer> colaB = new LinkedList<>();

        System.out.print("¿Cuántos números quieres ingresar en la Cola A? ");
        int n = sc.nextInt();

        // Ingresar datos a la cola A
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            int num = sc.nextInt();
            colaA.add(num);
        }

        System.out.println("\nCola A inicial: " + colaA);

        // Mover elementos de A a B manteniendo el orden
        while (!colaA.isEmpty()) {
            colaB.add(colaA.remove());
        }

        System.out.println("Cola B (mismo orden): " + colaB);
        System.out.println("Cola A al final: " + colaA);
    }
}
