package com.sofka.exercises.punto18;


public class Serie implements Entregable{
    private boolean entregado = false;
    private int numTemporadas = 13;
    private String titulo = "";
    private String genero = "";
    private String creador = "";

    public Serie(int numTemporadas, String titulo, String genero, String creador) {
        this.numTemporadas = numTemporadas;
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie() {
    }

    @Override
    public String toString() {
        return "Serie{" +
                "entregado=" + entregado +
                ", numTemporadas=" + numTemporadas +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        boolean nueva = entregado;
        return nueva;
    }

    @Override
    public boolean isEntregado(boolean prestado) {
        return false;
    }

    @Override
    public int compareTo(Videojuego a) {
        int estado = -1;
        if(this.numTemporadas == a.getHorasEstimadas()){
            estado = 0;
        }else if(this.numTemporadas > a.getHorasEstimadas()){
            estado = 1;
        }
        return estado;
    }
}
