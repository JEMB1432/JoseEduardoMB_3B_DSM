package mx.JEMB;

import mx.JEMB.Models.EmpleadoPorHoras;
import mx.JEMB.Models.EmpleadoTiempoCompleto;

public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto etc = new EmpleadoTiempoCompleto("JEMB!$#","JEMB",1500,"NA");
        System.out.println("Empleado Tiempo Completo: " + etc.getNombre());
        System.out.println(etc.calcularSalario());

        EmpleadoPorHoras eph = new EmpleadoPorHoras("eph142","JUAN",150,5);
        System.out.println("Empleado PorHoras Completo: " + eph.getNombre());
        System.out.println(eph.calcularSalario());

    }
}