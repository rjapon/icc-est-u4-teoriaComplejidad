package complejidades;

public class ComplejidadLogaritmica {
    /*
        Complejidad Logaritmica: O(log n)
        La complejidad logaritmica se da cuando un programa reduce el tamaño de un problema en cada iteración.
        Debido a esto, aunque el tamaño de la entrada aumente, la cantidad de iteraciones va a crecer lentamente.
    */
    public void ejemplo(){
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("Complejidad Logaritmica");

        /*
            En el ejemplo utilizamos i*=2 en vez de tener un ciclo que avanza
             de uno en uno. Por esta razón la cantidad de iteraciones necesarias disminuye
        */

        int n=100;
        int pasos = 0;
        
        for (int i = 1; i <= n; i *= 2) {
            pasos++;
        }
        
        System.out.println("Total de operaciones para n=" + n + ": " + pasos + "vueltas");


    }

}

