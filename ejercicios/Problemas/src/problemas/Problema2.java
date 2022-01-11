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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        System.out.println("Ingrese 1 para calcular el area de del cuadrado."
                + " Ingrese 2 para calcular el area de un triangulo"
                + " Ingrese 3 para cacular el area de un  rectangulo ");
        int tipo = entrada.nextInt();
        if (tipo == 1) {
            mensaje = obtenerAreaCuadrado();
        } else {
            if (tipo == 2) {
                mensaje = obtenerAreaTriangulo();
            } else {
                if (tipo == 3) {
                    mensaje = obtenerAreaRectangulo();
                } else {
                    mensaje = "valor incorrecto";
                }
            }
        }

        System.out.printf("%s\n", mensaje);

    }

    public static String obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;
        String cadena = "";
        System.out.println("Ingrese el valor del lado");
        lado = entrada.nextDouble();
        area = lado * lado * lado * lado;
        cadena = String.format("%sArea: %.2f\n",
                cadena,
                area
        );
        return cadena;
    }

    public static String obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double base;
        double altura;
        double area;
        String cadena = "";
        System.out.println("Ingrese el valor de la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        cadena = String.format("%sArea: %.2f\n",
                cadena,
                area
        );
        return cadena;
    }

    public static String obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);

        double base;
        double altura;
        double area;
        String cadena = "";
        System.out.println("Ingrese el valor de la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextDouble();
        area = (base * altura);
        cadena = String.format("%sArea: %.2f\n",
                cadena,
                area);
        return cadena;
    }

}
