package es.iesmz.ed.algoritmes;

/**
 * Clase con una variable long y una función para sumar las cifras eliminando el digito más alto
 */

public class SumaDescendent {
    static long numero=0;

    /**
     * Constructor.
     * @param numero es el numero que se va a comprobar.
     */
    public SumaDescendent(long numero) {
        this.numero = numero;
    }

    /**
     * Funcion que devuelve la suma de todas las cifras de un mismo numero eliminando la mas alta.
     * @return long
     */

    public static long suma(long numero){
        long sumaNumero = 0;
        boolean esNegativo = false;
        if (numero < 0) {
            esNegativo = true;
            numero = Math.abs(numero);
        }
        String cadenaNumeros = Long.toString(numero);
        for (int i = 0; i < cadenaNumeros.length(); i++) {
            String substringCadenaNums = cadenaNumeros.substring(i);
            long subNumero = Long.parseLong(substringCadenaNums);
            sumaNumero += subNumero;
        }

        if (esNegativo == true) {
            sumaNumero = sumaNumero * -1;
        }
        return sumaNumero;
    }
}
