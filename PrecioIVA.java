package com.example;

public class PrecioIVA {

    public static void main(String[] args) {
        System.out.print(precio(5));



        }
         static double precio (double precio1) {
             double iva = 1.21;
             return precio1 * iva;


         }
}
