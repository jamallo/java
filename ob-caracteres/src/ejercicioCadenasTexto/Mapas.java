package ejercicioCadenasTexto;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    //Los mapas tienen una clave y un valor
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap();
        mapa.put("Clave1", 10);
        mapa.put("Clave2", 20);
        mapa.put("Clave3", 30);

        System.out.println(mapa);

        for (Map.Entry elemento : mapa.entrySet()) {
            System.out.println("La clave del elemento del mapa es: " + elemento.getKey());
            System.out.println("El valor del elemento del mapa es: " + elemento.getValue());


            
        }

    }
}
