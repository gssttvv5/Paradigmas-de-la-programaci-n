public class Calculadora {

    public int sumar(int a, int b){
        return a + b;
    }

    public int sumar(int a, int b, int c){
        return a+ b + c;
    }

    public double sumar(double a, double b){
        return a + b;
    }

    public static void main(String[] args){
        Calculadora cal = new Calculadora();

        System.out.println("Suma de enteros: " + cal.sumar(5,10));
        System.out.println("Sumar tres enteros: " + cal.sumar(5, 07, 5));
        System.out.println("Suma de float: " + cal.sumar(3.5, 2.8));
    }
}