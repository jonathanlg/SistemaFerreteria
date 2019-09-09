package Controladores;

import IU.frmPrincipal;

public class controlPerfil {
    
    public static void perfil()
    {
        String perf = ControlLogeo.perfil();
        if(perf.equalsIgnoreCase("Almacen"))
        {
            frmPrincipal.btnClientes.setVisible(false);
            frmPrincipal.btnCompras.setVisible(false);
            frmPrincipal.btnVentas.setVisible(false);
            frmPrincipal.mnCompras.setVisible(false);
            frmPrincipal.mnVentas.setVisible(false);
            frmPrincipal.mnEmpleados.setVisible(false);
            frmPrincipal.smnUsuarios.setVisible(false);
        }
        if(perf.equalsIgnoreCase("Compra"))
        {
            frmPrincipal.btnArticulos.setVisible(false);
            frmPrincipal.btnVentas.setVisible(false);
            frmPrincipal.btnClientes.setVisible(false);
            frmPrincipal.mnArticulos.setVisible(false);
            frmPrincipal.mnVentas.setVisible(false);
            frmPrincipal.mnClientes.setVisible(false);
            frmPrincipal.mnEmpleados.setVisible(false);
            frmPrincipal.smnUsuarios.setVisible(false);
        }
        if(perf.equalsIgnoreCase("Venta"))
        {
            frmPrincipal.btnArticulos.setVisible(false);
            frmPrincipal.btnCompras.setVisible(false);
            frmPrincipal.mnArticulos.setVisible(false);
            frmPrincipal.mnProveedores.setVisible(false);
            frmPrincipal.mnCompras.setVisible(false);
            frmPrincipal.smnUsuarios.setVisible(false);
        }
    }
    
}
