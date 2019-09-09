package Controladores;

import Componentes.Fecha;
import Componentes.Mensajes;
import Datos.GestionarGasto;
import IU.dlgGastos;
import Modelo.Gasto;

public class ControlGasto {

    public static String addGasto() {
        String msg;
        String fecha = dlgGastos.dcFecha.getText();
        String gaFecha = Fecha.formatoFecha(fecha);
        int gaDescripcion = Integer.parseInt(dlgGastos.lblCodDetalle.getText());
        String gaNombre = dlgGastos.txtNombre.getText().toUpperCase().trim();
        double gaImporte = Double.parseDouble(dlgGastos.txtImporte.getText());
        String gaObservacion = dlgGastos.txtObser.getText().toUpperCase().trim();

        Gasto gasto = new Gasto(gaFecha, gaDescripcion, gaNombre, gaImporte, gaObservacion);

        msg = GestionarGasto.addGasto(gasto);

        if (msg == null) {
            Mensajes.informacion("Registrado");
        } else {
            Mensajes.error("No se pudo guardar");
        }

        return "";

    }

}
