package org.example;

public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.isEmpty()) {
            System.out.printf("Nombre del usuario no puede ser nulo o vacio\n");
        } else {
            this.nombreUsuario = nombreUsuario;
        }
    }

    public void setContrasena(String password) {
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isDigit = false;

        if (password == null || password.isEmpty() || password.length() < 8) {
            System.out.println("La contraseña debe ser mayor o igual a 8 caracteres\n");
        } else {
            //
            for (int i = 0; i < password.length(); i++) {
                char caracter = password.charAt(i);
                int ascii = (int) caracter;
                if (ascii >= 65 && ascii <= 90) {
                    isUpperCase = true;
                }
                if (ascii >= 97 && ascii <= 122) {
                    isLowerCase = true;
                }
                if (ascii >= 48 && ascii <= 57) {
                    isDigit = true;
                }
            }

            if (!isUpperCase) {
                System.out.println("Debe tener almenos una mayuscula\n");
            } else if (!isLowerCase) {
                System.out.println("Debe tener almenos una minuscula\n");
            } else if (!isDigit) {
                System.out.println("Debe tener almenos una numero\n");
            } else {
                this.password = password;
            }
        }
    }

    public boolean estaInicializado() {
        if (password == null || password.isEmpty() && (nombreUsuario == null || nombreUsuario.isEmpty())) {
            return false;
        }else{
            return true;
        }
    }

    public boolean autenticar(String intentPassword) {
            return password.equals(intentPassword);

    }
}