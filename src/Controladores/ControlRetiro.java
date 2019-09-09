package Controladores;

import Componentes.Fecha;
import Componentes.Mensajes;
import Datos.GestionarRetiro;
import IU.dlgRetiro;
import Modelo.Retiro;

public class ControlRetiro {

    public static String addRetiro() {
        String msg;
        String fecha = dlgRetiro.dateChooserCombo1.getText();
        String reFecha = Fecha.formatoFecha(fecha);
        int reDescripcion = Integer.parseInt(dlgRetiro.lblCodDetalleGasto.getText());
        String reNombre = dlgRetiro.txtNombre.getText().toUpperCase().trim();
        double reImporte = Double.parseDouble(dlgRetiro.txtImporte.getText());

        Retiro retiro = new Retiro(reFecha, reDescripcion, reNombre, reImporte);

        msg = GestionarRetiro.addRetiro(retiro);

        if (msg == null) {
            Mensajes.informacion("Registrado");
        } else {
            Mensajes.error("No se pudo registrar");
        }
        return msg;
    }

}
