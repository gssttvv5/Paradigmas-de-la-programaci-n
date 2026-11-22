import java.util.ArrayList;

public class Contenedor<T> {
    private ArrayList<T> elementos = new ArrayList<>();

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public void mostrarTodos() {
        for (T e : elementos) {
            System.out.println("- " + e);
        }
    }

    public static void main(String[] args) {
        Contenedor<String> materias = new Contenedor<>();
        materias.agregar("Paradigmas 1");
        materias.agregar("Base de Datos");
        System.out.println("Materias:");
        materias.mostrarTodos();

        Contenedor<Double> calificaciones = new Contenedor<>();
        calificaciones.agregar(9.5);
        calificaciones.agregar(10.0);
        System.out.println("\nCalificaciones:");
        calificaciones.mostrarTodos();
    }
}