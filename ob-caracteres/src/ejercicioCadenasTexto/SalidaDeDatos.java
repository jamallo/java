package ejercicioCadenasTexto;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SalidaDeDatos {

    public static void main(String[] args) throws FileNotFoundException {
        //Crear el archivo
        PrintStream info = new PrintStream("Ejemplo.txt");
        //Crear el contenido del archivo
        info.println("Ejemplo de salida de datos");
    }
}
