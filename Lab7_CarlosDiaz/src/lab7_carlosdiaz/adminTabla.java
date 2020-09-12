package lab7_carlosdiaz;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class adminTabla {
    private ArrayList<Tabla> listaTablas = new ArrayList();
    private File archivo = null;

    public adminTabla(String path) {
        archivo = new File(path);
    }

    public ArrayList<Tabla> getListaTablas() {
        return listaTablas;
    }

    public void setListaTablas(ArrayList<Tabla> listaTablas) {
        this.listaTablas = listaTablas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    //mutador extra
    public void setTabla(Tabla t){
        this.listaTablas.add(t);
    }
    
    public void cargarArchivo() {
        try {            
            listaTablas = new ArrayList();
            Tabla temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Tabla) objeto.readObject()) != null) {
                        listaTablas.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Tabla t : listaTablas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
