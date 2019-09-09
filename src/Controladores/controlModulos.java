package Controladores;

import IU.frmPrincipal;

public class controlModulos {
    
    public static void modAlmacen()
    {
        frmPrincipal.mnVentas.setVisible(false);
        frmPrincipal.mnClientes.setVisible(false);
        frmPrincipal.mnCompras.setVisible(false);
        frmPrincipal.mnEmpleados.setVisible(false);
        frmPrincipal.mnProveedores.setVisible(false);
        frmPrincipal.btnClientes.setVisible(false);
        frmPrincipal.btnCompras.setVisible(false);
        frmPrincipal.btnVentas.setVisible(false);
    }
    
}
