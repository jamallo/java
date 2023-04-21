package ejercicioCadenasTexto;

public class ThrowYThrows {

    public static void main(String[] args) {
        try {
            divide(4, 0);
        } catch (Exception e) {
            System.out.println("AAA");
        }

    }
    public static int divide(int A, int B) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = A / B;
        } catch (ArithmeticException e){
            throw new ArithmeticException();
        }

        return resultado;
    }
}
