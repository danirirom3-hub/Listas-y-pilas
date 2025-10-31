package ejercicio_listas;

public class ListaContactos {
    private Nodo cabeza;

    public ListaContactos() {
        cabeza = null;
    }

    // Agregar contacto al final
    public void agregarContacto(String nombre, String telefono, String correo) {
        Nodo nuevo = new Nodo(nombre, telefono, correo);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
        System.out.println("Contacto agregado: " + nombre);
    }

    // Buscar contacto por nombre
    public void buscarContacto(String nombre) {
        Nodo temp = cabeza;
        boolean encontrado = false;

        while (temp != null) {
            if (temp.nombre.equalsIgnoreCase(nombre)) {
                System.out.println("📞 Nombre: " + temp.nombre);
                System.out.println("📱 Teléfono: " + temp.telefono);
                System.out.println("📧 Correo: " + temp.correo);
                encontrado = true;
                break;
            }
            temp = temp.siguiente;
        }

        if (!encontrado) {
            System.out.println("❌ Contacto no encontrado.");
        }
    }

    // Eliminar contacto por nombre
    public void eliminarContacto(String nombre) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (cabeza.nombre.equalsIgnoreCase(nombre)) {
            cabeza = cabeza.siguiente;
            System.out.println("Contacto eliminado: " + nombre);
            return;
        }

        Nodo temp = cabeza;
        while (temp.siguiente != null && 
               !temp.siguiente.nombre.equalsIgnoreCase(nombre)) {
            temp = temp.siguiente;
        }

        if (temp.siguiente != null) {
            temp.siguiente = temp.siguiente.siguiente;
            System.out.println("Contacto eliminado: " + nombre);
        } else {
            System.out.println("❌ Contacto no encontrado.");
        }
    }

    // Mostrar todos los contactos
    public void mostrarContactos() {
        if (cabeza == null) {
            System.out.println("📂 No hay contactos registrados.");
            return;
        }

        Nodo temp = cabeza;
        System.out.println("📒 Lista de Contactos:");
        while (temp != null) {
            System.out.println("- " + temp.nombre + " | " + temp.telefono + " | " + temp.correo);
            temp = temp.siguiente;
        }
    }
}