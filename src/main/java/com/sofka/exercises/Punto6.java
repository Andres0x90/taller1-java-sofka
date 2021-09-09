package com.sofka.exercises;

public class Punto6
{
    public static void mostrarPares()
    {
        System.out.print("Numeros pares: ");
        for  (int i = 1; i<=100; i++)
        {
            if(i%2 == 0)
                System.out.print(i + ", ");
        }
        System.out.print("\n");
    }
    public static void mostrarImpares()
    {
        System.out.print("Numeros impares: ");

        for  (int i = 1; i<=100; i++)
        {
            if(i%2 != 0)
                System.out.print(i + ", ");
        }
        System.out.print("\n");
    }
    public static void crearInterfaz()
    {
        System.out.println("Numero pares e impares del 1 al 100");
        mostrarPares();
        mostrarImpares();
    }
}
