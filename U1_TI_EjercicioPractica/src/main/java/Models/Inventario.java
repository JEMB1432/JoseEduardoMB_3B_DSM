package Models;

public class Inventario {

    private Producto[] productos;

    public Inventario(int tamano) {
        this.productos = new Producto[tamano];
    }

    public boolean agregarProducto(Producto producto) {
        for(int i = 0; i < productos.length; i++) {
            if(producto.getEstado()){
                if(productos[i] == null){
                    productos[i] = producto;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean eliminarProducto(String codigo) {
        for(int i = 0; i < productos.length; i++) {
            if(productos[i] != null){
                if(productos[i].getCodigo().equals(codigo)){
                    productos[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public Producto buscarProducto(String codigo) {
        for(int i = 0; i < productos.length; i++) {
            if(productos[i] != null){
                if(productos[i].getCodigo().equals(codigo)){
                    return productos[i];
                }
            }
        }
        return null;
    }

    public int totalitems(){
        int total = 0;
        for(int i = 0; i < productos.length; i++) {
            if(productos[i] != null){
                total += productos[i].getCantidad();
            }
        }
        return total;
    }

}
