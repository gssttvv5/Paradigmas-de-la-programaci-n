import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterator {
    public static void main(String[] args) {
        // 1. Crear el ArrayList y agregar elementos
        ArrayList<String> materias = new ArrayList<>();
        materias.add("Calculo");
        materias.add("Paradigmas");
        materias.add("Ingles");
        materias.add("Base de Datos");

        // 2. Obtener el Iterator de la colección
        Iterator<String> it = materias.iterator();

        // 3. Recorrer y eliminar un elemento de forma segura con it.remove()
        while (it.hasNext()) {
            String materia = it.next();
            if (materia.equals("Ingles")) {
                it.remove(); // Evita ConcurrentModificationException
            }
        }

        // 4. Verificar los elementos restantes
        System.out.println("Materias restantes: " + materias);
    }
}   