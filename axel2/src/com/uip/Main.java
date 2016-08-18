package com.uip;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws Exception {
	// cambio de temperatura de celcius a farenheit

       double tempC; //Temperatura en grados Celcsius
        double tempF; //Temperatura en grados Farenheit
        BufferedReader k= new BufferedReader(new InputStreamReader(System.in));

        //tempC = 25.0; //Asignación de valor punto flotante

        System.out.print("Temperatura en Celsius: ");
        tempC= Double.parseDouble(k.readLine());

        tempF = tempC * 9/5 + 32;

        System.out.println("Temperatura:" + tempC + " F"); //Salida
        System.out.println("Temperatura:" + tempF + " F"); //Salida

    }
}
