package utez.edu.mx.Models;

public class Garage {
    private int numVehiculos;
    private Vehiculo[] vehiculos;

    public Garage(int numVehiculos) {
        this.vehiculos = new Vehiculo[numVehiculos];
    }

    public int getNumVehiculos() {
        return numVehiculos;
    }

    public void setNumVehiculos(int numVehiculos) {
        this.numVehiculos = numVehiculos;
    }

    public boolean estacionar(Vehiculo v) {
        for(int i = 0; i < vehiculos.length; i++) {
                if(vehiculos[i] == null){
                    vehiculos[i] = v;
                    return true;
                }else{
                    if(i==vehiculos.length-1){
                        System.out.println("No se puede agregar el vehiculo, Esta lleno");
                    }
                }
        }
        return false;
    }

    public boolean retirar(String placa) {
        for(int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i] == null){
                if(i == vehiculos.length-1){
                    System.out.println("No se puede retirar, El garage está Vacio");
                }
                continue;
            }else if(vehiculos[i].getPlaca().equals(placa)){
                    vehiculos[i] = null;
                    return true;
                }else{
                return false;
            }
        }
        return false;
    }

    public int contarVehiculos() {
        int contador = 0;
        for(int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i] != null){
                contador++;
            }
        }
        return contador;
    }

}
