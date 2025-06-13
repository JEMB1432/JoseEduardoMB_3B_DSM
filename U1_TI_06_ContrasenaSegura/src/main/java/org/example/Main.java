package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioSeguro usuarioSeguro = new UsuarioSeguro();

        System.out.println("Introduzca el usuario: ");
        String usuario = sc.nextLine();
        usuarioSeguro.setNombreUsuario(usuario);

        System.out.println("Introduzca el password: ");
        String password = sc.nextLine();
        usuarioSeguro.setContrasena(password);

        if(!usuarioSeguro.estaInicializado()){
            System.out.println("Ingrese correctamente los datos");
        }else {
            System.out.println("-------------------------------------\n");
            System.out.println("LOGIN");
            System.out.println("Ingrese su contraseña");
            String contrasena = sc.nextLine();

            if(usuarioSeguro.autenticar(contrasena)) {
                System.out.println("Acceso concedido \n");
            } else {
                System.out.println("Acceso denegado \n");
            }
        }
    }
}