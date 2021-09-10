package com.sofka.exercises;

import java.util.Scanner;

public class Punto12
{
    public static void comparar(String cadena1, String cadena2)
    {
        String diff_cadena1 = "";
        String diff_cadena2 = "";

        if (!cadena1.equalsIgnoreCase(cadena2))
        {
            for(int i=0; i<cadena1.length(); i++)
            {
                try
                {
                    if(cadena1.charAt(i) != cadena2.charAt(i))
                        diff_cadena1 = diff_cadena1.concat(Character.toString(cadena1.charAt(i)));
                }catch (IndexOutOfBoundsException e)
                {
                    diff_cadena1 = diff_cadena1.concat(Character.toString(cadena1.charAt(i)));
                }

            }

            for(int i=0; i<cadena2.length(); i++)
            {
                try
                {
                    if(cadena2.charAt(i) != cadena1.charAt(i))
                        diff_cadena2 = diff_cadena2.concat(Character.toString(cadena2.charAt(i)));
                }catch (IndexOutOfBoundsException e)
                {
                    diff_cadena2 = diff_cadena2.concat(Character.toString(cadena2.charAt(i)));
                }
            }
            System.out.println("Diferencias");
            System.out.println("Diferencia palabra 1: "+diff_cadena1);
            System.out.println("Diferencia palabra 2: " +diff_cadena2);
            return;
        }
        System.out.println("Ambas palabras son iguales");
    }
    public static void crearInterfaz(Scanner input)
    {
        System.out.print("Ingrese una palabra: ");
        input.nextLine();
        String palabra1 = input.nextLine();
        System.out.print("Ingrese una palabra: ");
        String palabra2 = input.nextLine();

        comparar(palabra1, palabra2);
    }
}
