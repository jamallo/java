package ejercicioCadenasTexto;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class CopiarUnFichero {

    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("Ejemplo.txt");
            byte [] datos = in.readAllBytes();

            PrintStream out = new PrintStream("DestinoCopia.txt");
            out.write(datos);
        } catch (Exception e){
            System.out.println("Ha ocurrido un error " + e.getMessage());
        }
    }
}
