package JEMB.Models;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    List<Animal> inventario = new ArrayList<>();

    public List<Animal> getInventario() {
        return inventario;
    }

    public void setInventario(List<Animal> inventario) {
        this.inventario = inventario;
    }

    public boolean venderAnimal(Cliente c, Animal a) {
        if(inventario.isEmpty()){
            return false;
        }
        for (int i = 0; i < inventario.size(); i++) {
            if(inventario.get(i).getNombre().equals(a.getNombre()) && !(c.tieneMascota(a)) ) {
                    inventario.remove(i);
                    c.setMascota(a);
                    return true;
            }
        }
        return false;
    }

    public void reabastecerAnimal(Animal a) {
        inventario.add(a);
    }

}
