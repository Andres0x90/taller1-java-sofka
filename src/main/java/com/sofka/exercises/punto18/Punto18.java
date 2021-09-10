package com.sofka.exercises.punto18;

import java.util.ArrayList;
import java.util.List;

public class Punto18
{
    public static void obtenerInfoGeneral() {

        List<Videojuego> videojuegos = new ArrayList<>();
        List<Videojuego> videojuegosEntregados = new ArrayList<>();
        videojuegos.add(new Videojuego("Minecraft",1000, "Survival", "Mojang"));
        videojuegos.add(new Videojuego("Resident Evil 4",3, "Terror/Accion", "CONAMI"));
        videojuegos.add(new Videojuego("League of Legends",3500, "MMORPG", "RiotGames"));
        videojuegos.add(new Videojuego("God Of War",4, "Accion", "Sony"));
        videojuegos.add(new Videojuego("GTA V",22, "Accion", "Rockstar"));

        List<Serie> series = new ArrayList<>();
        List<Serie> seriesEntregados = new ArrayList<>();
        series.add(new Serie(6, "Shingeki No Kyojin", "Shonen", "Hajime Isayama"));
        series.add(new Serie(3, "Tensei Shitara Slime Datta Ken", "Isekai", "Fuse"));
        series.add(new Serie(5, "Vikingos", "Accion/Historico", "Netflix"));
        series.add(new Serie(1, "Tokyo revengers", "Isekai/accion", "Ken Wakui"));
        series.add(new Serie(5, "Rick & Morty", "Ciencia Ficcion", "Justin Roiland"));

        videojuegos.get(1).entregar();
        series.get(1).entregar();
        videojuegos.get(4).entregar();

        for (int i = 0; i < series.size(); i++){
            if(videojuegos.get(i).isEntregado() == true){
                videojuegosEntregados.add(videojuegos.get(i));
                videojuegos.remove(i);
            }
            if(series.get(i).isEntregado() == true){
                seriesEntregados.add(series.get(i));
                series.remove(i);
            }
        }
        int contadorVideoJuegosEntregados = 0;
        for(int i = 0; i < videojuegosEntregados.size(); i++){
            contadorVideoJuegosEntregados += 1;
        }
        for(int i = 0; i < videojuegosEntregados.size(); i++){
            videojuegos.add(videojuegosEntregados.get(i));
            videojuegosEntregados.remove(i);
        }
        System.out.println("Los videojuegos entregados fueron: " + contadorVideoJuegosEntregados);
        int contadorSeriesEntregadas = 0;
        for(int i = 0; i < seriesEntregados.size(); i++){
            contadorSeriesEntregadas += 1;
        }
        for(int i = 0; i < seriesEntregados.size(); i++){
            series.add(seriesEntregados.get(i));
            seriesEntregados.remove(i);
        }
        System.out.println("Las series entregadas fueron: " + contadorSeriesEntregadas);

        double mayorEnHoras = 0;
        int indiceMayor = 0;
        for(int i = 0; i < videojuegos.size(); i++){
            if(mayorEnHoras < videojuegos.get(i).getHorasEstimadas()){
                mayorEnHoras = videojuegos.get(i).getHorasEstimadas();
                indiceMayor = i;
            }
        }
        System.out.println("Juego con mas horas: " +
                videojuegos.get(indiceMayor).toString());
        double mayorEnTemps = 0;
        for(int i = 0; i < series.size(); i++){
            if(mayorEnTemps < series.get(i).getNumTemporadas()){
                mayorEnTemps = series.get(i).getNumTemporadas();
                indiceMayor = i;
            }
        }
        System.out.print("Serie con mas temporadas: " +
                series.get(indiceMayor).toString());


    }
    public static  void crearInterfaz()
    {
        obtenerInfoGeneral();
        System.out.print("\n");
    }
}
