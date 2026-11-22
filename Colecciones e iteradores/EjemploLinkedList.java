import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        // 1. Crear una lista doblemente enlazada
        LinkedList<String> tareas = new LinkedList<>();

        // 2. Agregar elementos de forma normal
        tareas.add("Cocinar");
        tareas.add("Estudiar");

        // 3. Ventaja: Métodos rápidos para los extremos
        tareas.addFirst("Despertar (Primero)"); // Inserta al inicio en O(1)
        tareas.addLast("Dormir (Último)");      // Inserta al final en O(1)

        // 4. Obtener elementos (es más lento que en un ArrayList)
        System.out.println("Primera tarea: " + tareas.getFirst());

        // 5. Eliminar elementos de los extremos
        tareas.removeFirst();
        tareas.removeLast();

        // 6. Recorrer la lista
        System.out.println("\nTareas restantes:");
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }
    }
}