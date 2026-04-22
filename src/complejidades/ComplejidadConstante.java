package complejidades;

public class ComplejidadConstante {

    /*
        Complejidad Constante : O(1)
        Descripción: La complejidad constante es cuando una operación siempre tarda  
        lo mismo, sin importar cuántos datos haya.
    */

    public void ejemplo(){
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("Complejidad Constante");
        //consultar el saldo de una tarjeta en una posición ya conocida dentro de un arreglo

        double[] saldos = {150.75, 320.50, 89.00, 500.25, 43.65};

        System.out.println("Saldo del cliente 3: " + saldos[2]);
    }

}    



