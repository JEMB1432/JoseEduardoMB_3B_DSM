package org.JEMB;

import org.JEMB.Models.Computadora;

public class Main {
    public static void main(String[] args) {
        Computadora computadora = new Computadora();

        computadora.setModeloComputadora("Legion Y5");

        computadora.encender();
        computadora.encender();

        computadora.apagar();
    }
}