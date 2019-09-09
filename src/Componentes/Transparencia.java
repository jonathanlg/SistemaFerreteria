package Componentes;

import IU.frmCargaInicial;
import com.sun.awt.AWTUtilities;

public class Transparencia {
 
    public static class transparencia {

        public transparencia(frmCargaInicial frm) {
            
            frm.setUndecorated(true);
        AWTUtilities.setWindowOpaque(frm, false);
            
        }
    }
}