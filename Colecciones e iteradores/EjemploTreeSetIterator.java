import java.util.Iterator;
import java.util.TreeSet;

public class EjemploTreeSetIterator {
    public static void main(String[] args) {
        // 1. Crear el TreeSet (ordena automáticamente y no acepta duplicados)
        TreeSet<Integer> calificaciones = new TreeSet<>();

        // 2. Agregar elementos en desorden
        calificaciones.add(85);
        calificaciones.add(100);
        calificaciones.add(70);
        calificaciones.add(85); // Duplicado, será ignorado

        // 3. Consultar el menor y el mayor elemento
        System.out.println("Calificacion mas baja: " + calificaciones.first());
        System.out.println("Calificacion mas alta: " + calificaciones.last());

        // 4. Recorrer el conjunto ordenado usando Iterator
        System.out.println("\nCalificaciones ordenadas:");
        Iterator<Integer> it = calificaciones.iterator();
        while (it.hasNext()) {
            System.out.println("- " + it.next());
        }
    }
}