package JEMB.Models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    List<Animal> mascotas = new ArrayList<>();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean tieneMascota(Animal mascota){
        for (int i = 0; i < mascotas.size(); i++){
            if (mascotas.get(i).getNombre().equals(mascota.getNombre())){
                return true;
            }
        }
        return false;
    }

    public void setMascota(Animal mascota) {
        this.mascotas.add(mascota);
    }
}
