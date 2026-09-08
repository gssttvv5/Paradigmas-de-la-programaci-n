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