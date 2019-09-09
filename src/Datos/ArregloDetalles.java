package Datos;

import Modelo.DetalleSalida;
import java.io.Serializable;
import java.util.ArrayList;

public class ArregloDetalles implements Serializable{
   
    private ArrayList<DetalleSalida> ds; //Arreglo de objetos para las lineas de la salida
    
    //Constructor
    public ArregloDetalles()
    {
        ds = new ArrayList(); //Creamos el objeto
    }
    //Agregamos una nueva fila al detalle
    public void agregar(DetalleSalida nuevo)
    {
        ds.add(nuevo);
    }
    
    //Obtenemo una fila del detalle
    public DetalleSalida getFila(int i)
    {
        return ds.get(i);
    }
    
    //Remplazamos la informacion de la linea
    public void update(int i, DetalleSalida act)
    {
        ds.set(i, act);
    }
    
    //Elimina todas la lineas del detalle
    public void vaciar()
    {
        for(int i=0;i<numFilas();i++)
        {
            ds.remove(0);
        }
    }
    
    //Elimina una linea del detalle
    public void eliminar(int i)
    {
        ds.remove(i);
    }
    
    //Obtiene el numero de filas registradas
    public int numFilas()
    {
        return ds.size();
    }
    
    //Buscar y validar que el objeto no se repita
    public int busca(int codigo)
    {
        for(int i=0;i<numFilas();i++)
        {
            if(codigo == getFila(i).getCodArt())
                return i; //Retorna indice
        }
        return -1; //No se encontro objeto
    }
    
}
