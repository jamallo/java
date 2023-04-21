package ejercicioCadenasTexto;

import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {
        //Los vectores son arrais sin un límite de capacidad
        Vector<Integer> vector = new Vector();
        //crear cada vector
        vector.add(1); //index 0
        vector.add(2); //index 1
        vector.add(3); //index 2
        vector.add(4); //index 3
        System.out.println(vector);
        //eliminar vectores
        vector.remove(2);
        System.out.println(vector);
        //Comprobar Tamaño y capacidad
        System.out.println("Tamaño vector: " + vector.size() + "\nCapacidad vector: " + vector.capacity());

        //Nuevo vector
        Vector<Integer> vector2 = new Vector();
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        vector2.add(4);
        vector2.add(5);
        vector2.add(6);
        vector2.add(7);
        vector2.add(8);
        vector2.add(9);
        vector2.add(10);
        vector2.add(11);
        vector2.add(12);
        vector2.add(13);
        vector2.add(14);
        vector2.add(15);

        System.out.println(vector2);
        System.out.println("Tamaño vector2: " + vector2.size() + "\nCapacidad vector2: " + vector2.capacity());
        //Los vectores son dinámicos con lo que va aumentando la capacidad automáticamente de 10 en 10
        //Se puede modificar la capacidad y el incremento de la capacidad Vector<Integer> vector2 = new Vector(capacidad inicial, incremento capacidad);
        //reducir la capacidad del vector para que no ocupe tanta memoria
        vector2.trimToSize();
        System.out.println("Nueva capacidad vector2: " + vector2.capacity());

        boolean resultado = vector.equals(vector2);
        System.out.println(resultado);

        for (int i = 0; i < vector.size(); i++){
            System.out.println(vector.get(i));
        }

        for (int i : vector) {
            System.out.println(i);
        }

    }
}
