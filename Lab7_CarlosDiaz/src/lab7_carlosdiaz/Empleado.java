package lab7_carlosdiaz;

import java.io.Serializable;
import java.util.ArrayList;

public class Empleado extends Persona implements Serializable{
    private ArrayList<Carro> carrosE = new ArrayList();
    private static final long SerialVersionUID=777L;

    public Empleado(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Empleado() {
        super();
    }
    
    public ArrayList<Carro> getCarrosE() {
        return carrosE;
    }

    public void setCarrosE(ArrayList<Carro> carrosE) {
        this.carrosE = carrosE;
    }

    @Override
    public String toString() {
        return this.getNombre() + " "+this.getApellido()+" "+this.getEdad()+" años "+getCarrosE().size()+" carros";
    }
    
}
