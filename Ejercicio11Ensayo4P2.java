package com.mycompany.main11;

/**
*
* @author Espinoza Jiménez Ana María
*/

public class Main11 {

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 13;

        if (esPar(num1)) {
            System.out.println(num1 + " es un número par.");
        } else {
            System.out.println(num1 + " es un número impar.");
        }

        if (esPar(num2)) {
            System.out.println(num2 + " es un número par.");
        } else {
            System.out.println(num2 + " es un número impar.");
        }
    }
}