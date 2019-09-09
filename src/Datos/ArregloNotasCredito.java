package Datos;

import Modelo.detalle_notaCredito;
import java.util.ArrayList;

public class ArregloNotasCredito {
    
    private ArrayList<detalle_notaCredito> dt;
    
    //Constructor
    public  ArregloNotasCredito()
    {
        dt = new ArrayList<detalle_notaCredito>();//Creamos el objeto
    }
    
    //Agregamos una nueva fila al detalle
    public void agregar(detalle_notaCredito nuevo)
    {
        dt.add(nuevo);
    }
    
    //Obtenemo una fila del detalle
    public detalle_notaCredito getFila(int i)
    {
        return dt.get(i);
    }
    
    //Remplazamos la informacion de la linea
    public void update(int i, detalle_notaCredito act)
    {
        dt.set(i, act);
    }
    
    //Elimina todas la lineas del detalle
    public void vaciar()
    {
        for(int i=0;i<numFilas();i++)
        {
            dt.remove(0);
        }
    }
    
    //Elimina una linea del detalle
    public void eliminar(int i)
    {
        dt.remove(i);
    }
    
    //Obtiene el numero de filas registradas
    public int numFilas()
    {
        return dt.size();
    }
    
    //Buscar y validar que el objeto no se repita
    public int busca(int codigo)
    {
        for(int i=0;i<numFilas();i++)
        {
            if(codigo == getFila(i).getCodArticulo())
                return i; //Retorna indice
        }
        return -1; //No se encontro objeto
    }
    
}
