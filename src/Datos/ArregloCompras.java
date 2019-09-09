package Datos;

import Modelo.DetalleCompra;
import java.util.ArrayList;

public class ArregloCompras {
    
    public ArrayList<DetalleCompra> dc; //Arreglo de objetos para la linea de saldas de compra
    
    //Constructor
    public ArregloCompras()
    {
        dc = new ArrayList();
    }
    
    //Agregamos una fila al detalle
    public void agregar(DetalleCompra nuevo)
    {
        dc.add(nuevo);
    }
    
    //Obtenemos una fila del detalle
    public DetalleCompra getFila(int i)
    {
        return dc.get(i);
    }
    
    //Remplazamos la informacion de la linea
    public void update(int i, DetalleCompra act)
    {
        dc.set(i, act);
    }
    
    //Obtenemos el numero de filas registradas
    public int numFilas()
    {
        return dc.size();
    }
    
    //Elimina una fila del detalle
    public void eliminar(int i)
    {
        dc.remove(i);
    }        
    
    //Elimina toda la fila del detalle
    public void vaciar()
    {
        for(int i=0;i<numFilas();i++)
        {
            dc.remove(0);
        }
    }
    
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
