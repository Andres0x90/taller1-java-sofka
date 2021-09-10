package com.sofka.exercises;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Punto11
{
    public static int getLength(String frase)
    {
        return frase.length();
    }
    public static void contarVocal(char caracter, int[] vocales)
    {
        switch (caracter)
        {
            case 'a':
                vocales[0] += 1;
                break;
            case 'e':
                vocales[1] += 1;
                break;
            case 'i':
                vocales[2] += 1;
                break;
            case 'o':
                vocales[3] += 1;
                break;
            case 'u':
                vocales[4] += 1;
                break;
        }
    }
    public static int[] getTotalVocales(String frase)
    {
        int[] vocales = new int[5];

        for (int i=0; i< getLength(frase); i++)
            contarVocal(frase.toLowerCase().charAt(i), vocales);

        return vocales;
    }

    public static void crearInterfaz(Scanner input)
    {
        System.out.print("Ingrese una frase: ");
        input.nextLine();
        String frase = input.nextLine();
        int[] vocales = getTotalVocales(frase);
        String vocalesString = "aeiou";

        System.out.println("Tamaño de la frase: " + getLength(frase));
        for (int i=0; i< vocales.length; i++)
            System.out.println("Vocales " + vocalesString.charAt(i)
            + ": " + vocales[i]);
    }
}