package com.sofka.exercises.punto17;

public class Televisor extends Electrodomestico{
    private int resolucion = 20;
    private boolean itsTDT = false;

    public Televisor(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean itsTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.itsTDT = itsTDT;
    }

    public Televisor(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Televisor() {
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

        if(resolucion > 40 && itsTDT == true){
            resultado *= 1.30;
            resultado += 50;
        }else if(resolucion <= 40 && itsTDT == true){
            resultado+= 50;
        }else if(resolucion > 40 && itsTDT == false){
            resultado *= 1.30;
        }

        return resultado;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isItsTDT() {
        return itsTDT;
    }
}