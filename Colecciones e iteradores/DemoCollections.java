import java.util.*;

public class DemoCollections {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Toluca"); lista.add("Atlacomulco"); lista.add("Toluca");

        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(722); conjunto.add(712); conjunto.add(722);

        Map<String, Integer> prefijos = new HashMap<>();
        prefijos.put("Toluca", 722); prefijos.put("Atlacomulco", 712);

        System.out.println("--- Navegacion Estricta por Iterator ---");
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            String ciudad = it.next();
            System.out.println("Campus Universitario UAEMex: " + ciudad);
        }
    }
}
