package lab7_carlosdiaz;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Persona implements Serializable{
    private ArrayList<Carro> carrosC = new ArrayList();
    private static final long SerialVersionUID=777L;

    public Cliente(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Cliente() {
        super();
    }
    
    public ArrayList<Carro> getCarrosC() {
        return carrosC;
    }

    public void setCarrosC(ArrayList<Carro> carrosC) {
        this.carrosC = carrosC;
    }

    @Override
    public String toString() {
        return this.getNombre() + " "+this.getApellido()+" "+this.getEdad()+" años "+getCarrosC().size()+" carros";
    }
    
}
