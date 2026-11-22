
// 1. EL MODELO (Datos y Reglas de Negocio)

// No tiene idea de cómo se va a imprimir o mostrar esta información.
class Estudiante {
    private String nombre;
    private String matricula;

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public String getNombre() { return nombre; }
    
    public void setNombre(String nombre) {
        // Aquí irían las reglas de negocio (ej. validar que no esté vacío)
        this.nombre = nombre;
    }

    public String getMatricula() { return matricula; }
}


// 2. LA VISTA (Interfaz de Usuario)

// Solo sabe cómo "dibujar" los datos en la pantalla. No procesa lógica.
class VistaEstudiante {
    public void mostrarDetalles(String nombre, String matricula) {
        System.out.println("--- Interfaz de Usuario ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("---------------------------\n");
    }

    public void mostrarAlerta(String mensaje) {
        System.out.println("[ALERTA VISUAL] " + mensaje);
    }
}


// 3. EL CONTROLADOR (El Intermediario)

// Conecta la Vista y el Modelo. Recibe las acciones y decide qué hacer.
class ControladorEstudiante {
    private Estudiante modelo;
    private VistaEstudiante vista;

    public ControladorEstudiante(Estudiante modelo, VistaEstudiante vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    // Método que simula "escuchar" el clic de un botón en la interfaz
    public void eventoBotonActualizarNombre(String nuevoNombre) {
        // 1. El Controlador le da la orden al Modelo de actualizar los datos
        modelo.setNombre(nuevoNombre);
        
        // 2. El Controlador le ordena a la Vista mostrar un mensaje de éxito
        vista.mostrarAlerta("Nombre guardado correctamente en el sistema.");
    }

    // Método para dibujar la pantalla inicial pidiendo los datos al Modelo
    public void refrescarPantalla() {
        vista.mostrarDetalles(modelo.getNombre(), modelo.getMatricula());
    }
}


// EJECUCIÓN (Simulación del programa)

public class MainMVC {
    public static void main(String[] args) {
        // 1. Instanciamos los componentes
        Estudiante modelo = new Estudiante("Juan Pérez", "20261015");
        VistaEstudiante vista = new VistaEstudiante();
        
        // 2. Ensamblamos el MVC pasando el modelo y la vista al controlador
        ControladorEstudiante controlador = new ControladorEstudiante(modelo, vista);

        // 3. Mostramos la pantalla inicial
        controlador.refrescarPantalla();


        // SIMULACIÓN DE LA ACCIÓN DEL USUARIO
        System.out.println("-> El usuario escribe 'Carlos López' y hace clic en 'Actualizar'...");
        
        // La vista delega la acción al controlador
        controlador.eventoBotonActualizarNombre("Carlos López");
        
        System.out.println("\n-> El sistema refresca la pantalla...");
        controlador.refrescarPantalla();
    }
}