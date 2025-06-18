package utez.edu.mx.Models;

public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, String placa, int numPuertas) {
        super(marca, placa);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

}
