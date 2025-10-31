package ejercicio_listas;
import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaContactos lista = new ListaContactos();
        int opcion;

        do {
            System.out.println("\n=== AGENDA DE CONTACTOS ===");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Mostrar todos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();
                    lista.agregarContacto(nombre, telefono, correo);
                    break;
                case 2:
                    System.out.print("Nombre a buscar: ");
                    lista.buscarContacto(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Nombre a eliminar: ");
                    lista.eliminarContacto(sc.nextLine());
                    break;
                case 4:
                    lista.mostrarContactos();
                    break;
                case 5:
                    System.out.println("👋 Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
    }
}
