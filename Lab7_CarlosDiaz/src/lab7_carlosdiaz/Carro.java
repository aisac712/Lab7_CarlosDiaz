package lab7_carlosdiaz;

import java.io.Serializable;

public class Carro implements Serializable{
    private String placa;
    private String tamano;
    private int numPuertas;         //(Pequeño, mediano o Grande)
    private int nivSuciedad;        //5-10
    private static final long SerialVersionUID=777L;

    public Carro(String placa, String tamano, int numPuertas, int nivSuciedad) {
        this.placa = placa;
        this.tamano = tamano;
        this.numPuertas = numPuertas;
        this.nivSuciedad = nivSuciedad;
    }

    public Carro() {
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNivSuciedad() {
        return nivSuciedad;
    }

    public void setNivSuciedad(int nivSuciedad) {
        this.nivSuciedad = nivSuciedad;
    }

    @Override
    public String toString() {
        return placa +" "+ tamano +" "+ numPuertas +" "+ nivSuciedad;
    }
    
}
