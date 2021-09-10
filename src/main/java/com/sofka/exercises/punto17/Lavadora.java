package com.sofka.exercises.punto17;


public class Lavadora extends Electrodomestico{
    private double carga = 5;

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora() {
    }

    @Override
    public double precioFinal(){
        double resultado = 0;

        switch (super.getConsumoEnergetico()){
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

        if(getPeso() >= 0 && getPeso() <= 19){
            resultado+=10;
        }else if(getPeso() >= 20 && getPeso() <= 49){
            resultado+=50;
        }else if(getPeso() >= 50 && getPeso() <= 79){
            resultado+=80;
        }else if (getPeso() >= 80){
            resultado+=100;
        }

        if(carga > 30){
            resultado+=50;
        }

        return resultado;
    }

    public double getCarga() {
        return carga;
    }
}
