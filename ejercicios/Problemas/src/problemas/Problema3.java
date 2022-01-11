/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 

        String mensaje = ObtenerPromedio();
        System.out.println(mensaje);
        
    }

    public static String ObtenerPromedio() {
        Scanner entrada = new Scanner(System.in);
        double notas;
        int i;
        double promedio = 0;
        String cadena = "";
        for (i = 0; i < 4; i++) {
            System.out.println("Ingrese la nota " + i);
            notas = entrada.nextDouble();
            promedio = promedio + notas;
            cadena = String.format("%s %.2f-",cadena,notas);
        }
        promedio = promedio / i;
        if (promedio >= 0 && promedio <=5) {
            cadena = String.format("El promedio de las notas:%s Es regular",cadena);
        } else {
            if (promedio == 2) {
                cadena = String.format("El promedio de las notas:%s Es Bueno",cadena);
            } else {
                if (promedio == 3) {
                    cadena = String.format("El promedio de las notas:%s Es Muy Bueno",cadena);
                } else {
                    cadena = String.format("El promedio de las notas:%s Es Sobresaliente",cadena);
                }
            }
        }
        
        return cadena;
    }

}
