package com.sofka.exercises.punto17;

public class Electrodomestico {
    private double precioBase = 100;
    private String color = "blanco";
    private char consumoEnergetico = 'F';
    private double peso = 5;
    private String coloresPermitidos[] = {"blanco", "negro", "rojo", "azul", "gris"};
    private char letrasPermitidas[] = {'A', 'B', 'C', 'D', 'E', 'F'};

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);

    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    public Electrodomestico(){
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    private void comprobarConsumoEnergetico(char letra) {
        boolean itsValido = false;
        char resultado = ' ';

        for (int i = 0; i < letrasPermitidas.length; i++) {
            if (letra == letrasPermitidas[i]) {
                itsValido = true;
                resultado = letra;
                break;
            }
        }

        if (itsValido == false) {
            resultado = 'F';
            setConsumoEnergetico(resultado);
        }
    }

    private void comprobarColor(String color){
        boolean itsValido = false;
        String resultado = "";
        for(int i = 0; i < coloresPermitidos.length; i++){
            if(color.toLowerCase() == coloresPermitidos[i]){
                itsValido = true;
                resultado = color.toLowerCase();
                break;
            }
        }
        if(itsValido == false){
            resultado = "blanco";
            setColor(resultado);
        }
    }

    public double precioFinal(){
        double resultado = 0;

        switch (consumoEnergetico){
            case 'A':
                resultado+=100;
                break;

            case 'B':
                resultado+=80;
                break;

            case 'C':
                resultado+=60;
                break;

            case 'D':
                resultado+=50;
                break;

            case 'E':
                resultado+=30;
                break;

            case 'F':
                resultado+=10;
                break;
        }

        if(peso >= 0 && peso <= 19){
            resultado+=10;
        }else if(peso >= 20 && peso <= 49){
            resultado+=50;
        }else if(peso >= 50 && peso <= 79){
            resultado+=80;
        }else if (peso >= 80){
            resultado+=100;
        }

        return resultado;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setColoresPermitidos(String[] coloresPermitidos) {
        this.coloresPermitidos = coloresPermitidos;
    }

    public void setLetrasPermitidas(char[] letrasPermitidas) {
        this.letrasPermitidas = letrasPermitidas;
    }
}