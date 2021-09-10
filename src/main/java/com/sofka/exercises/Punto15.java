package com.sofka.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Punto15
{
    public static void crearMenu()
    {
        System.out.print("****** GESTION CINEMATOGRAFICA ********\n"
        + "1-NUEVO ACTOR\n"
        + "2-BUSCAR ACTOR\n"
        + "3-ELIMINAR ACTOR\n"
        + "4-MODIFICAR ACTOR\n"
        + "5-VER TODOS LOS ACTORES\n"
        + "6- VER PELICULAS DE LOS ACTORES\n"
        + "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n"
        + "8-SALIR\n");
    }

    public static void crearInterfaz(Scanner input)
    {
        int opcion = 1;

        do
        {
            crearMenu();
            if (opcion > 8 || opcion < 1)
                System.out.println(" OPCION INCORRECTO");

            System.out.print("Ingrese su opcion: ");
            try
            {
                opcion = input.nextInt();
            }
            catch(InputMismatchException e)
            {
                input.nextLine();
                opcion = -1;
            }

        }while(opcion != 8);
    }
}
