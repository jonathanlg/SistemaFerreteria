package Datos;

import Modelo.detalle_presupuesto;
import java.util.ArrayList;

public class ArregloPresupuesto {
    
    private ArrayList<detalle_presupuesto> dp; //Arreglo de objetos para las lineas del presupuesto
    
    //Constructor
    public ArregloPresupuesto()
    {
        dp = new ArrayList(); //Creamos el objeto
    }
    //Agregamos una nueva fila al detalle
    public void agregar(detalle_presupuesto nuevo)
    {
        dp.add(nuevo);
    }
    
    //Obtenemo una fila del detalle
    public detalle_presupuesto getFila(int i)
    {
        return dp.get(i);
    }
    
    //Remplazamos la informacion de la linea
    public void update(int i, detalle_presupuesto act)
    {
        dp.set(i, act);
    }
    
    //Elimina todas la lineas del detalle
    public void vaciar()
    {
        for(int i=0;i<numFilas();i++)
        {
            dp.remove(0);
        }
    }
    
    //Elimina una linea del detalle
    public void eliminar(int i)
    {
        dp.remove(i);
    }
    
    //Obtiene el numero de filas registradas
    public int numFilas()
    {
        return dp.size();
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
