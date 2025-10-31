package ejercicio_listas;

public class Nodo {
    String nombre;
    String telefono;
    String correo;
    Nodo siguiente;

    public Nodo(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.siguiente = null;
    }
}
