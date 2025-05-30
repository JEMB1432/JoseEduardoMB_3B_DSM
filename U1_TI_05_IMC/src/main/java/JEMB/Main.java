package JEMB;

import JEMB.Models.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona persona = new Persona();

        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su altura");
        double altura = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingrese su peso");
        double peso = Double.parseDouble(scanner.nextLine());

        persona.setNombre(nombre);
        persona.setAltura(altura);
        persona.setPeso(peso);

        System.out.println("IMC: " + String.format("%.2f", persona.CalcularIMC())  + "\n" + "CLasificacion: " + persona.clasificarIMC() );
    }
}