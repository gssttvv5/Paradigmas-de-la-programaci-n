public class Main {
    public static void main(String[] args) {
       DAO<Estudiante> estudianteDAO = new EstudianteDAOMySQL();

        Estudiante nuevoEstudiante = new Estudiante(25252039, "Gustavo Romero Martinez");
        estudianteDAO.guardar(nuevoEstudiante);
    
        for (Estudiante e : estudianteDAO.obtenerTodos()) {
            System.out.println("ID: " + e.getId() + " | Nombre: " + e.getNombre());
        }
    }
}