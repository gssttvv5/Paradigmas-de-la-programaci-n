public class ManejoExcepciones {

    // Función que puede generar una excepción (dividir por cero)
    public static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }

    public static void main(String[] args) {
        System.out.println("Iniciando la calculadora...");

        // Un bloque 'try' que llama a la función
        try {
            int resultado = dividir(50, 0); // Esto generará una ArithmeticException
            System.out.println("El resultado de la división es: " + resultado);
        } 
        // Un bloque 'catch' que maneja la excepción e imprime un mensaje fácil de usar
        catch (ArithmeticException e) {
            System.out.println("Error: No es posible realizar una división por cero. Verifica el denominador ingresado.");
        } 
        // Un bloque 'finally' para ejecutar el código que debe ejecutarse independientemente de si se produjo una excepción
        finally {
            System.out.println("Operación matemática finalizada (Bloque finally ejecutado).");
        }

        System.out.println("El programa continúa su ejecución normalmente sin bloquearse.");
    }
}