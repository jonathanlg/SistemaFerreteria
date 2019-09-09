package Componentes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/*CLASE PARA GENERAR LOS ID's DE TODAS LAS TABLAS Y PARA EXTRAER VALORES ENTEROS*/
/*-------------------------------------------------------------------------------*/
public class generarCodigos {
    /*Metodo solo es util cuando las primary key son enteros, si el primary key es varchar
     solo generara el codigo hasta el 10 en caso de mysql y acces, aun no se ha hecno la prueba con 
     SQL server y ORACLE */

    public static String getCodigo(String sql)//Traemos el id mayor de las tablas
    {
        String codgen = "";
        String CodMaximo = "";
        int contador = 0;
        try {
            Connection conexion = new ConexionBD().getConexion();//Nos conectamos
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            ResultSetMetaData rmeta = resultado.getMetaData();
            int numColumnas = rmeta.getColumnCount();

            while (resultado.next())//Recorremos la tabla
            {
                for (int j = 1; j <= numColumnas; j++) {
                    CodMaximo = resultado.getString(j).toString();//Obtenermos el codigo maximo
                }
                contador++;//Acumulamos
            }
            conexion.close();
        } catch (SQLException e) {
            //Excepcion en caso la tabla este vacia
            System.out.println("Tabla vacía");
        }
        if (contador == 0)//Si no hay registros
        {
            codgen = "1";
        } else//Si hay mas de un registro
        {
            int mayor = Integer.parseInt(CodMaximo.substring(0));
            codgen = unoMas(mayor + 1);//Aumentamos un valor mas
        }
        return codgen;//Retornamos el valor
    }

    static String unoMas(int num)//Aumentar el valor obtenido en getCodigo() +1
    {
        String nnum = String.valueOf(num);
        for (int i = String.valueOf(num).length(); i <= 1; i++) {
            nnum = "" + nnum;//Sumamos el valor
        }
        return nnum;//Retornamos el valor
    }

    public static String getCantidad(String sql)//Metodo para traer valores enteros de la base de datos
    {
        String codgen = "";
        String CodMaximo = "";
        int contador = 0;
        try {
            Connection conexion = new ConexionBD().getConexion();//Nos conectamos
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            ResultSetMetaData rmeta = resultado.getMetaData();
            int numColumnas = rmeta.getColumnCount();

            while (resultado.next())//Recorremos la tabla
            {
                for (int j = 1; j <= numColumnas; j++) {
                    CodMaximo = resultado.getString(j).toString();//Obtenermos el codigo maximo
                }
                contador++;//Acumulamos
            }
            conexion.close();
        } catch (SQLException e) {
            //Excepcion en caso la tabla este vacia
            System.out.println("Tabla vacía");
        }
        if (contador == 0)//Si no hay registros
        {
            codgen = "1";
        } else//Si hay mas de un registro
        {
            int mayor = Integer.parseInt(CodMaximo.substring(0));
            codgen = String.valueOf(mayor);//No aumentamos nada
        }
        return codgen;//Retornamos el valor
    }

    public static String getDecimales(String sql)//Metodo para traer datos decimales
    {
        String codgen;
        String CodMaximo = "";
        int contador = 0;
        try {
            Connection conexion = new ConexionBD().getConexion();//Nos conectamos
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            ResultSetMetaData rmeta = resultado.getMetaData();
            int numColumnas = rmeta.getColumnCount();

            while (resultado.next())//Recorremos la tabla
            {
                for (int j = 1; j <= numColumnas; j++) {
                    CodMaximo = resultado.getString(j).toString();//Obtenermos el codigo maximo
                }
                contador++;//Acumulamos
            }
            conexion.close();
        } catch (SQLException e) {
            //Excepcion en caso la tabla este vacia
            System.out.println(0.0);
        }
        if (contador == 0)//Si no hay registros
        {
            codgen = "1";
        } else//Si hay mas de un registro
        {
            double mayor = Double.parseDouble(CodMaximo.substring(0));
            codgen = String.valueOf(mayor);//No aumentamos nada
        }
        return codgen;//Retornamos el valor
    }
    
    public static String getFecha(String sql)//Metodo para traer fechas
    {
        String codgen = "";
        String CodMaximo = "";
        int contador = 0;
        try {
            Connection conexion = new ConexionBD().getConexion();//Nos conectamos
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            ResultSetMetaData rmeta = resultado.getMetaData();
            int numColumnas = rmeta.getColumnCount();

            while (resultado.next())//Recorremos la tabla
            {
                for (int j = 1; j <= numColumnas; j++) {
                    CodMaximo = resultado.getString(j).toString();//Obtenermos el codigo maximo
                }
                contador++;//Acumulamos
            }
            conexion.close();
        } catch (SQLException e) {
            //Excepcion en caso la tabla este vacia
            System.out.println("Tabla vacía");
        }
        if (contador == 0)//Si no hay registros
        {
            codgen = "1";
        } else//Si hay mas de un registro
        {
            String mayor = String.valueOf(CodMaximo.substring(0));
            codgen = String.valueOf(mayor);//No aumentamos nada
        }
        return codgen;//Retornamos el valor
    }

}
