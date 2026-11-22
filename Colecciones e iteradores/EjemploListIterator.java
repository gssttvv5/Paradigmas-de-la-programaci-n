import java.util.LinkedList;
import java.util.ListIterator;

public class EjemploListIterator {
    public static void main(String[] args) {
        // 1. Crear la lista y agregar elementos
        LinkedList<String> pasos = new LinkedList<>();
        pasos.add("Paso 1: Analizar");
        pasos.add("Paso 2: Disenar");
        pasos.add("Paso 3: Programar");

        // 2. Obtener el ListIterator
        ListIterator<String> it = pasos.listIterator();

        // 3. Recorrer hacia adelante con next()
        System.out.println("--- Hacia adelante ---");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 4. Recorrer hacia atrás con previous()
        System.out.println("\n--- Hacia atras ---");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
