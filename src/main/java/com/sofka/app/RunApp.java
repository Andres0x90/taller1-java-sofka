package com.sofka.app;

import com.sofka.exercises.*;
import com.sofka.exercises.punto16.Punto16;

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
                    case 5:
                        Punto5.crearInterfaz();
                        break;
                    case 6:
                        Punto6.crearInterfaz();
                        break;
                    case 7:
                        Punto7.crearInterfaz(input);
                        break;
                    case 8:
                        Punto8.crearInterfaz(input);
                        break;
                    case 9:
                        Punto9.crearInterfaz(input);
                        break;
                    case 10:
                        Punto10.crearInterfaz(input);
                        break;
                    case 11:
                        Punto11.crearInterfaz(input);
                        break;
                    case 12:
                        Punto12.crearInterfaz(input);
                        break;
                    case 13:
                        Punto13.crearInterfaz();
                        break;
                    case 14:
                        Punto14.crearInterfaz(input);
                        break;
                    case 15:
                        Punto15.crearInterfaz(input);
                        break;
                    case 16:
                        Punto16.crearInterfaz(input);
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
