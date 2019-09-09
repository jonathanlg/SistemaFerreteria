package Componentes;

public class Combo {

    public int codigo;
    public String desc;

    //Constructor Vacio
    public Combo() {
    }

    //Constructor LLeno
    public Combo(int codigo, String desc) {
        this.codigo = codigo;
        this.desc = desc;
    }

    //Getter y Setter
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {//Muestra la descripcion completa
        return desc;
    }

}
