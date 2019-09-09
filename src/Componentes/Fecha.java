package Componentes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {

    public static String formatoFecha(String fecha) {
        String fechas = null;
        try {
            SimpleDateFormat fe = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat myFecha = new SimpleDateFormat("20" + "yy-MM-dd");

            fechas = myFecha.format(fe.parse(fecha));
        } catch (Exception e) {
            System.out.println("No se pudo convertir");
        }
        return fechas;
    }
    
    public static String fechaCompleta(String fecha){
        String fechas = null;
        String horas = null;
        String horaCompleta = null;
        try {
            Date hoy = new Date();
            SimpleDateFormat df = new SimpleDateFormat("H:mm:ss");
            SimpleDateFormat fe = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat myFecha = new SimpleDateFormat("20" + "yy-MM-dd");
            fechas = myFecha.format(fe.parse(fecha));
            horas = df.format(hoy);
            horaCompleta = fechas + " " + horas;
        } catch (ParseException e) {
            System.out.println("No se pudo convertir la fecha completa");
        }
        return horaCompleta;
    }
    
    public static String fechaReporte(){
        String fechas = null;
        try {
            Date hoy = new Date();
            SimpleDateFormat fe = new SimpleDateFormat("20" + "yy-MM-dd");
            fechas = fe.format(hoy);
        } catch (Exception e) {
            System.out.println("Error al ver la fecha");
        }
        return fechas;
    }
    
    public static String fechaCorrecta(){
        String fechas = null;
        try {
            Date hoy = new Date();
            SimpleDateFormat fe = new SimpleDateFormat("yyyy-MM-dd");
            fechas = fe.format(hoy);
        } catch (Exception e) {
            System.out.println("Error al ver la fecha");
        }
        return fechas;
    }
    
    public static String darHora(){
        String hora = null;
        try {
            Date hoy = new Date();
            SimpleDateFormat df =  new SimpleDateFormat("H:mm:ss");
            hora = df.format(hoy);
            System.out.println("La hora es "+hora);
        } catch (Exception e) {
            System.out.println("No se pudo mostrar la hora");
        }
        return hora;
    }

}
