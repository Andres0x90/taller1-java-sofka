package com.sofka.exercises;

import java.util.Scanner;

public class Punto4
{
    public static final double IVA = 1.21;

    public static Double calcularPrecioTotal(Double precio)
    {
        return precio * IVA;
    }

    public static void crearInterfaz(Scanner input)
    {
        System.out.print("Ingrese el precio del producto: ");
        Double precio = input.nextDouble();
        System.out.println("Caculando precio + IVA ...");
        System.out.println("Su precio total es: " + calcularPrecioTotal(precio));
    }
}
