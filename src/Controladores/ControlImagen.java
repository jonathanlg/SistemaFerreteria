package Controladores;

import Componentes.Mensajes;
import Datos.GestionarImagen;
import IU.JPanelConFondo;
import IU.dlgFondo;
import IU.frmPrincipal;
import Modelo.Imagen;
import java.awt.Image;

public class ControlImagen {

    private Image imagen;

    public static void addImagen() {
        String msg;
        String imgNombre = dlgFondo.jLabel1.getText();
        Imagen i = new Imagen(imgNombre);

        msg = GestionarImagen.addImagen(i);

        if (msg == null) {
            Mensajes.informacion("Fondo de pantalla guardado");
        } else {
            Mensajes.error("No se pudo guardar el fondo de pantalla");
        }

    }

    public void buscar(String cod) {
        Imagen im = GestionarImagen.busImage(cod);
        String nombreImagen = "/Recursos/" + im.getImgFondo();
        ((JPanelConFondo) dlgFondo.panelFondo).setImagen(nombreImagen);
        ((JPanelConFondo) frmPrincipal.panelFondo).setImagen(nombreImagen);
    }

    public void establecerFondo(String cod) {
        GestionarImagen.quitarFondo();
        GestionarImagen.establecerFondo(cod);
    }

}
