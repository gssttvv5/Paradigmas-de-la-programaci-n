import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejemplo {

    public void procesarArchivo(String archivo) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(archivo);
            System.out.println("Abriendo y procesando el archivo...");
            // ... procesar ...
        } catch (FileNotFoundException e) {
            System.out.println("No encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error I/O: " + e.getMessage());
        } finally {
            // SIEMPRE se ejecuta - limpiar recursos
            System.out.println("Ejecutando finally: cerrando recursos si es necesario.");
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        Ejemplo ejemplo = new Ejemplo();
        ejemplo.procesarArchivo("archivo_que_no_existe.txt");
    }
}