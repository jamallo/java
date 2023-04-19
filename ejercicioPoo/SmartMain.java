package ejercicioPoo;

public class SmartMain {

    public static void main(String[] args) {


        //1. Creación de objetos:

        SmartPhone iphone14 = new SmartPhone("Iphone", "Apple", "IOS", 6.6, false, "14", 650.80);
        SmartWatch samsungWatch = new SmartWatch("Watch", "Samsung", "Android Wear", 2.5, false, "Acero", 44.5);

        //2. Impresión:
        System.out.println(iphone14);
        System.out.println(samsungWatch);
    }
}
