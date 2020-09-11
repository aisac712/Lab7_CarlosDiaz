package lab7_carlosdiaz;

public class Carro {
    private String placa;
    private String tamano;
    private int numPuertas;         //(Pequeño, mediano o Grande)
    private int nivSuciedad;        //5-10

    public Carro(String placa, String tamano, int numPuertas, int nivSuciedad) {
        this.placa = placa;
        this.tamano = tamano;
        this.numPuertas = numPuertas;
        this.nivSuciedad = nivSuciedad;
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
    
}
