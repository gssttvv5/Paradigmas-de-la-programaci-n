import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EjemploMapas {
    public static void main(String[] args) {
        
        // ----------------------------------------------------------------------
        // 1. HASHMAP: Prioriza la velocidad absoluta. No tiene orden.
        // ----------------------------------------------------------------------
        Map<Integer, String> productosHash = new HashMap<>();
        productosHash.put(301, "Laptop");
        productosHash.put(105, "Teclado");
        productosHash.put(202, "Monitor");
        
        System.out.println("--- HASHMAP (Orden impredecible) ---");
        for (Map.Entry<Integer, String> entrada : productosHash.entrySet()) {
            System.out.println("Código: " + entrada.getKey() + " | Producto: " + entrada.getValue());
        }
        
        // ----------------------------------------------------------------------
        // 2. TREEMAP: Ordena automáticamente por la llave (menor a mayor).
        // ----------------------------------------------------------------------
        Map<Integer, String> productosTree = new TreeMap<>();
        productosTree.put(301, "Laptop");
        productosTree.put(105, "Teclado");
        productosTree.put(202, "Monitor");
        
        System.out.println("\n--- TREEMAP (Ordenado por llave) ---");
        for (Map.Entry<Integer, String> entrada : productosTree.entrySet()) {
            System.out.println("Código: " + entrada.getKey() + " | Producto: " + entrada.getValue());
        }
        
        // 3. Obtener un valor específico (O(1) en HashMap, O(log n) en TreeMap)
        System.out.println("\nBúsqueda en HashMap: El código 105 es " + productosHash.get(105));
    }
}