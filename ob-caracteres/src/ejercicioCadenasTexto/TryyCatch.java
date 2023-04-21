package ejercicioCadenasTexto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TryyCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos números a dividir: ");

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        try {
            int resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
            //para saber las excepcines que daría:
        //} catch (Exception e) {
          //  System.out.println("La excepción es: " + e.getClass());
            //nos devuelve en caso de dividir entre 0: class java.lang.ArithmeticException
            //capturamos la excepción concreta:
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");

        } catch (Exception e) {
            System.out.println("Otra excepción diferente");
        } finally {
            System.out.println("Finalizado");
        }
    }
}
