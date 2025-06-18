package utez.edu.mx;

import utez.edu.mx.Models.Coche;
import utez.edu.mx.Models.Garage;
import utez.edu.mx.Models.Motocicleta;
import utez.edu.mx.Models.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(4);

        Coche c1 = new Coche("VND", "206615-5",4);
        Coche c2 = new Coche("ABC", "201225-3",4);
        Motocicleta m1 = new Motocicleta("JKF", "aasd522-5",true);
        Motocicleta m2 = new Motocicleta("LDK", "affd522-5",false);

        System.out.println("ESTACIONAR COCHE 1: " + garage.estacionar(c1));
        System.out.println("ESTACIONAR COCHE 2: " + garage.estacionar(c2));

        System.out.println("CONTEO DE COCHES: " + garage.contarVehiculos());



        System.out.println("RETIRAR COCHE 1: " + garage.retirar("206615-5"));
        System.out.println("RETIRAR COCHE \"falso\" : " + garage.retirar("2078615-5"));

        System.out.println("RETIRAR COCHE 2: " + garage.retirar("201225-3"));

        System.out.println("RETIRAR COCHE 1 cuando esta vacio: " + garage.retirar("206615-5"));

        System.out.println("CONTEO DE COCHES: " + garage.contarVehiculos());

    }
}