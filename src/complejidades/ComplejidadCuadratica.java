package complejidades;

public class ComplejidadCuadratica {
    /*
        Complejidad Cuadratica : O(n^2)
        Descripción: Cada elemento, se compara con el resto de datos.
        Entonces, si aumentan los datos, el número de comparaciones crece mucho más rápido.
    */

    public void ejemplo(){
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("Complejidad Cuadratica");

        /*
            Este código compara una nota con las demás para ver si hay notas repetidas.
            Como hace muchas comparaciones entre los elementos, tarda más cuando la lista crece. 
        */

        int[] notas = {8, 7, 8, 9, 6};

        for (int i = 0; i < notas.length; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] == notas[j]) {
                    System.out.println("Hay notas repetidas: " + notas[i]);
                }
            }
        }
        
    }

}