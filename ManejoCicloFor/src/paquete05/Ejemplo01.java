/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tabla;
        int numero;
        int inicio = 1;
        int contador = 1;
        System.out.println("Ingresar el numero que desea generar la tabla");
        numero = entrada.nextInt();
        System.out.println("Ingresar el numero maximo a generar");
        tabla = entrada.nextInt();

        while (inicio <= numero) {
            while (contador <= tabla) {
                System.out.println(inicio + " *" + contador + "=" + inicio * contador);
                contador= contador + 1;
            }
                 contador = 1;
                 inicio = inicio +1;
                 
        }
    }

}
