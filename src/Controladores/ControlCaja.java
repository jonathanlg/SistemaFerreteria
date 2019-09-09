package Controladores;

import Componentes.Fecha;
import Componentes.Mensajes;
import Datos.GestionarCaja;
import IU.dlgCaja;
import IU.dlgCajaDia;
import Modelo.Caja;

public class ControlCaja {

    public static String addCaja() {
        String msg;
        String caFecha = Fecha.fechaCorrecta();
        double caInicial = Double.parseDouble(dlgCaja.txtCaInicial.getText());

        Caja caja = new Caja(caFecha, caInicial, 0.0, 0.0);
        msg = GestionarCaja.addCaja(caja);
        if (msg == null) {
            Mensajes.informacion("Caja del día iniciada");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String actCaja() {
        String msg;
        String caFecha = Fecha.fechaCorrecta();
        double caInicial = Double.parseDouble(dlgCajaDia.txtCajaInicial.getText());
        double caFinal = Double.parseDouble(dlgCajaDia.txtTotalE.getText());
        double caDif = Double.parseDouble(dlgCajaDia.lblDiferencia.getText());

        Caja caja = new Caja(caFecha, caInicial, caFinal, caDif);
        msg = GestionarCaja.actCaja(caja);
        if (msg == null) {
            Mensajes.informacion("Caja del día actualizada");
        } else {
            Mensajes.informacion("Caja del día actualizada");
        }
        return msg;
    }

}
