package es.iesmz.ed.algoritmes;
import java.util.ArrayList;

/**
 * Clase con una variable long y una función para saber cuantos digitos se repiten en un mismo año
 */

public class Any {
    static long numero;

    /**
     * Constructor.
     * @param numero es el numero que se va a comprobar.
     */

    public Any(long numero) {
        Any.numero = numero;
    }

    /**
     * Funcion que devuelve la cantidad de cifiras difernetes que estan en un mismo año.
     * @return int
     */

    public static int digitsDiferents(long numero){
        ArrayList<Character> numeros = new ArrayList<>();
       String cadena= String.valueOf(numero);


        for (int i = 0; i < cadena.length(); i++) {
            if(!numeros.contains(cadena.charAt(i))) {
                numeros.add(cadena.charAt(i));
            }
        }
        return numeros.size();
    }
}
