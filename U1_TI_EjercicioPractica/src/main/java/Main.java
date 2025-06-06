import Models.Inventario;
import Models.Producto;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(3);

        Producto p1 = new Producto();
        Producto p2 = new Producto();
        Producto p3 = new Producto();
        Producto p4 = new Producto();

        p1.Validan("cod1", "pc", 5);
        p2.Validan("cod2", "teclado", 4);
        p3.Validan("cod3", "mose", 3);
        p4.Validan("cod4", "pantalla", 2);

        System.out.println(inventario.agregarProducto(p1));
        System.out.println(inventario.agregarProducto(p2));
        System.out.println(inventario.agregarProducto(p3));
        System.out.println(inventario.agregarProducto(p4));

        System.out.println("--------------------------------------------------\nBuscar Producto");

        System.out.println(inventario.buscarProducto("cod1"));
        System.out.println(inventario.buscarProducto("cod10"));

        System.out.println("---------------------------------------------------\nTotal de Productos");
        System.out.println(inventario.totalitems());

        System.out.println("--------------------------------------------------\n eliminar Producto");
        System.out.println(inventario.eliminarProducto("cod5"));
        System.out.println(inventario.eliminarProducto("cod1"));

        System.out.println("---------------------------------------------------\nTotal de Productos");
        System.out.println(inventario.totalitems());

        //reagregar
        System.out.println(inventario.agregarProducto(p4));


    }
}