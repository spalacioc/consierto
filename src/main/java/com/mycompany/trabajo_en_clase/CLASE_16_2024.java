/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo_en_clase;


/**
 * MI PRIMER PROGRAMA
 * 1. entraralos datos int o string
 * 2. operar los datos
 *      2.1 determinar cuantas notas
 *      2.2 llamar a l metodo entrar datos tantas veces como notas
 *      2.3 entrar porcentajes por cada nota
 *      2.4 multiplicar la nota por su peso
 *      2.5 sumar el producto de cada nota
 * 3. los resultados
 * @author spala
 */

import java.util.Scanner; // en tiempo de compilacion se pega el codigo que necesito . class

public class CLASE_16_2024 {
    
    public static Scanner teclado = new Scanner(System.in); // objeto clase
    public static String materia = "";
    public static float notafinal = 0;
    
    public static int leerInt(String mensaje){
        int dato;
        System.out.println(mensaje);
        dato = teclado.nextInt();
        return dato;
    }
    
    public static String leerString(String mensaje){
        String dato;
        System.out.println(mensaje);
        dato = teclado.next();
        return dato;
    }
    
    public static String leerLinea(String mensaje){
        String dato;
        System.out.println(mensaje);
        dato = teclado.nextLine();
        return dato;
    }
    
    public static float leerFloat(String mensaje){
        float dato;
        System.out.println(mensaje);
        dato = teclado.nextFloat();
        return dato;
    }
    
    public static float multiplicar(int nota, float porsentaje){
        return (nota*porsentaje/100);
    }
    
    public static void imprimir(String resultado){

        System.out.println("" + resultado);
    }
    
    public static void calculoNotaParcial(){
        materia = leerLinea("Ingrese el nombre de la materia: ");
        int canNotas = leerInt("Ingrese la cantidad de notas: ");
        float suma = 0;
        float resultado = 0;
        
        for(int i=1; i<=canNotas;i++){
            int nota1 = leerInt("Ingrese una" +i+ "nota (int)");
            float porcentaje = leerFloat("Ingrese su porcentaje de la nota" +i+ "(Float)");
            suma = suma + multiplicar(nota1,porcentaje);
        }
        
        resultado = suma/canNotas;
        
        imprimir("en la materia " + materia + "La nota final es: " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("MODO CLACULADORA");
        calculoNotaParcial();
        
        
    }
}
