package es.iesmz.ed.algoritmes;

/**
 * Clase con una variable long y una función esHyperpar para saber si todos sus caracteres eran pares.
 */

public class Hyperpar {
    private long numero;

    /**
     * Constructor.
     * @param numero es el número a comprobar.
     */

    public Hyperpar(long numero) {
        this.numero = numero;
    }

    /**
     * Función para calcula y saber si todos sus caracteres son pares.
     * @return boolean
     */

    public static boolean esHyperpar(long numero){

            numero = Math.abs(numero);
            String num = String.valueOf(numero);
            for (int i = 0; i < num.length(); i++) {
                if(num.charAt(i) % 2!=0){
                    return false;
                }
            }
            return true;
    }
}
