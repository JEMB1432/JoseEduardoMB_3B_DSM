package Models;

public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    private boolean estado;

    public void Validan(String codigo, String nombre, int cantidad) {
        if(codigo == null || codigo.isEmpty() || cantidad <= 0) {
            System.out.println("Ingrese datos validos");
            this.estado = false;
        }else {
            this.codigo = codigo;
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.estado = true;
        }
    }
    public String getCodigo() {
        return codigo;
    }

    public boolean getEstado() {
        return estado;
    }

    public int getCantidad() {
        return cantidad;
    }
}
