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
public class Problema5 {
    
    public static void main(String[] args) {
        double respuesta;
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};   
        Sumadatos(informacion);
        respuesta = Sumadatos(informacion);
        System.out.printf("Resultado de la suma: %.2f\n",respuesta);
    }

    public static double Sumadatos(int[][] datos) {
        double suma = 0; 
        for (int fila = 0; fila < datos.length; fila++) {
            for (int col = 0; col < datos.length; col++) {
                suma = suma + datos[fila][col];
            }
        } 
        return suma;
    }
}
