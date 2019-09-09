package Controladores;

import Componentes.Fecha;
import Componentes.Mensajes;
import Datos.GestionarIngreso;
import IU.dlgIngreso;
import Modelo.Ingreso;

public class ControlIngreso {

    public static String addIngreso() {
        String msg;
        String fecha = dlgIngreso.dateChooserCombo1.getText();
        String ingFecha = Fecha.formatoFecha(fecha);
        int ingDescripcion = Integer.parseInt(dlgIngreso.lblCodDetallIngreso.getText());
        int ingCliente = Integer.parseInt(dlgIngreso.lblCodCliente.getText());
        double ingImporte = Double.parseDouble(dlgIngreso.txtImporte.getText());
        String ingObserv = dlgIngreso.txtObserv.getText().toUpperCase().trim();

        Ingreso ingreso = new Ingreso(ingFecha, ingDescripcion, ingCliente, ingImporte, ingObserv);

        msg = GestionarIngreso.addIngreso(ingreso);

        if (msg == null) {
            Mensajes.informacion("Registrado");
        } else {
            Mensajes.error("No se pudo registrar");
        }

        return msg;
    }

}
