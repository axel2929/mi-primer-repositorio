package com.uip;
//Programa que convierte de centimetros a pulgada
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void CmtoInch (double cm) {
        //Declaracion de variables
        double pulg;
        pulg = cm / 2.54;  //calculo de conversion

        System.out.print("Conversion de centimetros a pulgadas = " + pulg);   //salida en pantalla

    }

    public static void main(String[] args) throws Exception {
        //Declaracion de variables
        double cm;
        BufferedReader k= new BufferedReader(new InputStreamReader(System.in));
        //Entrada por teclado
        System.out.print("Introduzca medida en centimetros= ");

        cm= Double.parseDouble(k.readLine());
        //Condicion de ejecucion
        if (cm >0) {
            CmtoInch(cm);

        } else
            System.out.print("Introdujo un valor negativo y no es valido");

	// write your code here
    }
}
