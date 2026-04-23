package complejidades;

import java.util.Arrays;

public class ComplejidadNLogN {
    /*
        Complejidad NLogN : O(nlogn)
        Descripcion: Pasa cuando un algoritmo trabaja con todos los datos,
        pero además los va organizando o dividiendo en partes.
    */
    public void ejemplo(){
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("Complejidad NLogN");

        /*
            Este código ordena las notas de menor a mayor usando un método eficiente.
            Lo que hace es acomodar todos los datos de forma más rápida que compararlos uno por uno muchas veces.
         */

        int[] notas = {78, 90, 65, 88, 72, 95, 80};
        Arrays.sort(notas);

        for (int nota : notas) {
            System.out.println(nota);
        }
    }
}
