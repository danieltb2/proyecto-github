/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.github;

/**
 *
 * @author ALU1J
 */
public class ProyectoGithub {

    /**
     * @param args the command line arguments
     */
    static String veredicto(String valor1, String valor2) {
        /*En este metodo estan los parametros valor1 y valor2 los cuales
        simbolizan la nota que querias sacar y la nota que tienes 
        respectivamente, como la nota que quería sacar era 10 y me he sacado un 9 el resultado es:
        "Te has confiado. Falta realismo".*/
        if (valor1.equals(valor2)) {
            return "Perfecto. Has tenido buen criterio.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Has mejorado, o te ha llegado el éxito inesperado.";
        }
        return "Te has confiado. Falta realismo.";
    }
    public static void main(String[] args) {//Daniel Terol Barbero
        // TODO code application logic here
        System.out.println("La calificación de " + args[0] + " : "+ args[2]);
        System.out.println(veredicto(args[1], args[2]));
    }
}
