package com.sofka.exercises;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Punto13
{
    public static String getFechaActual()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        return  dtf.format(now);
    }

    public static void crearInterfaz()
    {
        System.out.println(getFechaActual());
    }
}
