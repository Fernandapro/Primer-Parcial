/*
 * Programador: Fernanda Quinilla
 * Parcial 1
 * Agregar productos en carretilla
 */

package Archivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class Archivo {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception
    {
        String nombreArchivo = "C:/prueba.txt";
        /* Definición del archivo de texto a leer */
        FileInputStream archivo; // Definición de flujo de datos
        InputStreamReader conversor; // Definición del flujo de lectura
        BufferedReader filtro; // Definición del buffer
        String línea;
        /* Crea los objetos FileInputStream, BufferedReader y BufferedReader */
        try {
            archivo = new FileInputStream(nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encuentra");
        }catch (IOException e){
            System.err.println("El programa fallo");
        }catch(Exception e){
            System.err.println("El programa fallo");
        } finally {
            System.out.println("Finalizar programa");
        }
        archivo = new FileInputStream(nombreArchivo);
        conversor = new InputStreamReader(archivo);
        filtro = new BufferedReader(conversor);
        línea = filtro.readLine();
        while (línea != null) {
            System.out.println(línea);
            /* Imprime en pantalla una línea del archivo */
            línea = filtro.readLine(); // Lee la siguiente línea 
        }
        filtro.close(); 
    }

}
