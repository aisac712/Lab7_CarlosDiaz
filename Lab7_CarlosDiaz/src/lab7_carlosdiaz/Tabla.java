package lab7_carlosdiaz;

import java.io.Serializable;
import javax.swing.table.DefaultTableModel;

public class Tabla implements Serializable{
    private DefaultTableModel modelo;
    private static final long SerialVersionUID=777L;

    public Tabla(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }
    
}
