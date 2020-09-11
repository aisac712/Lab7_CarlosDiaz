package lab7_carlosdiaz;

import java.util.ArrayList;

public class Cliente extends Persona{
    private ArrayList<Carro> carrosC = new ArrayList();

    public Cliente(String nombre, String apellido, String edad) {
        super(nombre, apellido, edad);
    }

    public ArrayList<Carro> getCarrosC() {
        return carrosC;
    }

    public void setCarrosC(ArrayList<Carro> carrosC) {
        this.carrosC = carrosC;
    }
    
}
