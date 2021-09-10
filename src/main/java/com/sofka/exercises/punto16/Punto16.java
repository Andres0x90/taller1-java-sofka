package com.sofka.exercises.punto16;

import java.util.Locale;
import java.util.Scanner;

public class Punto16
{
    public static void comprobarTipoPeso(Persona persona)
    {
        if (persona.calcularIMC() == Persona.DELGADEZ)
            System.out.println("Esta persona esta por debajo de su peso ideal");
        else if (persona.calcularIMC() == Persona.PESO_IDEAL)
            System.out.println("Esta persona esta en su peso ideal");
        else if (persona.calcularIMC() == Persona.OBESIDAD)
            System.out.println("Esta persona tiene sobrepeso");
        else
            System.out.println("Por favor ingrese un peso y una altura valida");
    }
    public static void comprobarMayorDeEdad(Persona persona)
    {
        if (persona.esMayorDeEdad())
            System.out.println("Esta persona es mayor de edad");
        else
            System.out.println("Esta persona no es mayor de edad");
    }
    public static void crearPersona1(Scanner input)
    {
        String nombre;
        int edad;
        char sexo;
        float peso, altura;

        input.nextLine();
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        System.out.print("Ingrese su sexo(H o M): ");
        input.nextLine();
        sexo = input.nextLine().toUpperCase().charAt(0);
        System.out.print("Ingrese su peso en kilogramos: ");
        peso = input.nextFloat();
        System.out.print("Ingrese su altura en metros: ");
        altura = input.nextFloat();

        Persona persona = new Persona(nombre, sexo, edad, peso, altura);
        comprobarTipoPeso(persona);
        comprobarMayorDeEdad(persona);
        System.out.println(persona.toString());
    }
    public static void crearPersona2(Scanner input)
    {
        String nombre;
        int edad;
        char sexo;

        input.nextLine();
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        System.out.print("Ingrese su sexo(H o M): ");
        input.nextLine();
        sexo = input.nextLine().toUpperCase().charAt(0);

        Persona persona = new Persona(nombre, sexo, edad);
        comprobarTipoPeso(persona);
        comprobarMayorDeEdad(persona);
        System.out.println(persona.toString());
    }

    public static void crearPersona3(Scanner input)
    {
        Persona persona = new Persona();

        System.out.print("Ingrese su nombre: ");
        persona.setNombre(input.nextLine());
        System.out.print("Ingrese su edad: ");
        persona.setEdad(input.nextInt());
        System.out.print("Ingrese su sexo(H o M): ");
        input.nextLine();
        persona.setSexo(input.nextLine().toUpperCase().charAt(0));
        System.out.print("Ingrese su peso en kilogramos: ");
        persona.setPeso(input.nextFloat());
        System.out.print("Ingrese su altura en metros: ");
        persona.setAltura(input.nextFloat());

        comprobarTipoPeso(persona);
        comprobarMayorDeEdad(persona);
        System.out.println(persona.toString());
    }

    public static void crearInterfaz(Scanner input)
    {
        crearPersona1(input);
        crearPersona2(input);
        crearPersona3(input);
    }
}
