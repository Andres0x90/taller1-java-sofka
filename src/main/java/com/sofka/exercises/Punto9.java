package com.sofka.exercises;

import java.util.Scanner;

public class Punto9
{
    public static final String fraseOriginal = "La sonrisa sera la mejor arma contra la tristeza";

    public static String remplazarFrase()
    {
        return fraseOriginal.replace('a', 'e');
    }
    public static String adicionarFrase(String fraseModificada,String nuevaFrase)
    {
        return fraseModificada.concat(" ").concat(nuevaFrase);
    }
    public static void crearInterfaz(Scanner input)
    {
        System.out.println("Frase original: " + fraseOriginal);
        System.out.println("Frase modificada: " + remplazarFrase());
        System.out.print("Ingrese una nueva frase a adicionar: ");
        input.nextLine();
        String nuevaFrase = input.nextLine();
        System.out.println("Frase completa: " + adicionarFrase(remplazarFrase(),nuevaFrase));
    }
}
