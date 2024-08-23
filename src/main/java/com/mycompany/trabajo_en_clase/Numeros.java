/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo_en_clase;
import java.util.Scanner;

/**
 *
 * @author spala
 */
public class Numeros {

    static Scanner teclado = new Scanner(System.in); //creamos un objeto llamado teclado de la clase scanner

    public static int leer(){
       
        
        System.out.println("Ingrese un numero:");
        int num1;
        num1 = teclado.nextInt();
        return num1;

        
    }
    
    public static String leer2(){
       
        System.out.println("Ingrese un string:");
        String letra;
        letra = teclado.next();
        return letra;
    }
}
    
