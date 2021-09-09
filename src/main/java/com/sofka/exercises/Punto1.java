package com.sofka.exercises;

public class Punto1
{
    public static void comprobarMayor(int num1, int num2)
    {
        if (num1 > num2)
            System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
        else if(num1 == num2)
            System.out.println("Ambos numeros son iguales");
        else
            System.out.println("El numero " + num2 + " es mayor que el numero " + num1);    }
}
