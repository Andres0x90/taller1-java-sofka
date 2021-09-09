package com.sofka.exercises;

import java.util.Scanner;

public class Punto3
{
    public static Double calcularArea(Double radio)
    {
        return Math.PI *  Math.pow(radio,2);
    }

    public static  void crearInterfaz(Scanner input)
    {
        System.out.print("Ingrese el radio del circulo: ");
        Double radio = input.nextDouble();
        System.out.println("El area del circulo es: " + calcularArea(radio));
    }
}
