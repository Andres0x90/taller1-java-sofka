package com.sofka.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Punto8
{
    public static boolean esDiaLaboral(String dia) throws Exception
    {
        switch (dia.toLowerCase())
        {
            case "lunes":
            case  "martes":
            case  "miercoles":
            case  "jueves":
            case  "viernes":
                return true;
            case "sabado":
            case "domingo":
                return false;
            default:
                throw new Exception();
        }


    }

    public static void crearInterfaz(Scanner input)
    {
        System.out.print("Ingrese un dia de la semana: ");
        input.nextLine();
        String dia = input.nextLine();

        try {
            if (esDiaLaboral(dia))
                System.out.println("Es un dia laboral");
            else
                System.out.println("No es un dia laboral");
        } catch (Exception e) {
            System.out.println("Error! Ingrese un dia de la semana valido");
        }
    }
}
