package semana3;

public class Usuario {
    private String nombre;
    private static int total = 0;

    public Usuario(String nombre) {
        this.nombre = nombre;
        total++;
    }

    public static int getTotal() {
        return total;
    }

    public static void main(String[] args) {
        new Usuario("Juan");
        new Usuario("Pedro");
        new Usuario("María");
        System.out.println("Total de usuarios: " + Usuario.getTotal());
    }
}