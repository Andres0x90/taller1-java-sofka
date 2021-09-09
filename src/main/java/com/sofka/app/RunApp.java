package com.sofka.app;

import com.sofka.exercises.Punto1;
import com.sofka.exercises.Punto2;
import com.sofka.exercises.Punto3;
import com.sofka.exercises.Punto4;

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
                    case 1:
                        Punto1.comprobarMayor(7,10);
                        break;
                    case 2:
                        Punto2.crearInterfaz(input);
                        break;
                    case 3:
                        Punto3.crearInterfaz(input);
                        break;
                    case 4:
                        Punto4.crearInterfaz(input);
                        break;
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
