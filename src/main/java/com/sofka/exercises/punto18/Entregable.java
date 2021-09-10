package com.sofka.exercises.punto18;

public interface Entregable
{
    default void entregar(){
        boolean prestado = true;
    }

    default void devolver(){
        boolean prestado = false;
    }

    default boolean isEntregado(){
        boolean nueva = false;
        return nueva;
    }

    boolean isEntregado(boolean prestado);

    default int compareTo(Videojuego a){
        return 0;
    }
}
