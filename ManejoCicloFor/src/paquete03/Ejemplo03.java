/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre ;
        String posicion ;
        int edad ;
        double estatura ;
        int limite= 0 ;
        String reporte = "Listado de jugadores\n" ;
        
        System.out.println("Ingrese el numero de jugadores a ingresar");
        limite = entrada.nextInt();
        for (int i = 1; i <= limite; i++) {
        entrada.nextLine();
        System.out.println("Ingrese el nombre y apellido del jugador");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la posicion");
        posicion = entrada.nextLine();
        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese la estatura");
        estatura = entrada.nextDouble();
        
        reporte = String.format("%s%d. %s -%s-,edad: %d,estatura %s\n"
                ,reporte,i,nombre,
                posicion,edad, estatura);
     
        }
        System.out.printf("%s\n", reporte);
    }
}
