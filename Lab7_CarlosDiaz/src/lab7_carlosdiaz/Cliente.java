package lab7_carlosdiaz;

import java.util.ArrayList;

public class Cliente extends Persona{
    private ArrayList<Carro> carrosC = new ArrayList();

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
