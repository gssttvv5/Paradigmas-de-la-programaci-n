public class Ejemplo1 {
    public static void main(String[] args) {
        /*
         * try { // Código que PODRÍA lanzar excepción
         *
         * } catch (TipoExcepcion e) { // Manejo si ocurre
         *
         * } finally { // SIEMPRE se ejecuta
         *
         * }
         *
         * try {
         * FileInputStream fis = new FileInputStream("archivo.txt");
         * } catch (FileNotFoundException e) {
         * System.out.println("Archivo no existe: " + e.getMessage());
         * } catch (IOException e) {
         * System.out.println("Error de lectura: " + e.getMessage());
         * } catch (Exception e) {
         * System.out.println("Error: " + e.getMessage());
         * }
         */
        double saldo = 1000.0;
        int meses = 0;
        CuentaBancaria cuenta = new CuentaBancaria();
        double interes = cuenta.calcularInteres(saldo, meses);
        System.out.println("Interés: " + interes);
    }
}
class CuentaBancaria {
    public double calcularInteres(double saldo, int meses) {
        try {
            if (meses == 0)
                throw new ArithmeticException("Meses != 0");
            double interes = saldo * 0.05 / 12 * meses;
            return interes;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return 0.0;
        }
    }
}
public void procesarArchivo(String archivo) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(archivo);
            // ... procesar ...
        } catch (FileNotFoundException e) {
            System.out.println("No encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error I/O: " + e.getMessage());
        } finally {
            // SIEMPRE se ejecuta - limpiar recursos
            if (fis != null)
                try {
                    fis.close();
                } catch (IOException e) {
                }
        }
    }
    class SaldoInsuficienteException extends Exception {
    private double saldoRequerido;
    private double saldoDisponible;

    public SaldoInsuficienteException(
            double requerido, double disponible) {
        super("Requiere: $" + requerido +
              ", Disponible: $" + disponible);

        this.saldoRequerido = requerido;
        this.saldoDisponible = disponible;
    }

    public double getSaldoRequerido() {
        return saldoRequerido;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }
}