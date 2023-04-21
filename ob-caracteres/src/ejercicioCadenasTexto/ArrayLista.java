package ejercicioCadenasTexto;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLista {

    public static void main(String[] args) {

        ArrayList <String> lista = new ArrayList<>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        System.out.println(lista);

        for (String nombre : lista) {
            System.out.println(nombre);
        }

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        LinkedList<String> listaEnlazada = new LinkedList (lista);
        System.out.println(listaEnlazada);
    }

}
