package com.sofka.exercises;

import java.util.Scanner;

public class Punto2
{
    public static void compararNumeros(int num1, int num2)
    {
        if (num1 > num2)
            System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
        else if(num1 == num2)
            System.out.println("Ambos numeros son iguales");
        else
            System.out.println("El numero " + num1 + " es menor que el numero " + num2);
    }

    public static void crearInterfaz(Scanner input)
    {
        int num1, num2;

        System.out.print("Ingrese un numero entero: ");
        num1 = input.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        num2 = input.nextInt();

        compararNumeros(num1, num2);
    }
}
