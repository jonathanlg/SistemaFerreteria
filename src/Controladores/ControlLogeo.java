package Controladores;

import Componentes.Encript;
import Componentes.traerIP;
import Datos.Logeo;
import IU.frmAcceso;
import IU.frmPrincipal;
import Modelo.Usuario;
import javax.swing.Timer;

public class ControlLogeo {

    static Timer timer;
    int cont;
    public static final int ONE_SECOND=2;
    
    static Usuario u;
    static String user;
    static String pass;

    public static String logear() {
        user = frmAcceso.txtUsuario.getText().trim();
        pass = Encript.getStringMessageDigest(frmAcceso.psPasword.getText(), Encript.MD5);
        u = Logeo.logear(user, pass);
        if (u.getPefil().equalsIgnoreCase("1")) {
            if (u.getIp().equals(traerIP.getIP())) {
                String msg = Logeo.acceso(u);
                abrirPrincipal();
            } else {
                frmAcceso.lblMensaje.setText("Su dirección IP no esta autorizada");
            }
        }
        if (u.getPefil().equalsIgnoreCase("2")) {
            if (u.getIp().equals(traerIP.getIP())) {
                String msg = Logeo.acceso(u);
                abrirPrincipal();
            } else {
                frmAcceso.lblMensaje.setText("Su dirección IP no esta autorizada");
            }
        }
        if (u.getPefil().equalsIgnoreCase("3")) {
            if (u.getIp().equals(traerIP.getIP())) {
                String msg = Logeo.acceso(u);
                abrirPrincipal();
            } else {
                frmAcceso.lblMensaje.setText("Su dirección IP no esta autorizada");
            }
        }
        if (u.getPefil().equalsIgnoreCase("4")) {
            if (u.getIp().equals(traerIP.getIP())) {
                String msg = Logeo.acceso(u);
                abrirPrincipal();
            } else {
                frmAcceso.lblMensaje.setText("Su dirección IP no esta autorizada");
            }
        }
        return String.valueOf(u.getNomUsuario());
    }

    public static String perfil() {
        return String.valueOf(u.getPefil());
    }

    public static String desLogeo() {
        String msg = null;
        msg = Logeo.salida(u);
        if (msg == null) {
            System.out.println("Se inserto Salida" + msg);
        } else {
            System.out.println("No se inserto salida" + msg);
        }
        return msg;
    }

    public static void abrirPrincipal() {
        frmPrincipal p = new frmPrincipal();
        p.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        p.setVisible(true);
    }

}
