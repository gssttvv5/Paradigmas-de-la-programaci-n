import java.util.ArrayList; // Importación obligatoria

public class EjemploArrayList {
    public static void main(String[] args) {
        // 1. Crear el ArrayList (usamos el operador diamante <> vacío a partir de Java 7)
        ArrayList<String> lenguajes = new ArrayList<>();

        // 2. Agregar elementos
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("C++");

        // 3. Modificar un elemento (Cambiar Python por Kotlin en el índice 1)
        lenguajes.set(1, "Kotlin");

        // 4. Obtener un elemento
        System.out.println("El primer lenguaje es: " + lenguajes.get(0)); // Imprime Java

        // 5. Eliminar un elemento (por índice o por coincidencia)
        lenguajes.remove("C++");

        // 6. Recorrer la lista y verificar el tamaño actual
        System.out.println("Tamaño de la lista: " + lenguajes.size());

        for (String lenguaje : lenguajes) {
            System.out.println("- " + lenguaje);
        }
    }
}