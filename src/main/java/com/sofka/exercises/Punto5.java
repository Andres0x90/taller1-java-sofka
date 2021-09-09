package com.sofka.exercises;

public class Punto5
{
    public static void mostrarPares()
    {
        int i=1;
        System.out.print("Numeros pares: ");
        while (i<=100)
        {
            if(i%2 == 0)
                System.out.print(i + ", ");
            i++;
        }
        System.out.print("\n");
    }
    public static void mostrarImpares()
    {
        int i=1;
        System.out.print("Numeros impares: ");
        while (i<=100)
        {
            if(i%2 != 0)
                System.out.print(i + ", ");
            i++;
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
