package com.mycompany.main10;

/**
*
* @author Espinoza Jiménez Ana María
*/

public class Main10 {

    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int resultado1 = mayor(10, 5);
        System.out.println("El número mayor es: " + resultado1);

        int resultado2 = mayor(7, 12);
        System.out.println("El número mayor es: " + resultado2);
    }
}