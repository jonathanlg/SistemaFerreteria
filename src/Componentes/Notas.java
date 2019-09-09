package Componentes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Notas {

    //Grabar en Registro
    public void escribir(String aux) {
        File f = new File(System.getProperty("user.dir")+"\\Nota\\notas.txt");
        try {
            f.createNewFile();
            if (!f.exists()) {
                f.createNewFile();
            }
            FileWriter fw = new FileWriter(f);
            fw.write(aux);
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo leer o grabar ", "ERROR ", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Leer todo el registro
    public String leeTodo() {
        String nota = "";
        try {
            FileReader fr = new FileReader(System.getProperty("user.dir")+"\\Nota\\notas.txt");
            BufferedReader leer = new BufferedReader(fr);

            String s;

            while ((s = leer.readLine()) != null) {
                nota = nota + s + "\n";
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo leer el archivo ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return nota;
    }

}
