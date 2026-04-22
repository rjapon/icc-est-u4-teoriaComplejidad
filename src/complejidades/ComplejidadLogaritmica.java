package complejidades;

public class ComplejidadLogaritmica {
    /*
        Complejidad Logaritmica: O(log n)
        La complejidad logaritmica se da cuando un programa reduce 
        el tamañno de un problema de forma rápida
        Explicación:
        Esto se logra dividiendo o multiplicando para que se necesite 
        cada vez menos operaciones.
    */
    public void ejemplo(){
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("Complejidad Logaritmica");

        int n=100;
        int pasos = 0;
        
        for (int i = 1; i <= n; i *= 2) {
            pasos++;
        }
        
        System.out.println("Total de operaciones para n=" + n + ": " + pasos + "vueltas");


    }

}