/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Metodos {

    public static String numero() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Introdueix el primer numero. ");
        return sc.nextLine();

    }
    
    public static String operacions() {
        Scanner sc = new Scanner(System.in);
        boolean comprobar = false;
        String operacion;
        do {
            comprobar = true;
            operacion = sc.nextLine();

            switch (operacion) {
                case "s":
                case "S":
                case "n":
                case "N":
                    break;
                default:
                    System.err.println("\n Error, posa un valor vàlid. \n");
                    comprobar = false;
            }
        } while (comprobar != true);
        return operacion;

    }

}