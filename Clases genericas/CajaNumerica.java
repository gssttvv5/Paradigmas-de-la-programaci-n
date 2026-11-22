public class CajaNumerica<T extends Number> {
    private T numero;

    public void setNumero(T numero) {
        this.numero = numero;
    }

    public T getNumero() {
        return numero;
    }

    public double calcularDoble() {
        return numero.doubleValue() * 2;
    }

    public static void main(String[] args) {
        CajaNumerica<Integer> cajaEntero = new CajaNumerica<>();
        cajaEntero.setNumero(25);
        System.out.println("Entero: " + cajaEntero.getNumero() + " | Doble: " + cajaEntero.calcularDoble());

        CajaNumerica<Double> cajaDecimal = new CajaNumerica<>();
        cajaDecimal.setNumero(9.5);
        System.out.println("Decimal: " + cajaDecimal.getNumero() + " | Doble: " + cajaDecimal.calcularDoble());
    }
}