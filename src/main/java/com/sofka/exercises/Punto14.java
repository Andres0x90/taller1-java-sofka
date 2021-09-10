package com.sofka.exercises;

import java.util.Scanner;

public class Punto14
{
    public static void recorrer(int inicio)
    {
        for(int i = inicio; i<=1000; i+=2)
            System.out.print(i + ", ");

        System.out.print("\n");
    }

    public static void crearInterfaz(Scanner input)
    {
        System.out.print("Ingrese un numero inicial para empezar el recorrido: ");
        int inicio = input.nextInt();
        recorrer(inicio);
    }
}
