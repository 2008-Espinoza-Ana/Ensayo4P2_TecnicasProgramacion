/**
*
* @author Espinoza Jiménez Ana María
*/

public class Main {

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        double area1 = calcularArea(10, 5);
        System.out.println("El área del rectángulo es: " + area1);

        double area2 = calcularArea(7.5, 3.2);
        System.out.println("El área del rectángulo es: " + area2);
    }
}