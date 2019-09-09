package Componentes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SeleccionarImagen {

    private BufferedImage _image = null;
    static  FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Imagen", "jpg", "png");

    public static FileInputStream fis;
    public static int longitudBytes;
    static JFileChooser dlg;

    public static void selccionar(JLabel lblRuta, JLabel lblImagen) {
        dlg = new JFileChooser();
        dlg.setFileFilter(filter);
        dlg.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int opcion = dlg.showOpenDialog(null);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(dlg.getSelectedFile());
                SeleccionarImagen.longitudBytes = (int) dlg.getSelectedFile().length();
                String file = dlg.getSelectedFile().getPath();
                lblRuta.setText(file);
                ImageIcon icon = new ImageIcon(file);
                Image img = icon.getImage();
                Image newImg = img.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newImg);
                lblImagen.setIcon(newIcon);
            } catch (Exception e) {
            }
        } else {
            System.out.println("No selecciono nada");
        }
    }
}
