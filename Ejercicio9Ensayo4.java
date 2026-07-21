/**
*
* @author Espinoza Jiménez Ana María
*/

public class Main {

    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        double promedio = calcularPromedio(8.5, 7.0, 6.5);
        System.out.println("El promedio es: " + promedio);

        if (promedio >= 7) {
            System.out.println("El estudiante aprobó.");
        } else {
            System.out.println("El estudiante reprobó.");
        }
    }
}