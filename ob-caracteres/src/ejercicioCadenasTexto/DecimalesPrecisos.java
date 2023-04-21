package ejercicioCadenasTexto;

import java.math.BigDecimal;

public class DecimalesPrecisos {

    public static void main(String[] args) {

        //Para operar con número de gran precisión se utiliza bigDecimal

        BigDecimal valorA = new BigDecimal(0.1f);
        //para operar no se puede con +, -, *, / ya que tiene sus propios métodos, ejem: multiplicación:
        BigDecimal valorB = new BigDecimal(4);
        BigDecimal resultado =  valorA.multiply(valorB);
        System.out.println(resultado.toString());
        BigDecimal resultado2 = valorA.add(valorB);
        System.out.println(resultado2.toString());
    }
}
