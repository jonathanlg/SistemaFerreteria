package Datos;

import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.Imagen;

public class GestionarImagen {
    
    public static String getCodigo(){
        String cod = generarCodigos.getCodigo("SELECT MAX(img_cod) FROM imagen");
        return cod;
    }
    
    public static String addImagen(Imagen i) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO imagen VALUES (");
        sql.append(getCodigo()).append(",'").append(i.getImgFondo()).append("','N')");
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }
    
    public static Imagen busImage(String cod) {
        Imagen im = null;
        String sql = "SELECT * FROM imagen WHERE img_cod="+cod+"";
        Object[] filaObt = Operacion.getFila(sql);
        if(filaObt != null)
        {
            im = new Imagen();            
            im.setImgCod(Integer.parseInt(filaObt[0].toString()));
            im.setImgFondo(filaObt[1].toString());
        }
        else
        {
            System.out.println("No se encontro");
        }
        return im;
    }
    
    public static Imagen fondoPrincipal() {
        Imagen im = null;
        String sql = "SELECT * FROM imagen WHERE img_estado='S'";
        Object[] filaObt = Operacion.getFila(sql);
        if(filaObt != null)
        {
            im = new Imagen();            
            im.setImgCod(Integer.parseInt(filaObt[0].toString()));
            im.setImgFondo(filaObt[1].toString());
            System.out.println("Encontrado :"+filaObt[1].toString());
        }
        else
        {
            System.out.println("No se encontro");
        }
        return im;
    }
    
    public static String quitarFondo(){
        String msg;
        String sql = "UPDATE imagen SET img_estado='N'";
        msg = Operacion.exeOperacion(sql);
        return msg;
    }
    
    public static void establecerFondo(String cod){
        String msg;
        String sql = "UPDATE imagen SET img_estado='S' WHERE img_cod="+cod+"";
        msg = Operacion.exeOperacion(sql);
    }
    
}
