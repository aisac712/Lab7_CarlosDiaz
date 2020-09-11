package lab7_carlosdiaz;

import java.util.ArrayList;

public class Empleado extends Persona{
    private ArrayList<Carro> carrosE = new ArrayList();

    public Empleado(String nombre, String apellido, String edad) {
        super(nombre, apellido, edad);
    }

    public ArrayList<Carro> getCarrosE() {
        return carrosE;
    }

    public void setCarrosE(ArrayList<Carro> carrosE) {
        this.carrosE = carrosE;
    }
    
}
