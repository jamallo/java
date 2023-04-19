package ejercicioInterfaces;

import java.util.List;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUD();

    public static void main(String[] args) {

        cocheCRUD.save(new CocheCRUD());
        cocheCRUD.findAll();
        cocheCRUD.delete();

    }
}
