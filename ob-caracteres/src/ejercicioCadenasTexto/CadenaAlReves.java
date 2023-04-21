package ejercicioCadenasTexto;

public class CadenaAlReves {

    public static void main(String[] args) {
        String cadena = "Mensaje DE TEXTo";

        int total = cadena.length() - 1;

        for (int i = total; i >= 0; i--){
            System.out.println(cadena.charAt(i));
        }

    }
}
