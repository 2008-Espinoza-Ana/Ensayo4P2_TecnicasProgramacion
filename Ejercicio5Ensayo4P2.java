/**
*
* @author Espinoza Jiménez Ana María
*/

public class Main {

    public static void operaciones(double a, double b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));

        if (b != 0) {
            System.out.println("División: " + (a / b));
        } else {
            System.out.println("División: No se puede dividir entre cero");
        }
    }

    public static void main(String[] args) {
        operaciones(10, 5);
        operaciones(7, 0);
    }
}