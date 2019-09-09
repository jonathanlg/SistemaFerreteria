package Componentes;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class metodos {
    private BufferedImage _image = null;    
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Imagen","jpg","png");
    
    /**
     * Constructor de clase
     */
    public metodos(){}      
    
    /**
     * dada una direccion fisica de un archivo de imagen,
     * coloca esta en el objeto BufferedImage, o sea en memoria 
     * @param  url
     */
    public void cargar_imagen_en_buffer(URL _url){         
        //se llena el buffer con la imagen        
            try {                
                _image = ImageIO.read(_url);
            } catch (IOException ex) {
                System.err.println( ex.getMessage() );
            }               
    }
    
    /* retorna el objeto almacenado en memoria */
   public BufferedImage Obtener_imagen_de_Buffer(){       
        return _image;
   }
    
   /* crea una imagen en el BufferedImage y la pinta en el JPanel */
   public void crear_imagen(JPanel p){
    //crea una imagen 400x300 con pixels de 8 bits en RGB. 
    this._image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
    this._image.createGraphics();
    Graphics2D g = (Graphics2D)this._image.getGraphics();
    // pintamos una imagen
    g.setColor(Color.RED);
    g.fillRect(0, 0, 400, 100);
    g.setColor(Color.YELLOW);
    g.fillRect(0, 100, 400, 100);
    g.setColor(Color.GREEN);
    g.fillRect(0, 200, 400, 100);
    
    //añadimos al JPanel, con las dimensiones del contenedor, no de la imagen
    p.add(new mipanel(this._image, p.getSize()));
    p.setVisible(true);                
    p.repaint();   		
   }
   
   /**
    * crea un archivo de imagen desde el BufferedImage dada la direccion fisica 
    * @param  String f
    */
   public void guardar_imagen(String f){
        try {
            //se extrae el fomato de la cadena "f" que contiene la direccion
            String formato = (f.endsWith(".jpg")) ? "jpg" : "png";			
            //ImageIO.write(_image, "jpg", new File("e:/carpeta/imagen2.jpg"));
            ImageIO.write(_image, formato, new File(f));
	} catch (IOException e) {            
            System.out.println("Error al crear el archivo");
	}
   }
   
   public void Guardar_Dialogo(){
       JFileChooser fileChooser = new JFileChooser();       
       fileChooser.setFileFilter(filter);
       int result = fileChooser.showSaveDialog(null);       
       if ( result == JFileChooser.APPROVE_OPTION ){ 
                //se obtiene la direccion donde se guardara la imagen
                String url = fileChooser.getSelectedFile().toString();
                //String namefile = fileChooser.getSelectedFile().getName();                                            
                System.out.println("url: " + url);                                        
                //Se guarda la imagen
                guardar_imagen(url);            
        }
   }
   
    /**
     * Metodo que muestra una ventana de dialgo para añadir "archivo de imagen" en memoria     
     * @param JPanel
     */
    public void Abrir_Dialogo(JPanel p){
       JFileChooser fileChooser = new JFileChooser();       
       fileChooser.setFileFilter(filter);
       int result = fileChooser.showOpenDialog(null);  
       if ( result == JFileChooser.APPROVE_OPTION ){
            try {           
                //se asigna a "url" el archivo de imagen seleccionado
                URL url = fileChooser.getSelectedFile().toURL();                 
                //se lo coloca en memoria
                cargar_imagen_en_buffer(url);                            
                //se añade al contenedor
                p.add(new mipanel(Obtener_imagen_de_Buffer(), p.getSize()));
                p.setVisible(true);
                p.repaint();                           
            } 
            catch (IOException ex) {                
                System.err.println( ex.getMessage() );
            } 
        }
    }   
    
    public void Abrir_DialogoSeleccionImagen(JPanel p,JButton btn, JLabel ruta, JLabel rutas){
       JFileChooser fileChooser = new JFileChooser();       
       fileChooser.setFileFilter(filter);
       int result = fileChooser.showOpenDialog(null);  
       if ( result == JFileChooser.APPROVE_OPTION ){
            try {           
                //se asigna a "url" el archivo de imagen seleccionado
                URL url = fileChooser.getSelectedFile().toURL(); 
                ruta.setText(fileChooser.getSelectedFile().getName());
                rutas.setText(fileChooser.getSelectedFile().getPath());
                //se lo coloca en memoria
                cargar_imagen_en_buffer(url);                            
                //se añade al contenedor
                p.add(new mipanel(Obtener_imagen_de_Buffer(), p.getSize()));
                p.setVisible(true);
                p.repaint();          
                btn.setText("Guardar");
            } 
            catch (IOException ex) {                
                System.err.println( ex.getMessage() );
                btn.setText("Nuevo Fondo");
            } 
        }
    } 
    
}
