public class Main {
    public static void main(String[] args) {
       DAO<Estudiante> estudianteDAO = new EstudianteDAOMySQL();

        Estudiante nuevoEstudiante = new Estudiante(25252039, "Gustavo Romero Martinez");
        estudianteDAO.guardar(nuevoEstudiante);

        Estudiante nuevoEstudiante2 = new Estudiante(25252040, "Juan Perez");
        estudianteDAO.guardar(nuevoEstudiante2);

        Estudiante nuevoEstudiante3 = new Estudiante(25252041, "Maria Lopez");
        estudianteDAO.guardar(nuevoEstudiante3);
    
        for (Estudiante e : estudianteDAO.obtenerTodos()) {
            System.out.println("ID: " + e.getId() + " | Nombre: " + e.getNombre());
        }
    }
}