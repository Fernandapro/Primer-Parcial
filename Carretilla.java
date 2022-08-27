/*
 * Programador: Fernanda Quinilla
 * Parcial 1
 * Agregar productos en carretilla
 */

package sobrecarga;

import java.util.ArrayList;
import java.util.List;


public class Carretilla {
        // Atributo que define una lista de productos contenidos en la carretilla
	private List<Producto> lista = new ArrayList<Producto>();
	
	/**
	 * Constructor de la clase Carretilla
	 */
	public Carretilla() {
	    super();
	}
	
        public Carretilla(List<Producto> lista){
            super();
            this.lista= lista;
        }
        
        
        
	/**
	 * Método que agrega un producto a la lista de la carretilla
	 * @param p Parámetro de tipo Producto a agregar a la lista
	 */
	public void agregar(Producto pr) {
		lista.add(pr);
	}

        /**
         * Metodo sobrecarga para agregar un producto, pero pasándole el nombre del producto y diferente precio.
         * @param nombre
         * @param precio 
         */
        public void agregarProducto(String nombre, double precio){
                lista.add(new Producto(nombre,precio));
        }
 
        /**
         * método sobrecargado para agregar varios productos de una sola vez, pasándole un listado de productos.
         * @param Producto 
         */
        public void agregarProducto(List<Producto> Producto){
                lista.addAll(Producto);
        }
        
        
        /**
         * Sobrecarga el constructor de la clase Carretilla para que se pueda pasar una lista inicial de productos.
         * @param productos 
         */
        public void agregarProducto(Producto... productos){
                
        for (Producto fi : productos){
            lista.add(fi);
        }
       }
        }