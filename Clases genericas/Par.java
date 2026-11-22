public class Par<K, V> {
    private K clave;
    private V valor;

    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave() {
        return clave;
    }

    public V getValor() {
        return valor;
    }

    public static void main(String[] args) {
        Par<Integer, String> alumno = new Par<>(202601, "Carlos Ruiz");
        System.out.println("Cuenta: " + alumno.getClave() + " | Nombre: " + alumno.getValor());

        Par<String, Double> producto = new Par<>("Teclado Mecanico", 850.50);
        System.out.println("Producto: " + producto.getClave() + " | Precio: $" + producto.getValor());
    }
}