package utez.edu.mx.Models;

public class Motocicleta extends Vehiculo {
    private boolean tienecaja = false;

    public Motocicleta(String marca, String placa, boolean tienecaja) {
        super(marca, placa);
        this.tienecaja = tienecaja;
    }

    public boolean isTienecaja() {
        return tienecaja;
    }

    public void setTienecaja(boolean tienecaja) {
        this.tienecaja = tienecaja;
    }
}
