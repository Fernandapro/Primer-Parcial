/*
 * Programador: Fernanda Quinilla
 * Parcial 1
 * Agregar productos en carretilla
 */
package sobrecarga;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal
 */
public class Main {
    public static void main(String[] args) {
        
        
    Producto pr = new Producto("Caja de leche", 12);
    Carretilla uno = new Carretilla();
    uno.agregarProducto(pr);
    uno.agregarProducto("Caja de leche", 15);
    
    List<Producto> productos= new ArrayList<Producto>();
    productos.add(new Producto("Libra de café",50));
    
   
    productos.add(new Producto("Pan de banano",70));
    productos.add(new Producto("Galletas de chocolate",10));
    uno.agregarProducto(productos);
    uno.agregarProducto(new Producto("Galletas de chocolate",15),new Producto("galleda de  Vainilla",7));
    }
    
}
