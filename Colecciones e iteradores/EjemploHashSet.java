import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
        // 1. Crear el HashSet
        HashSet<String> usuarios = new HashSet<>();

        // 2. Agregar elementos
        usuarios.add("Alejandro");
        usuarios.add("Maria");
        usuarios.add("Carlos");

        // 3. Intentar agregar un duplicado (Será ignorado)
        boolean seAgrego = usuarios.add("Maria");
        System.out.println("¿Se pudo agregar 'Maria' otra vez?: " + seAgrego); // Imprime: false

        // 4. Verificar si un elemento existe (Búsqueda ultrarrápida O(1))
        if (usuarios.contains("Carlos")) {
            System.out.println("Carlos está registrado.");
        }

        // 5. Eliminar un elemento
        usuarios.remove("Alejandro");

        // 6. Recorrer el conjunto (Notarás que el orden de salida no es el de inserción)
        System.out.println("\nUsuarios registrados actuales:");
        for (String usuario : usuarios) {
            System.out.println("- " + usuario);
        }
    }
}