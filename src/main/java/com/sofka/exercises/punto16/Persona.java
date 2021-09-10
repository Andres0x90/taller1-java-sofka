package com.sofka.exercises.punto16;

import java.util.Random;

public class Persona
{
    private static final char HOMBRE = 'H';
    private static final char MUJER = 'M';
    public static final int DELGADEZ = -1;
    public static final int PESO_IDEAL = 0;
    public static final int OBESIDAD = 1;

    private String nombre, DNI = "";
    private char sexo;
    private int edad = 0;
    private float peso, altura = 0;

    public Persona()
    {
        this.sexo = HOMBRE;
        this.DNI = generarDNI();
    }

    public Persona(String nombre, char sexo, int edad) {
        this.nombre = nombre;
        this.sexo = comprobarSexo(sexo);
        this.edad = edad;
        this.DNI = generarDNI();
    }

    public Persona(String nombre, char sexo, int edad, float peso, float altura) {
        this.nombre = nombre;
        this.sexo = comprobarSexo(sexo);
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.DNI = generarDNI();
    }

    public int calcularIMC()
    {
        Double imc = this.peso/Math.pow(this.altura,2);

        if (imc < 20)
            return DELGADEZ;
        else if (imc >= 20 && imc <= 25)
            return PESO_IDEAL;
        else if (imc > 25)
            return OBESIDAD;

        return 2;
    }

    public boolean esMayorDeEdad()
    {
        if (this.edad >= 18)
            return true;

        return  false;
    }

    private char comprobarSexo(char sexo)
    {
        if (sexo == 'M')
            return sexo;

        return 'H';
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    private String generarDNI()
    {
        int randomID = generarRandom(10000000, 100000000);
        String DNIGenerated = Integer.toString(randomID);
        DNIGenerated = DNIGenerated.concat(Character.toString(calcularLetra(randomID)));

        return DNIGenerated;
    }

    private int generarRandom(int min, int max)
    {
        return (int)(Math.random() * (max-min));
    }
    private char calcularLetra(int randomID)
    {
        String tableHash = "TRWAGMYFPDXBNJZSQVHLCKE";
        return tableHash.charAt(randomID%23);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
