package complejidades;

public class ComplejidadLineal {
    /*
        Complejidad Lineal: O(n) 
        La complejidad Lineal se da cuando el tiempo de ejecución del algoritmo 
        aumenta de manera proporcional de los datos de entrada. 
        Explicación: 
        Esto se debe a que se recorre todas las posiciones. Es decir si un arreglo
        tiene 3 elementos, se van a evaluar los tres elementos una sola vez. Si el 
        arreglo tiene 6 el tiempo se duplica
    */
    public void ejemplo(){

        int[] numeros = {5, 10, 15,};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            System.out.println("Sumando: " + numeros[i] + "+" + suma);  
        }
        System.out.println("Resultado final: " + suma);
    }
    
}
