/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author Usuarioo
 */
public class ejemplo_while {

    public static void main(String[] args) {

        Scanner tablas = new Scanner(System.in);
        int tabla;
        int limite;
        int contador = 1;
        int contador2 = 1;

        System.out.println("ingrese hasta que tabla de multiplicar desea que presente ");
        tabla = tablas.nextInt();

        System.out.println("ingrese el limite de numeros presentes en la tabla ");
        limite = tablas.nextInt();

        while (contador<=tabla){
            while (contador2<=limite){
                    System.out.println(contador + "*" + contador2 + "=" + contador * contador2);
                    contador2 = contador2 + 1;
            }
             contador = contador + 1;
             contador2=1;
        }
             
        
        
           
        

    }
}
