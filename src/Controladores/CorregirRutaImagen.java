package Controladores;

import java.util.StringTokenizer;

public class CorregirRutaImagen {
    
    String ruta, separador, nuevoSeparador;
    
    public CorregirRutaImagen(String laRuta, String sep, String nuevoSep)
    {
        this.ruta = laRuta;
        this.separador = sep;
        this.nuevoSeparador = nuevoSep;
    }
    
    public String obtenerRutaCorregida()
    {
        StringTokenizer tokens = new StringTokenizer(ruta, separador);
        //Para guardar la ruta corregida
        String rutaCorregida = new String();
        //Contat los tokens (en este caso las carpetas, contando tambien el nombre del archivo seleccionado)
        int noTokens = tokens.countTokens();
        int i=1;
        do
        {
            //Agregar el nuevo separador
            rutaCorregida += tokens.nextToken()+nuevoSeparador;
            i++;
        }while(i<noTokens);
        //Agregar la ruta corregida al ultimo token, (nombre del archivo)
        rutaCorregida += tokens.nextToken();
        //Mostrar la ruta corregida en la consola
        System.out.println(rutaCorregida+"\n"+noTokens+" tokens ");
        return rutaCorregida;
    }
    
}
