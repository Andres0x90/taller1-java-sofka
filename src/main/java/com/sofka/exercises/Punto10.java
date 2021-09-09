package com.sofka.exercises;

import java.util.Scanner;

public class Punto10
{
    public static String eliminarEspacios(String frase)
    {
        return frase.replace(" ", "");
    }

    public static void crearInterfaz(Scanner input)
    {
        System.out.print("Ingrese una frase: ");
        input.nextLine();
        String frase = input.nextLine();
        System.out.println("Frase modificada: " + eliminarEspacios(frase));
    }
}
