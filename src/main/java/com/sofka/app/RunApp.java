package com.sofka.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunApp
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        int opcion;
        do
        {
            System.out.print("Ingrese el numero del ejercicio que desea ejecutar: ");
            try
            {
                opcion = input.nextInt();

                switch (opcion)
                {
                    default:
                        System.out.println("Ejercicio no encontrado en la lista");
                        break;
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Ingrese un numero valido");
                input.nextLine();
                opcion = -1;
            }

        }while(opcion != 0);

    }
}
