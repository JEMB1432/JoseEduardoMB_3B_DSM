package JEMB;


import JEMB.Models.Cliente;
import JEMB.Models.Gato;
import JEMB.Models.Perro;
import JEMB.Models.Tienda;

public class Main {
    public static void main(String[] args) {
        Perro p1 = new Perro("nomP1",5);
        Perro p2 = new Perro("nomP2",6);
        Gato g1 = new Gato("nomG1",7);
        Gato g2 = new Gato("nomG2",4);

        Cliente c1 = new Cliente("JUAN");

        Tienda t1 = new Tienda();
        t1.reabastecerAnimal(p1);
        t1.reabastecerAnimal(p2);
        t1.reabastecerAnimal(g1);
        t1.reabastecerAnimal(g2);

        System.out.println( " Vender animal 2: " + t1.venderAnimal(c1,p2));
        t1.reabastecerAnimal(p2);

        System.out.println(" Vender animal al mismo cliente 2 (debe fallar la venta): " + t1.venderAnimal(c1,p2));
        System.out.println(" Vender animal que ya no axiste: " + t1.venderAnimal(c1,p2));

    }
}