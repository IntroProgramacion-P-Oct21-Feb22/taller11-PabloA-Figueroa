/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        System.out.println("Ingrese 1 para calcular el valor de la planilla de luz."
                + " Ingrese 2 para calcular l valor de un inmueble");
        int tipo = entrada.nextInt();
        if (tipo == 1) {
            mensaje = calcularValorLuz();
        } else {
            if (tipo == 2) {
                mensaje = calcularPredio();
            } else {
                mensaje = "valor incorrecto";
            }
        }

        System.out.printf("%s\n", mensaje);

    }

    public static String calcularValorLuz() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String cedula;
        double vkilovatio;
        double nkilovatio;
        double total;
        String cadena = "";
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su cedula");
        cedula = entrada.nextLine();
        System.out.println("Ingrese el valor del kilovatio");
        nkilovatio = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilovatios consumidos");
        vkilovatio = entrada.nextDouble();
        total = nkilovatio * vkilovatio ;
        cadena = String.format("Cliente %s con cedula %s debe cancelar el valor de "
                + "$%.2f\n",
                nombre,
                cedula,
                total          
        );
        return cadena;
    }

    public static String calcularPredio() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String cedula;
        double inmueble;
        double predio;

        String cadena = "";
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su cedula ");
        cedula = entrada.nextLine();
        System.out.println("Ingrese el valor del inmueble");
        inmueble = entrada.nextDouble();
        predio = inmueble * 0.02;
        cadena = String.format("Cliente %s con cedula %s tiene un inmueble valorado en "
                + "$%.2f y tiene que pagar de predio $%.2f",
                nombre,
                cedula,
                inmueble,
                predio
        );
        return cadena;
    }



}
