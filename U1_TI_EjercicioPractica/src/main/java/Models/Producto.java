package Models;


public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;

    public void Validan(String codigo, String nombre, int cantidad) {
        if(codigo == null || codigo.isEmpty() || cantidad <= 0) {
            System.out.println("Ingrese datos validos");
        }else {
            this.codigo = codigo;
            this.nombre = nombre;
            this.cantidad = cantidad;
        }
    }
    public String getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }
}
