package com.sofka.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Punto7
{
    public static boolean comprobar(int num)
    {
        return num >= 0;
    }

    public static void crearInterfaz(Scanner input)
    {
        int num;
        do
        {
            try
            {
                System.out.print("Ingrese un numero entero mayor o igual a cero: ");
                num = input.nextInt();
            }catch (InputMismatchException e)
            {
                input.nextLine();
                System.out.println("Ingrese un numero entero valido para este ejercicio");
                num = -1;
            }


        }while(!comprobar(num));
        System.out.println("Numero ingresado: " + num);
    }
}
