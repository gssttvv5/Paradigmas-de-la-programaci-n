public class EjemPolimorfismo {
    public static void main(String[] args) {
        Triangulo fig = new Triangulo();
        Cuadro fig2 = new Cuadro();
        Circulo fig3 = new Circulo();

        fig.dibujar();
        fig2.dibujar();
        fig3.dibujar();

        Figura [] figus = new Figura[3];
        figus[0] = new Circulo();
        figus[1] = new Cuadro();
        figus[2] = new Triangulo();

        for (Figura f: figus){
            f.dibujar();
        }
    }
}

class Figura {
    public void dibujar(){
        System.out.println("Dibujando figura");
    }
}

class Circulo extends Figura {
    @Override
    public void dibujar(){
        System.out.println("Dibujando triangulo");
    }
}

class Triangulo extends Figura {
    @Override
    public void dibujar(){
        System.out.println("Dibujando un triangulo");
    }
}

class Cuadro extends Figura {
    @Override
    public void dibujar(){
        System.out.println("Dibujando un triangulo");
    }
}



