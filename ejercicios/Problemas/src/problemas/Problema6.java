/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        double mediaAritmetica;
        double desviacionEstandar;
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        mediaAritmetica = obtenerMediaAritmetica(informacion);
        desviacionEstandar = obtenerDesviacionEstandar(informacion, mediaAritmetica);
        System.out.printf(" La Media aritmética es: %.2f \n La Desviación "
                + " Estandar es: %.2f \n ", mediaAritmetica, desviacionEstandar);
    }

    public static double obtenerMediaAritmetica(int[] datos) {
        double suma = 0;
        double media;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
        media = suma / datos.length;
        return media;
    }

    public static double obtenerDesviacionEstandar(int[] datos, double media) {
        double suma;
        double varianza = 0;
        double desviación;
        for (int i = 0; i < datos.length; i++) {
            suma = Math.pow(datos[i] - media, 2);
            varianza = varianza + suma;
        }
        varianza = varianza / (datos.length - 1);
        desviación = Math.sqrt(varianza);
        return desviación;
    }

}
