package ejercicioCadenasTexto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class EntradaDeDatos {

    public static void main(String[] args) {
        try {

            //acceder a ficheros ficheros
            InputStream fichero = new FileInputStream("Ejemplo.txt");
            //leer ficheros
            try {
                byte[] datos = fichero.readAllBytes();

                for (byte dato : datos) {
                    System.out.println((char)dato); //char para leer el fichero que no sea numérico.
                }
            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        }catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
