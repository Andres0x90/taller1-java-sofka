package com.sofka.exercises.punto17;

import java.util.ArrayList;
import java.util.List;

public class Punto17
{
    public static void crearInterfaz()
    {
        List<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();

        electrodomesticos.add(new Televisor(100, "Amarillo", 'B', 50,
                21, false));
        electrodomesticos.add(new Lavadora(100, 135));
        electrodomesticos.add(new Televisor(100, "Negro", 'E',
                32, 45, true));
        electrodomesticos.add(new Televisor(100, "rojo", 'C',
                22, 41, false));
        electrodomesticos.add(new Lavadora(100, 145));
        electrodomesticos.add(new Televisor(100, "amarillo", 'A',
                12, 24, true));
        electrodomesticos.add(new Lavadora(100, "negro", 'F', 110, 48));
        electrodomesticos.add(new Televisor(100, "gris", 'A',
                25, 80, false));
        electrodomesticos.add(new Lavadora(100, "gris", 'B', 120, 35));
        electrodomesticos.add(new Lavadora(100, "negro", 'A', 110, 125));

        double precioTelevisores = 0;
        double precioLavadoras= 0;
        double precioTotal = 0;
        for (int i = 0; i < electrodomesticos.size(); i++){
            if (electrodomesticos.get(i) instanceof Televisor)
                precioTelevisores += electrodomesticos.get(i).precioFinal();
            else if (electrodomesticos.get(i) instanceof  Lavadora)
                precioLavadoras += electrodomesticos.get(i).precioFinal();

            precioTotal += electrodomesticos.get(i).precioFinal();
        }

        System.out.println("El precio total de los televisores es: $" + precioTelevisores);
        System.out.println("El precio total de las lavadoras es: $" + precioLavadoras);
        System.out.println("El precio total de los electrodomesticos es: $" + precioTotal);
    }
}
