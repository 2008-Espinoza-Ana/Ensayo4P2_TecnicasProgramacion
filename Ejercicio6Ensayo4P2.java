package com.mycompany.main6;

/**
*
* @author Espinoza Jiménez Ana María
*/

import java.util.Random;

public class Main6 {
public static int obtenerNumero() { Random rand = new Random(); return rand.nextInt(100) + 1;
}

public static void main(String[] args) { int numero = obtenerNumero();
System.out.println("Numero aleatorio: " + numero);
}
}
